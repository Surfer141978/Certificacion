/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic2;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Javier_2
 */
public class VentanaInicioSesion extends JFrame {
	JButton buttonIngresar; 

	public static void main(String[] args) { 

		JFrame login = new JFrame("Sistema de Información Yamantaka");
		PanelImagen_Login imagen = new PanelImagen_Login();
		PanelDatos_Login datos = new PanelDatos_Login(login);

		login.add(imagen, BorderLayout.NORTH);
		login.add(datos, BorderLayout.CENTER); 
		login.setSize(380, 365);
		login.setVisible(false);
		login.setResizable(false);
		login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}    
}
