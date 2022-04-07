@file:Suppress("NAME_SHADOWING")

package block2

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val post = post.copy(id = generationId())
        posts += post
//        println(posts.last())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val postId = post.component1()
        val postNext = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(
                    fromId = postNext.fromId,
                    createdBy = postNext.createdBy,
                    text = postNext.text,
                    replyOwnerId = postNext.replyOwnerId,
                    replyPostId = postNext.replyPostId,
                    friendsOnly = postNext.friendsOnly,
                    comments = postNext.comments,
                    copyright = postNext.copyright,
                    likes = postNext.likes,
                    reposts = postNext.reposts,
                    views = postNext.views,
                    postType = postNext.postType,
                    signerId = postNext.signerId,
                    canPin = postNext.canPin,
                    canDelete = postNext.canDelete,
                    canEdit = postNext.canEdit,
                    isPinned = postNext.isPinned,
                    markedAsAds = postNext.markedAsAds,
                    isFavorite = postNext.isFavorite,
                    postponedId = postNext.postponedId,
                    postSource = postNext.postSource,
                    geo = postNext.geo,
                    copyHistory = postNext.copyHistory,
                    attachments = postNext.attachments
                )
//                println(posts[index])
                return true
            }
        }
        return false
    }

    private var memoryIdPost: Int = 1

    private fun generationId(): Int {
        memoryIdPost += 1
        return memoryIdPost - 1
    }

    fun clearArr() {
        posts = emptyArray()
        memoryIdPost = 1
    }
}