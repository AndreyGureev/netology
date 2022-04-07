package block2

import block2.Attachment.AudioAttachments
import block2.Attachment.PhotoAttachments
import block2.Attachment.VideoAttachments
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        WallService.clearArr()
        val total = WallService.add(
            Post(
                id = 23,
                555,
                33,
                99,
                20220406,
                "Создание записи G",
                12,
                13,
                false,
                Post.Comments(2),
                Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
                Post.Likes(3),
                Post.Reposts(35436),
                Post.Views(234345757),
                PostType.Post,
                Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
                arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            14,
                            167,
                            "Rammstein",
                            "Engel",
                            265,
                            "https://www.rammsteinworld.com",
                            19970401
                        )
                    )
                ),
                Post.Geo("World", "30°58'51''", null),
                65,
                null,
                donut = Post.Donut(
                    true,
                    60,
                    "placeholder",
                    false,
                    null
                ),
                postponedId = 555
            )
        )
        assertNotEquals(0, total.id)
    }

    @Test
    fun updateTrue() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 23,
                555,
                33,
                99,
                20220406,
                "Создание записи X",
                12,
                13,
                false,
                Post.Comments(2),
                Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
                Post.Likes(3),
                Post.Reposts(35436),
                Post.Views(234345757),
                PostType.Post,
                Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
                arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            31,
                            221,
                            "YouTube",
                            265,
                            "https://www.youtube.com/watch?v=x2rQzv8OWEY",
                            20150715,
                            676,
                            138269570,
                            "GOM"
                        )
                    ), PhotoAttachments(
                        PhotoAttachments.Photo(
                            234, 24, 77, 9, "Single", 1994
                        )
                    )
                ),
                Post.Geo("World", "30°58'51''", null),
                65,
                null,
                donut = Post.Donut(
                    true,
                    60,
                    "placeholder",
                    false,
                    null
                ),
                postponedId = 555
            )
        )
        WallService.add(
            Post(
                id = 23,
                555,
                33,
                99,
                20220406,
                "Создание записи X",
                12,
                13,
                false,
                Post.Comments(2),
                Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
                Post.Likes(3),
                Post.Reposts(35436),
                Post.Views(234345757),
                PostType.Post,
                Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
                arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            14,
                            167,
                            "Rammstein",
                            "Engel",
                            265,
                            "https://www.rammsteinworld.com",
                            19970401
                        )
                    )
                ),
                Post.Geo("World", "30°58'51''", null),
                65,
                null,
                donut = Post.Donut(
                    true,
                    60,
                    "placeholder",
                    false,
                    null
                ),
                postponedId = 555
            )
        )
        val total = WallService.update(
            Post(
                id = 1,
                555,
                33,
                99,
                20220406,
                "Создание записи X",
                12,
                13,
                false,
                Post.Comments(2),
                Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
                Post.Likes(3),
                Post.Reposts(35436),
                Post.Views(234345757),
                PostType.Post,
                Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
                arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            31,
                            221,
                            "YouTube",
                            265,
                            "https://www.youtube.com/watch?v=x2rQzv8OWEY",
                            20150715,
                            676,
                            138269570,
                            "GOM"
                        )
                    ), PhotoAttachments(
                        PhotoAttachments.Photo(
                            234, 24, 77, 9, "Single", 1994
                        )
                    )
                ),
                Post.Geo("World", "30°58'51''", null),
                65,
                null,
                donut = Post.Donut(
                    true,
                    60,
                    "placeholder",
                    false,
                    null
                ),
                postponedId = 555
            )
        )
        assertTrue(total)
    }

    @Test
    fun updateFalse() {
        WallService.clearArr()
        WallService.add(
            Post(
                id = 23,
                555,
                33,
                99,
                20220406,
                "Создание записи X",
                12,
                13,
                false,
                Post.Comments(2),
                Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
                Post.Likes(3),
                Post.Reposts(35436),
                Post.Views(234345757),
                PostType.Post,
                Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
                arrayOf(
                    AudioAttachments(
                        AudioAttachments.Audio(
                            14,
                            167,
                            "Rammstein",
                            "Engel",
                            265,
                            "https://www.rammsteinworld.com",
                            19970401
                        )
                    )
                ),
                Post.Geo("World", "30°58'51''", null),
                65,
                null,
                donut = Post.Donut(
                    true,
                    60,
                    "placeholder",
                    false,
                    null
                ),
                postponedId = 555
            )
        )

        val total = WallService.update(
            Post(
                id = 23,
                555,
                33,
                99,
                20220406,
                "Создание записи X",
                12,
                13,
                false,
                Post.Comments(2),
                Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
                Post.Likes(3),
                Post.Reposts(35436),
                Post.Views(234345757),
                PostType.Post,
                Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
                arrayOf(
                    VideoAttachments(
                        VideoAttachments.Video(
                            31,
                            221,
                            "YouTube",
                            265,
                            "https://www.youtube.com/watch?v=x2rQzv8OWEY",
                            20150715,
                            676,
                            138269570,
                            "GOM"
                        )
                    ), PhotoAttachments(
                        PhotoAttachments.Photo(
                            234, 24, 77, 9, "Single", 1994
                        )
                    )
                ),
                Post.Geo("World", "30°58'51''", null),
                65,
                null,
                donut = Post.Donut(
                    true,
                    60,
                    "placeholder",
                    false,
                    null
                ),
                postponedId = 555
            )
        )
        assertFalse(total)
    }
}