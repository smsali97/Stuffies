package assignment;

public class StatsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    
     for (int i = 0; i < 3_000_000; i++) {
		  int r = (int) (Math.random()*3 + 1);
		  
		switch (r) {
		case 1:
			count1++;
			break;
		case 2:
			count2++;
			break;
		case 3:
			count3++;
			break;
		}  
	}
       System.out.println("Number of times 1, 2, 3 have occured respectively: " + 
	count1 + " " + count2 + " " + count3);
	}

}
