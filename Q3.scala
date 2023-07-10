import scala.io.StdIn
object Q3{
    def main(args: Array[String]): Unit={
        println("Enter the number:")
        var num: Int = StdIn.readInt()
        var result: Int =     sumOfNumbers(num)
        println(s"addition of numbers from 1 to $num: $result")
    }
    def sumOfNumbers(n:Int , sum:Int=1): Int={
        if(n==1){
            return sum
        }else{
            return sumOfNumbers(n-1 , n+sum)
        }
    }
}