// import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Cálculo de Área");
		
		double b, h, B, A;
		
		b = (int) 6.0;
		h = 5.0;
		B = 8.0;
		
		A = (b + B) / 2.0 * h;
		
		System.out.println(A);
		
		System.out.println("Digite um nome, um número inteiro, um quebrado e um char");
		
		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);	
		
		double w;
		w = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", w);
		
		char z;
		z = sc.next().charAt(0); //para pegar um numero limitado de caracteres
		System.out.println("Você digitou " + z);
		
		System.out.println("Agora todos de uma vez (sem o char): ");
		String i;
		int j;
		double k;		
		i = sc.next();
		j = sc.nextInt();
		k = sc.nextDouble();
		
		System.out.println("Agora todos de uma vez (sem o char): ");
		
		System.out.println("Os valores digitados foram: ");
		System.out.println(i);
		System.out.println(j);
		System.out.printf("%.2f%n", k);
		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
