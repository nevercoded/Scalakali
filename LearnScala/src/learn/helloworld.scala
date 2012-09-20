package learn

// Different types of import
import java.util.{Date,Locale}
// Use _ instead of * 
import java.util._
import java.text.DateFormat._

// object is a singleton class. No statics in Scala.
object helloworld {
  
	def main(args: Array[String]) {
		// Can use existing java libs
		var date = new Date();		
		println(date + "Hello, world! " +
		    getDateInstance(LONG,Locale.CANADA)+ Locale.FRANCE);
		 
		//Creating an object of that class Person
		var person = new Person();
		person.firstName = "Senior";
		person.lastName = "Hero";
		person.printName
		person.printAddress	
		println(person addNumbers(100,300)); // different infix syntax
	}
}