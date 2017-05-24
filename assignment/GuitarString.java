package assignment;

public class GuitarString {
private final int SAMPLE_RATE = 44_100;
private RingBuffer rb;
private int tcount = 0;

    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	 
    	      int N = 25;
    	      double[] samples = { .2, .4, .5, .3, -.2, .4, .3, .0, -.1, -.3 };  
    	      GuitarString testString = new GuitarString(samples);
    	      for (int i = 0; i < N; i++) {
    	          int t = testString.time();
    	          double sample = testString.sample();
    	          System.out.printf("%6d %8.4f\n", t, sample);
    	          testString.tic();
    	      
    	  }
	}


	// create a guitar string of the given frequency, using a sampling rate of 44,100
	public GuitarString(double freq) {
		int  N = (int) Math.round(SAMPLE_RATE/freq); 
		
		rb = new RingBuffer(N);
		
		for (int i = 0; i < N; i++) {
			rb.enqueue(0.0);
		} 
	}
	
	// create a guitar string whose size and initial values are given by the array
	public GuitarString(double[] init) {
		rb = new RingBuffer(init.length);
		   for (int i = 0; i < init.length; i++) {
			rb.enqueue(init[i]);
		}
	}	   
		
	// set the buffer to white noise
	public void pluck() {
		for (int i = 0; i < rb.size(); i++) {
			double rand = -0.5 + Math.random();
			rb.dequeue();
			rb.enqueue(rand);
		}		
	}
	
	// return the current sample
	public double sample() {
		return rb.peek();
	}
	
	// advance the simulation one time step
	public void tic() {
		double value1 = rb.dequeue();
		double value2 = rb.peek();
		
		rb.enqueue( 0.994 * 0.5*(value1+value2));
		this.tcount++;
	}
	
	 // return number of tics
	public int time() {
	  return tcount;
	}
	
	

}