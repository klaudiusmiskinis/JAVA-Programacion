package Clases;

public class Futbolista extends Comun {

	//ATRIBUTOS
	private int dorsal;
	private String nacionalidad;

	//CONSTRUCTORES
	public Futbolista (int id, String nombre, String apellidos, int edad, int dorsal, String nacionalidad) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.nacionalidad = nacionalidad;
	}

	public Futbolista (int dorsal, String nacionalidad) {
		super();
		this.dorsal = dorsal;
		this.nacionalidad = nacionalidad;
	}

	public Futbolista (int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
	}

	public Futbolista () {
		super();
	}

	//METODOS

	//GETTERs
	public int getDorsal() {
		return this.dorsal;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	//SETTERs
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	//---

	public void jugarPartido() {
		System.out.println(this.getNombre() + "("+ getClass().getName() + ")" + " va a jugar un partido.");
	}

	public void entrenar() {
		System.out.println(this.getNombre() + "("+ getClass().getName() + ")" + " va a entrenar.");
	}

}
