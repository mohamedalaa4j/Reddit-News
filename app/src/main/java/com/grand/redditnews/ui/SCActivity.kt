package com.grand.redditnews.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.grand.redditnews.databinding.ActivityScBinding
import com.grand.redditnews.viewModel.SCActivityVM

//Splash Screen UI
class SCActivity : AppCompatActivity() {
    private var binding: ActivityScBinding? = null

    private val viewModel: SCActivityVM by lazy {
        ViewModelProvider(this)[SCActivityVM::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        viewModel.disableNightMode()
        viewModel.delay()

        lifecycleScope.launchWhenStarted {
            viewModel.startMainActivity.collect {

                if (it){ startMainActivity() }
                viewModel.startMainActivity.emit(false)
            }
        }

    }//onCreate/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun startMainActivity(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}