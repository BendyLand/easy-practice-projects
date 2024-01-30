package dice

import scala.io
import scala.util.Random

object DiceRoller:
    private def chooseDice(): (Int, Int) =
        println("Please enter a number 1 - 10: ")
        val numDice = 4
            // io.StdIn.readInt() match
            //     case x: Int if (1 to 10).contains(x) => x
            //     case _: Int => 
            //         println("Invalid choice. Defaulting to 1")
            //         1

        println("Please choose the amount of sides for the dice: ")
        println("a.) 2\nb.) 3\nc.) 4\nd.) 6\ne.) 8\nf.) 10\ng.) 12\nh.) 100")
        val numSides = 6
            // io.StdIn.readLine()
            // .toLowerCase
            // .strip() match
            //     case "a" => 2
            //     case "b" => 3
            //     case "c" => 4
            //     case "d" => 6
            //     case "e" => 8
            //     case "f" => 10
            //     case "g" => 12
            //     case "h" => 100
            //     case _ => 
            //         println("Invalid choice. Defaulting to 6")
            //         6
        (numDice, numSides)
    end chooseDice

    def roll =
        val (numDice, numSides) = chooseDice()
        val numbers: Seq[Int] =
            for i <- 1 to numDice yield
                Random.nextInt(numSides) + 1

        println(s"\nRolling ${numDice}d${numSides}")
        (0 until numbers.size).foreach { i =>
            println(s"Roll ${i+1}: ${numbers(i)}")
        }
