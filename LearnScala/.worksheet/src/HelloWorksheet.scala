object HelloWorksheet {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  println("Welcome to the Scala worksheet");$skip(14); 
  var i = 10;System.out.println("""i  : Int = """ + $show(i ));$skip(30); ;
	def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(17); val res$0 = 
    increase(i);System.out.println("""res0: Int = """ + $show(res$0));$skip(13); ;
	var j = 20;System.out.println("""j  : Int = """ + $show(j ));$skip(41); ;
	
	// semi colon is optional
	var k = 10;System.out.println("""k  : Int = """ + $show(k ));$skip(8); 
	j = 20
	
	// Defining Name
	object Name{
		var firstName = "Sushanth";
		var lastName = "Reddy";
		
		def printName(){
			println(firstName + lastName);
		}
	};$skip(172); 
	Name.printName();
	
	class AnyName{
		var firstName="Sushanth ";
		var lastName="Reddy";
		
		def printName(){
			println(firstName+lastName);
		}
	};$skip(161); 
	
	var name = new AnyName();System.out.println("""name  : HelloWorksheet.AnyName = """ + $show(name ));$skip(30); ;
	name.firstName = "sushanth";$skip(26); ;
	name.lastName = "reddy";$skip(19); ;
	name.printName();}
	
	
	
	
}