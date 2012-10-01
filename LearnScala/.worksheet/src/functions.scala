object functions {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(39); 
  
  // block visibility
  var x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(28); ;
  var decorateX = {x*x -1};System.out.println("""decorateX  : Int = """ + $show(decorateX ));$skip(22); ;
  var y = decorateX;System.out.println("""y  : Int = """ + $show(y ));$skip(33);  ;
  
  def defDecorateX = {x*x-2};System.out.println("""defDecorateX: => Int""");$skip(24); ;
  var z = defDecorateX;System.out.println("""z  : Int = """ + $show(z ));$skip(26); ;
  var z1 = decorateX + x;;System.out.println("""z1  : Int = """ + $show(z1 ))}
}