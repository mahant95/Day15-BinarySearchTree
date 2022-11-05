
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
	//method to find the size i.e number of nodes in BST
	public int size(Node root)
	{
		if(root == null)
			return 0;
		else
			return (size(root.left)+1+size(root.right));
	}
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(60);
		tree.insert(95);
		tree.insert(65);
		tree.insert(63);
		//tree.insert(67);
		tree.inOrder();
		System.out.println();
		int size = tree.size(tree.root);
		if(size == 13)
			System.out.println("All elements are added");
		else
			System.out.println("Missing some elements");
		
		
	}
}
