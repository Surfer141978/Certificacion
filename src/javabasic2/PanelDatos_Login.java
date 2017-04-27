/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic2;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;/**
 *
 * @author Javier_2
 */
public class PanelDatos_Login extends JPanel implements ActionListener{
    	private final JComboBox<String> comboTipoUsuario;
	private JLabel labelNombreUsuario;
	private JTextField textNombreUsuario;
	private JLabel labelContraseña;
	private JPasswordField passUsuario;
	private JButton buttonIngresar;
        private JFrame login;

	// public PanelDatos_Login(){
        	public PanelDatos_Login(JFrame login){//agregar parametro
		this.login=login;//coge la referencia para poder ser utilizada en toda la clase                
		String[] tipoUsuario = {"Cliente", "Administrador", "Asesor de Ventas"};
		comboTipoUsuario = new JComboBox<String>(tipoUsuario);
		labelNombreUsuario = new JLabel("Nombre de Usuario:");
		textNombreUsuario = new JTextField(10);
		labelContraseña = new JLabel("Contraseña:");
		passUsuario = new JPasswordField(10);
		buttonIngresar = new JButton("Ingresar");
                buttonIngresar.addActionListener(this);
 

		// Borde

		Color colorBorde = new Color(84,33,29);
		Border interior = BorderFactory.createLineBorder(colorBorde, 1, false);
		Border bordeInterior = BorderFactory.createTitledBorder(interior, "Inicio de Sesión", 0, 0);
		Border bordeExterior = BorderFactory.createEmptyBorder(5, 5, 10, 10);
		setBorder(BorderFactory.createCompoundBorder(bordeExterior, bordeInterior)); 

		/// GridBagLayout

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0; // Fila 
		gbc.gridy = 0; // Columna
		gbc.gridwidth = 2; // Columnas que ocupa 
		gbc.gridheight =1; // Filas que ocupa
		//gbc.weightx = 1; 
		//gbc.weighty = 0;
		gbc.insets = new Insets(5, 15, 15, 1);
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.fill = GridBagConstraints.CENTER;
		this.add(comboTipoUsuario, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 0;
		gbc.insets = new Insets(5, 15, 5, 1);
		gbc.anchor = GridBagConstraints.NORTH;
		gbc.fill = GridBagConstraints.BOTH;
		this.add(labelNombreUsuario, gbc);
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 15, 4, 1);
		this.add(textNombreUsuario, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(1, 15, 4, 1);
		this.add(labelContraseña,gbc);
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 15, 10, 1);
		this.add(passUsuario, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(15, 4, 4, 10);
		this.add(buttonIngresar, gbc);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == buttonIngresar) {
			VentanaPrincipal vp = new VentanaPrincipal();
			VentanaInicioSesion vlogin = new VentanaInicioSesion();                        
			vp.setVisible(true);
			login.setVisible(false);
                } 
        }
}
