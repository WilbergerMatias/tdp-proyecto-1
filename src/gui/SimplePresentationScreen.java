package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;


import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;

	private JLabel lblLastName;
	private JTextField tfLU;
	private JTextField tfLastName;
	private JTextField tfFirstName;
	private JTextField tfMail;
	private JTextField tfURL;
	private JLabel lblPhotoPath;
	private JLabel lblExtra;
	private JLabel lblCarrerasDel;
	private JLabel lblExtraSpace;
	private JLabel lblFecha;
	

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(697, 414));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setBackground(new Color(153, 153, 153));
		tabInformation.setPreferredSize(new Dimension(670, 200));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		lblLastName = new JLabel("Apellido :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLastName.setForeground(new Color(255, 255, 102));
		lblLastName.setBackground(Color.WHITE);
		lblLastName.setBounds(10, 40, 70, 14);
		tabInformation.add(lblLastName);
		
		JLabel lblLu = new JLabel("LU :");
		lblLu.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLu.setForeground(new Color(255, 255, 102));
		lblLu.setBackground(Color.WHITE);
		lblLu.setBounds(10, 11, 70, 14);
		tabInformation.add(lblLu);
		
		JLabel lblName = new JLabel("Nombre :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblName.setForeground(new Color(255, 255, 102));
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(10, 69, 70, 14);
		tabInformation.add(lblName);
		
		JLabel lblUrl = new JLabel("URL :");
		lblUrl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUrl.setForeground(new Color(255, 255, 102));
		lblUrl.setBackground(Color.WHITE);
		lblUrl.setBounds(10, 126, 62, 14);
		tabInformation.add(lblUrl);
		
		JLabel lblMail = new JLabel("Mail :");
		lblMail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMail.setForeground(new Color(255, 255, 102));
		lblMail.setBackground(Color.WHITE);
		lblMail.setBounds(10, 97, 70, 14);
		tabInformation.add(lblMail);
		
		tfLU = new JTextField();
		tfLU.setBounds(73, 8, 314, 20);
		tabInformation.add(tfLU);
		tfLU.setColumns(10);
		
		tfLastName = new JTextField();
		tfLastName.setColumns(10);
		tfLastName.setBounds(73, 37, 314, 20);
		tabInformation.add(tfLastName);
		
		tfFirstName = new JTextField();
		tfFirstName.setColumns(10);
		tfFirstName.setBounds(73, 66, 314, 20);
		tabInformation.add(tfFirstName);
		
		tfMail = new JTextField();
		tfMail.setColumns(10);
		tfMail.setBounds(73, 94, 314, 20);
		tabInformation.add(tfMail);
		
		tfURL = new JTextField();
		tfURL.setColumns(10);
		tfURL.setBounds(73, 123, 314, 20);
		tabInformation.add(tfURL);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		lblPhotoPath = new JLabel("  ");
		lblPhotoPath.setBounds(467, 38, 193, 191);
		lblPhotoPath.setVisible(false);
		tabInformation.add(lblPhotoPath);
		
		JButton BotonId = new JButton("Quien soy?");
		BotonId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BotonId.setVisible(false);
				
				helper();
				
				showPortrait();
			}

			private void showPortrait() {
				// TODO Auto-generated method stub
				lblPhotoPath.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource(studentData.getPathPhoto())));
				lblPhotoPath.setVisible(true);
			}

			private void helper() {
				// TODO Auto-generated method stub
				
				tfLU.setText(String.valueOf(studentData.getId()));
				tfLastName.setText(studentData.getLastName());
				tfFirstName.setText(studentData.getFirstName());
				tfMail.setText(studentData.getMail());
				tfURL.setText(studentData.getGithubURL());
				
			}
		});
		BotonId.setFont(new Font("Tahoma", Font.BOLD, 15));
		BotonId.setForeground(Color.BLACK);
		BotonId.setBackground(Color.LIGHT_GRAY);
		BotonId.setBounds(467, 9, 193, 303);
		tabInformation.add(BotonId);
		
		lblExtra = new JLabel("Estudiando");
		lblExtra.setForeground(new Color(255, 255, 102));
		lblExtra.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblExtra.setBackground(Color.WHITE);
		lblExtra.setBounds(10, 226, 90, 14);
		tabInformation.add(lblExtra);
		
		lblCarrerasDel = new JLabel("Carreras del :");
		lblCarrerasDel.setForeground(new Color(255, 255, 102));
		lblCarrerasDel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCarrerasDel.setBackground(Color.WHITE);
		lblCarrerasDel.setBounds(10, 242, 100, 14);
		tabInformation.add(lblCarrerasDel);		
		
		lblExtraSpace = new JLabel(" ");
		lblExtraSpace.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/DCICLogo.png")));
		lblExtraSpace.setBounds(94, 154, 327, 160);
		tabInformation.add(lblExtraSpace);
		
		lblFecha = new JLabel(" ");
		lblFecha.setForeground(new Color(255, 255, 102));
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBackground(Color.WHITE);
		lblFecha.setBounds(10, 322, 500, 14);
		tabInformation.add(lblFecha);
		updatetime();
	}

	private void updatetime() {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		lblFecha.setText("Esta ventana fue generada en esta fecha : "+ dtf.format(now));
	}
}
