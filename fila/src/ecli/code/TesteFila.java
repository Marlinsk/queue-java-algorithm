package ecli.code;

import java.util.Random;

public class TesteFila {

	public static void main(String[] args) {

		Fila f = new Fila();
		int max = 10, r, n;
		Random random = new Random();

		try {
			for (int i = 0; i < max; i++) {
				r = Math.abs(random.nextInt() % max);
				f.insert(r, i);
				System.out.println("Entrou na fila: " + r);
			}
			System.out.println("Tamanho da fila:" + f.tamanho());
			for (int i = 0; i < max; i++) {
	            n = (int) f.remove();
	            System.out.println("Saiu da fila: " + n);
	        }
			System.out.println("Tamanho da fila:" + f.tamanho());
            
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
