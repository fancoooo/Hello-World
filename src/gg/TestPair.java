package gg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collectionlambda.Colletion1;

public class TestPair {
	public static void main(String[] args) {
		List<Pair<String,Integer>> a = new ArrayList<Pair<String,Integer>>();
		a.add(new Pair("anh",52));
		a.add(new Pair("em",5));
		a.add(new Pair("nha",31));
		Collections.sort(a, (o1, o2) -> {
			return o2.getV() - o1.getV();
		}
		);
		a.forEach(f ->{
			System.out.println(f.toString());;
		});
	}
}
