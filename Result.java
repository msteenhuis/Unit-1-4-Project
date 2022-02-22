public class Result
{
private String westernDemocracy;
private String socialDemocracy;
private String kleptocracy;
private String communist;
private String socialist;
private String totalitarianist;
private String theocracy;
private String dictatorial;
private String anarchist;
private String monarchy;
private String theodemocracy;

/**
* Constructor for Result
*
* @param int equality Represents the user's equality score. In the constructor, the equality rating is switched (i.e. from 1 to 9)
* @param int secularity Represents the user's secularity score. In the constructor, the secularity rating is switched (i.e. from 1 to 9)
*/
public Result(int equality, int secularity, int rigorous)
{
  equality = Math.abs(equality - 10);
  secularity = Math.abs(secularity - 10);
  this.westernDemocracy = "You are the head of a Liberal Democracy. \n With an equality score of " + equality + ", your government is capable of representing the school body. \n With a secularity score of " + secularity + ", your administration has separated church and state, although some members of your government may be motivated by their religious beleifs. \n With a rigorous score of " + rigorous + ", your administration prioritizes hard work in order to suceed.";

  this.socialDemocracy = "You are the head of a Social Democracy. \n With an equality score of " + equality + ", your government is very engaged in school activities. \n With a secularity score of " + secularity + ", your administration has separated church and state, although some members of your government may be motivated by their religious beleifs. \n With a rigorous score of " + rigorous + ", your government does it's best to make a student's life a Tech easier.";

  this.kleptocracy = "You are the head of a Kleptocracy. \n With an equality score of " + equality + ", your government is somewhat capable of representing the school body. \n With a secularity score of " + secularity + ", your administration has separated church and state, although some members of your government may be motivated by their religious beleifs. \n With a rigorous socre of " + rigorous + ", the school is very competitive. Your cabinet has dismissed rumors of corruption throughout the school, calling it 'Santestuy propaganda'.";

  this.communist = "You are the head of a Communist government. \n With an equality score of " + equality + ", the means of production is firmly controlled by the students...as well as yourself. \n With a secularity score of " + secularity + ", your government believes that any form of religion is 'the soul of soulless conditions'. \n With a rigorous score of " + rigorous + ", your government does it's best to make a student's life a Tech easier.";

  this.socialist = "You are the head of a Socialist government. \n With an equality score of " + equality + " ,the means of production is controlled by the students and nurtured by your oversight. \n With a secularity score of " + secularity + ", your administration has separated church and state, although some members of your government may be motivated by their religious beleifs. \n With a rigorous score of " + rigorous + ", your government does it's best to make a student's life a Tech easier.";

  this.totalitarianist = "You are the head of a totalitarianist government. \n With an equality score of " + equality + ", the government is an overbearing body that controlls nearly every aspect of school life. \n With a rigorous score of " + rigorous + ", the government uses a strict system in order to find students worthy of sucess. \n No government seats are obtainable excpet for you and your handful of advisors.";

  this.theocracy = "You are the head of a Theocratic government. \n With an equality score of " + equality + ", your government restricts goverment positions and good grades to students devoted to Moizism, resulting in a rigorous score of " + rigorous + ". \n With a secularity score of " + secularity + ", the school revolves around Moizist and Huisa policies. ALL HAIL OUR GLORIOUS LEADER!!";

  this.dictatorial = "You are the head of a Dictatorial government. \n With an equality score of " + equality + ", you and your peers have complete control over the government. \n With a secularity score of " + secularity + ", your administration is not particularly concerned about religion, although some members of your government may be motivated by their religious beleifs. \n With a rigorous score of " + rigorous + ", your administration has imposed strict grading systems and have made it virtously impossible to enter the government unless the prospective politician joins your friend group.";

  this.anarchist = "You are the head of a Anarchist government. \n With an equality score of " + equality + ", your administration has dismissed any notion of controlling Brooklyn Tech. Currently, the 7th Floor Party has occupied the Cafeteria, and Moizist and Secular Tech factions have been waging a Nerf war for the last few hours. \n With a secularity score of " + secularity + ", you care little for the student body's relgious beliefs. \n With a rigorous score of " + rigorous + ", your administration has no control over what the students and staff do, only that school starts at 8 and the doors must be locked by 5:00 on most days.";

  this.monarchy = "You are the head of a Monarchy. \n With an equality score of " + equality + ", all power is vested in one person. \n With a secularity score of " + secularity + ", the school accepts all religions, however Moizists do hold advantages in the school society. \n With a rigorous score of " + rigorous + ", most of the populace are doing just enough to get by, with a lucky few accepted into the noble court. When you graduate, I wish you the best of luck in finding a successor.";
  
  this.theodemocracy = "You are the head of a Theodemocracy. \n Your government has an equality score of " + equality + " with a fusion of theocratic rule and liberal democracy. \n With a secularity score of " + secularity + ", the school is based around the fundamental principles of Moizism. \n With a rigorous score of " + rigorous + ", your administration prioritizes hard work in order to suceed.";
}

private int Calculator(int equality, int secularity, int rigorous)
{
 int finalCalc = ((equality * 100) + (secularity * 50) + (rigorous * 150));
 return finalCalc;
}

/**
* Returns a String which explains which defines and explains the user's government based on their equality, secularity, and rigorous rating.
*
* @param int equality Represents the user's equality score.
* @param int secularity Represents the user's secularity score.
* @param int rigorous Represents the user's rigorous score. 
*/
public String finalResult(int equality, int secularity, int rigorous)
{

 String govt = anarchist;
 int finalCalc = Calculator(equality, secularity, rigorous);
 if (finalCalc > 1100.0 && finalCalc <= 1800.0)
  {
    if (finalCalc >= 950 && (equality >= 3 && equality <= 4) && (rigorous >= 3 && rigorous <= 4))
    {
      govt = socialist;
    }
    if (equality >= 5 && equality <= 6 && (rigorous >= 3 && rigorous <= 4))
    {
      govt = socialDemocracy;
    }
    if (equality >= 3 && equality <= 4 || (rigorous >= 5 && rigorous <= 6))
    {
      govt = westernDemocracy;
    }
    if (equality >= 9 && equality <= 10)
    {
      govt = communist;
    }
    if (secularity >= 7)
    {
      govt = theodemocracy;
    }

  }
 else if (finalCalc > 1800)
  {
    if (equality >= 5 && equality <= 6)
    {
      govt = kleptocracy;
    }
    if (equality >= 7 && equality <= 8 && (secularity >= 4 && secularity <= 6))
    {
      govt = dictatorial;
    }
    if (secularity >= 7)
    {
      govt = theocracy;
    }
    if (equality >= 9 && (rigorous >= 7 && rigorous <= 8))
    {
      govt = monarchy;
    }
    if (equality >= 9 && rigorous >= 9)
    {
      govt = totalitarianist;
    }
  }  

 else
 {
   govt = anarchist;
 }
  return govt;
}

}


