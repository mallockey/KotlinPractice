package academy.learnprogramming.kotlinpractice

fun nullReferences() {

    val str: String? = "This isn't null"
    val str4 = str!!.uppercase() // Use !! to say will NEVER be null
    println(str?.uppercase())

    str?.let { printText(it) }

    //The below is the same thing
    if (str == null) {
        null
    } else {
        str.uppercase()
    }

    // Defining default value if any of these is null
    //val whatever = bankBranch?.address?.country : "US"
    val str2 = str ?: "This is the default value"

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String// you can also safe cast operator
    println(str3)

    val nullableInts = arrayOfNulls<Int?>(5)
}

fun printText(text: String) {
    println(text)
}