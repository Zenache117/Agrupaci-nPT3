package AgrupamientoPorSemestre;

public class Principal {
	
	public static void main (String[] args) {
		
		CantidadAlumnado CantAlumn = new CantidadAlumnado();//objeto de la clase "Cantidad alumnado" con el cual se obtiene el limite de datos que se piensan ingresar
		int CantidadAlumnos = CantAlumn.Alumnos(); // CantidadAlumnos se vuelve la variable con la cual se opera
		Interfaz inter = new Interfaz(CantidadAlumnos);//objeto de la clase interfaz para llamar el lugar donde pediremos los datos
		inter.interfaz(CantidadAlumnos);
		
	}

}
