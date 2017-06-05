/**
  * Created by Fraser on 05/06/2017.
  */
object Main {

  //adds two value together if add is true,if false will multiply them together. will return the larger number if um1 or num2 is 0
  def addition(num1 : Int, num2 : Int, add : Boolean) : Int= {

    var num3 : Int = 0

    if(num1 == 0 || num2 == 0){
      if(num1 != 0)
        num3 = num1
      else
        num3 = num2
    } else if(add){
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
    println("0,5 passed: " + addition(0,5,false))
    println("2,0 passed: " + addition(2,0,true))
  }
}
