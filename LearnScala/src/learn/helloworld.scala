package learn

import java.util.Date

object helloworld {

  
	def main(args: Array[String]) {
	  
		// Can use existing java libs
		var date = new Date();		
		println(date + "Hello, world!")
	}
}