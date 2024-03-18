package modelo;

public class Usuario {

	String nombre;
	String correo;
	String contrasena;
	int semestre;
	double notas;

	public Usuario() {

	}

	public Usuario(String nombre, String correo, String contrasena, int semestre, double notas) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.semestre = semestre;
		this.notas = notas;
	}

	public Usuario(String nombre, String correo, String contrasena) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
	}

	public Usuario(String nombre, String correo, String contrasena, int semestre) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.semestre = semestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public void actualizarPerfil(String nombre, String correo, String contrasena) {

	}

	public void iniciarSesion() {

	}

	public void cerrarSesion() {

	}
	
	public void obtenerCursosInscritos() {

	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", contrasena=" + contrasena + ", semestre="
				+ semestre + ", notas=" + notas + "]";
	}
	
	

}
