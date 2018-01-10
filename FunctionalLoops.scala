val result = (1 to 100).reverse.mkString(",")
println(result)

val result2 = (100 to 1 by -1).mkString(",")
println(result2)

println((100 to 1 by -1).mkString(","))
