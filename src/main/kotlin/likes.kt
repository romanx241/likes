
fun main() {

    print("Введите количество лайков: ")
    var b: Int
    val `in` = readLine()
    b = `in`!!.toInt()
    println(outMessage(b))
}

fun outMessage(likes: Int): String? {
    var a = 0
    a = likes % 10
    return if (a == 1 && likes > 11) { "Понравилось $likes человеку" } else "Понравилось $likes людям"
}
