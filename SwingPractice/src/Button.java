import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  // poniendo en .* se importa toda la librería

public class Button extends JFrame{

	
	public Button(){
		
		JButton button1 = new JButton("Click me!");
		JPanel panel1 = new JPanel();
		this.add(panel1);
		panel1.setBackground(Color.red);
		panel1.add(button1);
		
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setTitle("VENTANA ÉPICA");
		this.setVisible(true);
	}

	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run() {
				
				new Button();
				
			}
			
		});
		
	}
	
}
