package i_introduction._10_Object_Expressions

import util.TODO
import util.doc10
import java.util.*

fun todoTask10(): Nothing = TODO(
    """
        Task 10.
        Read about object expressions that play the same role in Kotlin as anonymous classes in Java.

        Add an object expression that provides a comparator to sort a list in a descending order using 'java.util.Collections' class.
        In Kotlin you use Kotlin library extensions instead of java.util.Collections,
        but this example is still a good demonstration of mixing Kotlin and Java code.
    """,
    documentation = doc10()
)

fun task10(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, object: Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int = o2.compareTo(o1)
    })
    // Same as Collections.sort(arrayList, {o1, o2 -> o2.compareTo(o1))}
    // or in Kotlin arrayList.reversed()
    return arrayList
}


class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}