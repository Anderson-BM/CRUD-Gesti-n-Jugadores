package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Jugadores.Extencion;
import Jugadores.Jugador;


import java.awt.Font;
import javax.swing.border.MatteBorder;

@SuppressWarnings("unused")
public class InterfazPrincipal {

	private JFrame frame;
	private JTable table;
	private JTextField textNo;
	private JTextField textNombre;
	private JTextField textEdad;
	private JTextField textPosicion;
	DefaultTableModel tbm = new DefaultTableModel();
	
//-------------------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazPrincipal window = new InterfazPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
//---------------------------------------------------------
	public InterfazPrincipal() {
		
		initialize();
	}
//-------------------------------  AAP
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1115, 718);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//------------------------------------------- PANEL DE BOTONES E INICIO -----------------------------------------------------------------------

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(0, 64, 128));
		panel.setBounds(22, 0, 258, 671);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 612, 238, 49);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/trofeo.png")));
		lblNewLabel_6.setBounds(23, 10, 38, 34);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/trofeo.png")));
		lblNewLabel_6_1.setBounds(71, 10, 38, 34);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/trofeo.png")));
		lblNewLabel_6_2.setBounds(119, 10, 38, 34);
		panel_1.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("");
		lblNewLabel_6_3.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/trofeo.png")));
		lblNewLabel_6_3.setBounds(167, 10, 38, 34);
		panel_1.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/barcelona.png")));
		lblNewLabel_2.setBounds(165, 10, 83, 95);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/verde.png")));
		lblNewLabel_3.setBounds(-23, 115, 271, 487);
		panel.add(lblNewLabel_3);
		
		
		//-------------------------------------------  J SCROLL MODEL Y TABLA -----------------------------------------------------------------------
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(290, 468, 801, 160);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		String [] titulo = new String [] {"No Identificacion","Nombre","Edad","Posicion"};
		tbm.setColumnIdentifiers(titulo);
		
		
		 // Añadir filas por defecto
        Object[][] filasPorDefecto = {
            {"001", " Anderson Batista", "18", "Delantero"},
            {"002", "kILLIAN Mbape 2", "22", "Mediocampista"},
            {"003", "Cristiano Ronaldo", "25", "Defensa"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            {"004", "Messi Alvarez", "30", "Portero"},
            
        };

        for (Object[] fila : filasPorDefecto) {
            tbm.addRow(fila);
        }
		
		
		table.setModel(tbm);
		scrollPane.setViewportView(table);
		table.setVisible(false);
		
		
		JPanel panelEditar = new JPanel();
		panelEditar.setBackground(new Color(192, 192, 192));
		panelEditar.setBounds(290, 0, 249, 458);
		frame.getContentPane().add(panelEditar);
		panelEditar.setLayout(null);
		
		textNo = new JTextField();
		textNo.setBounds(10, 87, 135, 33);
		panelEditar.add(textNo);
		textNo.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(10, 180, 135, 33);
		panelEditar.add(textNombre);
		
		textEdad = new JTextField();
		textEdad.setColumns(10);
		textEdad.setBounds(10, 271, 135, 33);
		panelEditar.add(textEdad);
		
		textPosicion = new JTextField();
		textPosicion.setColumns(10);
		textPosicion.setBounds(10, 345, 135, 33);
		panelEditar.add(textPosicion);
		
		JLabel lblNewLabel = new JLabel("No Identidad");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 56, 111, 21);
		panelEditar.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(10, 149, 111, 21);
		panelEditar.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEdad.setBounds(10, 240, 111, 21);
		panelEditar.add(lblEdad);
		
		JLabel lblPosicion = new JLabel("Posicion");
		lblPosicion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPosicion.setBounds(10, 314, 111, 21);
		panelEditar.add(lblPosicion);
		
		JLabel lblNewLabel_1 = new JLabel("Agregar Jugador");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(45, 0, 166, 57);
		panelEditar.add(lblNewLabel_1);
		
		//------------------------------------------- COMPONENTES -----------------------------------------------------------------------
		JButton btnAgregar = new JButton("Agregar Jugador");
		btnAgregar.setForeground(new Color(240, 255, 255));
		btnAgregar.setBackground(new Color(50, 205, 50));
		btnAgregar.setBounds(55, 407, 145, 41);
		panelEditar.add(btnAgregar);
		btnAgregar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	      	agregar(); 

	      	 if (btnAgregar != null) {
		            // Clear text fields
		            textNo.setText("");
		            textNombre.setText("");
		            textEdad.setText("");
		            textPosicion.setText("");


		            JOptionPane.showMessageDialog(null, "Jugador agregado con éxito.");
		        } else {
		            JOptionPane.showMessageDialog(null, "Error al agregar Jugador.");
		        }
		    
	
	    }
				
				
				
			
		});
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(Color.LIGHT_GRAY);
		panel_2_1.setBounds(549, 0, 283, 459);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JButton btnModificar = new JButton("Modificar Jugador\r\n");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Editar();
				
				
			}
		});
		btnModificar.setForeground(new Color(240, 255, 255));
		btnModificar.setBackground(new Color(32, 178, 170));
		btnModificar.setBounds(66, 408, 145, 41);
		panel_2_1.add(btnModificar);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/jugadores-de-futbol.png")));
		lblNewLabel_5.setBounds(29, 72, 228, 293);
		panel_2_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Editar Jugador");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(66, 0, 166, 57);
		panel_2_1.add(lblNewLabel_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(Color.LIGHT_GRAY);
		panel_2_2.setBounds(842, 0, 249, 459);
		frame.getContentPane().add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JButton btnEliminar = new JButton("Eliminar Jugador");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				eliminar();
				

		      	 if (btnEliminar != null) {
			            JOptionPane.showMessageDialog(null, "Jugador Eliminado Exitosamente.");
			        } else {
			            JOptionPane.showMessageDialog(null, "Error al agregar usuario.");
			        }
			    
				
				
			}
		});
		btnEliminar.setForeground(new Color(245, 255, 250));
		btnEliminar.setBackground(new Color(255, 0, 0));
		btnEliminar.setBounds(43, 402, 145, 47);
		panel_2_2.add(btnEliminar);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(10, 66, 239, 291);
		panel_2_2.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(InterfazPrincipal.class.getResource("/GUI/imgGestionJugadores/arbitro (1).png")));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Eliminar Jugador\r\n");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1_1.setBounds(42, 0, 166, 57);
		panel_2_2.add(lblNewLabel_1_1_1);
		
		JButton btnListar = new JButton("Listar Judador\r\n");
		btnListar.setBackground(new Color(0, 0, 255));
		btnListar.setForeground(new Color(240, 255, 255));
		btnListar.setBounds(946, 630, 145, 44);
		frame.getContentPane().add(btnListar);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_1_1.setBackground(Color.ORANGE);
		panel_1_1.setBounds(290, 638, 635, 36);
		frame.getContentPane().add(panel_1_1);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				table.setVisible(true);
			}
		});
		
		
		
		
	}

    private void agregar() {
        tbm.addRow(new Object[] {
            textNo.getText(), textNombre.getText(), textEdad.getText(), textPosicion.getText()
        });
    }
    
    
    
    private void eliminar() {
    	int fila = table.getSelectedRow();
    	tbm.removeRow(fila);
    	
    }
    
    private void Editar() {
    	    int fila = table.getSelectedRow();
    	    tbm.setValueAt(textNo.getText(), fila, 0);
    	    tbm.setValueAt(textNombre.getText(), fila, 1);
    	    tbm.setValueAt(textEdad.getText(), fila, 2);
    	    tbm.setValueAt(textPosicion.getText(), fila, 3);
    	
    }
    private void Mostrar() {
	
	
}
}



