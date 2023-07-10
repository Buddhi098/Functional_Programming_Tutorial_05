import scala.io.StdIn
object Q6{
    def main(args: Array[String]):Unit={
        println("Enter the number:")
        var num: Int = StdIn.readInt()
        fibonacciSeq(num)
    }

    def fibonacci(n:Int): Int = {
        if(n==0){
            return 0
        }else if(n==1){
            return 1
        }else{
            fibonacci(n-1)+fibonacci(n-2)
        }
    }

    def fibonacciSeq(n:Int):Unit={
        if(n>0){
            fibonacciSeq(n-1)
        }
        println(fibonacci(n))
    }
}