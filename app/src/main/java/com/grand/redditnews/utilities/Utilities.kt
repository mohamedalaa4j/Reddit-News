package com.grand.redditnews.utilities

import android.app.Dialog
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import com.grand.redditnews.R
import java.util.*

object Utilities {

    private lateinit var progressbarDialog: Dialog

    fun showProgressDialog(context: Context) {
        progressbarDialog = Dialog(context)
        progressbarDialog.setCancelable(false)
        progressbarDialog.setContentView(R.layout.progress_dialog)
        progressbarDialog.show()
    }

    fun cancelProgressDialog() {
        if (progressbarDialog.isShowing) {
            progressbarDialog.dismiss()
        }
    }

    fun deviceLanguage(): String {

        return Locale.getDefault().language
    }

     fun isConnected(context: Context): Boolean {

        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

            val network = connectivityManager.activeNetwork ?: return false

            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

            return when {
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

                else -> false
            }
        } else {
            // if the android version is below M
            @Suppress("DEPRECATION") val networkInfo =
                connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }
    }

}