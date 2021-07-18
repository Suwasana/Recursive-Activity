object Main extends App {
      def GCD (c:Int,b:Int): Int=b match {
      case 0=> c
      case y if y>c => GCD (y,c)
      case _ => GCD(b,c%b)
    }

    def prime(p:Int, n:Int=2):Boolean = n match{
      case y if(p==y) => true
      case y if (GCD(p,y)>1) => false
      case y => prime(p,y+1)
     }

    println(prime(5))
    println(prime(8))
}