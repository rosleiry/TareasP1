package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtComplejoLacteo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtComplejoLacteo = new JTextField();
		txtComplejoLacteo.setEditable(false);
		txtComplejoLacteo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtComplejoLacteo.setText("COMPLEJO LACTEO DE CIUDAD DE LA HABANA");
		txtComplejoLacteo.setHorizontalAlignment(SwingConstants.CENTER);
		txtComplejoLacteo.setBounds(54, 80, 338, 23);
		contentPane.add(txtComplejoLacteo);
		txtComplejoLacteo.setColumns(10);
		
		JButton btnNewButton = new JButton("COMENZAR");
		btnNewButton.setBounds(158, 124, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SALIR");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
