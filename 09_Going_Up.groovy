int number
int nextnumber
int increase = 1
int counter = 0
String str

print "Keep entering numbers please (-1 to end) "
str = System.console().readLine();
number = Integer.parseInt(str);

if (number == -1) {
	nextnumber = -1
}

while (nextnumber != -1) {
	print "Keep entering numbers please (-1 to end) "
	str = System.console().readLine();
	nextnumber = Integer.parseInt(str);
	if ((nextnumber - number) == 1) {
		increase++
	}
	counter++
	number = nextnumber
}

if (counter < 1) {
	println "You didn't enter any numbers!"
}

else if (counter == 1) {
	println "You only entered one number!"
}

else {
	if (increase == counter) {
		println "Yes!"}
	else {
		println "No :("
	}
}
