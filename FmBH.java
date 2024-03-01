package n1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FmBH extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtgia;
	private JTextField txtslton;
	private JTextField txtttien;
	private JTextField txtnhapsi;
	JComboBox cmbhang = new JComboBox();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FmBH frame = new FmBH();
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
	public FmBH() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				cmbhang.addItem("Xang");
				cmbhang.addItem("Dau");
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.out.print("Tam biet");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Chọn hàng");
		lblNewLabel_3.setBounds(30, 11, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Giá");
		lblNewLabel_2.setBounds(30, 36, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Số lượng tồn");
		lblNewLabel_1.setBounds(30, 67, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Nhập sĩ");
		lblNewLabel.setBounds(30, 100, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Thành tiền");
		lblNewLabel_4.setBounds(30, 137, 67, 14);
		contentPane.add(lblNewLabel_4);
		
		
		cmbhang.setBounds(136, 7, 103, 22);
		contentPane.add(cmbhang);
		
		txtgia = new JTextField();
		txtgia.setBounds(136, 33, 86, 20);
		contentPane.add(txtgia);
		txtgia.setColumns(10);
		
		txtslton = new JTextField();
		txtslton.setBounds(136, 64, 86, 20);
		contentPane.add(txtslton);
		txtslton.setColumns(10);
		
		txtttien = new JTextField();
		txtttien.setBounds(136, 129, 86, 20);
		contentPane.add(txtttien);
		txtttien.setColumns(10);
		
		txtnhapsi = new JTextField();
		txtnhapsi.setBounds(136, 97, 86, 20);
		contentPane.add(txtnhapsi);
		txtnhapsi.setColumns(10);
		
		JButton btnNewButton = new JButton("Bán");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBounds(136, 173, 67, 23);
		contentPane.add(btnNewButton);
	}
}
