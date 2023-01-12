
public class Programador extends Empleado {//clase hija Programador que hereda de Empleado
	
	//atributos del programador
	private int lineasDeCodigoPorHora = 0;
	private String lenguajeDominante="";
	
	//getters y setters de los atributos del programador
	public int getLineasDeCodigoPorHora() {
		return lineasDeCodigoPorHora;
	}
	public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
	}
	public String getLenguajeDominante() {
		return lenguajeDominante;
	}
	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	//override de los metodos de la clase Empleado o padre
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
	public String getCédula() {
		// TODO Auto-generated method stub
		return super.getCédula();
	}
	@Override
	public void setCédula(String cédula) {
		// TODO Auto-generated method stub
		super.setCédula(cédula);
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
	public String getEstadoCivil() {
		// TODO Auto-generated method stub
		return super.getEstadoCivil();
	}
	@Override
	public void setEstadoCivil(String estadoCivil) {
		// TODO Auto-generated method stub
		super.setEstadoCivil(estadoCivil);
	}
	@Override
	public int getSalario() {
		// TODO Auto-generated method stub
		return super.getSalario();
	}
	@Override
	public void setSalario(int salario) {
		// TODO Auto-generated method stub
		super.setSalario(salario);
	}

	
	@Override
	public void asignarClasificación() {
		// TODO Auto-generated method stub
		super.asignarClasificación();
	}
	

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println( "lineas de codigo por hora: " + this.lineasDeCodigoPorHora+ "\nlenguaje dominante: " + this.lenguajeDominante);
	}

	
	
	
	
	
	
	
	
	
	



}
