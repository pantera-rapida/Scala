val a = 90

// s for String interpolation
println(s"${a} luftballons floating in the summer sky")

// with only 1 value don't need the braces
println(s"$a luftballons floating in the summer sky")

// but adding 3 to 99 won't work w/o the braces, will just say + 3...
println(s"$a + 3 luftballons floating in the summer sky")

// but adding 3 to 99 won't work w/o the braces, will just say + 3...
println(s"${a + 3} luftballons floating in the summer sky")
