package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroPersonal extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroPersonal dialog = new RegistroPersonal();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroPersonal() {
		setBounds(100, 100, 823, 543);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 0, 139));
			panel.setBorder(new TitledBorder(null, "Por favor llena los campos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Cedula:");
				lblNewLabel.setBounds(44, 37, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombres:");
				lblNewLabel_1.setBounds(44, 71, 56, 16);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Apellidos:");
				lblNewLabel_2.setBounds(44, 111, 56, 16);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Sexo:");
				lblNewLabel_3.setBounds(44, 155, 56, 16);
				panel.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Edad:");
				lblNewLabel_4.setBounds(44, 203, 56, 16);
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Correo:");
				lblNewLabel_5.setBounds(44, 248, 56, 16);
				panel.add(lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("Direccion");
				lblNewLabel_6.setBounds(44, 291, 56, 16);
				panel.add(lblNewLabel_6);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Telefono:");
				lblNewLabel_7.setBounds(44, 337, 56, 16);
				panel.add(lblNewLabel_7);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("Salario:");
				lblNewLabel_8.setBounds(44, 390, 56, 16);
				panel.add(lblNewLabel_8);
			}
			{
				textField = new JTextField();
				textField.setBounds(112, 34, 153, 22);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(112, 68, 153, 22);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(112, 108, 153, 22);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(112, 152, 153, 22);
				panel.add(textField_3);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(112, 200, 153, 22);
				panel.add(textField_4);
			}
			{
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(112, 245, 153, 22);
				panel.add(textField_5);
			}
			{
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(112, 288, 153, 22);
				panel.add(textField_6);
			}
			{
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(112, 334, 153, 22);
				panel.add(textField_7);
			}
			{
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				textField_8.setBounds(112, 387, 153, 22);
				panel.add(textField_8);
			}
			{
				JLabel lblNewLabel_9 = new JLabel(" Es profesional?");
				lblNewLabel_9.setBounds(122, 421, 111, 16);
				panel.add(lblNewLabel_9);
			}
			
			JRadioButton rdbtnNewRadioButton = new JRadioButton("Si");
			rdbtnNewRadioButton.setBackground(Color.WHITE);
			rdbtnNewRadioButton.setBounds(102, 443, 67, 25);
			panel.add(rdbtnNewRadioButton);
			
			JRadioButton rdbtnNo = new JRadioButton("No");
			rdbtnNo.setBackground(Color.WHITE);
			rdbtnNo.setBounds(199, 443, 67, 25);
			panel.add(rdbtnNo);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(12, 23, 302, 446);
			panel.add(panel_1);
			
			JButton btnNewButton = new JButton("Registrar");
			btnNewButton.setBackground(Color.WHITE);
			btnNewButton.setBounds(353, 443, 111, 25);
			panel.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Volver");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(698, 461, 97, 25);
			panel.add(btnNewButton_1);
		}
	}
}
