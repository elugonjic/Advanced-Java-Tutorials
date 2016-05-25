public class PairProg {
   public static void main(String[] args) {
      Pair<String, Integer> grade1 = new Pair<String, Integer> //the types that the class will be created with are provided here, String and Integer
         ("Williams", 90); //the first is the String which the constructor needs and the second is the integers
      Pair<String, Integer> grade2 = new Pair<String, Integer>
         ("Brown", 44);
      Pair<String, String> example = new Pair<String, String>("example1", "example");
      Pair<String, String> example2 = new Pair<String, String>("example1"); //example in which only 1 parameter is given for the constructor

      System.out.println(grade1.first());
      System.out.println(grade1.second());
      System.out.println(grade2.first());
      System.out.println(grade2.second());
   }
}