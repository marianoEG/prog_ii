public class Ejemplo04 {
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		persona1.nombre = "Juan Pérez López";
		persona1.edad = 34;
		persona1.estatura = 1.70f;
		persona1.sexo = 'M';
		persona1.imprimirDatos();
		
		Empleado empleado1 = new Empleado();
		empleado1.nombre = "Daniel Vázquez Luna";
		empleado1.edad = 40;
		empleado1.estatura = 1.81f;
		empleado1.sexo = 'M';
		empleado1.depto = "Electrónica";
		empleado1.turno = 'V';
		empleado1.sueldo = 8000.0f;
		empleado1.imprimirDatos();
	}
}

class Persona {
	String nombre;
	int edad;
	float estatura;
	char sexo;
	
	void imprimirDatos() {
		System.out.println( "Nombre: " + nombre + "\n" +
							"Edad: " + edad + "\n" +
							"Estatura: " + estatura + "\n" +
							"Sexo: " + sexo
		);
	}
}

class Empleado {
	String nombre;
	int edad;
	float estatura;
	char sexo;
	String depto;
	char turno;
	float sueldo;
	
	void imprimirDatos() {
		System.out.println( "Nombre: " + nombre + "\n" +
							"Edad: " + edad + "\n" +
							"Estatura: " + estatura + "\n" +
							"Sexo: " + sexo + "\n" + 
							"Depto: " + depto  + "\n" + 
							"Turno: " + turno  + "\n" + 
							"Sueldo: $" + sueldo
		);
	}
}