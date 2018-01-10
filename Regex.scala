val message = "We are meeting on June 13th of this year, and having lunch at 12:30PM"

//val regex = "(\\s|[0-9])?[0-9]:[0-5][0-9]\\s*(AM|PM)"
//println(regex(message))

val regex2 = """(\s|[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r
println(regex2.findAllIn(message).toList)
