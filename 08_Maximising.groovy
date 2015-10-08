int number
int maximum = 0
String str

while (number != -1) {
	print "Enter a number please (-1 to end) "
	str = System.console().readLine();
	number = Integer.parseInt(str);
	if (number > maximum) {
		maximum = number
	}
}

println "The largest number you entered was " + maximum
