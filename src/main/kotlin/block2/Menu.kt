package block2

// «2.2. ООП: Объекты и классы»
// Задача №1 - Посты
fun main() {
    val source = Post(
        id = 45,
        232,
        17,
        76,
        20220406,
        "Создание записи",
        12,
        13,
        true,
        Post.Comments(2),
        Post.Copyright(55, "https://dev.vk.com/reference/objects/post", "name", "type"),
        Post.Likes(3),
        Post.Reposts(35436),
        Post.Views(234345757),
        PostType.Post,
        Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
        null,
        Post.Geo("World", "30°58'51''", null),
        65,
        null,
        donut = Post.Donut(
            true,
            60,
            "placeholder",
            false,
            null
        )
    )

    val source1 = Post(
        id = 55,
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
        null,
        Post.Geo("World", "30°58'51''", null),
        65,
        donut = Post.Donut(
            true,
            60,
            "placeholder",
            false,
            null
        ),
        postponedId = 555
    )

    val source2 = Post(
        id = 44,
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
        Post.PostSource(Type.Widget, Platform.Iphone, "https://dev.vk.com/reference/objects/post-source"),
        null,
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

    WallService.add(source1)
    WallService.add(source2)

    print(WallService.update(source))
}
