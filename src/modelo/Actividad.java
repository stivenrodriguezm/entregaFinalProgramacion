package modelo;

public class Actividad {

	String nombreActividad;
	boolean estado;
	String fechaVencimiento;
	String descripcion;
	double calificacion;
	
	public Actividad() {
		
	}
	public Actividad(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion) {
		super();
		this.nombreActividad = nombreActividad;
		this.estado = estado;
		this.fechaVencimiento = fechaVencimiento;
		this.descripcion = descripcion;
		this.calificacion = calificacion;
	}
	public String getNombreActividad() {
		return nombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	public String definirNombre() {
		return "";
	}
	
	public String establecerPrioridad() {
		return "";
	}
	@Override
	public String toString() {
		return "Actividad [nombreActividad=" + nombreActividad + ", estado=" + estado + ", fechaVencimiento="
				+ fechaVencimiento + ", descripcion=" + descripcion + ", calificacion=" + calificacion + "]";
	}
	
	
}
