package assignment;

public class GuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 37;
		GuitarString[] gh = new GuitarString[N];
		String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";

		for (int i = 0; i < gh.length; i++) {
			double freq = 440 * (Math.pow(1.05956, i - 24));
			gh[i] = new GuitarString(freq);
		}

		while (true) {

			// Check if the user has typed a key
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

		}
	}
}
