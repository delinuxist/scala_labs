import scala.annotation.tailrec
def sumUntil(n: Int): Int = {
  if(n<= 0) 0
  else n + sumUntil(n-1)
}

def sumOfNumbers(a: Int,b: Int): Int = {
  if(a > b) 0
  else a + sumOfNumbers(a+1,b)
}
sumOfNumbers(2,5)

def sumRange(a: Int,b: Int): Int = {
  @tailrec
  def sumLoop(a: Int,sum: Int): Int = {
    if(a > b) sum
    else sumLoop(a+1,a+sum)
  }
  sumLoop(a,0)
}

sumRange(2,5)
// sumRange(2,5)
// 3,2+0
// 4,3+2+0
// 5,4+3+2+0
// 6,5+4+3+2+0
// acc = 14

def calculateFib(n: Int): Int = {
  @tailrec
  def fib(temp: Int,temp1: Int,counter: Int): Int = {
    if(counter >= n) temp
    else fib(temp1,temp + temp1,counter+1)
  }
  fib(0,1,1)
}
calculateFib(20)

def concatenateStrings(str: String,n: Int ): String = {
  @tailrec
  def loopString(n: Int,concatenatedString: String): String = {
    if(n <= 0) concatenatedString
    else loopString(n-1,concatenatedString+str)
  }
  loopString(n,"")
}

concatenateStrings("hello",4)

def findStringLength(str: String): Int = {
  @tailrec
  def loopCount(count: Int,str: String): Int = {
    if(str == "") count
    else loopCount(count+1,str.tail)
  }
  loopCount(0,str)
}

findStringLength("hellow")


def isPrime(n: Int): String = {
  var flag: Boolean = false
  @tailrec
  def loopPrime(counter: Int): Unit = {

    if(counter < n)
      if(n%counter == 0) flag = true
      else loopPrime(counter+1)
  }
  loopPrime(2)
  if(flag) "Not prime"
  else "Is prime"
}
isPrime(8)

// count characters and return count of characters as map
//def countCharacters(str: String): Map[Char,Int] = {
//  @tailrec
//  def characterCount() = {
////    var data:Map[Char,Int] =
////
////    @tailrec
////    def loop() = {
////
////    }
//  }
//}

//1
val sumOfLengthOfStrings = (str1: String,
                    str2: String,
                    str3: String,
                    str4: String,
                    str5: String) =>
                    str1.length +
                    str2.length +
                    str3.length +
                    str4.length +
                    str5.length

sumOfLengthOfStrings("hello","hi","by","is","of")

//2
val printResult: Int => () => Int = (num: Int) => () => num * 2
val d = printResult(2)

//3
val funct: (String,(Int,(String=>Int))=>Int)=>(Int=>Int) =
  (str: String,func:(Int,(String => Int))=>Int)=>(num: Int) => {
    func(str.length,(str)=> str.length) + num
  }

funct("Obeng",(num: Int,f:(String)=>Int)=>num+f("Obeng"))(5);

//4
val addThreeNumbers = (x:Int) => (y:Int) => (z: Int) => x+y+z
addThreeNumbers(2)(3)(4)

// 5


def calculator(str: String): Int = {
  def workings() = {
      str match {
        case "add" => 2+2
        case "subtract" => 5-2
        case "power" => 2*2
      }
  }
  workings()
}
calculator("subtract")

