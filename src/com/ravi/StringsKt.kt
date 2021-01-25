package com.ravi

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val extension = fullName.substringBeforeLast(".")
    val fileName = fullName.substringAfterLast(".")

    println("Directory : $directory\n Full File Name: $fullName\n Extension: $extension\n File Name: $fileName")
}

fun parseWithRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {

    parsePath("/Users/khakhkhar/ravi.txt")
    parseWithRegex("/Users/khakhkhar/ravi.txt")

    val price = """${'$'}99.9"""
    println(price)
    val kotlinLogo = """
        .|  //
        .|//
        .|/ \    
    """.trimMargin(".")
    println(kotlinLogo)
}