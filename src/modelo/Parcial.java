package modelo;

import java.util.ArrayList;

public class Parcial extends Actividad {
	
	ArrayList<String> temas;
	
	public Parcial() {
		
	}

	public Parcial(ArrayList<String> temas) {
		super();
		this.temas = temas;
	}

	public Parcial(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion) {
		super(nombreActividad, estado, fechaVencimiento, descripcion, calificacion);
		// TODO Auto-generated constructor stub
	}
	
	public Parcial(String nombreActividad, boolean estado, String fechaVencimiento, String descripcion,
			double calificacion, ArrayList<String> temas) {
		super(nombreActividad, estado, fechaVencimiento, descripcion, calificacion);
		this.temas = temas;
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> getTemas() {
		return temas;
	}

	public void setTemas(ArrayList<String> temas) {
		this.temas = temas;
	}
	
	public void definirDuracion() {
		
	}
	public void definirTemas() {
		
	}

	@Override
	public String toString() {
		return "Parcial [temas=" + temas + "]";
	}
	
	
}
