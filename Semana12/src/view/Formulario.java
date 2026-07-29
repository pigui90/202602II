package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Formulario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNombre = new JLabel("Nombre:");
		lbNombre.setBounds(10, 11, 59, 14);
		contentPane.add(lbNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(66, 8, 129, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(btnMostrar, "HOLA " + name);
				if(tfNombre.getText().equals("")) {
					lblMensaje.setForeground(Color.RED);
					lblMensaje.setText("Falta el nombre");
				}else {
					lblMensaje.setText("");
				}
			}
		});
		btnMostrar.setBounds(256, 160, 89, 23);
		contentPane.add(btnMostrar);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(46, 50, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(46, 87, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(210, 50, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(210, 87, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(46, 159, 188, 91);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Observaciones");
		lblNewLabel.setBounds(10, 133, 129, 14);
		contentPane.add(lblNewLabel);
		
		lblMensaje = new JLabel("");
		lblMensaje.setBounds(205, 11, 155, 14);
		contentPane.add(lblMensaje);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(344, 25, 48, 20);
		contentPane.add(spinner);
		
		JButton btnNavegar = new JButton("Navegar");
		btnNavegar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormularioClase formClass = new FormularioClase();
				formClass.setVisible(true);
				setVisible(false);
			}
		});
		btnNavegar.setBounds(256, 194, 89, 23);
		contentPane.add(btnNavegar);

	}
}
