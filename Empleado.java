
public class Empleado {
	
	public String nombre = "";
	private int edad = 0;
	private boolean estadoSoltero = false;
	private String calificacion="";
	
	public String getNombre() { //para obtener nombre del empleado
		return nombre;
	}
	public void setNombre(String nombre) { //para setear o establecer nombre del empleado
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean isEstadoSoltero() {
		return estadoSoltero;
	}
	
	public void setEstadoSoltero(boolean estadoSoltero) {
		this.estadoSoltero = estadoSoltero;
	}
	
	public void asignarCalificacion() {
		if(this.getEdad()<=21) {
			this.calificacion="Principiante";
		} else if(this.getEdad()<=35 && this.getEdad()>=22) {
			this.calificacion="Intermedio";
		} else if(this.getEdad()>35) {
			this.calificacion="Senior";
		}
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", estadoSoltero=" + estadoSoltero + ", calificacion="
				+ calificacion + "]";
	}
	
	
	

}
