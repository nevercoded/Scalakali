package week1

object Main {

  def main(args: Array[String]){
    //Using ExampleFunctions
    var exFunc = new ExampleFunctions();
    println(exFunc.add(100,100));
    println(exFunc.add(2,22));
    println(exFunc.sqrt(2));
    println(exFunc.sqrt(200));
    println(exFunc.sqrt(1.22));
    println(exFunc.sqrt(1.2e33));
  }

}