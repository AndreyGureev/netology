@file:Suppress("NAME_SHADOWING")

package block2

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val wall = post.copy(id = generationId())
        posts += wall
//        println(posts.last())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, wall) in posts.withIndex()) {
            if (wall.id == wall.component1()) {
                posts[index] = wall.copy(
                    fromId = post.fromId,
                    createdBy = post.createdBy,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    signerId = post.signerId,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    postponedId = post.postponedId,
                    postSource = post.postSource,
                    geo = post.geo,
                    copyHistory = post.copyHistory,
                    attachments = post.attachments
                )
                println(posts[index])
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
