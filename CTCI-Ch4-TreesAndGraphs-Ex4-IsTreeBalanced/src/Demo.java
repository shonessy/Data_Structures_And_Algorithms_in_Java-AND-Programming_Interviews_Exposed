
public class Demo {

	public static void main(String[] args) {
		System.out.println("Balanced tree");
		int sortedArray[] = {2,4,7,9,11,12,18,32,71,78,82,93,104};
		Tree balancedTree = Tree.createMinimalHeightTreeFromSortedArray(sortedArray);
		balancedTree.displayTree();
		System.out.println();
		
		System.out.println("Unbalanced tree");
		Tree unbalancedTree = new Tree();
		unbalancedTree.insert(15);
		unbalancedTree.insert(7);
		unbalancedTree.insert(21);
		unbalancedTree.insert(6);
		unbalancedTree.insert(10);
		unbalancedTree.insert(17);
		unbalancedTree.insert(22);
		unbalancedTree.insert(9);
		unbalancedTree.insert(13);
		unbalancedTree.insert(12);
		unbalancedTree.insert(14);
		unbalancedTree.displayTree();
		System.out.println();
		
		System.out.println("Is balancedTree balanced:  " + balancedTree.isTreeBalanced());
		System.out.println("Is unbalancedTree balanced:  " + unbalancedTree.isTreeBalanced());
		
		System.out.println();
		System.out.println("Improved checking: ");
		
		System.out.println("Is balancedTree balanced:  " + balancedTree.isTreeBalancedImproved());
		System.out.println("Is unbalancedTree balanced:  " + unbalancedTree.isTreeBalancedImproved());
		
	}

}
