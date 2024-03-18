package modelo;

public class Curso {
	String nombreCurso;
	long codigo;
	String profesor;
	String horario;

	public Curso() {

	}

	public Curso(String nombreCurso, long codigo, String profesor, String horario) {
		super();
		this.nombreCurso = nombreCurso;
		this.codigo = codigo;
		this.profesor = profesor;
		this.horario = horario;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void agregarTarea() {

	}

	public void actualizarDescripcion() {

	}

	public void actualizarProfesion() {

	}

	@Override
	public String toString() {
		return "Curso [nombreCurso=" + nombreCurso + ", codigo=" + codigo + ", profesor=" + profesor + ", horario="
				+ horario + "]";
	}

}
