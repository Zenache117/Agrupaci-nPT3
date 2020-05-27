package AgrupamientoPorSemestre;

import javax.swing.JOptionPane;

public class CantidadAlumnado {
	
	public int Alumnos() {
		
		int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Dame la cantidad de alumnos que desea ingresar: "));
		return alumnos;
		
	}

}
