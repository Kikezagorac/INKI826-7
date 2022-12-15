package vezbi.br1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
			list.add("Brufen");
			list.add("Metafen");
			list.add("Andol");
			list.add("Paracetamol");
						
			if(list.get(list.size() - 1).equals("Paracetamol")){
				System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura!");
			}
			else
				System.out.println("Namenata na lekot ne e poznata!");
	}
}
