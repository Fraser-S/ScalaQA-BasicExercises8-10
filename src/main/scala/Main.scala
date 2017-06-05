/**
  * Created by Fraser on 05/06/2017.
  */
object Main {

  //adds two value together if add is true,if false will multiply them together
  def addition(num1 : Int, num2 : Int, add : Boolean) : Int= {

    var num3 : Int = 0

    if(add){
      //if add is true add the numbers
      num3 = num1 + num2
    } else {
      //if add is false multiply them
      num3 = num1 * num2
    }
    num3
  }

  def main(args : Array[String]) : Unit = {
    println("2 + 5 = " + addition(2,5, true))
    println("2 * 5 = " + addition(2,5,false))

  }
}
