package week1

class ExampleFunctions {

  def add(a:Int,b:Int):Int={
    return a+b;
  }
  def sqrt(x:Double)={
	  def abs(x:Double) = if(x<0) -x else x;
	  
	  def isGoodEnough(guess:Double)=
	    abs(guess * guess - x)/x <0.001;
	  
	  def improveGuess(guess:Double)=
	    (guess + x/guess)/2;
	  
	  def sqrtIter(guess:Double):Double = {
	    if(isGoodEnough(guess)) guess;
	    else sqrtIter(improveGuess(guess));
	  }	  
	  sqrtIter(1);
  }
  
  
}