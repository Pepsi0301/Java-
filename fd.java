package my_proj;

import java.util.Scanner;

public class fd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int w = 1;
		int c = 1;
		System.out.print("Введіть довжину першої основи  = ");
		i = sc.nextInt();
		System.out.print("Введіть довжину другої основи = ");
		w = sc.nextInt();
		System.out.print("Введіть довжину висоти між основами = ");
		c = sc.nextInt();
		System.out.println("Площа трапеції = " + (0.5*c)*(i+w));
	}


	}

