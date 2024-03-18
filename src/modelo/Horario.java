package modelo;

public class Horario {

	String listaDeCursos;

	public Horario() {

	}

	public Horario(String listaDeCursos) {
		super();
		this.listaDeCursos = listaDeCursos;
	}

	public String getListaDeCursos() {
		return listaDeCursos;
	}

	public void setListaDeCursos(String listaDeCursos) {
		this.listaDeCursos = listaDeCursos;
	}

	public void agregarCurso() {

	}

	public void eliminarCurso() {

	}

	public void mostrarHorario() {

	}

	@Override
	public String toString() {
		return "Horario [listaDeCursos=" + listaDeCursos + "]";
	}
	
}
