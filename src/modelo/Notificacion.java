package modelo;

public class Notificacion {
	String mensaje;
	String fecha;
	String horaEnvio;

	public Notificacion() {

	}

	public Notificacion(String mensaje, String fecha, String horaEnvio) {
		super();
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.horaEnvio = horaEnvio;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraEnvio() {
		return horaEnvio;
	}

	public void setHoraEnvio(String horaEnvio) {
		this.horaEnvio = horaEnvio;
	}

	public void enviarNotificacion() {

	}

	public void mostrarNotificacion() {

	}

	@Override
	public String toString() {
		return "Notificacion [mensaje=" + mensaje + ", fecha=" + fecha + ", horaEnvio=" + horaEnvio + "]";
	}

}
