// old Java style
val str = String.format("This is a %s.", "Test")
println(str)

//Scala style
val str2 = "This is a %s.".format("Test")
println(str2)

println("Because you're %s, %s, %s times a lady.".format("Three", "Twice", "Once"))

// format is C style %s repalced by String, positions %{position}${format}
println("Because you're %3$s, %2$s, %1$s times a lady.".format("Three", "Twice", "Once"))

// Java 8 includes time
import java.time._
println("We will be eating lunch on %1$tB the %1$te in the year %1$tY.".format(LocalDate.now))

// printf, you can lessen the typing
printf("We will be eating lunch on %1$tB %1$te, %1$tY.", LocalDate.now)
println
println

val lyrics = """I see trees of %s
	         @%s roses too
		 @I see them bloom
		 @For me and you
		 @And I think to myself
		 @What a wonderful world""".stripMargin('@').format("green", "Red")
println(lyrics)
