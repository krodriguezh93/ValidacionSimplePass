import java.util.Scanner;

public class Validacion {

	public static void main(String[] args) {
		
	     Scanner entrada = new Scanner(System.in);
	        String password ="karina123";
	        int intentos =3;
	        boolean inten = false;
	        String contraseņa;
	        String repetir = "Introduzca la cotraseņa nuevamente";
	        for (int i=0; i<intentos && !inten;i++) {
	        	System.out.println("introduzca la contraseņa:");
	        	contraseņa = entrada.next();
	        	
			
	        	if (contraseņa.equals(password)) {
	        		System.out.println("Contraseņa corracta!");
	        		inten=true;
	        	}else {
	        		System.out.println("Contraseņa incorrecta!");
	        	}
			}
	        
		
		}
}