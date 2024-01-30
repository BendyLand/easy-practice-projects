package temperature 

object TemperatureConverter:
    def convertToCelsius(temp: Float): Float =
        println(s"$temp in celsius is: ")
        ((temp - 32.0) * (5.0/9.0)).toFloat
        
    def convertToFahrenheit(temp: Float): Float =
        println(s"$temp in fahrenheit is: ")
        ((temp * (9.0/5.0)) + 32.0).toFloat
