package modelo;

public class Tarea extends Actividad {

	int agrupacion;

	public Tarea() {

	}

	public Tarea(int agrupacion) {
		super();
		this.agrupacion = agrupacion;
	}

	public Tarea(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion) {
		super(nombreActividad, estado, fechaVencimiento, descripcion, calificacion);
	}
	
	public Tarea(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion, int agrupacion) {
		super(nombreActividad, estado, fechaVencimiento, descripcion, calificacion);
		this.agrupacion = agrupacion;
	}


	public int getAgrupacion() {
		return agrupacion;
	}

	public void setAgrupacion(int agrupacion) {
		this.agrupacion = agrupacion;
	}

	public void asignarDescripcion() {

	}

	public String obtenerPrioridad() {
		return "";
	}

	@Override
	public String toString() {
		return "Tarea [agrupacion=" + agrupacion + "]";
	}

}
