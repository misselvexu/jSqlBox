package test.mutiple_thread;

import com.github.drinkjava2.BeanBox;

import test.Config;

public class MultiTester {

	public static class MultiThread implements Runnable {
		public void run() {
			test.jdbc.Tester tester = BeanBox.getBean(test.jdbc.Tester.class);
			tester.tx_BatchInsertDemo();
		}
	}

	public static void main(String[] args) {
		Config.recreateDatabase();
		MultiThread m = new MultiThread();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
		new Thread(m).start();
	}

}