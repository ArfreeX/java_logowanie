package j_login;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		LogBase.loginBase();
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();
			}
		});
	}

}
