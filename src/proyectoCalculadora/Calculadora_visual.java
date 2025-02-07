package proyectoCalculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class Calculadora_visual extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoTexto;
	
	String cadena1 = "", cadena2 = "", operacion="";
	int turno = 1;
	double resultado = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_visual frame = new Calculadora_visual();
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
	public Calculadora_visual() {
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora_visual.class.getResource("/img/calculadora.png")));
		setTitle("Mi Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 328, 477);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 316, 438);
		getContentPane().setLayout(null); // Para poder redimensionar los objetos dentro del panel
		contentPane.add(panel);
		
		//btnCero
		JButton btnCero = new JButton("0");
		btnCero.setBackground(Color.LIGHT_GRAY);
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "0";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "0";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		//btnPunto
		JButton btnPunto = new JButton(".");
		btnPunto.setBackground(Color.LIGHT_GRAY);
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += ".";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += ".";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		//btnEnter
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setForeground(Color.BLACK);
		btnEnter.setBackground(Color.GREEN);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cad1 = 0, cad2 = 0, resul = 0;
				cad1 = Double.parseDouble(cadena1);
				cad2 = Double.parseDouble(cadena2);
				
				switch(operacion) {
				case "+":
					resul = cad1+cad2;
					break;
				case "-":
					resul = cad1-cad2;
					break;
				case "*":
					resul = cad1*cad2;
					break;
				case "/":
					resul = cad1/cad2;
					break;
				}
				
				CampoTexto.setText(String.valueOf(resul));
				cadena1 = String.valueOf(resul); cadena2 = ""; operacion="";
				turno = 1;
				resultado = 0;
			}
		});
		
		//btnUno
		JButton btnUno = new JButton("1");
		btnUno.setBackground(Color.LIGHT_GRAY);
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "1";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "1";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		//btnDos
		JButton btnDos = new JButton("2");
		btnDos.setBackground(Color.LIGHT_GRAY);
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "2";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "2";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnTres = new JButton("3");
		btnTres.setBackground(Color.LIGHT_GRAY);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "3";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "3";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnCuatro = new JButton("4");
		btnCuatro.setBackground(Color.LIGHT_GRAY);
		btnCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "4";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "4";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnCinco = new JButton("5");
		btnCinco.setBackground(Color.LIGHT_GRAY);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "5";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "5";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnSeis = new JButton("6");
		btnSeis.setBackground(Color.LIGHT_GRAY);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "6";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "6";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnSiete = new JButton("7");
		btnSiete.setBackground(Color.LIGHT_GRAY);
		btnSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(turno == 1) {
				cadena1 += "7";
				CampoTexto.setText(cadena1);
			} else {
				cadena2 += "7";
				CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
			}
			}
		});
		
		JButton btnOcho = new JButton("8");
		btnOcho.setBackground(Color.LIGHT_GRAY);
		btnOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "8";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "8";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnNueve = new JButton("9");
		btnNueve.setBackground(Color.LIGHT_GRAY);
		btnNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(turno == 1) {
					cadena1 += "9";
					CampoTexto.setText(cadena1);
				} else {
					cadena2 += "9";
					CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
				}
			}
		});
		
		JButton btnMas = new JButton("+");
		btnMas.setForeground(Color.WHITE);
		btnMas.setBackground(Color.GRAY);
		btnMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turno = 2;
				operacion = "+";
				CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
			}
		});
		
		JButton btnMenos = new JButton("-");
		btnMenos.setBackground(Color.GRAY);
		btnMenos.setForeground(Color.WHITE);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turno = 2;
				operacion = "-";
				CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
			}
		});
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setForeground(Color.WHITE);
		btnMultiplicar.setBackground(Color.GRAY);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turno = 2;
				operacion = "*";
				CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
			}
		});
		
		JButton btnDividir = new JButton("/");
		btnDividir.setForeground(Color.WHITE);
		btnDividir.setBackground(Color.GRAY);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				turno = 2;
				operacion = "/";
				CampoTexto.setText(cadena1 + " " + operacion + " " + cadena2);
			}
		});
		
		CampoTexto = new JTextField();
		CampoTexto.setForeground(Color.WHITE);
		CampoTexto.setBackground(Color.DARK_GRAY);
		CampoTexto.setFont(new Font("DejaVu Sans", Font.BOLD, 12));
		CampoTexto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoTexto.setHorizontalAlignment(SwingConstants.RIGHT);
		CampoTexto.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setForeground(Color.WHITE);
		btnClear.setBackground(Color.RED);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CampoTexto.setText("");
				cadena1 = ""; cadena2 = ""; operacion="";
				turno = 1;
				resultado = 0;
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(btnUno, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnDos, 0, 0, Short.MAX_VALUE))
										.addComponent(btnCero, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(btnTres, 0, 0, Short.MAX_VALUE)
										.addComponent(btnPunto, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
									.addGap(12)
									.addComponent(btnEnter))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(btnCuatro, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnCinco, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnSeis, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(btnSiete, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnOcho, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnNueve, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
									.addComponent(btnMas, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(btnDividir, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnMultiplicar, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(btnMenos, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(CampoTexto, GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
							.addGap(10))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(121)
					.addComponent(btnClear)
					.addContainerGap(130, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(CampoTexto, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDividir, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnMultiplicar, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
						.addComponent(btnMenos, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnSiete, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnOcho, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNueve, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCuatro, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCinco, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSeis, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)))
						.addComponent(btnMas, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEnter, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnTres, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(btnDos, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
								.addComponent(btnUno, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCero, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
								.addComponent(btnPunto, GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
	}
}
