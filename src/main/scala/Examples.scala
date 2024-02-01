package examples

object Examples:

    import palindrome.* 
    def palindromeCheckerExample =
        val palindromeChecker = PalindromeChecker
        println(palindromeChecker.check("tacocat"))
        println(palindromeChecker.check("Noxon"))
        println(palindromeChecker.check("the quick brown fox"))
        println(palindromeChecker.check("cigar to go tragic"))


    import filemanager.*
    import java.io.File
    def fileManagerExample =
        val fileManager = FileManager
        fileManager.createFile("./testfile.txt")
        fileManager.createFile("./testfile2.txt")
        fileManager.listFiles("src/main/scala")
        fileManager.deleteFile(File("./testfile.txt"))

    import dice.*
    def diceRollerExample = 
        val diceRoller = DiceRoller
        diceRoller.roll 
        println()

    import temperature.*
    def temperatureConverterExample =
        val tempConverter = TemperatureConverter
        println(tempConverter.convertToCelsius(32)) // 0
        println()
        println(tempConverter.convertToCelsius(212)) // 100
        println()
        println(tempConverter.convertToCelsius(61)) // 16
        println()
        println(tempConverter.convertToFahrenheit(0)) // 32
        println()
        println(tempConverter.convertToFahrenheit(100)) // 212
        println()
        println(tempConverter.convertToFahrenheit(16)) // 61
        println()


    import quotes.*
    def randomQuotesExample = 
        val quoteGenerator = QuoteGenerator
        quoteGenerator.displayQuotes
        println()


    import todo.*
    def todoExample =
        val todo = TodoList()
        todo.add("Cook")
        todo.add("Clean")
        todo.add("Fix")
        todo.add("Build")
        println(todo.parse)
        todo.remove(4)
        println(todo.parse)
        todo.add("Draw")
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
        taskManager.add("Shop")
        taskManager.add("Study")
        taskManager.add("Work")
        taskManager.add("Game")
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
        completeTask("Random Quote Generator")
        completeTask("Temperature Converter")

        println(s"\nNumber of projects completed: ${completed.size}\n")
        println("Unfinished projects remaining: \n")
        projects.foreach(println)
        println()
