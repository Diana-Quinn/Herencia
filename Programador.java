
public class Programador extends Empleado{
	
	private String lenguajeDominante="";

	

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return super.getEdad();
	}

	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		super.setEdad(edad);
	}

	@Override
	public boolean isEstadoSoltero() {
		// TODO Auto-generated method stub
		return super.isEstadoSoltero();
	}

	@Override
	public void setEstadoSoltero(boolean estadoSoltero) {
		// TODO Auto-generated method stub
		super.setEstadoSoltero(estadoSoltero);
	}

	@Override
	public void asignarCalificacion() {
		// TODO Auto-generated method stub
		super.asignarCalificacion();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+this.getLenguajeDominante();
	}
	

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}

	

	

}
