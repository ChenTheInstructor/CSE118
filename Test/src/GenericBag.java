import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class GenericBag<E /*extends Comparable<E>*/> {
	private E[] arr;
	private int nElems;

	public GenericBag(Class clazz, int maxSize) {
		arr = (E[]) (Array.newInstance(clazz, maxSize));
		nElems = 0;
	}

	public E[] remove(Class clazz, Predicate<E> predicate) {
		E[] matchArr = (E[]) (Array.newInstance(clazz, nElems));
		int matchCount = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];
//				for (int j = i; j < nElems - 1; j++) {
//					arr[j] = arr[j + 1];
//				}
//				i--;
				arr[i] = arr[nElems-1];
				nElems--;
			}
		}
		return Arrays.copyOf(matchArr, matchCount);
	}

	
//	public E[] remove(Class clazz, Predicate<E> predicate) {
//		E[] matchArr = (E[]) (Array.newInstance(clazz, nElems));
//		int matchCount = 0;
//		for (int i = 0; i < nElems; i++) {
//			if (predicate.test(arr[i])) {
//				matchArr[matchCount++] = arr[i];
//				for (int j = i; j < nElems - 1; j++) {
//					arr[j] = arr[j + 1];
//				}
//				i--;
//				nElems--;
//			}
//		}
//		return Arrays.copyOf(matchArr, matchCount);
//	}

	public E[] search(Class clazz, Predicate<E> predicate) {
		E[] matchArr = (E[]) (Array.newInstance(clazz, nElems));
		int matchCount = 0;
		for (int i = 0; i < nElems; i++) {
			if (predicate.test(arr[i])) {
				matchArr[matchCount++] = arr[i];
			}
		}
		return Arrays.copyOf(matchArr, matchCount);
	}

	public void add(E value) {
		arr[nElems++] = value;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
}
