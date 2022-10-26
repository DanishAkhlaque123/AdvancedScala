object question6 extends App{
  class alternet[A](l: List[A]){
    def print123 = l.map(x => println(x))

  }

  implicit def alternet1[B](l1: List[B]) = new alternet(l1)


  val aList=List("Hello","Tabish","Akhlaque")
  aList.print123



}
