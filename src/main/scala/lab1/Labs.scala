package lab1

import java.util

object Labs extends App {
  println(convertCelsiusToFahrenheit(20.0))
  println(formatDate("11/06/15"))
  println(extractData("root:\u200Bx:0:0:root:/root:/bin/bash"))


  private def convertCelsiusToFahrenheit(temp: Double) : Double = (temp * 9 / 5) + 32

  private def formatDate(dateString: String) : String = {
    val arrayOfStrings:Array[String] =  dateString.split("/")
    val dayString: String = arrayOfStrings(0)
    val monthString = arrayOfStrings(1)
    val yearString = arrayOfStrings(2)
    val day: String = getDayFromDate(dayString)
    val month: String = getMonthFromDate(monthString)
    val year: String = "20"+yearString

    day+" "+month+" "+year
  }

  private def getMonthFromDate(month: String): String = {
    month match {
      case "01" => "January"
      case "02" => "February"
      case "03" => "March"
      case "04" => "April"
      case "05" => "May"
      case "06" => "June"
      case "07" => "July"
      case "08" => "August"
      case "09" => "September"
      case "10" => "October"
      case "11" => "November"
      case "12" => "December"
    }
  }

  private def getDayFromDate(dayString: String): String = {
    var day: String = ""
    if(dayString.toInt >= 10 && dayString.toInt <= 14){
      day = dayString + "th"
    } else {
     day = dayString.substring(1) match {
        case i if(i.toInt >= 10 && i.toInt <= 14) => i.toInt+"th"
        case "1" => dayString.toInt+"st"
        case "2" => dayString.toInt+"nd"
        case "3" => dayString.toInt+"rd"
        case _ => dayString.toInt+"th"
      }
    }
    day
  }

  private def extractData(data: String): String = {
  val arrayData: Array[String] = data.split(":")
    s"""
      |Username: ${arrayData(0)}
      |Password: ${arrayData(1)}
      |UserId: ${arrayData(2)}
      |GroupId: ${arrayData(3)}
      |Description: ${arrayData(4)}
      |Home: ${arrayData(5)}
      |Shell: ${arrayData(6)}
      |""".stripMargin
  }
}
