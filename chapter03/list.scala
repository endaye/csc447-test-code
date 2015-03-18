// ch 3.8
val ontTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = ontTwo ::: threeFour
println(ontTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new List.")

val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val ontTwoThree2 = 1 :: 2 :: 3 :: Nil
println(ontTwoThree2)