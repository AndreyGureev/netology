package block2.Attachment

class AudioAttachments(audio: Audio) : Attachments() {
    override val type: String = "Audio"

    data class Audio(
        val id: Int,
        val ownerId: Int,
        val artist: String,
        val title: String,
        val duration: Int,
        val url: String,
        val date: Int
    )
}