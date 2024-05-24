import scala.io.StdIn

@main
def main(): Unit = {

  var breakloop: Boolean  = false;
  while(!breakloop) {
    println("Enter two numbers separated by space to add (type exit to exit)? ")
    val input = StdIn.readLine();
    if (input == "exit") {
      println("Exiting...")
      breakloop = true;
    } else{
      val parts = input.split(" ")
      if(parts.length != 2){
        println("Invalid input, the total numbers entered must be 2 ")
      } else{
        val num1 = parts(0).toInt;
        val num2 = parts(1).toInt;
        val sum = num1 + num2;

        println("The sum is "+ sum);
      }

    }

  }

}