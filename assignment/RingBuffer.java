package assignment;

public class RingBuffer {
	private double[] buffer;
	public int capacity;
	private int first;
	private int last;
	private int count = 0;

	public static void main(String[] args) {
		int N = 10;
		RingBuffer buffer = new RingBuffer(N);  
	      for (int i = 1; i <= N; i++) {
	          buffer.enqueue(i);
	      }
	      double t = buffer.dequeue();
	      buffer.enqueue(t);
	      System.out.println("Size after wrap-around is " + buffer.size());
	      while (buffer.size() >= 2) {
	          double x = buffer.dequeue();
	          double y = buffer.dequeue();
	          buffer.enqueue(x + y);
	      }
	      System.out.println(buffer.peek());
	}

	// create an empty ring buffer, with given max capacity
	public RingBuffer(int capacity) {
		if (capacity <= 0)
            throw new IllegalArgumentException
            ("RingBuffer capacity must be positive.");	
		
		buffer = new double[capacity];
		this.capacity = capacity;

		
		first = capacity/2 + 1;
		last = first;

	}

	// return number of items currently in the buffer
	public int size() {
		return count;
	}

	// is the buffer empty (size equals zero)
	public boolean isEmpty() {
		return (this.size() == 0);
	}

	// is the buffer full (size equals capacity)?
	public boolean isFull() {
		if (this.size() == this.capacity)
			return true;
		else
			return false;
	}

	// add item x to the end
	public void enqueue(double x) {

		// Check if enqueue is full
		if (this.isFull())
			throw new IllegalArgumentException("Enqueue is full! :(");
			 
		// Then Add the item
			this.buffer[(this.last)] = x;
			
			if (this.last==this.capacity -1) {
				this.last = 0;

			}
			else this.last += 1;
		count++;
	}

	// delete and return item from the front
	public double dequeue() {
		 if (this.isEmpty()) {
				throw new IllegalArgumentException("Enqueue is empty :( !");			   
			}
			
		
		int prevfirst = this.first;
		
		 if (prevfirst==this.capacity -1) {
				this.first = 0;       
	        }
		 else this.first = prevfirst + 1;
	    count--;
		
		 
        return this.buffer[prevfirst];
	}

	// return (but do not delete) item from the front
	public double peek() {

		return this.buffer[first];
	}

   
}
