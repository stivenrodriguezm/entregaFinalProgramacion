package modelo;

public class Quiz extends Actividad {
	String tema;
	public Quiz() {
		
	}
	
	public Quiz(String tema) {
		super();
		this.tema = tema;
	}

	public Quiz(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion) {
		super(nombreActividad, estado, fechaVencimiento, descripcion, calificacion);
	}
	
	public Quiz(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion, String tema) {
		super(nombreActividad, estado, fechaVencimiento, descripcion, calificacion);
		this.tema = tema;
	}

	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public void definirTipo() {
		
	}
	public void definirPreguntas() {
		
	}

	@Override
	public String toString() {
		return "Quiz [tema=" + tema + "]";
	}
	
	
}
