package BinaryTree;

public class BinaryTreeClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//18 true 12 true 16 false false true 17 false false true 31 true 120 false false false
	//	1 true 3 true 7 false false true 8 false false true 2 true 9 false false true 10 false false          12                                              13
		
		
		BinaryTree tree=new BinaryTree();
		//BinaryTree tree1=new BinaryTree();
		//tree.display();
		//tree1.display();
		//System.out.println(tree.checkBST());
		//System.out.println(tree.size2());
		//System.out.println(tree.max());
		//System.out.println(tree.min());
		//System.out.println(tree.height());
		//System.out.println(tree.find(15));
		//tree.mirror();
		tree.display();
		//tree.mirror();
		//tree.findAtLevel(2);
	//	tree.preOrderTraverse();
		//tree.postOrderTraverse();
        //tree.inOrderTraverse();
		//tree.preOrederTI();
        //System.out.println(tree.sumOfNodes());
		//tree.removeLeafNode();
	//	tree.display();
		
		System.out.println();
		
		//tree.alternatePrint();
	//	System.out.println(tree.possibleSum(43));
		
		//System.out.println(tree.createLevelList());
		//tree.sumToK(30);
		//tree.replaceGreat();
		//tree.display();
		tree.possiblePath(12);
	}

}
