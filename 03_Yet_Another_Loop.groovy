/*

  You enter a number. It then asks to enter more numbers.
  This is determined by your first number. If you enter 10
  or higher, the program ends and prints “finished”.

  If you enter less than 10, then it asks for more numbers
  of ten less than what you entered. So if you start by
  entering say 8, it will ask for 2 more numbers and if
  you start with 3 it will ask for 7 more numbers.

  As you enter these numbers it will print each one. If
  you cannot wait to enter all the numbers, just enter 0,
  which will finish the program.

*/

String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
i++;
String star = System.console().readLine()
int j = Integer.parseInt(star)
if (j == 0) {
break;
} else if (j != 1) {
println j;
}
}
System.out.println("finished");
