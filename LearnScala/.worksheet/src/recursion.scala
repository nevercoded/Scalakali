object recursion {import scala.runtime.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(73); 
  
  def printName()={
  	println("This is a recursion worksheet");
  };System.out.println("""printName: ()Unit""");$skip(18); ;
  
  printName();$skip(84); ;
  
  def factorial(n:Int):Int={
  	if(n==0)return 1;
		return n*factorial(n-1);
  };System.out.println("""factorial: (n: Int)Int""");$skip(19); val res$0 = 
  
  factorial(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(83); ;
 
 	def sumInt(a:Int,b:Int):Int={
 		if(a>b)return 0;
 		else a+sumInt(a+1,b);
 	};System.out.println("""sumInt: (a: Int, b: Int)Int""");$skip(15); val res$1 = 
 	sumInt(1,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(139); ;
  
  // Defining a generic function
  def sum(f:Int=>Int,a:Int,b:Int):Int={
  	if(a>b) return 0;
  	else{
  		f(a)+ sum(f,a+1,b);
  	}
  };System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(35); 
  
  def cube(x:Int):Int = {x*x*x};System.out.println("""cube: (x: Int)Int""");$skip(50); val res$2 = 
  // passing function as argument
  sum(cube,1,5);System.out.println("""res2: Int = """ + $show(res$2));$skip(50); val res$3 = 
  // Passing anonymous function
  sum(x=>x*x,1,5);System.out.println("""res3: Int = """ + $show(res$3))}
}