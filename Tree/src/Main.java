
public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.addValue(15);
		tree.addValue(12);
		tree.addValue(50);		
		tree.addValue(40);
		tree.addValue(2);
		tree.addValue(10);
		tree.addValue(100);
		tree.addValue(5);
		
		tree.print();
		
		tree.searchValue(40);
		tree.searchValue(16);
		
		System.out.println("A árvore possui " + tree.numberOfNodesInTree() + " elementos");
	}
}
