import java.util.Scanner;

public class Validacion {

	public static void main(String[] args) {
		
	     Scanner entrada = new Scanner(System.in);
	        String password ="karina123";
	        int intentos =3;
	        boolean inten = false;
	        String contrase�a;
	        String repetir = "Introduzca la cotrase�a nuevamente";
	        for (int i=0; i<intentos && !inten;i++) {
	        	System.out.println("introduzca la contrase�a:");
	        	contrase�a = entrada.next();
	        	
			
	        	if (contrase�a.equals(password)) {
	        		System.out.println("Contrase�a corracta!");
	        		inten=true;
	        	}else {
	        		System.out.println("Contrase�a incorrecta!");
	        	}
			}
	        
		
		}
}