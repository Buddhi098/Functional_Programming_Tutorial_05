import scala.io.StdIn
object Q4{
    def main(args: Array[String]): Unit={
        println("Enter the number:")
        var num: Int = StdIn.readInt()
        if(isEven(num)){
            println("Number is Even")
        }else{
            println("Number is Odd")
        }
    }

    def isEven(n: Int): Boolean = {
        if(n==0){
            return true
        }else{
            return isOdd(n-1)
        }
    }
    def isOdd(n:Int):Boolean = !(isEven(n))
}