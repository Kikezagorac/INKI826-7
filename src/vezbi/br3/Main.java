package vezbi.br3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Vardar Skopje", "Rakomet", 18));
		list.add(new SportskiKlub("Pelister Bitola", "Kosharka", 10));
		list.add(new SportskiKlub("Pobeda Prilep", "Fudbal", 41));

		Collections.sort(list);
		for (SportskiKlub a : list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getBrojClenovi());
			System.out.println();
		}
	}
}