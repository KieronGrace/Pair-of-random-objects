package genericpair;


public class Pair<F, S> {
   F F;
   S S;
   //constructor class takes two parameters to instantiate the pair
   public Pair(F F, S S){
      setF(F);
      setS(S);
   }
   
   //set method for first element
   public final void setF(F newF){
      this.F = newF;
   }
   
   //set method for second element
   public final void setS(S newS){
      this.S = newS;
   }
   
   //get method for first element
   public F getF(){
      return this.F;
   }
   
   //get method for second element
   public S getS(){
      return this.S;
   }
   
   //
   public void displayPair(String name){
      System.out.printf("Pair %s: %s, %s%n", name, getF(),
              getS());
   }
}
