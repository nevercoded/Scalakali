package learn

class Person {

	private var firstName:String="Sushanth";
	private var lastName:String ="Reddy";
	protected var address:String = "Sunnyvale";
	protected var age:Int = 0;
	val immutableObject: String = "IAMSTRONG";
	
	def setFirstName(first:String){
	  this.firstName = first;
	}
	
	def setLastName(last:String){
	  this.lastName = last;
	}
	
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

class NicePerson extends Person{
	
	def setAge(ag:Int)={
	  this.age = ag;
	}
	
	def getTheAge():Int = {	 
      return this.age;
	}
}
