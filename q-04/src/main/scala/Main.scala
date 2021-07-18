object Main extends App {

  find (14)
  find (13)

  def find (n:Int): Unit = {
    if(n==0) println("even")
    else if(n==1) println("odd")
    else find (n-2)
  }
}