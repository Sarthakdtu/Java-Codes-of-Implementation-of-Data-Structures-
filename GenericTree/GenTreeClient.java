package GenericTree;

public class GenTreeClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//18 3 20 2 6 0 25 0 64 0 7 1 19 0
		//24 3 41 3 15 0 27 0 51 0 35 3 12 0 15 0 16 0 79 4 0 0 50 2 110 0 97 0 2 0 45 0  
		
GenericTree tree=new GenericTree();
//GenericTree tree1=new GenericTree();
tree.display();
System.out.println(tree.numberOfLeafNodes());
//System.out.println(tree.size());
//System.out.println(tree.height());
//System.out.println(tree.find(21));
//System.out.println(tree.max());
//tree.mirror();
//tree1.display();
//tree.mirror();
//tree.printAtLevel(2);
//tree.preOrderTraverse();
//tree.postOrderTraverse();
//System.out.println(tree.sumOfNodes());
//System.out.println(tree.secondMax());
//System.out.println(tree.justGreaterThanN(34));
//System.out.println(tree.numberOfLeafNodes());
//System.out.println(tree.isSame(tree1));
tree.replaceWithDepth();
tree.display();
	}

}
