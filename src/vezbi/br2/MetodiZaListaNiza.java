package vezbi.br2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {
	public void listToArray(List<String> lista){
		String [] niza = new String[lista.size()];
		lista.toArray(niza);
		System.out.println("Listata pretvorena vo niza izgleda: ");

		for(String s: niza){
			System.out.println(s);
		}
	}
	public void arrayToList(String [] niza){
		List<String> list = new ArrayList<String>();
		list = Arrays.asList(niza);
		System.out.println("Nizata pretvorena vo lista izgleda: ");

		for(String s : list){
			System.out.println(s);
		}
	}
}