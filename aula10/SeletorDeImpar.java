package aula10;

public class SeletorDeImpar {
	
		public static void main(String[] args) {
			System.out.println("Contador de números ímpares");
			
			for (int i = 1; i <= 50; i += 2) {
				System.out.println("Os números ímpares são: " + i);
			}
			System.out.println("Contador de números pares:");
			for (int i = 2; i <= 50; i += 2) {
				System.out.println("Os números pares são: " + i);
			}
		}
}
