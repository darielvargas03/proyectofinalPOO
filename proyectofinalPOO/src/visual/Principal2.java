package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal2 frame = new Principal2();
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
	public Principal2() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 554);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 139));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(70, 60, 767, 423);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 34));
		lblNewLabel.setBounds(62, 77, 186, 54);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Personal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroPersonal dialog = new RegistroPersonal();
				dialog.setVisible(true);
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(61, 144, 137, 75);
		panel_1.add(btnNewButton);
		
		JButton btnEmpresa = new JButton("Empresa");
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistroEmpresa dialog = new RegistroEmpresa();
				dialog.setVisible(true);
			}
		});
		btnEmpresa.setBackground(Color.WHITE);
		btnEmpresa.setBounds(61, 253, 137, 75);
		panel_1.add(btnEmpresa);
		
		JLabel lblNewLabel_1 = new JLabel("Tu informacion esta segura!");
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(286, 377, 194, 33);
		panel_1.add(lblNewLabel_1);
	}

}
