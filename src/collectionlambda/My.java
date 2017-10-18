package collectionlambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class My {
	public static void main(String[] args){
		TreeSet<Myclass> a = new TreeSet<>(new Comparator<Myclass>() {

			@Override
			public int compare(Myclass o1, Myclass o2) {
				// TODO Auto-generated method stub
				return o2.key - o1.key;
			}
			
		});
		a.add(new Myclass(8,1));
		a.add(new Myclass(2,6));
		a.add(new Myclass(6,3));
		a.add(new Myclass(9,9));
		a.forEach(f->{
			System.out.println(f.tostring());
		});
	}
}
