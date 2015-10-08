/* 

  The program asks you to enter your year of birth and
  then it determines if you are an adult or not. It
  defines an adult as someone who is 18 and older (>17)
  and it also assumes that the current year is 2012!

*/

int currentYear = 2012
print "When were you born (year)?"
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult."
