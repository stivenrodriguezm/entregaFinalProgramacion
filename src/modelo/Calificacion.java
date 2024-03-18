package modelo;

public class Calificacion {
	double nota;
	double ponderacion;
	
	public Calificacion() {
		
	}
	public Calificacion(double nota, double ponderacion) {
		super();
		this.nota = nota;
		this.ponderacion = ponderacion;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public double getPonderacion() {
		return ponderacion;
	}
	public void setPonderacion(double ponderacion) {
		this.ponderacion = ponderacion;
	}
	@Override
	public String toString() {
		return "Calificacion [nota=" + nota + ", ponderacion=" + ponderacion + "]";
	}
	
	

}
