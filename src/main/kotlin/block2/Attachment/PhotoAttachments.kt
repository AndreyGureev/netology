package block2.Attachment

class PhotoAttachments(photo: Photo) : Attachments() {
    override val type: String = "Photo"

    data class Photo(
        val id: Int,
        val albumId: Int,
        val ownerId: Int,
        val userId: Int,
        val text: String,
        val date: Int
    )
}