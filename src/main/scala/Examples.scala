package examples

object Examples:

    import quotes.*
    def randomQuotesExample = 
        val quoteGenerator = QuoteGenerator
        val quotes = quoteGenerator.chooseThreeQuotes
        quoteGenerator.displayQuotes

    import todo.*
    def todoExample =
        val todo = TodoList()
        todo.add("Ben")
        todo.add("Olivia")
        todo.add("Mom")
        todo.add("Bob")
        println(todo.parse)
        todo.remove(4)
        println(todo.parse)
        todo.add("Stormy")
        println(todo.parse)

    import calculator.Calculator
    def calculatorExample =
        val calculator = Calculator
        val n1 = 5
        val n2 = 3
        val n3 = 0
        println("5 + 3 = " + calculator.add(n1, n2))
        println("5 - 3 = " + calculator.subtract(n1, n2))
        println("5 * 3 = " + calculator.multiply(n1, n2))
        println("5 / 3 = " + calculator.divide(n1, n2))
        println("5 / 0 = " + calculator.divide(n1, n3))
        println("0 / 5 = " + calculator.divide(n3, n1))
        println()

    import taskManager.TaskManager
    def taskManagerExample =
        val taskManager = TaskManager()
        taskManager.add("one")
        taskManager.add("two")
        taskManager.add("three")
        taskManager.add("four")
        taskManager.display
        taskManager.remove(3)
        println() // line break
        taskManager.display
        println()

    def summarize =
        var projects = List(
            "Task Manager",
            "Calculator",
            "Todo List",
            "Random Quote Generator",
            "Temperature Converter",
            "Dice Roller",
            "Basic File Manager",
            "Palindrome Checker",
            "Morse Code Translator",
            "Simple Quiz Game"
            )
        var completed = List.empty[String]
        def completeTask(task: String) =
            if projects.contains(task) then
                projects = projects.filter(_ != task)
                completed = task +: completed
            else
                println("Task not found.")

        completeTask("Task Manager")
        completeTask("Calculator")
        completeTask("Todo List")

        println(s"\nNumber of projects completed: ${completed.size}\n")
        println("Unfinished projects remaining: \n")
        projects.foreach(println)
        println()






