
public class Main {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();

		list1.add(3); // put a 3 in the list
		list1.add(5); // put a 5 in the list
		list1.add(-10); // put a -10 in the list

		System.out.println(list1); // [3, 5, -10]

		/* 1. Test set and get methods */
		// list1.set(2, 100); //set index 2 to 100 -> [3, 5, 100]
		// list1.set(0, 1); //set index 0 to 1 -> [1, 5, 100]
		// System.out.println("After setting: " + list1);

		// System.out.println("Element at index 0: " + list1.get(0)); // prints 1
		// System.out.println("Element at index 1: " + list1.get(1)); // prints 5
		// System.out.println("Element at index 2: " + list1.get(2)); // prints 100

		/* 2. Test add at an index (overload existing add) */
		// list1.add(0, 7); //add 7 at the front of the list ->[7, 1, 5, 100]
		// list1.add(1, -5); //add -5 at index 1 -> [7, -5, 1, 5, 100]
		// list1.add(5, 12); //add 12 at index 5 -> [7, -5, 1, 5, 100, 12]
		// System.out.println("After adding: " + list1);

		/* 3. Test delete */
		// list1.delete(3); //remove node at index 3 -> [7, -5, 1, 100, 12]
		// list1.delete(0); //remove first node -> [-5, 1, 100, 12]
		// list1.delete(3); //remove last node -> [-5, 1, 100]
		// System.out.println("After deleting: " + list1);

	}

}
