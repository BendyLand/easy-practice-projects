package todo

case class Task(id: Int, body: String)
case class Tasks(tasks: Array[Task])

class TodoList(var tasks: Tasks = Tasks(Array.empty)):
    private var nextId = 1
    def add(task: String) =
        val newTask = Task(nextId, task)
        tasks = Tasks(tasks._1 :+ newTask)
        nextId += 1
        this.save 

    def remove(id: Int) =
        tasks = Tasks(tasks._1.filter(_.id != id))
        this.save

    import java.io.FileWriter
    import java.io.File
    def save =
        val path = "./TodoList.txt"
        var result = ""
        tasks._1.foreach { task =>
            result += s"${task.id}\t${task.body}"
            result += "\n"
        }
        val fileWriter = FileWriter(File(path))
        fileWriter.write(result)
        fileWriter.close()

    def parse =
        val path = "./TodoList.txt"
        var result = ""
        if File(path).exists() then
            val source = scala.io.Source.fromFile(path)
            val lines = try source.mkString finally source.close()
            val listOfTasks = lines.split("\n")
            listOfTasks.foreach { task =>
                val formattedTask = task.split("\t").mkString(" ")
                result += s"${formattedTask}\n"
            }
        else
            println("File does not exist")

        result
