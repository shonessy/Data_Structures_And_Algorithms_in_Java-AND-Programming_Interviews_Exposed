
public class Demo {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(new Worker("Ana", 15));
		tree.insert(new Worker("Jovana", 12));
		tree.insert(new Worker("Milena", 72));
		tree.insert(new Worker("Secerlema", 45));
		tree.insert(new Worker("Iva", 18));
		tree.insert(new Worker("Anka", 81));
		tree.insert(new Worker("Jovanka", 51));
		tree.insert(new Worker("Andjelija", 62));
		tree.insert(new Worker("Melanija", 78));
		
		tree.displayTree();
		
		System.out.println();
		System.out.println(tree.find(new Worker("Secerlema", 45)));
		System.out.println();
		
		System.out.println("Traverse In Order: ");
		tree.traverseInOrder();
		System.out.println();
		
		System.out.println("Traverse Pre Order: ");
		tree.traversePreOrder();
		System.out.println();
		
		System.out.println("Traverse Post Order: ");
		tree.traversePostOrder();
		System.out.println();
		
		System.out.println("Minimum: " + tree.findMin());
		System.out.println();
		
		System.out.println("Maximum: " + tree.findMax());
		System.out.println();
		
		System.out.println("Izbrisi Ivu: " + tree.delete(new Worker("Iva", 18)));
		tree.displayTree();
		
		System.out.println("Izbrisi Jovanku: " + tree.delete(new Worker("Jovanka", 51)));
		tree.displayTree();
		
		System.out.println("Izbrisi Anku: " + tree.delete(new Worker("Anka", 81)));
		tree.displayTree();
		
	}

}
