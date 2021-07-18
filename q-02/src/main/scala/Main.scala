object Main extends App {

  def GCD (a:Int,b:Int): Int=b match {
    case 0=> a
    case c if c>a => GCD (c,a)
    case _ => GCD(b,a%b)
  }

  def prime(p:Int, n:Int=2):Boolean = n match{
    case c if(p==c) => true
    case c if (GCD(p,c)>1) => false
    case c => prime(p,c+1)
  }

  def primeseq (n:Int): Unit = {
    if (prime(n)) println(n)
    if(n>0) primeseq(n-1)
  }

  primeseq(10)
}