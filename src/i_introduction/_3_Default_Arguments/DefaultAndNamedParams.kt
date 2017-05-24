package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloads of 'JavaCode3.foo()' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add parameters and replace 'todoTask3()' with a real body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

fun foo(name: String): String = todoTask3()

fun task3(): String {
//    todoTask3()
    print((JavaCode3().foo("a") +
            JavaCode3().foo("b", 1) +
            JavaCode3().foo("c", true) +
            JavaCode3().foo("d",2,true)))
    return (JavaCode3().foo("a") +
            JavaCode3().foo("b", 1) +
            JavaCode3().foo("c", true) +
            JavaCode3().foo("d",2,true))
}
