package vezbi.br2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MetodiZaListaNiza m = new MetodiZaListaNiza();
		List<String> list = new ArrayList<String>();
		list.add("Crna");
		list.add("Bela");
		list.add("Siva");
		m.listToArray(list);

		String [] niza = {"crna","bela","siva"};
		m.arrayToList(niza);
	}
}