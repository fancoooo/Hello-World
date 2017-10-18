package gg;

import java.util.Comparator;

public class Pair<T,V> {
	private T key;
	private V value;
	Pair(T t,V v){
		key = t;
		value = v;
	}
	public T getT() {
		return key;
	}
	public V getV() {
		return value;
	}
	@Override
	public String toString() {
		return key + " | " + value;
	}
}
