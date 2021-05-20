package Clases;

public class Entrenador extends Comun {

	//ATRIBUTOS
	private String idFederacion;

	//CONSTRUCTORES
	public Entrenador() {
		super();
	}

	public Entrenador(String idFederacion) {
		super();
		this.idFederacion = idFederacion;
	}

	public Entrenador(int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	//METODOS

	//GETTERs
	public String getIdFederacion() {
		return this.idFederacion;
	}

	//SETTERs
	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	//---

	public void dirigirPartido() {
		System.out.println("Los jugadores juegan un partido y " + this.getNombre() + "("+ getClass().getName() + ")" +  " dirige el partido.");
	}

	public void dirigirEntrenamiento() {
		System.out.println(this.getNombre()  + "("+ getClass().getName() + ")" +  " dirige el entreno y los futbolistas entrenan.");
	}

}
