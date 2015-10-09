int mynumber = (999 * Math.random()) + 1 // Between 0 and 1000 is 1-999
int guess = 0
String str

println "Try to guess my number!"

while (guess != mynumber) {
	print ("Tell me a number: ")
	str = System.console().readLine()
	guess = Integer.parseInt(str)
	if (guess > mynumber) {
		println ("No! My number is lower.")
	}
	else if (guess < mynumber) {
		println ("No! My number is higher.")
	}
	else {
		println ("CORRECT!")
		break
	}

}





