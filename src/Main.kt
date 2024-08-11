/*
println() is a synchronous call because the task of printing the text to the output is completed before execution
can move to the next line of code. Because each function call in main() is synchronous, the entire main()
function is synchronous. Whether a function is synchronous or asynchronous is determined by the parts that
it's composed of. A synchronous function returns only when its task is fully complete. So after the last print
statement in main() is executed, all work is done. The main() function returns and the program ends.
 */
fun main() {
    println("Weather forecast")
    println("Sunny")
}