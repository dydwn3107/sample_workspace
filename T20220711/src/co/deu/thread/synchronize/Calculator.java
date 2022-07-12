package co.deu.thread.synchronize;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) { //synchronized 처리하는 중에 다른 Thread 접근 x
		this.memory = memory;
		
		try {
			Thread.sleep(2000);//2초간 멈춤
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // currentThread 현재실행되는 것
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
}
