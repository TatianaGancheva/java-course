package tree;

public class Test {

	public static void main(String[] args) {
		TreeNode<Integer> root= new TreeNode<Integer>(8);
		{
			TreeNode<Integer> node9 = root.addChild(9);
			TreeNode<Integer> node13= root.addChild(13);
			TreeNode<Integer> node15 = root.addChild(15);
			{
				TreeNode<Integer> node20 = node15.addChild(null);
		    	TreeNode<Integer> node89 = node15.addChild(56);
		    	{
		    		TreeNode<Integer> node99=node89.addChild(99);
		    	}
			}
		}
		root.print(root, 0);
		int result=root.findDepth(root, 0,99);
		System.out.println("Depth is: " +result);
	}
}
		
	


