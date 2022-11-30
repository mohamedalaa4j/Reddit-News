package com.grand.redditnews.data.models.received


import com.google.gson.annotations.SerializedName

data class KotlinNewsModel(
    @SerializedName("data")
    val `data`: Data?,
    @SerializedName("kind")
    val kind: String?
) {
    data class Data(
        @SerializedName("after")
        val after: String?,
        @SerializedName("before")
        val before: Any?,
        @SerializedName("children")
        val children: List<Children?>?,
        @SerializedName("dist")
        val dist: Int?,
        @SerializedName("geo_filter")
        val geoFilter: Any?,
        @SerializedName("modhash")
        val modhash: String?
    ) {
        data class Children(
            @SerializedName("data")
            val `data`: Data?,
            @SerializedName("kind")
            val kind: String?
        ) {
            data class Data(
                @SerializedName("all_awardings")
                val allAwardings: List<Any?>?,
                @SerializedName("allow_live_comments")
                val allowLiveComments: Boolean?,
                @SerializedName("approved_at_utc")
                val approvedAtUtc: Any?,
                @SerializedName("approved_by")
                val approvedBy: Any?,
                @SerializedName("archived")
                val archived: Boolean?,
                @SerializedName("author")
                val author: String?,
                @SerializedName("author_flair_background_color")
                val authorFlairBackgroundColor: Any?,
                @SerializedName("author_flair_css_class")
                val authorFlairCssClass: Any?,
                @SerializedName("author_flair_richtext")
                val authorFlairRichtext: List<Any?>?,
                @SerializedName("author_flair_template_id")
                val authorFlairTemplateId: Any?,
                @SerializedName("author_flair_text")
                val authorFlairText: Any?,
                @SerializedName("author_flair_text_color")
                val authorFlairTextColor: Any?,
                @SerializedName("author_flair_type")
                val authorFlairType: String?,
                @SerializedName("author_fullname")
                val authorFullname: String?,
                @SerializedName("author_is_blocked")
                val authorIsBlocked: Boolean?,
                @SerializedName("author_patreon_flair")
                val authorPatreonFlair: Boolean?,
                @SerializedName("author_premium")
                val authorPremium: Boolean?,
                @SerializedName("awarders")
                val awarders: List<Any?>?,
                @SerializedName("banned_at_utc")
                val bannedAtUtc: Any?,
                @SerializedName("banned_by")
                val bannedBy: Any?,
                @SerializedName("can_gild")
                val canGild: Boolean?,
                @SerializedName("can_mod_post")
                val canModPost: Boolean?,
                @SerializedName("category")
                val category: Any?,
                @SerializedName("clicked")
                val clicked: Boolean?,
                @SerializedName("content_categories")
                val contentCategories: Any?,
                @SerializedName("contest_mode")
                val contestMode: Boolean?,
                @SerializedName("created")
                val created: Double?,
                @SerializedName("created_utc")
                val createdUtc: Double?,
                @SerializedName("crosspost_parent")
                val crosspostParent: String?,
                @SerializedName("crosspost_parent_list")
                val crosspostParentList: List<CrosspostParent?>?,
                @SerializedName("discussion_type")
                val discussionType: Any?,
                @SerializedName("distinguished")
                val distinguished: Any?,
                @SerializedName("domain")
                val domain: String?,
                @SerializedName("downs")
                val downs: Int?,
                @SerializedName("edited")
                val edited: Any?,
                @SerializedName("gilded")
                val gilded: Int?,
                @SerializedName("gildings")
                val gildings: Gildings?,
                @SerializedName("hidden")
                val hidden: Boolean?,
                @SerializedName("hide_score")
                val hideScore: Boolean?,
                @SerializedName("id")
                val id: String?,
                @SerializedName("is_created_from_ads_ui")
                val isCreatedFromAdsUi: Boolean?,
                @SerializedName("is_crosspostable")
                val isCrosspostable: Boolean?,
                @SerializedName("is_meta")
                val isMeta: Boolean?,
                @SerializedName("is_original_content")
                val isOriginalContent: Boolean?,
                @SerializedName("is_reddit_media_domain")
                val isRedditMediaDomain: Boolean?,
                @SerializedName("is_robot_indexable")
                val isRobotIndexable: Boolean?,
                @SerializedName("is_self")
                val isSelf: Boolean?,
                @SerializedName("is_video")
                val isVideo: Boolean?,
                @SerializedName("likes")
                val likes: Any?,
                @SerializedName("link_flair_background_color")
                val linkFlairBackgroundColor: String?,
                @SerializedName("link_flair_css_class")
                val linkFlairCssClass: Any?,
                @SerializedName("link_flair_richtext")
                val linkFlairRichtext: List<Any?>?,
                @SerializedName("link_flair_text")
                val linkFlairText: Any?,
                @SerializedName("link_flair_text_color")
                val linkFlairTextColor: String?,
                @SerializedName("link_flair_type")
                val linkFlairType: String?,
                @SerializedName("locked")
                val locked: Boolean?,
                @SerializedName("media")
                val media: Any?,
                @SerializedName("media_embed")
                val mediaEmbed: MediaEmbed?,
                @SerializedName("media_metadata")
                val mediaMetadata: MediaMetadata?,
                @SerializedName("media_only")
                val mediaOnly: Boolean?,
                @SerializedName("mod_note")
                val modNote: Any?,
                @SerializedName("mod_reason_by")
                val modReasonBy: Any?,
                @SerializedName("mod_reason_title")
                val modReasonTitle: Any?,
                @SerializedName("mod_reports")
                val modReports: List<Any?>?,
                @SerializedName("name")
                val name: String?,
                @SerializedName("no_follow")
                val noFollow: Boolean?,
                @SerializedName("num_comments")
                val numComments: Int?,
                @SerializedName("num_crossposts")
                val numCrossposts: Int?,
                @SerializedName("num_reports")
                val numReports: Any?,
                @SerializedName("over_18")
                val over18: Boolean?,
                @SerializedName("parent_whitelist_status")
                val parentWhitelistStatus: String?,
                @SerializedName("permalink")
                val permalink: String?,
                @SerializedName("pinned")
                val pinned: Boolean?,
                @SerializedName("pwls")
                val pwls: Int?,
                @SerializedName("quarantine")
                val quarantine: Boolean?,
                @SerializedName("removal_reason")
                val removalReason: Any?,
                @SerializedName("removed_by")
                val removedBy: Any?,
                @SerializedName("removed_by_category")
                val removedByCategory: Any?,
                @SerializedName("report_reasons")
                val reportReasons: Any?,
                @SerializedName("saved")
                val saved: Boolean?,
                @SerializedName("score")
                val score: Int?,
                @SerializedName("secure_media")
                val secureMedia: SecureMedia?,
                @SerializedName("secure_media_embed")
                val secureMediaEmbed: SecureMediaEmbed?,
                @SerializedName("selftext")
                val selftext: String?,
                @SerializedName("selftext_html")
                val selftextHtml: String?,
                @SerializedName("send_replies")
                val sendReplies: Boolean?,
                @SerializedName("spoiler")
                val spoiler: Boolean?,
                @SerializedName("stickied")
                val stickied: Boolean?,
                @SerializedName("subreddit")
                val subreddit: String?,
                @SerializedName("subreddit_id")
                val subredditId: String?,
                @SerializedName("subreddit_name_prefixed")
                val subredditNamePrefixed: String?,
                @SerializedName("subreddit_subscribers")
                val subredditSubscribers: Int?,
                @SerializedName("subreddit_type")
                val subredditType: String?,
                @SerializedName("suggested_sort")
                val suggestedSort: Any?,
                @SerializedName("thumbnail")
                val thumbnail: String?,
                @SerializedName("title")
                val title: String?,
                @SerializedName("top_awarded_type")
                val topAwardedType: Any?,
                @SerializedName("total_awards_received")
                val totalAwardsReceived: Int?,
                @SerializedName("treatment_tags")
                val treatmentTags: List<Any?>?,
                @SerializedName("ups")
                val ups: Int?,
                @SerializedName("upvote_ratio")
                val upvoteRatio: Double?,
                @SerializedName("url")
                val url: String?,
                @SerializedName("url_overridden_by_dest")
                val urlOverriddenByDest: String?,
                @SerializedName("user_reports")
                val userReports: List<Any?>?,
                @SerializedName("view_count")
                val viewCount: Any?,
                @SerializedName("visited")
                val visited: Boolean?,
                @SerializedName("whitelist_status")
                val whitelistStatus: String?,
                @SerializedName("wls")
                val wls: Int?
            ) {
                data class SecureMedia(
                    @SerializedName("oembed")
                    val oembed: Oembed?,
                ){
                    data class Oembed(
                        @SerializedName("thumbnail_url")
                        val thumbnailUrl: String?
                    )
                }
                data class CrosspostParent(
                    @SerializedName("all_awardings")
                    val allAwardings: List<Any?>?,
                    @SerializedName("allow_live_comments")
                    val allowLiveComments: Boolean?,
                    @SerializedName("approved_at_utc")
                    val approvedAtUtc: Any?,
                    @SerializedName("approved_by")
                    val approvedBy: Any?,
                    @SerializedName("archived")
                    val archived: Boolean?,
                    @SerializedName("author")
                    val author: String?,
                    @SerializedName("author_flair_background_color")
                    val authorFlairBackgroundColor: Any?,
                    @SerializedName("author_flair_css_class")
                    val authorFlairCssClass: Any?,
                    @SerializedName("author_flair_richtext")
                    val authorFlairRichtext: List<Any?>?,
                    @SerializedName("author_flair_template_id")
                    val authorFlairTemplateId: Any?,
                    @SerializedName("author_flair_text")
                    val authorFlairText: Any?,
                    @SerializedName("author_flair_text_color")
                    val authorFlairTextColor: Any?,
                    @SerializedName("author_flair_type")
                    val authorFlairType: String?,
                    @SerializedName("author_fullname")
                    val authorFullname: String?,
                    @SerializedName("author_is_blocked")
                    val authorIsBlocked: Boolean?,
                    @SerializedName("author_patreon_flair")
                    val authorPatreonFlair: Boolean?,
                    @SerializedName("author_premium")
                    val authorPremium: Boolean?,
                    @SerializedName("awarders")
                    val awarders: List<Any?>?,
                    @SerializedName("banned_at_utc")
                    val bannedAtUtc: Any?,
                    @SerializedName("banned_by")
                    val bannedBy: Any?,
                    @SerializedName("can_gild")
                    val canGild: Boolean?,
                    @SerializedName("can_mod_post")
                    val canModPost: Boolean?,
                    @SerializedName("category")
                    val category: Any?,
                    @SerializedName("clicked")
                    val clicked: Boolean?,
                    @SerializedName("content_categories")
                    val contentCategories: Any?,
                    @SerializedName("contest_mode")
                    val contestMode: Boolean?,
                    @SerializedName("created")
                    val created: Double?,
                    @SerializedName("created_utc")
                    val createdUtc: Double?,
                    @SerializedName("discussion_type")
                    val discussionType: Any?,
                    @SerializedName("distinguished")
                    val distinguished: Any?,
                    @SerializedName("domain")
                    val domain: String?,
                    @SerializedName("downs")
                    val downs: Int?,
                    @SerializedName("edited")
                    val edited: Boolean?,
                    @SerializedName("gilded")
                    val gilded: Int?,
                    @SerializedName("gildings")
                    val gildings: Gildings?,
                    @SerializedName("hidden")
                    val hidden: Boolean?,
                    @SerializedName("hide_score")
                    val hideScore: Boolean?,
                    @SerializedName("id")
                    val id: String?,
                    @SerializedName("is_created_from_ads_ui")
                    val isCreatedFromAdsUi: Boolean?,
                    @SerializedName("is_crosspostable")
                    val isCrosspostable: Boolean?,
                    @SerializedName("is_meta")
                    val isMeta: Boolean?,
                    @SerializedName("is_original_content")
                    val isOriginalContent: Boolean?,
                    @SerializedName("is_reddit_media_domain")
                    val isRedditMediaDomain: Boolean?,
                    @SerializedName("is_robot_indexable")
                    val isRobotIndexable: Boolean?,
                    @SerializedName("is_self")
                    val isSelf: Boolean?,
                    @SerializedName("is_video")
                    val isVideo: Boolean?,
                    @SerializedName("likes")
                    val likes: Any?,
                    @SerializedName("link_flair_background_color")
                    val linkFlairBackgroundColor: String?,
                    @SerializedName("link_flair_css_class")
                    val linkFlairCssClass: Any?,
                    @SerializedName("link_flair_richtext")
                    val linkFlairRichtext: List<Any?>?,
                    @SerializedName("link_flair_text")
                    val linkFlairText: Any?,
                    @SerializedName("link_flair_text_color")
                    val linkFlairTextColor: String?,
                    @SerializedName("link_flair_type")
                    val linkFlairType: String?,
                    @SerializedName("locked")
                    val locked: Boolean?,
                    @SerializedName("media")
                    val media: Any?,
                    @SerializedName("media_embed")
                    val mediaEmbed: MediaEmbed?,
                    @SerializedName("media_only")
                    val mediaOnly: Boolean?,
                    @SerializedName("mod_note")
                    val modNote: Any?,
                    @SerializedName("mod_reason_by")
                    val modReasonBy: Any?,
                    @SerializedName("mod_reason_title")
                    val modReasonTitle: Any?,
                    @SerializedName("mod_reports")
                    val modReports: List<Any?>?,
                    @SerializedName("name")
                    val name: String?,
                    @SerializedName("no_follow")
                    val noFollow: Boolean?,
                    @SerializedName("num_comments")
                    val numComments: Int?,
                    @SerializedName("num_crossposts")
                    val numCrossposts: Int?,
                    @SerializedName("num_reports")
                    val numReports: Any?,
                    @SerializedName("over_18")
                    val over18: Boolean?,
                    @SerializedName("parent_whitelist_status")
                    val parentWhitelistStatus: String?,
                    @SerializedName("permalink")
                    val permalink: String?,
                    @SerializedName("pinned")
                    val pinned: Boolean?,
                    @SerializedName("pwls")
                    val pwls: Int?,
                    @SerializedName("quarantine")
                    val quarantine: Boolean?,
                    @SerializedName("removal_reason")
                    val removalReason: Any?,
                    @SerializedName("removed_by")
                    val removedBy: Any?,
                    @SerializedName("removed_by_category")
                    val removedByCategory: Any?,
                    @SerializedName("report_reasons")
                    val reportReasons: Any?,
                    @SerializedName("saved")
                    val saved: Boolean?,
                    @SerializedName("score")
                    val score: Int?,
                    @SerializedName("secure_media")
                    val secureMedia: Any?,
                    @SerializedName("secure_media_embed")
                    val secureMediaEmbed: SecureMediaEmbed?,
                    @SerializedName("selftext")
                    val selftext: String?,
                    @SerializedName("selftext_html")
                    val selftextHtml: String?,
                    @SerializedName("send_replies")
                    val sendReplies: Boolean?,
                    @SerializedName("spoiler")
                    val spoiler: Boolean?,
                    @SerializedName("stickied")
                    val stickied: Boolean?,
                    @SerializedName("subreddit")
                    val subreddit: String?,
                    @SerializedName("subreddit_id")
                    val subredditId: String?,
                    @SerializedName("subreddit_name_prefixed")
                    val subredditNamePrefixed: String?,
                    @SerializedName("subreddit_subscribers")
                    val subredditSubscribers: Int?,
                    @SerializedName("subreddit_type")
                    val subredditType: String?,
                    @SerializedName("suggested_sort")
                    val suggestedSort: Any?,
                    @SerializedName("thumbnail")
                    val thumbnail: String?,
                    @SerializedName("title")
                    val title: String?,
                    @SerializedName("top_awarded_type")
                    val topAwardedType: Any?,
                    @SerializedName("total_awards_received")
                    val totalAwardsReceived: Int?,
                    @SerializedName("treatment_tags")
                    val treatmentTags: List<Any?>?,
                    @SerializedName("ups")
                    val ups: Int?,
                    @SerializedName("upvote_ratio")
                    val upvoteRatio: Double?,
                    @SerializedName("url")
                    val url: String?,
                    @SerializedName("user_reports")
                    val userReports: List<Any?>?,
                    @SerializedName("view_count")
                    val viewCount: Any?,
                    @SerializedName("visited")
                    val visited: Boolean?,
                    @SerializedName("whitelist_status")
                    val whitelistStatus: String?,
                    @SerializedName("wls")
                    val wls: Int?
                ) {
                    class Gildings

                    class MediaEmbed

                    class SecureMediaEmbed
                }

                class Gildings

                data class MediaEmbed(
                    @SerializedName("content")
                    val content: String?,
                    @SerializedName("height")
                    val height: Int?,
                    @SerializedName("scrolling")
                    val scrolling: Boolean?,
                    @SerializedName("width")
                    val width: Int?
                )

                data class MediaMetadata(
                    @SerializedName("s4mqcrauq23a1")
                    val s4mqcrauq23a1: S4mqcrauq23a1?
                ) {
                    data class S4mqcrauq23a1(
                        @SerializedName("e")
                        val e: String?,
                        @SerializedName("id")
                        val id: String?,
                        @SerializedName("m")
                        val m: String?,
                        @SerializedName("p")
                        val p: List<P?>?,
                        @SerializedName("s")
                        val s: S?,
                        @SerializedName("status")
                        val status: String?
                    ) {
                        data class P(
                            @SerializedName("u")
                            val u: String?,
                            @SerializedName("x")
                            val x: Int?,
                            @SerializedName("y")
                            val y: Int?
                        )

                        data class S(
                            @SerializedName("u")
                            val u: String?,
                            @SerializedName("x")
                            val x: Int?,
                            @SerializedName("y")
                            val y: Int?
                        )
                    }
                }

                data class SecureMediaEmbed(
                    @SerializedName("content")
                    val content: String?,
                    @SerializedName("height")
                    val height: Int?,
                    @SerializedName("media_domain_url")
                    val mediaDomainUrl: String?,
                    @SerializedName("scrolling")
                    val scrolling: Boolean?,
                    @SerializedName("width")
                    val width: Int?
                )
            }
        }
    }
}