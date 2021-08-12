
public class Tree {
	private TreeNode root;
	
	public Tree() {
		root = null;
	}
	
	public void addValue(int value) {
		TreeNode newNode = new TreeNode(value);
		root = TreeNode.addNewNode(root, newNode);
	}
	
	public void searchValue(int value) {
		TreeNode nodeResult = TreeNode.searchValue(root, value);
		
		if (nodeResult == null) System.out.println("Valor n�o encontrado");
		else System.out.println("Valor encontrado");
	}
	
	public void print() {
		System.out.println("�RVORE: ");
		TreeNode.printNodes(root);
		System.out.println("");
	}
	
	public int numberOfNodesInTree() {
		return TreeNode.countNodes(root);
	}
}
