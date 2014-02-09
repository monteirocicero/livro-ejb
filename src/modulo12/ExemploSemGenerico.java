package modulo12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploSemGenerico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List l = new ArrayList();
		Integer num1 = new Integer(1);
		Integer num2 = new Integer(2);
		String str = "3";
		Integer num4 = new Integer(4);
		l.add(num1);
		l.add(num2);
		l.add(str);
		l.add(num4);
		Iterator numbers = l.iterator();
		while (numbers.hasNext()) {
			Integer integer = (Integer) numbers.next();
			System.out.println(integer.intValue());
		}

	}

}
