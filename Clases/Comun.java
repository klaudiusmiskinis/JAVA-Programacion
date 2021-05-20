package Clases;

public class Comun {

	//ATRIBUTOS
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;


	//CONSTRUCTORES
	public Comun (int id, String nombre, String apellidos, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	public Comun() {
		super();
	}

	//METODOS

	//GETTERs
	public int getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public int getEdad() {
		return this.edad;
	}

	//SETTERs
	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//---

	public void concentrarse() {
		System.out.println("Todos los miembros del equipo se concentran.");
	}

	public void viajar() {
		System.out.println("Todos los miembros del equipo están viajando.");
	}

}
