import java.io.Console;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class treeNode {
	
	void Foo(TreeNode root)
    {
        Stack nodes = new Stack();
        nodes.push(root);

        while (nodes.size() > 0)
        {
            TreeNode node = (TreeNode) nodes.pop();
            System.out.println(node.toString());
            for (int i = node.getChildCount() - 1; i >= 0; i--)
                nodes.push(node.getChildAt(i));
        }
    }
	
	public static void main(String[] args) {
		Stack nodes = new Stack();
		Stack node = new Stack();
		node.push(5);
		for(int i = 0; i < 5; i++) {
			nodes.push(node.push(i));
			System.out.println(nodes.get(i));
		}
		
		
	}

}
