package Generiske_Klasser.src.setoperationsopgave;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        // TODO
        Set<T> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        return union;
    }

    public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
        // TODO
        Set<T> differens = new HashSet<>();
        differens.addAll(s1);
        differens.removeAll(s2);

		//anden meåde at gøre det på
//		for (T t : s1) {
//			if(!s1.contains(t)){
//				differens.add(t);
//			}
//		}
        return differens;

    }

    public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
        // TODO
        Set<T> intesection = new HashSet<>(s1);
        intesection.retainAll(s2);

        return intesection;

    }

}
