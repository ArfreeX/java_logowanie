package j_login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class MyFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	public MyFrame() {

		panel = new MyPanel();
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 300);
		setTitle("Logowanie");
		setLocation(400, 340);
		setVisible(true);
		add(panel);

		lLogin = new JLabel("Login: ");
		lLogin.setBounds(80, 50, 200, 50);
		add(lLogin);

		lPassword = new JLabel("Password: ");
		lPassword.setBounds(80, 100, 200, 50);
		add(lPassword);

		setLayout(null);

		bNext = new JButton("Ok");
		bNext.setBounds(130, 200, 70, 20);
		add(bNext);

		bBack = new JButton("Anuluj");
		bBack.setBounds(230, 200, 70, 20);
		add(bBack);

		bNext.addActionListener(this);
		bBack.addActionListener(this);

		tLogin = new JTextField("");
		tLogin.setBounds(80, 90, 200, 20);
		add(tLogin);

		fPassword = new JPasswordField("");
		fPassword.setBounds(80, 140, 200, 20);
		// fPassword.setEchoChar('*');
		add(fPassword);

	}

	public String getName() {
		return tLogin.getText();
	}

	public String getPassword() {
		return new String(fPassword.getPassword());
	}

	@Override
	public void actionPerformed(ActionEvent button) {
		Object bSource = button.getSource();
		if (bSource.equals(bNext)) {
			{
				if (LogBase.loginCheck(getName(), getPassword())) {
					getContentPane().setBackground(Color.green);
					EventQueue.invokeLater(new Runnable() {
						@Override
						public void run() {
							new DrawFrame();
						}
					});
				} else
					getContentPane().setBackground(Color.red);
			}
		} else if (bSource.equals(bBack)) {
			// dispose();
			tLogin.setText("");
			fPassword.setText("");
			getContentPane().setBackground(Color.white);
		}
	}

	private JButton bNext, bBack;
	private JLabel lLogin, lPassword;
	private JTextField tLogin;
	private JPanel panel;
	private JPasswordField fPassword;
}