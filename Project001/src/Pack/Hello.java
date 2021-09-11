package Pack;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("»çÄ¢¿¬»ê Å¸ÀÔÀ» ÀÔ·Â ex) µ¡¼À »¬¼À °ö¼À ³ª´°¼À");	
	Scanner scty = new Scanner(System.in);
	System.out.println("¼ýÀÚ µÎ°³ ÀÔ·Â ½Ã »çÄ¢¿¬»ê °á°ú°ª Ãâ·Â");
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	String scty1 = scty.next();
		
	int a = sc.nextInt();
	int b = sc1.nextInt();
	// && : and, || : or
	if (scty1.equals("µ¡¼À") || scty1.equals("+")) {
		System.out.println("a + b = " + (a + b) );
	} else if( scty1.equals ("»¬¼À")){ 
		 System.out.println("a - b = " + (a - b) );
	} else if ( scty1.equals ("°ö¼À")){ 
		 System.out.println("a * b = " + (a * b) );
	} else if ( scty1.equals ("³ª´°¼À")){ 
		 System.out.println("a / b = " + (a / b) );
	} else {
		System.out.println("»çÄ¢¿¬»êÁß¿¡¼­ ÀÔ·ÂÇÏ¼¼¿ä");
	}
		

	
	
	sc.close();

		
	}
	
	
	
}
