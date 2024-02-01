package filemanager 

import scala.io.StdIn
import java.io.File

object FileManager:
    def getPath = 
        val input = StdIn.readLine().strip()
        File(input)
        .listFiles()
        .isEmpty match
            case true => "./"
            case false => input 

    def listFiles(path: String) =
        val files = File(path).listFiles()
        try files.foreach(println)
        catch case _: NullPointerException =>
            println("Error: Invalid directory")
        finally println("Closing directory")

    def createFile(path: String) =
        File(path).createNewFile() match 
            case true => println("File created successfully!")
            case false => println("Error creating file.")        

    def deleteFile(file: File) =
        file.exists() match
            case true => 
                file.delete()
                println("File deleted successfully!")
            case false => println("Error: File not found.")
