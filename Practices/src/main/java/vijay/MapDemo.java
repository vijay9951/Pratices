package vijay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<Integer, String>();

		m1.put(1, "vijay");
		m1.put(2, "verma");
		m1.put(3, "mango");
		m1.put(4, "apple");
		m1.put(5, "kiwi");

		Scanner s = new Scanner(System.in);
		System.out.println("enter key :  ");

		int map = s.nextInt();

		Set<Integer> s1 = m1.keySet();

		Iterator it = s1.iterator();

		while (it.hasNext()) {
			int temp = (Integer) it.next();
			if (temp <= map) {
				// System.out.println(m1.get(temp));
			} else {
				System.out.println(m1.get(temp));
			}

		}
	}

}
