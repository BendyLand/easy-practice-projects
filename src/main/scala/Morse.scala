package morse

import scala.collection.immutable.HashMap

object MorseCodeTranslator:
    val alphabet = HashMap(
        "A" -> ".-",
        "B" -> "-...",
        "C" -> "-.-.",
        "D" -> "-..",
        "E" -> ".",
        "F" -> "..-.",
        "G" -> "--.",
        "H" -> "....",
        "I" -> "..",
        "J" -> ".---",
        "K" -> "-.-",
        "L" -> ".-..",
        "M" -> "--",
        "N" -> "-.",
        "O" -> "---",
        "P" -> ".--.",
        "Q" -> "--.-",
        "R" -> ".-.",
        "S" -> "...",
        "T" -> "-",
        "U" -> "..-",
        "V" -> "...-",
        "W" -> ".--",
        "X" -> "-..-",
        "Y" -> "-.--",
        "Z" -> "--..",
        "1" -> ".----",
        "2" -> "..---",
        "3" -> "...--",
        "4" -> "....-",
        "5" -> ".....",
        "6" -> "-....",
        "7" -> "--...",
        "8" -> "---..",
        "9" -> "----.",
        "0" -> "-----",
        " " -> " "
    )
    val morseAlphabet = HashMap(
        ".-"    -> "A",
        "-..."  -> "B",
        "-.-."  -> "C",
        "-.."   -> "D",
        "."     -> "E",
        "..-."  -> "F",
        "--."   -> "G",
        "...."  -> "H",
        ".."    -> "I",
        ".---"  -> "J",
        "-.-"   -> "K",
        ".-.."  -> "L",
        "--"    -> "M",
        "-."    -> "N",
        "---"   -> "O",
        ".--."  -> "P",
        "--.-"  -> "Q",
        ".-."   -> "R",
        "..."   -> "S",
        "-"     -> "T",
        "..-"   -> "U",
        "...-"  -> "V",
        ".--"   -> "W",
        "-..-"  -> "X",
        "-.--"  -> "Y",
        "--.."  -> "Z",
        ".----" -> "1",
        "..---" -> "2",
        "...--" -> "3",
        "....-" -> "4",
        "....." -> "5",
        "-...." -> "6",
        "--..." -> "7",
        "---.." -> "8",
        "----." -> "9",
        "-----" -> "0",
        " "     -> " "
    )

    def encrypt(text: String): String =
        var newStr = ""
        text.foreach(char =>
            newStr += alphabet(char.toUpper.toString())
            newStr += " "
        )
        newStr

    def decrypt(text: String): String =
        var newStr = ""
        val splitText = text
            .split(" ")
            .map(x => if x == "" then " " else x)
            
        splitText.foreach(item =>
            newStr += morseAlphabet(item)
        )
        newStr
            .toLowerCase()
            .capitalize
            .replace("  ", " ")