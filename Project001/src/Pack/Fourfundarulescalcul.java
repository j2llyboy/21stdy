package Pack;

import java.util.Scanner;

public class Fourfundarulescalcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.out.println("1. ��Ģ���� Ÿ���� �Է��ϼ���");
	System.out.println("ex) ����(+) ����(-) ����(*) ������(/)");
	Scanner scty = new Scanner(System.in);
	System.out.println("2. ���� �ΰ��� �Է� �� ��Ģ���� ������� ����մϴ�.");
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	
	String scty1 = scty.next();
		
	int a = sc.nextInt();
	int b = sc1.nextInt();
	// && : and, || : or
	if (scty1.equals("����") || scty1.equals("+")) {
		System.out.println("a + b = " + (a + b) );
	} else if( scty1.equals ("����") || scty1.equals("-")){ 
		 System.out.println("a - b = " + (a - b) );
	} else if ( scty1.equals ("����") || scty1.equals("*")){ 
		 System.out.println("a * b = " + (a * b) );
	} else if ( scty1.equals ("������") || scty1.equals("/")){ 
		 System.out.println("a / b = " + (a / b) );
	} else {
		System.out.println("��Ģ�����߿��� �Է��ϼ���");
	}
		

	
	
	sc.close();

		
	}
	
	
	
}
