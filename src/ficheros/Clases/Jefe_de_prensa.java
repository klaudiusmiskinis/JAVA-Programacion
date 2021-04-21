package Clases;

public class Jefe_de_prensa extends Comun {
	//ATRIBUTO
	private String empresa;

	//CONSTRUCTORES
	//CONSTRUCTORES
	public Jefe_de_prensa (int id, String nombre, String apellidos, int edad, String empresa) {
		super(id, nombre, apellidos, edad);
		this.empresa = empresa;
	}

	public Jefe_de_prensa (String empresa) {
		super();
		this.empresa = empresa;
	}

	public Jefe_de_prensa (int id, String nombre, String apellidos, int edad) {
		super(id, nombre, apellidos, edad);
	}

	public Jefe_de_prensa () {
		super();
	}


	//METODOS

	//GETTERs
	public String getEmpresa() {
		return this.empresa;
	}

	//SETTERs
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	//---

	public void accion() {
		System.out.println(this.getNombre() + "("+ getClass().getName() + ")" + " realiza una accion.");
	}
}
