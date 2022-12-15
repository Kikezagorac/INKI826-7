package vezbi.br5b;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<String> mnozhestvo1 = new TreeSet<String> ();
		mnozhestvo1.add("Bitola");
		mnozhestvo1.add("Skopje");
		mnozhestvo1.add("Prilep");

		Set<String> mnozhestvo2 = new TreeSet<String> ();
		mnozhestvo2.add("Ohrid");
		mnozhestvo2.add("Bitola");
		mnozhestvo2.add("Prilep");

		System.out.println("Unijata od dvete mnozhestva e:");
		mnozhestvo1.addAll(mnozhestvo2);
		System.out.println(mnozhestvo1);
	}
}