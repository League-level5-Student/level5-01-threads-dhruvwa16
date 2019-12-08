package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  static //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	Thread[] threads = new Thread[51];
	public static void main(String[] args) {
		makeThread(50);
	}
	/* HINT: You will most likely need to do this with recursion */

	static void makeThread(int i) {
		if(i>0) {
		threads[i] = new Thread("Thread" + i);
		System.out.println(" Hello from " + threads[i].getName());
		makeThread(i-1);
		}
	}

}