public class Animations 
{

/**
* Constructor for the Animations object 
* 
*/
public Animations()
{
}

/**
* Returns an animated message based off of String str. The method will resemble the computer typing str which is bracketed by a pair of double chevrons.  
*
* @param String str String that will be animated by the method.
*/
public String titleOutput(String str) throws InterruptedException
{
 String newStr = "";
 int strLen = str.length();
 for (int counter = 0; counter < strLen; counter++)
  {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    newStr += str.substring(counter,counter + 1);
    System.out.print("<<" + newStr + ">>");
    Thread.sleep(50);
  }
return newStr;
}
/**
* Returns a colored, animated bar graph. The bar increases by one series of blocks until it reaches the method's desired number.
*
* @param double rating The number that determines the final length of the bar 
* @param String color The desired color of the bar graph
*/
public String barOutput(int rating, String color) throws InterruptedException
{
  int intRating = rating;
  String str = "";
  for (int i = 0; i <= intRating; i++)
  {
    str += color + "█";
    System.out.print(str);
    Thread.sleep(500);
  }
  return str;
}
}