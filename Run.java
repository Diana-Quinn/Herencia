import java.util.ArrayList;
import java.util.Scanner;//import de la clase Scanner desde la libreria java.util.Scanner

public class Run {

	
	public static void main(String[] args) {//metodo main
		
		boolean salir= true;
		@SuppressWarnings("resource")
		Scanner number=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner text = new Scanner(System.in);
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>(); //lista para guardar empleados, debe tener empleados como herencia o que sean propios empleados
		
		
		do {
			//Desea registrar un usuario?
			salir=true;
			
			System.out.println("\nDeses ingresar Empleado(0) o Programador(1)?");
			if(number.nextInt()==1) {
				//Ingresara programador
				Programador progAux = new Programador();
				System.out.println("\nIndique el nombre y apellidos del Programador");
				progAux.setNombre(text.nextLine());
				
				System.out.println("\nIndique la cedula");
				progAux.setCédula(text.nextLine());
				
				do { //validacion de la edad
				System.out.println("\nIndique la edad");
				progAux.setEdad(number.nextInt());
				}while(progAux.getEdad() < 18 || progAux.getEdad() > 45);
				      //fin validacion
				
				System.out.println("\nIndique el Estado Civil");
				progAux.setEstadoCivil(text.nextLine());
				
				System.out.println("\nIndique el salario");
				progAux.setSalario(number.nextInt());
				
				System.out.println("\nIndique el numero de lineas de codigo por hora");
				progAux.setLineasDeCodigoPorHora(number.nextInt());
				
				System.out.println("\nIndique el lenguaje dominante ");
				progAux.setLenguajeDominante(text.nextLine());
				
				empleados.add(progAux);
				
			} else {
				//ingresa Empleado
				Empleado empAux= new Empleado();
				System.out.println("\nIndique el nombre y apellidos del Empleado");
				empAux.setNombre(text.nextLine());
				
				System.out.println("\nIndique la cedula");
				empAux.setCédula(text.nextLine());
				
				do { //validacion de la edad
				System.out.println("\nIndique la edad");
				empAux.setEdad(number.nextInt());
				}while(empAux.getEdad() < 18 || empAux.getEdad() > 45);
				      //fin validacion
				
				System.out.println("\nIndique el Estado Civil");
				empAux.setEstadoCivil(text.nextLine());
				
				System.out.println("\nIndique el salario");
				empAux.setSalario(number.nextInt());
				
				empleados.add(empAux);
			}
			System.out.println("Desea ingresar otro empleado? (si:1 / no:0)");
			if(number.nextInt()==1) {
				salir=true;
			}else {
				salir=false;
			}
			
		}while(salir);
		
		//ciclo for para imprimir Empleados
		System.out.println("\n\nEMPLEADOS");
		for(int i=0; i<empleados.size(); i++) {
			System.out.println("\nEmpleado:"+i);
			empleados.get(i).imprimir();
			System.out.println("=================");
	}
		
  }
}