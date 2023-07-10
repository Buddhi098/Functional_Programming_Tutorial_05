import scala.io.StdIn
object q1{
    def main(args: Array[String]): Unit={
        println("Enter the number:")
        var num: Int = StdIn.readInt()
        var result: Boolean = isPrime(num)
        println(s"Answer: $result")
    }

    def isPrime(n:Int , p:Int=2):Boolean={
        if(p==n){
            return true
        }
        else if(n%p==0){
            return false
        }else{
            return isPrime(n , p+1)
        }
    }
}