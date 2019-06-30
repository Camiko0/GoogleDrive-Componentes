//Paquete
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
//Librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

//Declaración de la clase
public class Vista extends JFrame implements ActionListener{
	
	//Declaración de componentes
	private JPanel panelSuperior, panelInferior, panelIzquierdo, panelDerecho, panelFinal;
	private JLabel labelTitulo, labelIconosSuperior, labelIconosInferior, labelMiUnidad, labelAlmacenamiento,
	labelAccesoRapido, labelCarpetas, labelMiUnidad2;
	private JTextField textoNombreUsuario;
	private JButton botonCalendar, botonKeep, botonTasks,botonMiUnidad, botonCompartido, 
	botonReciente, botonDestacado, botonPapelera, botonCopias;
	private JComboBox comboAplicaciones, comboUsuario, comboMiUnidad;
	private JTextArea textoMiUnidad, textoAccesoRapido, textoCarpetas;
	private JSeparator separador, separador2, separador3;
	private Color colorAzulOscuro, colorRojoOscuro, colorMorado, colorCafeOscuro;
	private Cursor cursor;
	private Font fuenteNegrilla, fuenteNormal, fuenteCursiva;
	private Border borde1, borde3;
	
	//Constructor
	public Vista() {
		//Color
		colorAzulOscuro = new Color (77,109,203);
		colorRojoOscuro = new Color(201,72,57);
		colorMorado = new Color(226,218,230,150);
		colorCafeOscuro = new Color(82,25,2);
		
		//Cursor
		cursor= new Cursor(Cursor.HAND_CURSOR);
		
		//Fuente
		fuenteNegrilla = new Font("Times New Roman", Font.BOLD, 21); // BOLD → Negrilla
		fuenteNormal = new Font("Calibri (Cuerpo)", Font.PLAIN, 15); // PLAIN → texto normal
		fuenteCursiva = new Font("Arial", Font. ITALIC, 12); // ITALIC → cursive
		
		//Borde
		borde1= BorderFactory.createMatteBorder(0, 0, 3, 0, colorCafeOscuro);
		borde3= BorderFactory.createLineBorder(colorCafeOscuro, 2, true);
		
		//Panel Superior
		panelSuperior = new JPanel();
		panelSuperior.setBounds(0, 0, 1280, 80);
		panelSuperior.setBackground(Color.white);
		panelSuperior.setLayout(null);
		add(panelSuperior);

		//Panel Inferior
		panelInferior = new JPanel();
		panelInferior.setBounds(280, 80, 940, 80);
		panelInferior.setBackground(Color.white);
		panelInferior.setLayout(null);
		add(panelInferior);

		//Panel Izquierdo
		panelIzquierdo = new JPanel();
		panelIzquierdo.setBounds(0, 80, 280, 590);
		panelIzquierdo.setBackground(Color.white);
		panelIzquierdo.setLayout(null);
		add(panelIzquierdo);

		//Panel Derecho
		panelDerecho = new JPanel();
		panelDerecho.setBounds(280, 160, 940, 510);
		panelDerecho.setBackground(Color.white);
		panelDerecho.setLayout(null);
		add(panelDerecho);

		//Panel Final
		panelFinal = new JPanel();
		panelFinal.setBounds(1220, 80, 60, 590);
		panelFinal.setBackground(Color.white);
		panelFinal.setLayout(null);
		add(panelFinal);

		//Label
		labelTitulo = new JLabel(" Google");
		labelTitulo.setBounds(40,10,100,60);
		labelTitulo.setFont(fuenteNegrilla);
		labelTitulo.setForeground(colorRojoOscuro);
		labelTitulo.setBorder(borde1);
		panelSuperior.add(labelTitulo);
		labelIconosSuperior = new JLabel("Iconos");
		labelIconosSuperior.setBounds(870, 10, 60, 60);
		labelIconosSuperior.setForeground(colorAzulOscuro); 
		labelIconosSuperior.setFont(fuenteNormal);
		panelSuperior.add(labelIconosSuperior);
		labelIconosInferior = new JLabel("Iconos");
		labelIconosInferior.setBounds(870, 10, 60, 60);
		labelIconosInferior.setForeground(colorAzulOscuro); 
		labelIconosInferior.setFont(fuenteNormal);
		panelInferior.add(labelIconosInferior);
		labelMiUnidad = new JLabel("Mi Unidad");
		labelMiUnidad.setBounds(5,10,120,60);
		labelMiUnidad.setFont(fuenteNegrilla);
		labelMiUnidad.setForeground(colorRojoOscuro);
		labelMiUnidad.setBorder(borde1);
		panelInferior.add(labelMiUnidad);
		labelAlmacenamiento = new JLabel("       Almacenamiento");
		labelAlmacenamiento.setBounds(40,380,200,40);
		labelAlmacenamiento.setFont(fuenteNormal);
		labelAlmacenamiento.setForeground(colorRojoOscuro);
		labelAlmacenamiento.setBorder(borde1);
		panelIzquierdo.add(labelAlmacenamiento);
		labelAccesoRapido = new JLabel("Acceso Rápido");
		labelAccesoRapido.setBounds(10,2,530,15);
		labelAccesoRapido.setFont(fuenteCursiva);
		labelAccesoRapido.setForeground(colorAzulOscuro);
		panelDerecho.add(labelAccesoRapido);
		labelCarpetas = new JLabel("Carpetas");
		labelCarpetas.setBounds(10,198,530,15);
		labelCarpetas.setFont(fuenteCursiva);
		labelCarpetas.setForeground(colorAzulOscuro);
		panelDerecho.add(labelCarpetas);
		labelMiUnidad2 = new JLabel("Mi Unidad");
		labelMiUnidad2.setBounds(540,2,395,15);
		labelMiUnidad2.setFont(fuenteCursiva);
		labelMiUnidad2.setForeground(colorAzulOscuro);
		panelDerecho.add(labelMiUnidad2);
		
		//TextField
		textoNombreUsuario= new JTextField("Buscar en Drive:");
		textoNombreUsuario.setBounds(285, 10, 350, 60);
		textoNombreUsuario.setForeground(colorAzulOscuro); 
		textoNombreUsuario.setFont(fuenteNormal);
		textoNombreUsuario.setBorder(borde1);
		panelSuperior.add(textoNombreUsuario);
		
		//Button
		botonMiUnidad= new JButton("Mi Unidad");
		botonMiUnidad.setBounds(40, 80, 200, 40);
		botonMiUnidad.setCursor(cursor);
		botonMiUnidad.setForeground(colorRojoOscuro); 
		botonMiUnidad.setFont(fuenteNormal);
		botonMiUnidad.setBorder(borde1);
		panelIzquierdo.add(botonMiUnidad);
		botonCompartido= new JButton("Compartido Conmigo");
		botonCompartido.setBounds(40, 130, 200, 40);
		botonCompartido.setCursor(cursor);
		botonCompartido.setForeground(colorRojoOscuro); 
		botonCompartido.setFont(fuenteNormal);
		botonCompartido.setBorder(borde1);
		panelIzquierdo.add(botonCompartido);
		botonReciente= new JButton("Reciente");
		botonReciente.setBounds(40, 180, 200, 40);
		botonReciente.setCursor(cursor);
		botonReciente.setForeground(colorRojoOscuro); 
		botonReciente.setFont(fuenteNormal);
		botonReciente.setBorder(borde1);
		panelIzquierdo.add(botonReciente);
		botonDestacado= new JButton("Destacado");
		botonDestacado.setBounds(40, 230, 200, 40);
		botonDestacado.setCursor(cursor);
		botonDestacado.setForeground(colorRojoOscuro); 
		botonDestacado.setFont(fuenteNormal);
		botonDestacado.setBorder(borde1);
		panelIzquierdo.add(botonDestacado);
		botonPapelera= new JButton("Papelera");
		botonPapelera.setBounds(40, 280, 200, 40);
		botonPapelera.setCursor(cursor);
		botonPapelera.setForeground(colorRojoOscuro); 
		botonPapelera.setFont(fuenteNormal);
		botonPapelera.setBorder(borde1);
		panelIzquierdo.add(botonPapelera);
		botonCopias= new JButton("Copias de Seguridad");
		botonCopias.setBounds(40, 330, 200, 40);
		botonCopias.setCursor(cursor);
		botonCopias.setForeground(colorRojoOscuro); 
		botonCopias.setFont(fuenteNormal);
		botonCopias.setBorder(borde1);
		panelIzquierdo.add(botonCopias);
		botonCalendar= new JButton("Calendar");
		botonCalendar.setBounds(5, 10, 50, 50);
		botonCalendar.setCursor(cursor);
		botonCalendar.setForeground(colorRojoOscuro); 
		botonCalendar.setFont(fuenteCursiva);
		botonCalendar.setBorder(borde3);
		panelFinal.add(botonCalendar);
		botonKeep= new JButton("Calendar");
		botonKeep.setBounds(5, 70, 50, 50);
		botonKeep.setCursor(cursor);
		botonKeep.setForeground(colorRojoOscuro); 
		botonKeep.setFont(fuenteCursiva);
		botonKeep.setBorder(borde3);
		panelFinal.add(botonKeep);
		botonTasks= new JButton("Calendar");
		botonTasks.setBounds(5, 130, 50, 50);
		botonTasks.setCursor(cursor);
		botonTasks.setForeground(colorRojoOscuro); 
		botonTasks.setFont(fuenteCursiva);
		botonTasks.setBorder(borde3);
		panelFinal.add(botonTasks);
		
		//ComboBox
		comboAplicaciones= new JComboBox();
		comboAplicaciones.addItem("Cuenta");
		comboAplicaciones.addItem("Búsqueda");
		comboAplicaciones.addItem("Maps");
		comboAplicaciones.addItem("YouTube");
		comboAplicaciones.addItem("Google Play");
		comboAplicaciones.addItem("Noticias");
		comboAplicaciones.addItem("Gmail");
		comboAplicaciones.addItem("Contactos");
		comboAplicaciones.addItem("Drive");
		comboAplicaciones.addItem("Calendar");
		comboAplicaciones.addItem("Traductor");
		comboAplicaciones.addItem("Fotos");
		comboAplicaciones.addItem("Shopping");
		comboAplicaciones.setBounds(950, 20, 120, 40);
		comboAplicaciones.setForeground(colorCafeOscuro); 
		comboAplicaciones.setFont(fuenteNormal);
		comboAplicaciones.setCursor(cursor);
		comboAplicaciones.setBorder(borde3);
		panelSuperior.add(comboAplicaciones);
		comboUsuario= new JComboBox();
		comboUsuario.addItem("Añadir Cuenta");
		comboUsuario.addItem("Cerrar Sesión");
		comboUsuario .setBounds(1100, 20, 150, 40);
		comboUsuario.setForeground(colorCafeOscuro); 
		comboUsuario.setFont(fuenteNormal);
		comboUsuario.setCursor(cursor);
		comboUsuario.setBorder(borde3);
		panelSuperior.add(comboUsuario);
		comboMiUnidad= new JComboBox();
		comboMiUnidad.addItem("Nueva Carpeta");
		comboMiUnidad.addItem("Subir Archivos");
		comboMiUnidad.addItem("Subir Carpeta");
		comboMiUnidad.addItem("Documentos de Google");
		comboMiUnidad.addItem("Hoja de cálculo de Google");
		comboMiUnidad.addItem("Presentaciones de Google");
		comboMiUnidad.setBounds(40, 10, 200, 40);
		comboMiUnidad.setForeground(colorCafeOscuro); 
		comboMiUnidad.setFont(fuenteNormal);
		comboMiUnidad.setCursor(cursor);
		comboMiUnidad.setBorder(borde3);
		panelIzquierdo.add(comboMiUnidad);
		
		//TextArea
		textoAccesoRapido= new JTextArea();
		textoAccesoRapido.setBounds(5, 20, 530, 175);
		textoAccesoRapido.setForeground(colorCafeOscuro); 
		textoAccesoRapido.setFont(fuenteCursiva);
		textoAccesoRapido.setBackground(colorMorado);
		textoAccesoRapido.setBorder(borde1);
		panelDerecho.add(textoAccesoRapido);
		textoCarpetas= new JTextArea();
		textoCarpetas.setBounds(5, 220, 530, 250);
		textoCarpetas.setForeground(colorCafeOscuro); 
		textoCarpetas.setFont(fuenteCursiva);
		textoCarpetas.setBackground(colorMorado);
		textoCarpetas.setBorder(borde1);
		panelDerecho.add(textoCarpetas);
		textoMiUnidad= new JTextArea();
		textoMiUnidad.setBounds(540, 20, 395, 450);
		textoMiUnidad.setForeground(colorCafeOscuro); 
		textoMiUnidad.setFont(fuenteNormal);
		textoMiUnidad.setBackground(colorMorado);
		textoMiUnidad.setBorder(borde1);
		panelDerecho.add(textoMiUnidad);
		
		//Separator
		separador = new JSeparator(SwingConstants.HORIZONTAL);
		separador.setBounds(0, 75, 1280, 5);
		panelSuperior.add(separador);
		separador2 = new JSeparator(SwingConstants.HORIZONTAL);
		separador2.setBounds(0, 75, 930, 5);
		panelInferior.add(separador2);
		separador3 = new JSeparator(SwingConstants.VERTICAL);
		separador3.setBounds(1220, 0, 5, 630);
		panelFinal.add(separador3);
		
		//Configuración Ventana (de ultimas en el constructor)
		setTitle("Google Drive");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280,670);
		setLocationRelativeTo(this);
		setLayout(null);
		setResizable(true);
	}

	//Metodo de eventos	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}
}
