public class Binary2 {
	
 // number you wish to convert 
 public static String convert(long n) 
 {
   String n1 ="";
  
   
   while (n>0) {   
   if ((n%2)==0)
   {
    n1 = "0" + n1;
   }
   else {  
     
   n1 = "1" + n1;
   }
   n =  n/2;

    }
  return n1;
}
 
 public static void main(String[] args) {
	System.out.println(Binary2.convert(16));
}
}
