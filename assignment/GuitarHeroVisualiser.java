package assignment;

public class GuitarHeroVisualiser {

	public static void main(String[] args) {
			
 
		StdDraw.setCanvasSize(1024/4, 256);
		StdDraw.clear(StdDraw.BLACK);
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.setXscale(0, StdAudio.SAMPLE_RATE/2);
		StdDraw.setYscale(-1, +1);
		StdDraw.show();
		
		int N = 37;
		GuitarString[] gh = new GuitarString[N];
		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";

		for (int i = 0; i < gh.length; i++) {
			double freq = 440 * (Math.pow(1.05956, i - 24));
			gh[i] = new GuitarString(freq);
		}

		int x = 0;
		while (true) {

			// Check if the user has typed a key
			/*  nn//SS/ ..,,mmn //..,,m //..,,m nn//SS/ ..,,mmn
			
			                                              w q q
			              8 u       7               y     o p p
			i p z v b z p b n z p n d [ i d z p i p z p i u i i
			*/
			if (StdDraw.hasNextKeyTyped()) {
				char key = StdDraw.nextKeyTyped();
				int no = keyboard.indexOf(key);

				// Check if character is valid
				if (!(no == -1)) {
					gh[no].pluck();
				}
			}
			// Compute the super-position of the samples
			double sample = 0.5;
			for (int i = 0; i < 37; i++) {
				double old = sample;
				sample = old + gh[i].sample();
			}

			// send the result to standard audio

						StdAudio.play(sample);

						// advance the simulation of each guitar string by one step
						for (int i = 0; i < 37; i++) {
							gh[i].tic();
						}
						
						
			
			
			// Lets Draw!
						StdDraw.enableDoubleBuffering();
						if (sample!=0)
						StdDraw.point((x) % StdAudio.SAMPLE_RATE/2, sample);
						
									
					//	StdDraw.line(prev % StdAudio.SAMPLE_RATE, sample, 
						//		 (x+1) % StdAudio.SAMPLE_RATE, sample);
						if (x == StdAudio.SAMPLE_RATE - 1) {
							StdDraw.show();
						  StdDraw.clear(StdDraw.BLACK);
							x = 0;
						}
						

			x += 1;

		}
	}
}
