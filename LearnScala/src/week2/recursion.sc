object recursion {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def printName()={
  	println("This is a recursion worksheet");
  };                                              //> printName: ()Unit
  
  printName();                                    //> This is a recursion worksheet
  
  def factorial(n:Int):Int={
  	if(n==0)return 1;
		return n*factorial(n-1);
  }                                               //> factorial: (n: Int)Int
  
  factorial(4);                                   //> res0: Int = 24
 
 	def sumInt(a:Int,b:Int):Int={
 		if(a>b)return 0;
 		else a+sumInt(a+1,b);
 	}                                         //> sumInt: (a: Int, b: Int)Int
 	sumInt(1,5);                              //> res1: Int = 15
  
  // Defining a generic function
  def sum(f:Int=>Int,a:Int,b:Int):Int={
  	if(a>b) return 0;
  	else{
  		f(a)+ sum(f,a+1,b);
  	}
  }                                               //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  def cube(x:Int):Int = {x*x*x}                   //> cube: (x: Int)Int
  // passing function as argument
  sum(cube,1,5)                                   //> res2: Int = 225
  // Passing anonymous function
  sum(x=>x*x,1,5)                                 //> res3: Int = 55
}