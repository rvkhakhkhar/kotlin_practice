import com.ravi.Table

fun max(
        a: Int,
        b: Int
) = if (a > b) a else b

fun main(args: Array<String>): Unit {
    val answer: Int = 1
    val message = if (args.size == 1) {
        println("it's one branch")
        "It's one"
    } else {
        println("it's two branch")
        "It's two"
    }

    val languages = arrayListOf(
            "java",
            "c#"
    )

    val table = Table(45, 645, 90, true)
    println("area ${table.area}")
    println(table.height)
    println("circumference ${table.circumference}")
    table.width = 100
    table.isRounded = false
    println("New table $table")
    println("New table Area method ${table.getArea1(5)}")

    languages.add("python")

    println(languages)
    println("Dollar \$${max(15, 10)}")
    println("message $message")
    println("hello, ${if (args.isNotEmpty()) args[0] else "someone"}")
}

