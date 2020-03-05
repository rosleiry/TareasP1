package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;

public class Factura extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFacturacion;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Factura dialog = new Factura();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Factura() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 45, 414, 118);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel lblNewLabel_1 = new JLabel("Nombre:");
			lblNewLabel_1.setBounds(10, 36, 46, 14);
			panel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Direccion:");
			lblNewLabel_2.setBounds(10, 61, 64, 14);
			panel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel = new JLabel("Id cliente:");
			lblNewLabel.setBounds(10, 11, 64, 14);
			panel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Telefono:");
			lblNewLabel_3.setBounds(10, 86, 64, 14);
			panel.add(lblNewLabel_3);
		}
		{
			textField = new JTextField();
			textField.setBounds(77, 8, 128, 20);
			panel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(77, 33, 128, 20);
			panel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(77, 58, 327, 20);
			panel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(77, 83, 128, 20);
			panel.add(textField_3);
			textField_3.setColumns(10);
		}
		
		txtFacturacion = new JTextField();
		txtFacturacion.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtFacturacion.setEditable(false);
		txtFacturacion.setHorizontalAlignment(SwingConstants.CENTER);
		txtFacturacion.setText("FACTURACION");
		txtFacturacion.setBounds(144, 11, 126, 23);
		contentPanel.add(txtFacturacion);
		txtFacturacion.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
