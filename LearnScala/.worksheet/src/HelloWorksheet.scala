object HelloWorksheet {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
  println("Welcome to the Scala worksheet");$skip(14); 
  var i = 10;System.out.println("""i  : Int = """ + $show(i ));$skip(30); ;
	def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(i);System.out.println("""res0: Int = """ + $show(res$0))}
  
}