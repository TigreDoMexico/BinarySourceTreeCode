
public class TreeNode {
	private int value;
	private TreeNode nEsq;
	private TreeNode nDir;
	
	public TreeNode(int value) {
		this.value = value;
		nEsq = null;
		nDir = null;
	}

	public static TreeNode addNewNode(TreeNode root, TreeNode newNode) {
		if (root == null) return newNode;
		else if (newNode.getValue() < root.getValue()) {
			root.setEsqNode(addNewNode(root.getEsqNode(), newNode));
		} else {
			root.setDirNode(addNewNode(root.getDirNode(), newNode));
		}
		
		return root;
	}
	
	public static TreeNode searchValue(TreeNode root, int value) {
		if (root == null) return null;
		if (root.getValue() == value) return root;
		
		if (root.getValue() > value)
			return searchValue(root.getEsqNode(), value);
		return searchValue(root.getDirNode(), value);
	}
	
	public static int countNodes(TreeNode root) {
		if (root == null) return 0;
		return countNodes(root.getEsqNode()) + 1 + countNodes(root.getDirNode());
	}
	
	public static void printNodes(TreeNode root) {
		if (root != null) {
			System.out.print(root.getValue());
			System.out.print("(");
			printNodes(root.getEsqNode());
			printNodes(root.getDirNode());
			System.out.print(")");
		}
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getEsqNode() {
		return nEsq;
	}

	public void setEsqNode(TreeNode nEsq) {
		this.nEsq = nEsq;
	}

	public TreeNode getDirNode() {
		return nDir;
	}

	public void setDirNode(TreeNode nDir) {
		this.nDir = nDir;
	}
}
