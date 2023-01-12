
public class Empleado {//clase padre Empleado
	
	//inicializamos las variables
	private String nombre="";
	private String cédula="";
	private int edad=0;
	private String estadoCivil="";
	private int salario=0;
	
	private String clasificacion="";
	
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCédula() {
		return cédula;
	}
	public void setCédula(String cédula) {
		this.cédula = cédula;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
	    //Mensaje para edades 
		if(this.edad < 18 || this.edad > 45) {
	        System.out.println("La edad debe ser entre 18 y 45 años.");
	       }
		this.edad = edad;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	//metodo asignarClasificacion
	public void asignarClasificación(){  
		if(this.getEdad()<=21) {
			this.clasificacion="Principiante";
		} else if(this.getEdad()<=35 && this.getEdad()>=22) {
			this.clasificacion="Intermedio";
		} else if(this.getEdad()>35) {
			this.clasificacion="Senior";
		}
        System.out.println( "Clasficación por Edad: " + clasificacion );
    }
	
	//metodo para imprimir
	public void imprimir() {
        System.out.println("\nNombre: " + this.getNombre() + 
                "\nCédula: " + this.getCédula() + 
                "\nEdad: " + this.getEdad());
        asignarClasificación();
        System.out.println("Estado Civil: " + this.getEstadoCivil() + 
                "\nSalario: " + this.getSalario());
    }
	


}
