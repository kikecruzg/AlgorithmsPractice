package ejercicios;

public class LinkedLists {
	
	class Solution {
		public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			
			// Recorrer las listas para obtener su valor
			long num1 = getNumber(l1);
			long num2 = getNumber(l2);
			
			System.out.println("Numbers from lists: " + num1 + ", " + num2);

			String result = String.valueOf(num1 + num2);
			
			ListNode referenceNode = new ListNode(Integer.parseInt(String.valueOf(result.charAt(0))));
			
			for(int i = 1; i < result.length(); i++) {
				ListNode node = new ListNode(Integer.parseInt(String.valueOf(result.charAt(i))), referenceNode);
				referenceNode = node;
			}
	        return referenceNode;
	    }
		
		private long getNumber(ListNode l1) {
			long multiplier = 1;
			long number = l1.val;
			System.out.println("Initial value: " + number);
			ListNode l2 = l1.next;
			while(l2 != null) {
				multiplier *= 10;
				System.out.println(number + " += " + l2.val + " * " + multiplier);
				number += l2.val * multiplier;
				l2 = l2.next;
			}
			System.out.println("Final number: " + number);
			return number;
		}
	}
	
	class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) {
			this.val = val;
		}
		ListNode(int val, ListNode next) {
			this.val = val; this.next = next;
		}
	}
	
	public static void main(String[] args) {
		LinkedLists linkedLists =  new LinkedLists();
		Solution solution = linkedLists.new Solution();
		
		/*ListNode l1_1 = linkedLists.new ListNode(3);
		ListNode l1_2 = linkedLists.new ListNode(4, l1_1);
		ListNode l1_3 = linkedLists.new ListNode(2, l1_2);
		
		ListNode l2_1 = linkedLists.new ListNode(4);
		ListNode l2_2 = linkedLists.new ListNode(6, l2_1);
		ListNode l2_3 = linkedLists.new ListNode(5, l2_2);
		
		ListNode lista = solution.addTwoNumbers(l1_3, l2_3);*/
		
		ListNode l1_1 = linkedLists.new ListNode(9);
		ListNode l1_2 = linkedLists.new ListNode(9, l1_1);
		ListNode l1_3 = linkedLists.new ListNode(9, l1_2);
		ListNode l1_4 = linkedLists.new ListNode(9, l1_3);
		ListNode l1_5 = linkedLists.new ListNode(9, l1_4);
		ListNode l1_6 = linkedLists.new ListNode(9, l1_5);
		ListNode l1_7 = linkedLists.new ListNode(9, l1_6);
		ListNode l1_8 = linkedLists.new ListNode(9, l1_7);
		ListNode l1_9 = linkedLists.new ListNode(9, l1_8);
		ListNode l1_10 = linkedLists.new ListNode(1, l1_9);
		
		ListNode l2_1 = linkedLists.new ListNode(9);
		
		ListNode lista = solution.addTwoNumbers(l1_10, l2_1);
		
		System.out.println("Result is: " + solution.getNumber(lista));
	}
}

