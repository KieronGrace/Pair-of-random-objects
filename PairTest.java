//PairTest.java demonstrates Pair generic class
//CSIS 312-D01

package genericpair;

public class PairTest {

      public static void main(String[] args) {
      //output student and assignment
      System.out.printf("Kieron Roberson – Assignment 07%n%n");
      
      //create pair with F Integer and S String
      Pair intString = new Pair(3, "Elinor");
      
      //create pair with F String and S Integer
      Pair strInteger = new Pair("Birthday Cake", 6);
      
      //display Pairs as instantiated
      System.out.println("As initially created:");
      intString.displayPair("intString");
      strInteger.displayPair("strInteger");
      System.out.println();
      
      //set new values
      intString.setF("Googly Eyes");
      intString.setS(15.385);
      
      strInteger.setF(64);
      strInteger.setS(true);
      
      //display new pair values
      System.out.println("After calling set methods:");
      intString.displayPair("intString");
      strInteger.displayPair("strInteger");
   }
      
}
