package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
Thread[] threads;
ConcurrentLinkedQueue<Task> taskQueue;		
			
	public ThreadPool(int i) {
		threads = new Thread[i];
		taskQueue = new ConcurrentLinkedQueue<Task>();
		for (int j = 0; j < threads.length; j++) {
			threads[j] = new Thread(new Worker(taskQueue));
		}
		
		// TODO Auto-generated constructor stub
	}

	public void addTask(Task task) {
		taskQueue.add(task);
	}

	public void start() {
		// TODO Auto-generated method stub
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
