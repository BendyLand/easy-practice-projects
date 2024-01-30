package calculator

object Calculator:
    def add(a: Float, b: Float) = 
        a + b

    def subtract(a: Float, b: Float) = 
        a - b
    
    def multiply(a: Float, b: Float) =
        a * b
    
    def divide(a: Float, b: Float) = 
        b match
            case 0 => 0
            case _ => a / b
