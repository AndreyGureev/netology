package block3.NoteService

import java.time.LocalDateTime
import java.time.ZoneOffset

data class Comment(
    val id: Int = 1,
    val ownerId: Int = 1,
    var text: String,
    var isDeleted: Boolean = false,
    val date: Long = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC),
    val comments: MutableList<Comment> = mutableListOf(),
) : Notable<Comment> {
    override fun addTo(dest: MutableList<Comment>) {
        if (dest.isEmpty()) dest.add(this.copy(id = 1))
        else dest.add(this.copy(id = dest.last().id + 1))
    }

    override fun delete() {
        isDeleted = true
    }

    override fun restore() {
        isDeleted = false
    }

    override fun getCommentById(id: Int): Comment {
        for (comment in comments) {
            if (comment.id == id && !comment.isDeleted) return comment
        }
        throw CommentIdNotFoundException("Comment Id not found!")
    }

    fun edit(text: String) {
        this.text = text
    }

    override fun getCommentByIdForced(id: Int): Comment {
        for (comment in comments) {
            if (comment.id == id) return comment
        }
        throw CommentIdNotFoundException("Comment Id not found!")
    }
}