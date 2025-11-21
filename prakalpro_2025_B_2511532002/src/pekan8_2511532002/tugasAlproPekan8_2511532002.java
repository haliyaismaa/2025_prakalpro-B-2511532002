package pekan8_2511532002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tugasAlproPekan8_2511532002 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfBil1;
	private JTextField tfBil2;
	private JTextField txtPenjumlahan;
	private JTextField txtPengurangan;
	private JTextField txtPerkalian;
	private JTextField txtPembagian;
	private JTextField txtMod;
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
					tugasAlproPekan8_2511532002 frame = new tugasAlproPekan8_2511532002();
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
	public tugasAlproPekan8_2511532002() {
		setTitle("Operator Assigment");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(183, 227, 251));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Bil1 = new JLabel("Bilangan 1");
		Bil1.setForeground(new Color(32, 65, 125));
		Bil1.setFont(new Font("Arial", Font.BOLD, 12));
		Bil1.setBounds(33, 64, 80, 13);
		contentPane.add(Bil1);
		
		JLabel lblTitle = new JLabel("OPERATOR ASSIGMENT");
		lblTitle.setBounds(113, 10, 219, 22);
		lblTitle.setForeground(new Color(32, 65, 125));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
		contentPane.add(lblTitle);
		
		JLabel Bil2 = new JLabel("Bilangan 2");
		Bil2.setForeground(new Color(32, 65, 125));
		Bil2.setFont(new Font("Arial", Font.BOLD, 12));
		Bil2.setBounds(33, 97, 80, 13);
		contentPane.add(Bil2);
		
		tfBil1 = new JTextField();
		tfBil1.setHorizontalAlignment(SwingConstants.CENTER);
		tfBil1.setFont(new Font("Arial", Font.BOLD, 12));
		tfBil1.setBounds(102, 61, 96, 19);
		contentPane.add(tfBil1);
		tfBil1.setColumns(10);
		
		tfBil2 = new JTextField();
		tfBil2.setHorizontalAlignment(SwingConstants.CENTER);
		tfBil2.setFont(new Font("Arial", Font.BOLD, 12));
		tfBil2.setColumns(10);
		tfBil2.setBounds(102, 94, 96, 19);
		contentPane.add(tfBil2);
		
		JLabel lblNewLabel = new JLabel("HASIL OPERASI");
		lblNewLabel.setForeground(new Color(32, 65, 125));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(33, 158, 96, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Assigment Penjumlahan");
		lblNewLabel_1.setForeground(new Color(32, 65, 125));
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(35, 200, 180, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Assigment Pengurangan");
		lblNewLabel_1_1_1.setForeground(new Color(32, 65, 125));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(35, 270, 180, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Assigment Hasil Sisa Bagi");
		lblNewLabel_1_1_2.setForeground(new Color(32, 65, 125));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(33, 480, 180, 13);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Assigment Perkalian");
		lblNewLabel_1_1_3.setForeground(new Color(32, 65, 125));
		lblNewLabel_1_1_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3.setBounds(33, 340, 180, 13);
		contentPane.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Assigment Pembagian");
		lblNewLabel_1_1_3_1.setForeground(new Color(32, 65, 125));
		lblNewLabel_1_1_3_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1_1_3_1.setBounds(33, 410, 180, 13);
		contentPane.add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_2 = new JLabel("Penjumlahan");
		lblNewLabel_2.setForeground(new Color(32, 65, 125));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(33, 225, 80, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pengurangan");
		lblNewLabel_2_1.setForeground(new Color(32, 65, 125));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(33, 290, 80, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Modulo");
		lblNewLabel_2_1_1.setForeground(new Color(32, 65, 125));
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(33, 500, 80, 13);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Perkalian");
		lblNewLabel_2_1_2.setForeground(new Color(32, 65, 125));
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2.setBounds(33, 360, 80, 13);
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Pembagian");
		lblNewLabel_2_1_2_1.setForeground(new Color(32, 65, 125));
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_2_1.setBounds(33, 430, 80, 13);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		txtPenjumlahan = new JTextField();
		txtPenjumlahan.setHorizontalAlignment(SwingConstants.CENTER);
		txtPenjumlahan.setFont(new Font("Arial", Font.BOLD, 12));
		txtPenjumlahan.setBounds(133, 222, 60, 20);
		contentPane.add(txtPenjumlahan);
		txtPenjumlahan.setColumns(10);
		
		txtPengurangan = new JTextField();
		txtPengurangan.setHorizontalAlignment(SwingConstants.CENTER);
		txtPengurangan.setFont(new Font("Arial", Font.BOLD, 12));
		txtPengurangan.setColumns(10);
		txtPengurangan.setBounds(133, 287, 60, 20);
		contentPane.add(txtPengurangan);
		
		txtPerkalian = new JTextField();
		txtPerkalian.setHorizontalAlignment(SwingConstants.CENTER);
		txtPerkalian.setFont(new Font("Arial", Font.BOLD, 12));
		txtPerkalian.setColumns(10);
		txtPerkalian.setBounds(133, 357, 60, 20);
		contentPane.add(txtPerkalian);
		
		txtPembagian = new JTextField();
		txtPembagian.setHorizontalAlignment(SwingConstants.CENTER);
		txtPembagian.setFont(new Font("Arial", Font.BOLD, 12));
		txtPembagian.setColumns(10);
		txtPembagian.setBounds(133, 427, 60, 20);
		contentPane.add(txtPembagian);
		
		txtMod = new JTextField();
		txtMod.setHorizontalAlignment(SwingConstants.CENTER);
		txtMod.setFont(new Font("Arial", Font.BOLD, 12));
		txtMod.setColumns(10);
		txtMod.setBounds(133, 497, 60, 20);
		contentPane.add(txtMod);
		
		JButton btnProses = new JButton("Proses");
		btnProses.setForeground(new Color(32, 65, 125));
		btnProses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (tfBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi!");
					return;
				}
				if (tfBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
					return;
				}
			
				try {
					int a = Integer.parseInt(tfBil1.getText());
					int b = Integer.parseInt(tfBil2.getText());
					
					//Operasi
					txtPenjumlahan.setText(String.valueOf(a + b));
					txtPengurangan.setText(String.valueOf(a - b));
					txtPerkalian.setText(String.valueOf(a * b));
					
					if (b == 0) {
						txtPembagian.setText("Error");
						txtMod.setText("Error");
						pesanEror("Bilangan 2 tidak boleh 0!");
					}else {
						txtPembagian.setText(String.valueOf(a/b));
						txtMod.setText(String.valueOf(a%b));
					}
				}catch (NumberFormatException ex) {
					pesanEror("Bilangan 1 dan 2 harus angka!");
				}	
			}	
		});
		btnProses.setBackground(new Color(71, 181, 245));
		btnProses.setFont(new Font("Arial", Font.BOLD, 14));
		btnProses.setBounds(303, 72, 85, 21);
		contentPane.add(btnProses);
	}
}
