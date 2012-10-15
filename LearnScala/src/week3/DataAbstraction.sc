object DataAbstraction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val	x = new Rational(10,20)                   //> x  : Rational = 10/20
  x.numerator                                     //> res0: Int = 10
  x.denominator                                   //> res1: Int = 20
  
  val added = x.add(new Rational(1,2))            //> added  : Rational = 41/40
  added.numerator                                 //> res2: Int = 41
  added.denominator                               //> res3: Int = 40
  added.display()                                 //> 41/40
  
  x.subtract(new Rational(1,2))                   //> res4: Rational = 39/40
  //x.flag
  
  // validation
  val test1 = new Rational(10,0);                 //> java.lang.IllegalArgumentException: requirement failed: denominator should n
                                                  //| ot be zero
                                                  //| 	at scala.Predef$.require(Predef.scala:214)
                                                  //| 	at Rational.<init>(DataAbstraction.scala:22)
                                                  //| 	at DataAbstraction$$anonfun$main$1.apply$mcV$sp(DataAbstraction.scala:17
                                                  //| )
                                                  //| 	at scala.runtime.WorksheetSupport$$anonfun$$execute$1.apply$mcV$sp(Works
                                                  //| heetSupport.scala:75)
                                                  //| 	at scala.runtime.WorksheetSupport$.redirected(WorksheetSupport.scala:64)
                                                  //| 
                                                  //| 	at scala.runtime.WorksheetSupport$.$execute(WorksheetSupport.scala:74)
                                                  //| 	at DataAbstraction$.main(DataAbstraction.scala:1)
                                                  //| 	at DataAbstraction.main(DataAbstraction.scala)
  
}

 class Rational(x:Int, y:Int){
 	require(y!=0, "denominator should not be zero");
 	
 	def numerator = x;
 	def denominator = y;
 	private def flag = true;
 	
 	def display(){
 	 printf(this.numerator + "/" + this.denominator)
 	}
 	
 	override def toString = numerator + "/" + denominator
 	def add(that:Rational)={
 		new Rational(numerator*that.denominator + denominator+that.numerator,denominator*that.denominator);
 	}
 	
 	def neg: Rational = new Rational(-x,y);
 	def subtract(that:Rational) = {
 		add(that.neg);
 	}
 };