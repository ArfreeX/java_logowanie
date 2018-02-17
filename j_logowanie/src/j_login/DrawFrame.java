package j_login;

/*
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
*/
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawFrame extends JFrame /* implements ActionListener */ {

	private static final long serialVersionUID = 1L;

	DrawFrame() {
		d_panel = new DrawWindow();
		pack();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 600);
		setTitle("Rysowanie");
		setLocation(400, 340);
		setVisible(true);
		add(d_panel);
		/*
		 * setLayout(new FlowLayout()); bClear = new JButton("Clear");
		 * bClear.setBounds(290, 500, 70, 20); add(bClear);
		 * bClear.addActionListener(this);
		 */
	}

	/*
	 * @Override public void actionPerformed(ActionEvent button) {
	 * 
	 * Object bSource = button.getSource(); if ( bSource.equals( bClear ));
	 * 
	 * }
	 */
	private JPanel d_panel;
	// private JButton bClear;
}
