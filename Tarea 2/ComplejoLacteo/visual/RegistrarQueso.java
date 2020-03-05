package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class RegistrarQueso extends JFrame {

	private JPanel contentPane;
	private JTextField txtRegistrarQueso;
	private JTextField txtSeleccioneElTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarQueso frame = new RegistrarQueso();
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
	public RegistrarQueso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRegistrarQueso = new JTextField();
		txtRegistrarQueso.setEditable(false);
		txtRegistrarQueso.setBackground(Color.WHITE);
		txtRegistrarQueso.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegistrarQueso.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRegistrarQueso.setText("REGISTRAR QUESO");
		txtRegistrarQueso.setBounds(133, 25, 145, 23);
		contentPane.add(txtRegistrarQueso);
		txtRegistrarQueso.setColumns(10);
		
		txtSeleccioneElTipo = new JTextField();
		txtSeleccioneElTipo.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		txtSeleccioneElTipo.setEditable(false);
		txtSeleccioneElTipo.setText("Seleccione el tipo de queso:");
		txtSeleccioneElTipo.setBounds(10, 72, 145, 23);
		contentPane.add(txtSeleccioneElTipo);
		txtSeleccioneElTipo.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 143, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(170, 143, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(321, 143, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("SALIR");
		btnNewButton_4.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("ATRAS");
		btnNewButton_5.setBounds(245, 227, 89, 23);
		contentPane.add(btnNewButton_5);
	}

}
