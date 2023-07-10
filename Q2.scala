import scala.io.StdIn
object Q2{
    def main(args: Array[String]): Unit={
        println("Enter the number:")
        var num: Int = StdIn.readInt()
        println(s"All prime numbers less than $num: ")
        primeSeq(num)
    }
    def primeSeq(n:Int):Unit={
        if(isPrime(n)){
            print(s"$n  ")
        }
        if(n>=2){
            primeSeq(n-1)
        }
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