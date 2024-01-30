package quotes 

import scala.io.StdIn
import util.control.Breaks.{breakable, break}
import scala.collection.mutable.ArrayBuffer 
import scala.util.Random.shuffle 
import Sections.*

object QuoteGenerator:
    var quotes = Array.empty[String]
    def displayQuotes = 
        val rng = (1 to 3).toList
        rng.zip(quotes).foreach { (i, quote) =>
            println(s"$i.) $quote")
        }
        
    def chooseThreeQuotes =
        var choices: Array[Int] = Array.empty
        println("Please choose three numbers between 1 and 10: ")
        while choices.size < 3 do
            val choice = (StdIn.readInt() - 1)
            breakable {
                if !(0 to 9).contains(choice) then
                    println("Invalid choice, please try again.")
                    break
                else
                    choices = choices :+ choice
            }
        end while 
        shuffleCollections()
        val str1 = s"${subjects(choices(0))} ${verbs(choices(0))} ${complements(choices(0))}"
        shuffleCollections()
        val str2 = s"${subjects(choices(1))} ${verbs(choices(1))} ${complements(choices(1))}"
        shuffleCollections()
        val str3 = s"${subjects(choices(2))} ${verbs(choices(2))} ${complements(choices(2))}"

        quotes = Array(str1, str2, str3)
        

object Sections:
    def shuffleCollections() = 
        (1 to 10).foreach { _ => 
            subjects = shuffle(subjects)
            complements = shuffle(complements)
            verbs = shuffle(verbs)
        }

    var subjects = ArrayBuffer(
        "The universe",
        "A wise old owl",
        "A mischievous cat",
        "Time travel",
        "Quantum physics",
        "Fantasy",
        "Love",
        "Adventure",
        "Technology",
        "Nature",
    )
    var verbs = ArrayBuffer(
        "dances",
        "explores",
        "whispers",
        "inspires",
        "enlightens",
        "embraces",
        "conquers",
        "imagines",
        "awakens",
        "challenges",
    )
    var complements = ArrayBuffer(
        "in the moonlight",
        "with boundless curiosity",
        "like a work of art",
        "beyond the horizon",
        "with open arms",
        "in the heart of chaos",
        "in the pursuit of knowledge",
        "like a gentle breeze",
        "against all odds",
        "with a sense of wonder",
    )