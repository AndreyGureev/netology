package block2

import block2.Attachment.Attachments

enum class PostType {
    Post, Copy, Reply, Postpone, Suggest
}

enum class Type {
    Vk, Widget, Api, Rss, Sms
}

enum class Platform {
    Android, Iphone, WPhone
}

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean = false,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val postSource: PostSource,
//    val attachments: Array<Attachments>?,
    val geo: Geo,
    val signerId: Int,
    val copyHistory: Array<Post>?,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean = true,
    val donut: Donut,
    val postponedId: Int
) {
    data class Comments(
        val count: Int,
        val canPost: Boolean = true,
        val groupsCanPost: Boolean = true,
        val canClose: Boolean = true,
        val canOpen: Boolean = true
    )

    data class Copyright(
        val id: Int,
        val link: String,
        val name: String,
        val type: String
    )

    data class Likes(
        val count: Int,
        val userLikes: Boolean = true,
        val canLike: Boolean = true,
        val canPublish: Boolean = false
    )

    data class Reposts(
        val count: Int,
        val userReposted: Boolean = false
    )

    data class Views(
        val count: Int,
    )

    data class PostSource(
        val type: Type,
        val platform: Platform,
        val url: String
    )

    data class Geo(
        val type: String,
        val coordinates: String,
        val place: Place?
    ) {
        data class Place(
            val id: Int,
            val title: String,
            val latitude: Int,
            val longitude: Int,
            val created: Int,
            val icon: String,
            val checkins: Int,
            val updated: Int,
            val type: Int,
            val country: Int,
            val city: Int,
            val address: String
        )
    }

    data class Donut(
        val isDonut: Boolean,
        val paidDuration: Int,
        val placeholder: String,
        val canPublishFreeCopy: Boolean,
        val editMode: EditMode?
    ) {
        data class EditMode(
            val all: String,
            val duration: String
        )
    }
}
