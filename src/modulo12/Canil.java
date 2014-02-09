package modulo12;

import java.util.ArrayList;
import java.util.List;


public class Canil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List canil = new ArrayList();
		canil.add(new Cachorro("kaka"));
		canil.add(new Gato("Doro"));
		List<Cachorro> canilDog = new ArrayList<Cachorro>();
		canilDog.add(new Cachorro("Pluto"));
		//canilDog.add(new Gato("Cherry"));
	}

}
