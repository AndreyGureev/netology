package block3.ChatService

fun main() {
    UserService.addUser(User(name = "Алексей"))
    UserService.addUser(User(name = "Владимир"))
    UserService.addUser(User(name = "Кирилл"))
    UserService.addUser(User(name = "Дмитрий"))
    UserService.addUser(User(name = "Павел"))

    val alexey = UserService.findUserByName("Алексей")
    val vladimir = UserService.findUserByName("Владимир")
    val kirill = UserService.findUserByName("Кирилл")
    val dmitriy = UserService.findUserByName("Дмитрий")
    val pavel = UserService.findUser { user -> user.id == UserService.findUser { it.name == "Павел" }.id }


    ChatService.createMessage(alexey, vladimir, "Здравствуйте")
    ChatService.createMessage(vladimir, alexey, "Приветствую")
    ChatService.createMessage(kirill, pavel, "Добрый день")
    ChatService.createMessage(pavel, kirill, "Привет")
    ChatService.createMessage(vladimir, alexey, "Как дела, на работе?")
    ChatService.createMessage(kirill, pavel, "Всё хорошо")
    ChatService.createMessage(pavel, kirill, "Отлично")
    ChatService.createMessage(kirill, pavel, "Всё ок")
    ChatService.createMessage(dmitriy, kirill, "А у меня отпуск")


    println("\nВсего чатов: ${ChatService.getChatsNumber()}")
    println("Из них непрочитанных: ${ChatService.getUnreadChatsCount()}")

    ChatService.deleteChat(ChatService.getChatByUsers(vladimir, alexey))
    println("\nПосле удаления одного из чатов:")
    println("Всего чатов: ${ChatService.getChatsNumber()}")
    println("Из них непрочитанных: ${ChatService.getUnreadChatsCount()}")

    println("Количество чатов пользователя ${pavel.name}: ${pavel.getChatsList().size} ")

    println(
        "\nСообщения пользователей ${pavel.name} и ${kirill.name}:\n${
            ChatService.getMessagesStringByUsers(
                kirill,
                pavel
            )
        }"
    )
}