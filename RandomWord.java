public class RandomWord {
  public static void main(String[] args) {
 String random = "";
 String last = "";
 
 
  
   for (int i=1;!StdIn.isEmpty() ; i++) {
    String word = StdIn.readString();
    if ( 1/i < Math.random() ) {
      
    random = "";
    random = word;
    last = random + " ";
    }

 }
    System.out.println(last);
  }
}