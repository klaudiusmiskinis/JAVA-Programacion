package Clases;

public class Fisio extends Comun {

	//ATRIBUTOS
	private String titulacion;
	public int aniosExperiencia;
	

	//CONSTRUCTORES
	public Fisio(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public Fisio( int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
	}

	public Fisio(int aniosExperiencia, String titulacion) {
		super();
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public Fisio() {
		super();
	}

	//METODOS

	//GETTERs
	public int getAniosExperiencia() {
		return this.aniosExperiencia;
	}
	
	public String getTitulacion() {
		return this.titulacion;
	}

	//SETTERs
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	//---

	public void darMasaje() {
		System.out.println(this.getNombre() + "("+ getClass().getName() + ")" + " da un masaje.");
	}
}
