package assignment;

public class GuitarHeroes {

	public static void main(String[] args) {
        // Create two guitar strings, for concert A and C
		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";
        //double CONCERT_A = 440.0;
        //double CONCERT_C = CONCERT_A * Math.pow(2, 3.0/12.0);
        //GuitarString stringA = new GuitarString(CONCERT_A);
        //GuitarString stringC = new GuitarString(CONCERT_C);
        GuitarString[] keystrings;
        keystrings = new GuitarString[37];
        
        for (int i = 0; i < 37 ; i++){
        	keystrings[i] =  new GuitarString(440*Math.pow(1.05956, i - 24));
        }
       
       
        // the main input loop
        while (true) {
        	
            // check if the user has typed a key, and, if so, process it
            if (StdDraw.hasNextKeyTyped()) {
 
                // the user types this character
                char key = StdDraw.nextKeyTyped();
                
                
                // pluck the corresponding string
                if (!(keyboard.indexOf(key) == -1)){
                	keystrings[keyboard.indexOf(key)].pluck();
                } 
                
                
            }
			
            // compute the superposition of the samples
           
            double sample = 0.5;
           
            for (int i = 0; i < 37 ; i++){
            	double old = sample;
            	sample = old + keystrings[i].sample();
            }
            
            
            // send the result to standard audio
            StdAudio.play(sample);
            // advance the simulation of each guitar string by one step
            
            for (int i = 0; i < 37 ; i++){
            	keystrings[i].tic();
            }
            
            
        }
        
	}
}


