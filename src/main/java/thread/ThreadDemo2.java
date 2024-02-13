package thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo2 extends Thread{
	public static void main(String[] args) throws Exception{
		//threadSafe();
		threadSafe2();
	}

	private static void threadSafe2() throws InterruptedException {
		CustomerDef def = new CustomerDef();
		Thread t1 = new Thread(()->{
			for (int i = 0 ; i<1000 ; i++) {
				System.out.println("Thread : "+ Thread.currentThread().getName());
				def.add("Name:" + i, i * 10);
			}
		});
		Thread t2 = new Thread(()->{
			for (int i = 0 ; i<1000 ; i++){
				System.out.println("Thread : "+ Thread.currentThread().getName());
				def.add("Name:"+i, i*10);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		def.customers.forEach(System.out::println);
	}

	private static void threadSafe() throws InterruptedException {
		CustomerDef def = new CustomerDef();
		List<Customer> customers = new ArrayList<>();
		Thread t1 = new Thread(()->{
			for (int i = 0 ; i<1000 ; i++) {
				System.out.println("Thread : "+ Thread.currentThread().getName());
				customers.add(def.customer("Name:" + i, i * 10));
			}
		});
		Thread t2 = new Thread(()->{
			for (int i = 0 ; i<1000 ; i++){
				System.out.println("Thread : "+ Thread.currentThread().getName());
				customers.add(def.customer("Name:"+i, i*10));
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		customers.forEach(System.out::println);
	}
}
