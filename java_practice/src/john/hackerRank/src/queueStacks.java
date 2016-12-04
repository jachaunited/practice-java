import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class queueStacks {

	LinkedList queue;
	LinkedList stack;
	/*Stack<Character> stack1;
	Queue<Character> queue1;*/

	queueStacks() {
		
		/*stack1 = new Stack<>();
		queue1 = new LinkedList<>();*/
		queue = new LinkedList();
		stack = new LinkedList();
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		queueStacks p = new queueStacks();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}
		
		/*System.out.println(s);
		System.out.println(p.viewList());*/

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;                
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is " 
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
	
	/*public String viewList() {
		String s = charArr.toString();
		return  s;
	}*/

	public void pushCharacter(char ch) {
		/*(System.out.println("Push: " + ch + " " + charArr.indexOf(ch));
		charArr.add(0, ch);*/
		//stack.push(ch);
		stack.addLast(ch); //Push adds element on the top of the stack; top = last
	}

	public void enqueueCharacter(char ch) {
		/*(System.out.println("Enqueque: " + ch + " " + charArr.indexOf(ch));
		charArr.add(charArr.size() - 1, ch);*/
		queue.add(ch); //Enqueque adds element on the last of the queque; just like in a line
	}

	public char popCharacter() {
		/*System.out.println("Pop: " + charArr.getLast());
		return (char) charArr.remove(charArr.size() - 1);*/
		//return (char) stack.pop();
		return (char) stack.removeLast(); //Pop removes the top element of the stack; top = last
	}

	public char dequeueCharacter() {
		/*System.out.println("Dequeque " + charArr.getFirst());
		return (char) charArr.remove(0);*/
		return (char) queue.remove(); //Dequeue removes the first element of the queue
	}


}