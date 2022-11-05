
public class BinarySearchTree {
	
	class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	Node root;
	public BinarySearchTree() {
		root = null;
	}
	
	void insert(int data)
	{
		root = insertRec(root,data);
	}
	Node insertRec(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		
		if(data < root.data)
			root.left = insertRec(root.left, data);
		else
			root.right = insertRec(root.right, data);
		return root;
	}
	
	void inOrder()
	{
		inOrderRec(root);
	}
	void inOrderRec(Node root)
	{
		if(root == null)
			return;
		
		inOrderRec(root.left);
		System.out.print(root.data+" ");
		inOrderRec(root.right);
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.inOrder();
		System.out.println();
		tree.insert(30);
		tree.inOrder();
		System.out.println();
		tree.insert(70);
		tree.inOrder();
		
	}
}
