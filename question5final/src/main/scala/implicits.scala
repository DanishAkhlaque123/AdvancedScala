object implicits extends App{
  def multiply1( x: Int)(implicit y: Int): Int = x * y
  implicit val default=10
  println(multiply1(5))

}
