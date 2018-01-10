
// return type can be inferred; x and 7 are Int will return an Int, don't need to specify a return type
def add(x:Int, y:Int) = x + y

println(add(6, 7))

// method takes an Int type but returns a String, all 3 stmts are strings
def numberStatus(a:Int) = 
	if (a < 10) "Less than 10"
	else if (a > 10) "Greater than 10"
	else "It is 10!"
println(numberStatus(10))


