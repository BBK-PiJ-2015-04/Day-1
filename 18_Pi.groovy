print "Please enter the desired number of iterations: "
String str = System.console().readLine()
int n = Integer.parseInt(str)
int i = 1
int denominator = -1
double pi = 0
double previous_pi = 0
boolean add = true


while (i <= n) {
	i++
	denominator = denominator + 2
	if (add) {
		pi = pi + (4 / denominator)
	}
	else {
		pi = pi - (4 / denominator)
	}
	add = ! add
	// Now we check for accuracy
	// First three significant digits
	if (Math.abs((pi * 100) - (previous_pi * 100) < 1)) {
		println i
		println (Math.abs((pi * 100) - (previous_pi * 100)))
		println "three digits"
		println pi
		println previous_pi
		break
	}
	previous_pi = pi
}

println "Finished!"
println pi

