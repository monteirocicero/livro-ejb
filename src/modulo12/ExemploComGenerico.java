package modulo12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploComGenerico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		Integer num1 = new Integer(1);
		Integer num2 = new Integer(2);
		String str = "3";
		Integer num4 = new Integer(4);
		l.add(num1);
		l.add(num2);
		//l.add(str);
		l.add(num4);
		Iterator<Integer> numbers = l.iterator();
		while (numbers.hasNext()) {
			Integer integer = numbers.next();
			System.out.println(integer.intValue());
		}
	}

}
