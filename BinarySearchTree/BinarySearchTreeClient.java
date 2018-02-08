package BinarySearchTree;

public class BinarySearchTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BinarySearchTree bst=new BinarySearchTree();
		
		bst.add(65);
		bst.add(30);
		bst.add(75);
		bst.add(15);
		bst.add(45);
		bst.add(68);
		
		bst.add(95);
		bst.add(10);
		bst.add(20);
		bst.add(35);
		//bst.add(50);
		bst.add(85);
		bst.add(100);
				
		//bst.display();
		
		//System.out.println(bst.size());
		//System.out.println(bst.max());
		//System.out.println(bst.min());
		System.out.println();
		//bst.remove(15);
		//int[] arr={10,15,20,30,35,45,65,68,75,85,95,100};
		//BinarySearchTree bst2=new BinarySearchTree(arr);
		bst.sumNode(80);
		//bst2.display();
	}

}
