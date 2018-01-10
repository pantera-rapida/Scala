val lyrics = "I see trees or green, \n" +
	     "Red reoses too, \n" +
	     "I see them bloom, \n" +
	     "For me and you, \n" +
	     "And I think to myself, \n" +
	     "What a wonderful world"
println
println(lyrics)

val lyrics2 = """I see trees or green
	         Red reoses too
		 I see them bloom
		 For me and you
		 And I think to myself
		 What a wonderful world"""
println
println(lyrics2)

val lyrics3 = """I see trees or green
	         |Red reoses too
		 |I see them bloom
		 |For me and you
		 |And I think to myself
		 |What a wonderful world""".stripMargin
println
println(lyrics3)

val lyrics4 = """I see trees or green
	         @Red reoses too
		 @I see them bloom
		 @For me and you
		 @And I think to myself
		 @What a wonderful world""".stripMargin('@')
println
println(lyrics4)



