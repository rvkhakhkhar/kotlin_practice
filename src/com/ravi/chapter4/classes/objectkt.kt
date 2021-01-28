package com.ravi.chapter4.classes

import java.io.File

object Payroll {
    val allEmployees = arrayListOf<String>()
}

object CaseSensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main() {
    val value: String? = "dfdfdf"
    val res = value?.length ?: -1
    println(res)
    val add = Payroll.allEmployees.add("a")

    val files = listOf(File("Z"), File("a"))
    println(files.sortedWith(CaseSensitiveFileComparator))
}