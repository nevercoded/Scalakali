object DataAbstraction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val	x = new Rational(10,20)                   //> x  : Rational = 10/20
  x.numerator                                     //> res0: Int = 10
  x.denominator                                   //> res1: Int = 20
  
  val added = x.add(new Rational(1,2))            //> added  : Rational = 41/40
  added.numerator                                 //> res2: Int = 41
  added.denominator                               //> res3: Int = 40
  added.display()                                 //> 
  
}

 class Rational(x:Int, y:Int){
 	def numerator = x;
 	def denominator = y;
 	
 	def display(){
 	 printf(numerator + "/" + denominator)
 	}
 	
 	override def toString = numerator + "/" + denominator
 	def add(that:Rational)={
 		new Rational(numerator*that.denominator + denominator+that.numerator,denominator*that.denominator);
 	}
 };