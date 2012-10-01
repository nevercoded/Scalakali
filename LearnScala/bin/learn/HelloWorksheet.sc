object HelloWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var i = 10;                                     //> i  : Int = 10
	def increase(i: Int) = i + 1              //> increase: (i: Int)Int
    increase(i);                                  //> res0: Int = 11
	var j = 20;                               //> j  : Int = 20
	
	// semi colon is optional
	var k = 10                                //> k  : Int = 10
	j = 20
	
	// Defining Name
	object Name{
		var firstName = "Sushanth";
		var lastName = "Reddy";
		
		def printName(){
			println(firstName + lastName);
		}
	}
	Name.printName();                         //> SushanthReddy
	
	class AnyName{
		var firstName="Sushanth ";
		var lastName="Reddy";
		
		def printName(){
			println(firstName+lastName);
		}
	}
	
	var name = new AnyName();                 //> name  : HelloWorksheet.AnyName = HelloWorksheet$$anonfun$main$1$AnyName$1@16
                                                  //| 0e796
	name.firstName = "sushanth";
	name.lastName = "reddy";
	name.printName();                         //> sushanthreddy
	
	
	
	
}