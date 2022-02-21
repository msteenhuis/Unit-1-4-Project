public class TestAnswer
{

private double equality;
private double secular;
private double rigorous;

public TestAnswer()
{
}

/**
 * Returns a string where double equOne is inputted before a '&' and double rigOne is inputted directly after. Note: For methods questionFour and questionTen, they use the same structure but may contain different operations effecting the parameters.
 *
 * @param int qOne The user input for the question, found in Main.java. After the user inputs a integer, the method alters the value for double equOne - symbolizing the user's equality rating - and double rigOne - symbolizing the user's rigorous rating.
*/
public String questionOne(int qOne)
{
  double equOne = Math.abs(qOne - 10);
  double rigOne = qOne * 0.25;
  String returnOne = equOne + "&" + rigOne;
  return returnOne;
}

/**
 * Returns a string where double equTwo is returned as a string. Note: For all methods besides for questionOne, questionFour, and questionTen, these methods have the same structure but may contain different operations effecting the parameters.
 *
 * @param int qTwo The user input for the question, found in Main.java. After the user inputs a integer, the method converts the int into a string a then returns the string.
*/
public String questionTwo(int qTwo)
{
  double equTwo = qTwo;
  String returnTwo = equTwo + " ";
  return returnTwo;
}

public String questionThree(int qThree)
{
  double rigThree = qThree * 1.25;
  String returnThree = rigThree + " ";
  return returnThree;
}

public String questionFour(int qFour)
{
  double secFour = qFour * 1.25;
  double equFour = Math.abs(qFour - 10);
  String returnFour = secFour + "&" + equFour;
  return returnFour;
}

public String questionFive(int qFive)
{
  double rigFive = qFive ;
  String returnFive = rigFive + " ";
  return returnFive;
}

public String questionSix(int qSix)
{
  double secSix = qSix * 1.25;
  String returnSix = secSix + " ";
  return returnSix;
}

public String questionSeven(int qSeven)
{
  double equSeven = qSeven * 1.25;
  String returnSeven = equSeven + " ";
  return returnSeven;
}

public String questionEight(int qEight)
{
  double secEight = qEight;
  String returnEight = secEight  + " ";
  return returnEight;
}

public String questionNine(int qNine)
{
  double equ9 = Math.abs(qNine - 10);
  String returnNine = equ9 + " ";
  return returnNine;
}

public String questionTen(int qTen)
{
  double rigTen = qTen * 0.5;
  double secTen = qTen * 1.5;
  String returnTen = rigTen + "&" + secTen;
  return returnTen;
}

public String questionEleven(int qEleven)
{
  double rigEleven = Math.abs(qEleven - 10);
  String returnEleven = rigEleven + " ";
  return returnEleven;
}

public String questionTwelve(int qTwelve)
{
  double equTwelve = qTwelve * .5;
  String returnTwelve = equTwelve + " ";
  return returnTwelve;
}

public String questionThirteen(int qThirteen)
{
  double equThirteen = qThirteen * 1.25;
  String returnThirteen = equThirteen + " ";
  return returnThirteen;
}

public String questionFourteen(int qThirteen)
{
  double equFourteen = qThirteen * 1.125;
  String returnFourteen = equFourteen + " ";
  return returnFourteen;
}

public String questionFifteen(int qFifteen)
{
  double rigFifteen = qFifteen * 0.5;
  String returnFifteen = rigFifteen + " ";
  return returnFifteen;
}

/**
 *Extracts all values that effect the user's equality rating. It then parses all of the strings into doubles and finds the mean. The method returns 1.0 if the mean is lower than 1, 10 if the mean is higher than 1, and returns the calcualted mean otherwise.
 *
 * @param String one The return value from questionOne. The method must extract the equality rating from strings one and four from their respective strings before parsing them as their is another value and an '&' symbol in the string literal.
 * @param String two The return value from questionTwo. The method parses the return value from questionTwo into a double. The same happens for all of the other strings except for strings one and four from their respective methods.
*/
public double compileEqu(String one, String two, String four, String seven, String nine, String twelve, String fourteen)
{
 int and1 = one.indexOf("&");
 String num1 = one.substring(0, and1);

 int len4 = four.length();
 int and4 = four.indexOf("&");
 String num4 = four.substring(and4 + 1, len4);

 double doub1 = Double.parseDouble(num1);
 double doub2 = Double.parseDouble(two);
 double doub4 = Double.parseDouble(num4);
 double doub7 = Double.parseDouble(seven);
 double doub9 = Double.parseDouble(nine);
 double doub12 = Double.parseDouble(twelve);
 double doub14 = Double.parseDouble(fourteen);
 equality = (doub1 + doub2 + doub4 + doub7 + doub9 + doub12 + doub14) / 6.0;

 if (1.0 > equality || 10.0 < equality)
 {
   if ( 1.0 > equality)
   {
     equality = 1.0;
   }
   if (10.0 < equality)
   {
     equality = 10.0;
   }
 }
 return equality;
}

/**
 *Extracts all values that effect the user's secularity rating. It then parses all of the strings into doubles and finds the mean. The method returns 1.0 if the mean is lower than 1, 10 if the mean is higher than 1, and returns the calcualted mean otherwise.
 *
 * @param String four The return value from questionFour. The method must extract the secularity rating from strings four and ten from their respective strings before parsing them as their is another value and an '&' symbol in the string literal.
 * @param String six The return value from questionSix. The method parses the return value from questionSix into a double. The same happens for all of the other strings except for strings four and ten from their respective methods.
*/
public double compileSec(String four, String six, String eight, String ten)
{
 int and4 = four.indexOf("&");
 String num4 = four.substring(0, and4);

 int len10 = ten.length();
 int and10 = ten.indexOf("&");
 String num10 = ten.substring(and10 + 1, len10);

 double doub4 = Double.parseDouble(num4);
 double doub6 = Double.parseDouble(six);
 double doub8 = Double.parseDouble(eight);
 double doub10 = Double.parseDouble(num10);
 secular = (doub4 + doub6 + doub8 + doub10) / 5;

 if (1.0 > secular || 10.0 < secular)
 {
   if ( 1.0 > secular)
   {
     secular = 1.0;
   }
   if (10.0 < secular)
   {
     secular = 10.0;
   }
 }
 return secular;
}

/**
 *Extracts all values that effect the user's rigorous rating. It then parses all of the strings into doubles and finds the mean. The method returns 1.0 if the mean is lower than 1, 10 if the mean is higher than 1, and returns the calcualted mean otherwise.
 *
 * @param String one The return value from questionOne. The method must extract the rigorous rating from strings one and ten from their respective strings before parsing them as their is another value and an '&' symbol in the string literal.
 * @param String five The return value from questionFive. The method parses the return value from questionSix into a double. The same happens for all of the other strings except for strings one and ten from their respective methods.
*/
public double compileRig(String one, String three, String five, String ten, String eleven, String thirteen, String fifteen)
{
 int len1 = one.length();
 int and1 = one.indexOf("&");
 String num1 = ten.substring(and1 + 1, len1-1);

 int and10 = ten.indexOf("&");
 String num10 = ten.substring(0, and10);

 double doub1 = Double.parseDouble(num1);
 double doub3 = Double.parseDouble(three);
 double doub5 = Double.parseDouble(five);
 double doub10 = Double.parseDouble(num10);
 double doub11 = Double.parseDouble(eleven);
 double doub13 = Double.parseDouble(thirteen);
 double doub15 = Double.parseDouble(fifteen);
 rigorous = (doub1 + doub3 + doub5 + doub10 + doub11 + doub13 + doub15) / 7;

 if (1.0 > rigorous || 10.0 < rigorous)
 {
   if ( 1.0 > rigorous)
   {
     rigorous = 1.0;
   }
   if (10.0 < rigorous)
   {
     rigorous = 10.0;
   }
 }
 return rigorous;
}
}
