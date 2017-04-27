/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic2;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
/**
 *
 * @author Javier_2
 */
public class VentanaPrincipal extends JFrame{
	public static void main(String[] args) {

		JFrame ventanaPrincipal = new JFrame("Sistema de Información Yamantaka");
		ventanaPrincipal.setVisible(true);
                ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventanaPrincipal.setSize(800,600);
	}
}
