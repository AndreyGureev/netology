@file:Suppress("NAME_SHADOWING")

package block2

object WallService {
    private var posts = emptyArray<Post>()

    fun add(wall: Post): Post {
        val post = wall.copy(id = generationId())
        posts += post
//        println(posts.last())
        return posts.last()
    }

    fun update(wall: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == wall.component1()) {
                posts[index] = post.copy(
                    fromId = wall.fromId,
                    createdBy = wall.createdBy,
                    text = wall.text,
                    replyOwnerId = wall.replyOwnerId,
                    replyPostId = wall.replyPostId,
                    friendsOnly = wall.friendsOnly,
                    comments = wall.comments,
                    copyright = wall.copyright,
                    likes = wall.likes,
                    reposts = wall.reposts,
                    views = wall.views,
                    postType = wall.postType,
                    signerId = wall.signerId,
                    canPin = wall.canPin,
                    canDelete = wall.canDelete,
                    canEdit = wall.canEdit,
                    isPinned = wall.isPinned,
                    markedAsAds = wall.markedAsAds,
                    isFavorite = wall.isFavorite,
                    postponedId = wall.postponedId,
                    postSource = wall.postSource,
                    geo = wall.geo,
                    copyHistory = wall.copyHistory,
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
