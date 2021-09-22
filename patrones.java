package patrones;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class patrones {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String num , resp;
		
		menuPatron();
	
	}
	public static void menuPatron() {
		Scanner sc = new Scanner(System.in);
		String resp;
		do {
	    System.out.println("----------------------------------------------");
		System.out.println("Menu Patrones \n");
		System.out.println("1 = Patron 1");
		System.out.println("2 = Patron 2");
		System.out.println("3 = Patron 3");
		System.out.println("4 = Patron 4");
		System.out.println("5 = Salir");
		resp = sc.nextLine();
		switch(resp){
			case "1": patronuno(ingreseNumero(5)); break;
			case "2": patronDos(ingreseNumero(5)); break;
			case "3": patron3(ingreseNumero(6));break;
			case "4": patroncuatro(ingreseNumero(6)); break;
			case "5": System.out.print("Adios"); break;
			default: System.out.println("Ingrese una opción válida"); break;
		}
		
		}while(!resp.equals("5"));
		
	}
	public static int ingreseNumero(int fin){
		Scanner sc = new Scanner(System.in);
		String num = "" ;
		do {
		do {
		    System.out.println("----------------------------------------------");
			System.out.println("Ingrese un número para 'n'");
			num = sc.nextLine();
			}while(!esNumero(num) || num.isEmpty());
		}while(Integer.parseInt(num)>fin);
		return Integer.parseInt(num);
	}
	public static void patroncuatro(int num) {
		String inicio="* ";
		String centro=" *";
		String fin=" *";
			if(num==1){ 
				System.out.println(inicio);
			}else if(num==2) {
				System.out.println(inicio);
				System.out.println(fin);
			}else if(num==3){
				inicio = "**";
				fin = fin+"*";
				System.out.println(inicio);
				System.out.println(centro);
				System.out.println(fin);
				}else{
					inicio ="**";
					fin = "**";
					for(int i=3; i<num ;i++) {
						inicio = inicio+ "*";
						fin = fin+"*";
						centro = centro +"*";
					}
					System.out.println(inicio);
					for(int j=3 ; j<=num;j++) {
						System.out.println(centro);
					}
					System.out.println(fin);
				}
			}
	public static boolean esNumero(String letra) {
		Pattern patronMail = Pattern.compile("^([1-9])*$");
		Matcher matcher = patronMail.matcher(letra);
		return matcher.matches();
	}

public static void patronuno(int num) {
	String inicio="*";
	String centro="* *";
	String fin="***";
		if(num==1){ 
			System.out.println(inicio);
			
		}else if(num==2) {
			inicio = inicio+"*";
			System.out.println(inicio);
			System.out.println(inicio);
			
		}else if(num==3){
			inicio = "***";
			System.out.println(inicio);
			System.out.println(centro);
			System.out.println(fin);
			}else{
				inicio ="***";
				fin = "***";
				centro = "* ";
				for(int i=3; i<num ;i++) {
					inicio = inicio+ "*";
					fin = fin+"*";
					centro = centro +" ";
				
				}
				centro = centro +"*";
				System.out.println(inicio);
				for(int j=3 ; j<=num;j++) {
					System.out.println(centro);
				}
				System.out.println(fin);
			}
		
		}

public static void patronDos(int num) {
	String inicio="*";
	String centro=" *";
	String fin="***";
	String espacio="";
		if(num==1){ 
			System.out.println(inicio);
			
		}else if(num==2) {
			inicio = inicio+"*";
			System.out.println(inicio);
			System.out.println(inicio);
		}else if(num==3){
			inicio = "***";
			System.out.println(inicio);
			System.out.println(centro);
			System.out.println(fin);
			}else{
				inicio ="***";
				fin = "***";
				centro ="*";
				for(int i=3; i<num ;i++) {
					inicio = inicio+ "*";
				 	fin = fin+"*";
				
				}
				System.out.println(inicio);
				for(int j=3 ; j<=num;j++) {
					espacio="";
					for(int i=j ; i<=num;i++) {
						espacio=espacio+" ";
					}
					System.out.println(espacio+centro);
				}
				System.out.println(fin);
			}
}
public static void patron3(int num) {
	switch(num) {
	case 1 :  System.out.println("x");break;
	
	case 2 :  patronCentroPar(num);break;
	
	case 3 : patronex(num);
	         patronCentroImpar(num);
	         patronex(num); break;
	
	case 4 : patronex(num);
	         patronCentroPar(num); 
	         patronex(num);break;
	         
	default:  if((num)%2!=0) {
		    
		patronex(num);
		patronCentroImpar(num);
		patronexRev(num);
	} else {
		patronex(num);
		patronCentroPar(num);
		patronexRev(num);
		
	}
}
}

	public static void patronex(int num) {
		String caract = "x";
		String caract2 = " x";
		
		String padded = String.format("%-"+((num)-1)+"s", caract);
		System.out.print(padded);
		System.out.println("x");
 
 
		if((num)>=5) {
 
			String padde = String.format("%-"+((num)-2)+"s", caract2);
			System.out.print(padde);
			System.out.println("x");
 
 
 
			for(int i=3; i<(num)-((num)/2);i++) {
 
				caract2 = " " + caract2;
				String padd = String.format("%-"+((num)-i)+"s", caract2);
				System.out.print(padd);
				System.out.println("x");
			} 
 
 
			}
		}
		
	public static void patronexRev(int num) {
		 
		String caract ="x";
		String caract2=" x";

		if(num>=5) {
			caract2 = " " + caract2;
			for(int i=(num)-((num)/2);i>3;i--) {


				String padd = String.format("%-"+((num)-i+1)+"s", caract2);
				System.out.print(padd);
				System.out.println("x");
			} 

		}
		caract2=" x";
		String padde = String.format("%-"+((num)-2)+"s", caract2);
		System.out.print(padde);
		System.out.println("x");





			String padded = String.format("%-"+((num)-1)+"s", caract);
			System.out.print(padded);
			System.out.println("x");





}
public static void patronCentroPar(int num) {

	String caract = "xx";

	for (int i=3; i<=(num); i++ ) {
		if(i%2==0) {
			caract = " " + caract;
		}
	}
	System.out.println(caract);
	System.out.println(caract);
}
public static void patronCentroImpar(int num) {
	String caract = "x";

	for(int i=2;i<=(num); i++ ) {
		if(i%2!=0) {
			caract = " " + caract;
		}
	}
	System.out.println(caract);
}

}




