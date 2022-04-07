package block2.Attachment

class VideoAttachments(video: Video) : Attachments() {
    override val type: String = "Video"

    data class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val duration: Int,
        val url: String,
        val date: Int,
        val views: Int,
        val comments: Int,
        val player: String
    )
}