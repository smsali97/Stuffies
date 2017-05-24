package assignment;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PlaythatToneDeluxe {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("elise.txt");
		Scanner br = new Scanner(fr);
		
		// TODO Auto-generated method stub
		while (br.hasNext())
		{ // Read and play a note, with harmonics.
		double pitch = br.nextDouble();
		double duration = br.nextDouble();
		double[] a = note(pitch, duration);
		StdAudio.play(a);
	}
	    br.close();
	    fr.close();
	
	}
	
	//Creates a tone with some sound of frequency and time duration
	public static double[] tone(double freq, double time) {
		int SAMPLE_RATE = 44100;
		int samples = (int) (SAMPLE_RATE*time);
		double[] arry = new double[samples+1];
		 for (int i = 0; i < arry.length; i++) {
			arry[i] = Math.sin(2 * Math.PI * i * freq / SAMPLE_RATE);
		}
		 return arry;
	}
	
	/*Sums elements in an array according to their weights.
	T.weights must equal 1 */
	public static double[] sum(double[] a, double[] b, double awt, double bwt) {
	  double[] c = new double[a.length];
	    for (int i = 0; i < c.length; i++) {
			c[i] = a[i]*awt + b[i]*bwt;
		}
	  
	return c;	
	}
	
	public static double[] note(double pitch, double time) {
		double hz = 440.0 * Math.pow(2, pitch / 12.0);
		double[] a = tone(hz,time);
		double[] hi = tone(2*hz,time);
		double[] lo = tone(hz*0.5,time);
		double[] b = sum(hi,lo,0.5,0.5);
		return sum(a,b,0.5,0.5);
		
	}

}
