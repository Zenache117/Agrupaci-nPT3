package AgrupamientoPorSemestre;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Choice;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.io.*;

public class Interfaz {

	private JFrame frmAgrupamientoDeAlumnado;
	private JTextField txtNombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtMatricula;
	private JTextField txtCarrera;
	private int contador1=0,contador2=0,contador3=0,contador4=0,contador5=0,contador6=0,contador7=0,contador8=0,contador9=0,contador10=0;
	private int sumaAlumnos=0;

	public static void interfaz(int CantidadAlumnosTotales) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz(CantidadAlumnosTotales);
					window.frmAgrupamientoDeAlumnado.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Interfaz(int CantidadAlumnosTotales) {
		initialize(CantidadAlumnosTotales);
	}

	private void initialize(int CantidadAlumnosTotales) {
		frmAgrupamientoDeAlumnado = new JFrame();
		frmAgrupamientoDeAlumnado.setTitle("Agrupamiento de Alumnado");
		frmAgrupamientoDeAlumnado.setBounds(100, 100, 483, 652);
		frmAgrupamientoDeAlumnado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAgrupamientoDeAlumnado.getContentPane().setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNombre.setBounds(39, 113, 90, 34);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblNombre);

		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSemestre.setBounds(39, 195, 118, 40);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblSemestre);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEdad.setBounds(39, 286, 102, 49);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblEdad);

		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMatricula.setBounds(39, 376, 108, 49);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblMatricula);

		JLabel lblCarrera = new JLabel("Carrera");
		lblCarrera.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarrera.setBounds(39, 477, 90, 40);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblCarrera);

		JLabel lblRellenaLosCampos = new JLabel("Rellena los campos de informaci\u00F3n de cada alumno");
		lblRellenaLosCampos.setFont(new Font("Tahoma", Font.ITALIC, 19));
		lblRellenaLosCampos.setBounds(10, 11, 447, 65);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblRellenaLosCampos);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBounds(135, 113, 322, 34);
		frmAgrupamientoDeAlumnado.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		JRadioButton radioButton = new JRadioButton("1");
		buttonGroup.add(radioButton);
		radioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton.setBounds(39, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton);
		radioButton.setText("1");


		JRadioButton radioButton_1 = new JRadioButton("2");
		buttonGroup.add(radioButton_1);
		radioButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_1.setBounds(78, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_1);
		radioButton_1.setText("2");

		JRadioButton radioButton_2 = new JRadioButton("3");
		buttonGroup.add(radioButton_2);
		radioButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_2.setBounds(117, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_2);
		radioButton_2.setText("3");

		JRadioButton radioButton_3 = new JRadioButton("4");
		buttonGroup.add(radioButton_3);
		radioButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_3.setBounds(156, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_3);
		radioButton_3.setText("4");

		JRadioButton radioButton_4 = new JRadioButton("5");
		buttonGroup.add(radioButton_4);
		radioButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_4.setBounds(195, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_4);
		radioButton_4.setText("5");

		JRadioButton radioButton_5 = new JRadioButton("6");
		buttonGroup.add(radioButton_5);
		radioButton_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_5.setBounds(234, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_5);
		radioButton_5.setText("6");

		JRadioButton radioButton_6 = new JRadioButton("7");
		buttonGroup.add(radioButton_6);
		radioButton_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_6.setBounds(273, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_6);
		radioButton_6.setText("7");

		JRadioButton radioButton_7 = new JRadioButton("8");
		buttonGroup.add(radioButton_7);
		radioButton_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_7.setBounds(312, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_7);
		radioButton_7.setText("8");

		JRadioButton radioButton_8 = new JRadioButton("9");
		buttonGroup.add(radioButton_8);
		radioButton_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_8.setBounds(346, 242, 37, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_8);
		radioButton_8.setText("9");

		JRadioButton radioButton_9 = new JRadioButton("10");
		buttonGroup.add(radioButton_9);
		radioButton_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		radioButton_9.setBounds(385, 242, 46, 37);
		frmAgrupamientoDeAlumnado.getContentPane().add(radioButton_9);
		radioButton_9.setText("10");

		Choice choice = new Choice();
		choice.setBounds(147, 303, 142, 20);
		frmAgrupamientoDeAlumnado.getContentPane().add(choice);
		choice.addItem("Entre 15 y 20");
		choice.addItem("Entre 21 y 25");
		choice.addItem("Mas de 25");

		JLabel lblNombreError = new JLabel("");
		lblNombreError.setForeground(Color.RED);
		lblNombreError.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNombreError.setBounds(135, 158, 322, 34);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblNombreError);

		JLabel lblSemestreError = new JLabel("");
		lblSemestreError.setForeground(Color.RED);
		lblSemestreError.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblSemestreError.setBounds(39, 174, 402, 32);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblSemestreError);

		JLabel lblMatriculaError = new JLabel("");
		lblMatriculaError.setForeground(Color.RED);
		lblMatriculaError.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblMatriculaError.setBounds(39, 427, 418, 39);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblMatriculaError);

		JLabel lblCarreraError = new JLabel("");
		lblCarreraError.setForeground(Color.RED);
		lblCarreraError.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblCarreraError.setBounds(117, 510, 340, 34);
		frmAgrupamientoDeAlumnado.getContentPane().add(lblCarreraError);

		txtMatricula = new JTextField();
		txtMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMatricula.setBounds(157, 385, 300, 38);
		frmAgrupamientoDeAlumnado.getContentPane().add(txtMatricula);
		txtMatricula.setColumns(10);

		txtCarrera = new JTextField();
		txtCarrera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCarrera.setBounds(139, 477, 93, 34);
		frmAgrupamientoDeAlumnado.getContentPane().add(txtCarrera);
		txtCarrera.setColumns(10);

		JButton btnAgregarAlumno = new JButton("Agregar Alumno");
		btnAgregarAlumno.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAgregarAlumno.setBounds(117, 538, 235, 49);
		frmAgrupamientoDeAlumnado.getContentPane().add(btnAgregarAlumno);

		btnAgregarAlumno.addActionListener(new ActionListener() {
			public int validarSemestre() {
				int ValorSemestre=0;
				if(radioButton.isSelected()) {
					ValorSemestre = 1;
				}
				else if(radioButton_1.isSelected()) {
					ValorSemestre = 2;
				}
				else if(radioButton_2.isSelected()) {
					ValorSemestre = 3;
				}
				else if(radioButton_3.isSelected()) {
					ValorSemestre = 4;
				}
				else if(radioButton_4.isSelected()) {
					ValorSemestre = 5;
				}
				else if(radioButton_5.isSelected()) {
					ValorSemestre = 6;
				}
				else if(radioButton_6.isSelected()) {
					ValorSemestre = 7;
				}
				else if(radioButton_7.isSelected()) {
					ValorSemestre = 8;
				}
				else if(radioButton_8.isSelected()) {
					ValorSemestre = 9;
				}
				else if(radioButton_9.isSelected()) {
					ValorSemestre = 10;
				}
				else {
					lblSemestreError.setText("Tienes que elegir el semestre cursado");
				}
				return ValorSemestre;
			}
			public int validarEdad() {
				String Edad = choice.getSelectedItem();
				int edad = 1;
				if(Edad == "Entre 15 y 20") {
					edad=1;
				}
				else if(Edad == "Entre 21 y 25") {
					edad=2;
				}
				else if(Edad == "Mas de 25") {
					edad=3;
				}
				return edad;
			}
			public int validarNombre() {//Validamos que el nombre no contenga numeros o caracternes no alfabeticos
				int valido=0;
				int LetrasValidas=0;
				String nombre = txtNombre.getText();

				if(nombre.length()>=3) {
					for(int i=0; i< nombre.length();) {

						if(nombre.charAt(i)>=65 && nombre.charAt(i)<=90 || nombre.charAt(i)>=97 && nombre.charAt(i)<=122 || nombre.charAt(i)==32) {
							LetrasValidas++;
							i++;
						}
						else {
							lblNombreError.setText("El nombre contiene caracteres invalidos, inserte solo letras");
							i++;
						}
					}
				}
				else {
					lblNombreError.setText("Inserte almenos un nombre completo");
				}
				if(LetrasValidas == nombre.length()) {
					valido=1;
				}
				return valido;
			}

			public int validarMatricula() {
				int valido_1=0;
				int LetrasValidas_1=0;
				String matricula = txtMatricula.getText();
				if(matricula.length()>=7 && matricula.length()<=9) {
					for(int i=0; i< matricula.length();) {
						if(matricula.charAt(i)>=48 && matricula.charAt(i)<=57) {
							LetrasValidas_1++;
							i++;
						}
						else {
							lblMatriculaError.setText("La matricula contiene caracteres invalidos, inserte solo numeros");
							i++;
						}
					}

				}else if(matricula.length()<7 || matricula.length()>9){
					lblMatriculaError.setText("La matricula no puede ser menor de 7 digitos ni mayor a 9");

				}
				if(LetrasValidas_1 ==  matricula.length()) {
					valido_1=1;
				}
				return valido_1;
			}
			public int validarCarrera() {
				int valido_2=0;
				int LetrasValidas_2=0;
				String carrera = txtCarrera.getText();

				if(carrera.length()==3) {
					for(int i=0; i< carrera.length();) {

						if(carrera.charAt(i)>=65 && carrera.charAt(i)<=90) {
							LetrasValidas_2++;
							i++;
						}
						else {
							lblCarreraError.setText("El carrera contiene caracteres invalidos, inserte solo letras mayusculas");
							i++;
						}
					}
				}
				else {
					lblCarreraError.setText("Inserte las tres iniciales en mayusculas de la carrera");
				}
				if(LetrasValidas_2 == carrera.length()) {
					valido_2=1;
				}
				return valido_2;

			}

			Constructor Alumnos1[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos2[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos3[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos4[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos5[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos6[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos7[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos8[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos9[] = new Constructor[CantidadAlumnosTotales];
			Constructor Alumnos10[] = new Constructor[CantidadAlumnosTotales];




			public void actionPerformed(ActionEvent e) {

				int ValorSemestre = validarSemestre();
				int edad = validarEdad();
				int validonom = validarNombre();
				int validomat = validarMatricula();
				int validocarr = validarCarrera();

				if(validonom == 1 && validomat==1 && validocarr==1 && ValorSemestre!=0) {

					lblNombreError.setText("");
					lblMatriculaError.setText("");
					lblCarreraError.setText("");
					lblSemestreError.setText("");	

					try {
						File archivo = new File ("Agrupamiento_De_Alumnos.txt");
						FileWriter w = new FileWriter(archivo);
						BufferedWriter bw = new BufferedWriter(w);
						PrintWriter wr = new PrintWriter(bw);


						switch(ValorSemestre) {
						case 1:
							Alumnos1[contador1]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador1++;
							break;
						case 2:
							Alumnos2[contador2]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador2++;
							break;
						case 3:
							Alumnos3[contador3]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador3++;
							break;
						case 4:
							Alumnos4[contador4]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador4++;
							break;
						case 5:
							Alumnos5[contador5]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador5++;
							break;
						case 6:
							Alumnos6[contador6]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador6++;
							break;
						case 7:
							Alumnos7[contador7]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador7++;
							break;
						case 8:
							Alumnos8[contador8]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador8++;break;
						case 9:
							Alumnos9[contador9]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador9++;
							break;
						case 10:
							Alumnos10[contador10]= new Constructor(txtNombre.getText(),ValorSemestre,edad,txtMatricula.getText(),txtCarrera.getText());
							contador10++;
							break;
						}

						sumaAlumnos++;

						txtNombre.setText("");
						txtMatricula.setText("");
						txtCarrera.setText("");
						if(sumaAlumnos==CantidadAlumnosTotales) {


							String Edad ="";
							
							if(contador1>0) {
								wr.write("----------------------------------------Alumnos de primer semestre--------------------------\n");
							}
							for(int i=0; i<contador1; i++) {
								
								switch(Alumnos1[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos1[i].getNombre() + " Semestre: " +  Alumnos1[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos1[i].getMatricula() + " Carrera: " + Alumnos1[i].getCarrera()+"\n");

							}
							if(contador2>0) {
								wr.append("----------------------------------------Alumnos de segundo semestre--------------------------\n");
							}
							for(int i=0; i<contador2; i++) {
								switch(Alumnos2[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos2[i].getNombre() + " Semestre: " +  Alumnos2[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos2[i].getMatricula() + " Carrera: " + Alumnos2[i].getCarrera()+"\n");

							}
							if(contador3>0) {
								wr.append("----------------------------------------Alumnos de tercer semestre--------------------------\n");
							}
							for(int i=0; i<contador3; i++) {
								switch(Alumnos3[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos3[i].getNombre() + " Semestre: " +  Alumnos3[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos3[i].getMatricula() + " Carrera: " + Alumnos3[i].getCarrera()+"\n");

							}
							if(contador4>0) {
								wr.append("----------------------------------------Alumnos de cuarto semestre--------------------------\n");
							}
							for(int i=0; i<contador4; i++) {
								switch(Alumnos4[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos4[i].getNombre() + " Semestre: " +  Alumnos4[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos4[i].getMatricula() + " Carrera: " + Alumnos4[i].getCarrera()+"\n");

							}
							if(contador5>0) {
								wr.append("----------------------------------------Alumnos de quinto semestre--------------------------\n");
							}
							for(int i=0; i<contador5; i++) {
								switch(Alumnos5[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos5[i].getNombre() + " Semestre: " +  Alumnos5[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos5[i].getMatricula() + " Carrera: " + Alumnos5[i].getCarrera()+"\n");

							}
							if(contador6>0) {
								wr.append("----------------------------------------Alumnos de sexto semestre--------------------------\n");
							}
							for(int i=0; i<contador6; i++) {
								switch(Alumnos6[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos6[i].getNombre() + " Semestre: " +  Alumnos6[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos6[i].getMatricula() + " Carrera: " + Alumnos6[i].getCarrera()+"\n");

							}
							if(contador7>0) {
								wr.append("----------------------------------------Alumnos de septimo semestre--------------------------\n");
							}
							for(int i=0; i<contador7; i++) {
								switch(Alumnos7[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos7[i].getNombre() + " Semestre: " +  Alumnos7[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos7[i].getMatricula() + " Carrera: " + Alumnos7[i].getCarrera()+"\n");

							}
							if(contador8>0) {
								
								wr.append("----------------------------------------Alumnos de octavo semestre--------------------------\n");
							}
							for(int i=0; i<contador8; i++) {
								switch(Alumnos8[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos8[i].getNombre() + " Semestre: " +  Alumnos8[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos8[i].getMatricula() + " Carrera: " + Alumnos8[i].getCarrera()+"\n");

							}
							if(contador9>0) {
								wr.append("----------------------------------------Alumnos de noveno semestre--------------------------\n");
							}
							for(int i=0; i<contador9; i++) {
								switch(Alumnos9[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos9[i].getNombre() + " Semestre: " +  Alumnos9[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos9[i].getMatricula() + " Carrera: " + Alumnos9[i].getCarrera()+"\n");

							}
							if(contador10>0) {
								wr.append("----------------------------------------Alumnos de decimo semestre--------------------------\n");
							}
							for(int i=0; i<contador10; i++) {
								switch(Alumnos10[i].getEdad()) {
								case 1:
									Edad= "Entre 15 y 20";
									break;
								case 2:
									Edad= "Entre 21 y 25";
									break;
								case 3:
									Edad= "Mas de 25";
									break;
								}

								wr.append("Nombre: " + Alumnos10[i].getNombre() + " Semestre: " + Alumnos10[i].getSemestre() + " Edad: " + Edad + " Matricula: " + Alumnos10[i].getMatricula() + " Carrera: " + Alumnos10[i].getCarrera()+"\n");

							}

							wr.close();
							bw.close();
							btnAgregarAlumno.setEnabled(false);
							JOptionPane.showMessageDialog(null, "Ya has agregado todos los alumnos, puedes cerrar las ventanas");

						}




					}catch (Exception e1) {
						JOptionPane.showMessageDialog(null,"Ha sucedido un error al crear el archivo; " + e1);
					}



				}
				else {
					JOptionPane.showMessageDialog(null,"Uno de los datos registrados es incorrecto o no ha sido llenado");
				}
				
			}
			
		});

	}
}
