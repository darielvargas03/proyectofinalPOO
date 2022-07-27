package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class RegistroEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroEmpresa dialog = new RegistroEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroEmpresa() {
		setBounds(100, 100, 809, 513);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setForeground(new Color(255, 255, 255));
			panel.setBackground(new Color(0, 0, 139));
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Por favor llenar los datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("ID:");
				lblNewLabel.setBounds(51, 52, 56, 16);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Nombre:");
				lblNewLabel_1.setBounds(51, 103, 56, 16);
				panel.add(lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("Direccion:");
				lblNewLabel_2.setBounds(51, 162, 84, 16);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Telefono:");
				lblNewLabel_3.setBounds(51, 220, 56, 16);
				panel.add(lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("RNC");
				lblNewLabel_4.setBounds(51, 280, 56, 16);
				panel.add(lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Descripcion:");
				lblNewLabel_5.setBounds(35, 325, 72, 16);
				panel.add(lblNewLabel_5);
			}
			{
				textField = new JTextField();
				textField.setBounds(118, 49, 158, 22);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(118, 100, 158, 22);
				panel.add(textField_1);
			}
			{
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(118, 159, 158, 22);
				panel.add(textField_2);
			}
			{
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(118, 217, 158, 22);
				panel.add(textField_3);
			}
			{
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(118, 277, 158, 22);
				panel.add(textField_4);
			}
			{
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(118, 325, 178, 103);
				panel.add(textField_5);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(12, 28, 339, 415);
				panel.add(panel_1);
			}
			{
				JButton btnNewButton = new JButton("Registrar");
				btnNewButton.setBackground(Color.WHITE);
				btnNewButton.setBounds(374, 397, 97, 25);
				panel.add(btnNewButton);
			}
			{
				JButton btnNewButton_1 = new JButton("Volver");
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnNewButton_1.setBounds(672, 418, 97, 25);
				panel.add(btnNewButton_1);
			}
		}
	}

}
