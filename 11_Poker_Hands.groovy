/* Incomplete */

int card1rank
int card2rank
int card3rank
int card4rank
int card5rank
int card1suite
int card2suite
int card3suite
int card4suite
int card5suite
String str

while ((card1rank < 1) || (card1rank > 13)) {
	println ("Enter card number 1's rank")
	print ("Ace=1 Jack=11 Queen=12 King=13 :")
	str = System.console().readLine();
	card1rank = Integer.parseInt(str);
}

while ((card1suite < 1) || (card1suite > 4)) {
	println ("Enter card number 1's suite")
	print ("Spades=1 Hearts=2 Diamonds=3 Clubs=4 :")
	str = System.console().readLine();
	card1suite = Integer.parseInt(str);
}

while ((card2rank < 1) || (card2rank > 13)) {
	println ("Enter card number 2's rank")
	print ("Ace=1 Jack=11 Queen=12 King=13 :")
	str = System.console().readLine();
	card2rank = Integer.parseInt(str);
}

while ((card2suite < 1) || (card2suite > 4)) {
	println ("Enter card number 2's suite")
	print ("Spades=1 Hearts=2 Diamonds=3 Clubs=4 :")
	str = System.console().readLine();
	card2suite = Integer.parseInt(str);
}

while ((card3rank < 1) || (card3rank > 13)) {
	println ("Enter card number 3's rank")
	print ("Ace=1 Jack=11 Queen=12 King=13 :")
	str = System.console().readLine();
	card3rank = Integer.parseInt(str);
}

while ((card3suite < 1) || (card3suite > 4)) {
	println ("Enter card number 3's suite")
	print ("Spades=1 Hearts=2 Diamonds=3 Clubs=4 :")
	str = System.console().readLine();
	card3suite = Integer.parseInt(str);
}
while ((card4rank < 1) || (card4rank > 13)) {
	println ("Enter card number 4's rank")
	print ("Ace=1 Jack=11 Queen=12 King=13 :")
	str = System.console().readLine();
	card4rank = Integer.parseInt(str);
}

while ((card4suite < 1) || (card4suite > 4)) {
	println ("Enter card number 4's suite")
	print ("Spades=1 Hearts=2 Diamonds=3 Clubs=4 :")
	str = System.console().readLine();
	card4suite = Integer.parseInt(str);
}
while ((card5rank < 1) || (card5rank > 13)) {
	println ("Enter card number 5's rank")
	print ("Ace=1 Jack=11 Queen=12 King=13 :")
	str = System.console().readLine();
	card5rank = Integer.parseInt(str);
}

while ((card5suite < 1) || (card5suite > 4)) {
	println ("Enter card number 5's suite")
	print ("Spades=1 Hearts=2 Diamonds=3 Clubs=4 :")
	str = System.console().readLine();
	card5suite = Integer.parseInt(str);
}

println card1rank
println card1suite
println card2rank
println card2suite
println card3rank
println card3suite
println card4rank
println card4suite
println card5rank
println card5suite
