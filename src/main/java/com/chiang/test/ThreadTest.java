package com.chiang.test;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		System.out.println("test");
	}
	public static void main(String[]args)
	{
		Thread test = new Thread(new ThreadTest());
		System.out.println(test.getPriority());
		test.start();
	}

}
