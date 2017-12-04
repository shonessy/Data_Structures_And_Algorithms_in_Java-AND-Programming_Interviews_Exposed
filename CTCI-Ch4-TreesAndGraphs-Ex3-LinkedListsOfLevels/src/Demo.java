
public class Demo {

	public static void main(String[] args) {
		// ovako mi najlakse da kreiram stablo, iz zadatka Ex2
		int sortedArray[] = {2,4,7,9,11,12,18,32,71,78,82,93,104};
		Tree tree = Tree.createMinimalHeightTreeFromSortedArray(sortedArray);
		tree.displayTree();
		
		System.out.println();
		tree.displayLinkedListsOfLevels(tree.createLinkedListsOfLevels(tree));
		
	}

}
