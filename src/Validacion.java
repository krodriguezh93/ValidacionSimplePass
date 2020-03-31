import java.util.Scanner;

public class Validacion {

	public static void main(String[] args) {
		
	     Scanner entrada = new Scanner(System.in);
	        String password ="karina123";
	        int intentos =3;
	        boolean inten = false;
	        String contraseña;
	        String repetir = "Introduzca la cotraseña nuevamente";
	        for (int i=0; i<intentos && !inten;i++) {
	        	System.out.println("introduzca la contraseña:");
	        	contraseña = entrada.next();
	        	
			
	        	if (contraseña.equals(password)) {
	        		System.out.println("Contraseña corracta!");
	        		inten=true;
	        	}else {
	        		System.out.println("Contraseña incorrecta!");
	        	}
			}
	        
		
		}
}