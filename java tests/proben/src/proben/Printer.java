package proben;

public class Printer {
	public <E> void printArray(E[] arr) {
		for (E element : arr) {
			System.out.println(element);
		}
	}
}
