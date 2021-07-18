object Main extends App {

    fibanacciseq(6)

    def fibanacci(n:Int): Int= n match {
      case 0 => 0
      case 1 => 1
      case _ => fibanacci(n-1)+fibanacci(n-2)
    }

    def fibanacciseq(a:Int): Unit = {
      if(a>0) fibanacciseq(a-1)
      println(fibanacci(a))
    }
}