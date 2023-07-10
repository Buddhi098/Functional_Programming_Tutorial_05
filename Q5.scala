import scala.io.StdIn
object Q4{
    def main(args: Array[String]): Unit={
        println("Enter the number:")
        var num: Int = StdIn.readInt()
        if(num%2==0){
            var sum: Int = evenAdition(num)
            println(s"Addition of all even numbers less than $num: $sum")
        }else{
            var sum: Int = evenAdition(num-1)
            println(s"Addition of all even numbers less than $num: $sum")
        }
    }
    def evenAdition(n:Int , sum:Int=0):Int={
        if(n==0){
            return sum
        }else{
            return evenAdition(n-2 , n+sum)
        }
    }
}