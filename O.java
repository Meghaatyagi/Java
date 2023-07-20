public class O {
   public static void main(String[] args) {
    // String Literal
    String name = "Megha"; // Pool
    //String name = "Megha".intern();
    String name2 = "Megha";
    System.out.println(name == name2); // true
    String name3 = new String("Megha").intern();
    System.out.println(name == name3); // true

   } 
}
