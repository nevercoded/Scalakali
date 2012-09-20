package learn

class Person {

	var firstName="Sushanth";
	var lastName ="Reddy";
	var address = "Sunnyvale";
	
	def printName(){
	  println(firstName + " "+ lastName);
	}
	
	def printAddress(){
	  println(address);
	}
  
	def addNumbers(a:Int,b:Int):Int = {
	  var sum:Int = 0;
      sum = a + b;
      return sum;
	}
	
}