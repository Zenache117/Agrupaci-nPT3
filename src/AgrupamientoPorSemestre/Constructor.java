package AgrupamientoPorSemestre;

public class Constructor {

	private String nombre;
	private int semestre;
	private int edad;
	private String matricula;
	private String carrera;
	
	public Constructor() {
		nombre = "";
		semestre = 0;
		edad = 0;
		matricula = "";
		carrera = "";
	}
	
	public Constructor(String nombre, int semestre, int edad, String matricula, String carrera) {
		
		this.nombre = nombre;
		this.semestre = semestre;
		this.edad = edad;
		this.matricula = matricula;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
	
 }
