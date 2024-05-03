
public class LinkedList {

	// Reference to the first node in the list
	private ListNode list;

	public LinkedList() {
		list = null;
	}

	public void add(Integer n) {
		ListNode newNode = new ListNode(n);
		if (list == null) {
			list = newNode;
		} else {
			ListNode current = list;
			while (current.getNext() != null) { // exception thrown
				current = current.getNext();
			}
			// Insert the new node
			current.setNext(newNode);
		}
	}

	public String toString() {
		// String to return
		String result = "[";
		// current starts by pointing to 1st node
		ListNode current = list;

		while (current != null) {
			// Add node value to result
			/* todo */
			
			// Move current to the next node
			/* todo */

			// Add a comma if not at end of list
			if (current != null) {
				result += ", ";
			}
		}
		return result + "]";
	}

}
