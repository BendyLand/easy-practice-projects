package taskManager

case class Task(id: Int, body: String)
case class Tasks(tasks: Array[Task])

class TaskManager(var tasks: Tasks = Tasks(Array.empty)):
    private var nextId = 1
    def add(task: String) =
        val newTask = Task(nextId, task)
        tasks = Tasks(tasks._1 :+ newTask)
        nextId += 1

    def remove(id: Int) =
        tasks = Tasks(tasks._1.filter(_.id != id))

    def display =
        tasks.tasks.foreach { task =>
            println(s"${task.id}.) ${task.body}")
        }

