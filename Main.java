import java.util.Scanner;
class Main {
  public static void main(String[] args) throws InterruptedException {

  String cyan = "\u001B[36m";
  String purple = "\u001B[35m";
  String red = "\u001B[31m";
  String italics = "\033[3m";
  String reset = "\u001b[0m";

  Animations userOne = new Animations();
  userOne.titleOutput("WELCOME USER");
  System.out.println();
  Thread.sleep(1000);
  userOne.titleOutput("You and your peers have overthrown BTHS and its entire administration. It is now your burden to create a new government. Will you be the head of a tyrannical dictatorship? A perfect utopia? A lawless anarchy? The choice is yours. For each question, input an integer between 1 and 10 to show how much you support a policy.");
  System.out.println();
  System.out.println();
  

    System.out.println("Note: a more extreme answer, like 1 or 9, means that you staunchly agree or disagree with the statement.");
    System.out.println();
    System.out.println();
    System.out.println();

    Thread.sleep(250);

    TestAnswer user = new TestAnswer();

    Scanner input = new Scanner(System.in);

    System.out.println("1) The new government is assigning funds for the school. One party of students, the " + italics + "7TH FLOOR PARTY" + reset + ", would like to hire a professional cooking staff for the cafeteria, whilst another group of students, " + italics + "THE ENGINEER'S PARTY, " + reset + "would like new sports uniforms and renovate the weight rooms. To what extent do you agree with the " + italics + "7TH FLOOR PARTY?" + reset);
    int aOne = input.nextInt();
    String one = user.questionOne(aOne);


    System.out.println("2) The " + italics + "LEAGUE OF CLUBS PARTY " + reset + "wants to increase the quantity of club credits to receive a Brooklyn Technical Diploma to 40 in order to incentivize more club participation. To what extent do you agree with the " + italics + "LEAGUE OF CLUBS PARTY?" + reset);
    int aTwo = input.nextInt();
    String two = user.questionTwo(aTwo);


    System.out.println("3) A party of students and teachers known as the " + italics + "UNITED FRONT " + reset + "wants the Brooklyn Tech grading system to focus more on major assessments to create a more familiar environment for colleges. To what extent do you agree with this party?");
    int aThree = input.nextInt();  
    String three = user.questionThree(aThree);


    System.out.println("4) A new religion," + italics + " MOIZISM, " + reset + "has been founded by a group of students and has advocated for half days on Fridays and students being paid relative to their grade. To what extent do you agree with " + italics + "MOIZIST " + reset + "policies?");   
    int aFour = input.nextInt();  
    String four = user.questionFour(aFour);


    System.out.println("5) In order to improve junior grades, the " + italics + "SENIOR PARTY " + reset + "wants to add 2 more periods for all junior students and 2 less periods for all senior students. To what extent do you agree with the " + italics + "SENIOR PARTY?" + reset);   
    int aFive = input.nextInt();      
    String five = user.questionFive(aFive);


    System.out.println("6) " + italics + "MOIZIST " + reset + "believers have created several shrines throughout the school. A new party, " + italics + "THE MOIZIST BLOC"+ reset +", has championed the construction of a temple in the basement of the school. To what extent will you support the " + italics + "MOIZIST BLOC?" + reset);   
    int aSix = input.nextInt();   
    String six = user.questionSix(aSix);


    System.out.println("7) A new party, the " + italics + "TECH-XIT PARTY" + reset +", wants to pull Brooklyn Tech out of the " + italics + "SHSAT" + reset +". To what extent do you agree with the " + italics + "TECH-XIT PARTY?" + reset);   
    int aSeven = input.nextInt();    
    String seven = user.questionSeven(aSeven);


    System.out.println("8) " + italics + "THE MOIZIST BLOC " + reset + "would like to make January 12th a school holiday for Brooklyn Tech in order to celebrate their Glorious Leader. To what extent do you agree with this policy?");   
    int aEight = input.nextInt();  
    String eight = user.questionEight(aEight);


    System.out.println("9) A 'diplomatic' incident between the baseball teams of " + italics + "BROOKLYN TECH " + reset + "and " + italics + "SANTESTUY HIGH SCHOOL" + reset + ", respectively, has resulted in the school issuing a verbal protest against our grand school. Elements of the government are backing a plan requiring all students to break off relations with any and all of their " + italics + "SANTESTUY " + reset + "peers for the foreseeable future. To what extent do you support this plan?");  
    int aNine = input.nextInt();      
    String nine = user.questionNine(aNine);


    System.out.println("10) The " + italics + "SECULAR TECH PARTY " + reset + "has become a school-wide name due to their " + italics + "anti-MOIZIST" + reset + " policies. They want to remove all icons related to " + italics + "MOIZISM " + reset + "and repeal " + italics + "MOIZIST " + reset + "policies. To what extent do you agree with the " + italics + "SECULAR TECH " + reset + "party?");  
    int aTen = input.nextInt();      
    String ten = user.questionTen(aTen);


    System.out.println("11) An offshoot branch from " + italics + "MOIZISM" + reset + ", known as the " + italics + " HUISA"+ reset + ", advocates for more orthodox " + italics + "MOIZIST " + reset + " beliefs. Among their policies are the implementation of month-long breaks and more school policies celebrating important religious figures and dates. To what extent do you agree with these " + italics + "HUISA " + reset + "policies?");  
    int aEleven = input.nextInt();    
    String eleven = user.questionEleven(aEleven);


    System.out.println("12) One of your advisors has developed an algorithm that allows all students to always be accepted into their major of choice. Should you enact this algorithm?");  
    int aTwelve = input.nextInt();    
    String twelve = user.questionTwelve(aTwelve);

    System.out.println("13) A group of teachers have created the " + italics + "STUDENT ADVANCEMENT PARTY" + reset + ", which strives to add more lessons to many subjects and departments. This, in theory, would help students in college. To what extent do you agree with the " + italics + "STUDENT ADVANCEMENT PARTY?" + reset);  
    int aThriteen = input.nextInt();       
    String thriteen = user.questionThirteen(aThriteen);


    System.out.println("14) A new party, " + italics + "THE ATHLETIC UNITY PARTY" + reset + ", wants to create a mandate requiring all students to play a " + italics + "PSAL" + reset + " sport in order to incentivize fitness. To what extent do you agree with the " + italics + "THE ATHLETIC UNITY?" + reset);  
    int aFourteen = input.nextInt();       
    String fourteen = user.questionFourteen(aFourteen);


    System.out.println("15) The " + italics + "ANTI-HOMEWORK PARTY " + reset +"wants to ban all homework from the school curriculum. To what extent do you agree with the " + italics + "ANTI-HOMEWORK PARTY?" + reset);  
    int aFifteen = input.nextInt();       
    String fifteen = user.questionFifteen(aFifteen);

    int equ = (int)(Math.round(user.compileEqu(one, two, four, seven, nine, twelve, fourteen)));
  
    int sec = (int)(Math.round(user.compileSec(four, six, eight, ten)));
  
    int rig = (int)(Math.round(user.compileRig(one, three, five, ten, eleven, thriteen, fifteen)));


    
    Thread.sleep(1000);
    Result userTwo = new Result(equ, sec, rig);
    String x = userTwo.finalResult(equ, sec, rig);
    System.out.println(x);

    Animations userThree = new Animations();
    System.out.println(cyan + "Equality-----------------------------------------------");
    String equRating = userThree.barOutput(equ,cyan);
    System.out.println();
    System.out.println(purple + "Secularity---------------------------------------------");
    String secRating = userThree.barOutput(Math.abs(sec - 10),purple);
    System.out.println();
    System.out.println(red + "Rigorous-----------------------------------------------");
    String rigRating = userThree.barOutput(rig, red);
  }
}