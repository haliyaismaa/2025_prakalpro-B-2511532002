package pekan8_2511532002;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class OperatorAritmatikaGUI_2511532002 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532002 frame = new OperatorAritmatikaGUI_2511532002();
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
	public OperatorAritmatikaGUI_2511532002() {
		setTitle("OPERATOR ARITMATIKA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 315);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 53, 68, 13);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(41, 10, 226, 22);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setBounds(10, 92, 68, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Operator");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_1.setBounds(10, 151, 68, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Hasil");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_1_1.setBounds(10, 223, 47, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setForeground(Color.BLACK);
		txtBil1.setFont(new Font("Arial", Font.BOLD, 12));
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(88, 47, 60, 19);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setFont(new Font("Arial", Font.BOLD, 12));
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(88, 86, 60, 19);
		contentPane.add(txtBil2);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setFont(new Font("Arial", Font.BOLD, 12));
		cbOperator.setBounds(88, 143, 60, 21);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setFont(new Font("Arial", Font.BOLD, 14));
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(88, 219, 68, 27);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton Proc = new JButton("Proses");
		Proc.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		Proc.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				}else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				}else
				{
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						if( c==0) {
							hasil = a+b;
						}
						if (c==1) {
							hasil = a-b;
						}
						if (c==2) {
							hasil = a*b;
						}
						if (c==3) {
							hasil = a/b;
						}
						if (c==4) {
							hasil = a%b;
						}
					}catch (NumberFormatException ex) {
						pesanEror("Bilangan 1 dan 2 harus angka");
					}
				}
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		Proc.setBounds(158, 143, 75, 21);
		contentPane.add(Proc);

	}
}
