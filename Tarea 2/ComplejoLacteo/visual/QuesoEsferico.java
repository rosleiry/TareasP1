package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class QuesoEsferico extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtPrecioBase;
	private JTextField txtPrecioUnitario;
	private JTextField txtRadio;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuesoEsferico frame = new QuesoEsferico();
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
	public QuesoEsferico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("REGISTRAR");
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.setBounds(239, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txtId = new JTextField();
		txtId.setEditable(false);
		txtId.setText("Tipo queso:");
		txtId.setBounds(10, 45, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setEditable(false);
		txtPrecioBase.setText("Precio base:");
		txtPrecioBase.setBounds(10, 87, 86, 20);
		contentPane.add(txtPrecioBase);
		txtPrecioBase.setColumns(10);
		
		txtPrecioUnitario = new JTextField();
		txtPrecioUnitario.setEditable(false);
		txtPrecioUnitario.setText("Precio unitario:");
		txtPrecioUnitario.setBounds(10, 130, 86, 20);
		contentPane.add(txtPrecioUnitario);
		txtPrecioUnitario.setColumns(10);
		
		txtRadio = new JTextField();
		txtRadio.setEditable(false);
		txtRadio.setText("Radio:");
		txtRadio.setBounds(10, 173, 86, 20);
		contentPane.add(txtRadio);
		txtRadio.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(106, 87, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 130, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 173, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if(arg0.getItem().toString().equalsIgnoreCase(arg0)){
					
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Esferico", "Cilindrico", "Cilindrico hueco"}));
		comboBox.setBounds(106, 45, 99, 20);
		contentPane.add(comboBox);
	}
}
