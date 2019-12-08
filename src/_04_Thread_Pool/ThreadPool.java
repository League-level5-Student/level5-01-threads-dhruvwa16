package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
Thread[] threads;
ConcurrentLinkedQueue<Task> taskQueue;		
			
	public ThreadPool(int i) {
		threads = new Thread[i];
		for (int j = 0; j < threads.length; j++) {
			threads[i] = new Thread(()->new Worker());
		}
		taskQueue = new ConcurrentLinkedQueue<Task>();
		// TODO Auto-generated constructor stub
	}

	public void addTask(Task task) {
		// TODO Auto-generated method stub
		taskQueue.add(task);
	}

	public void start() {
		// TODO Auto-generated method stub
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			
		}
		
	}


}
