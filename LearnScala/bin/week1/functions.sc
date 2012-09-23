object functions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  // block visibility
  var x = 10;                                     //> x  : Int = 10
  var decorateX = {x*x -1};                       //> decorateX  : Int = 99
  var y = decorateX ;                             //> y  : Int = 99
  
  def defDecorateX = {x*x-2};                     //> defDecorateX: => Int
  var z = defDecorateX;                           //> z  : Int = 98
  var z1 = decorateX + x;                         //> z1  : Int = 109
}