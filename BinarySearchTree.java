package assignment.binarytree;

//import java.util.Scanner;

/* A Node class consists of three things, the information, reference to the 
 right child, and reference to the left child. */
class Node {
	public Patient patient;
	public Node lchild;
	public Node rchild;

	public Node(Patient p, Node l, Node r) /* Constructor for the Node class */
	{
		this.patient = p;
		lchild = l;
		rchild = r;
	}
}

public class BinarySearchTree {
	public Node ROOT;
	Node tmp, parent = null, currentNode = null;

	public BinarySearchTree() {
		ROOT = null; /* Initializing ROOT to null */
	}

	public void insert(Patient element) /*
										 * Inserts a Node in the Binary Search
										 * Tree
										 */
	{

		find(element, parent, currentNode);
		if (currentNode != null) /*
								 * Checks if the node to be inserted is already
								 * present or not
								 */
		{
			// System.out.println("Duplicates words not allowed");
			// return;
		} else /* If the specified Node is not present */
		{
			tmp = new Node(element, null, null); /* creates a Node */
			if (parent == null) /* If the tree is empty */
				ROOT = tmp;
			else if (element.age == parent.patient.age
					|| element.age < parent.patient.age)
				parent.lchild = tmp;
			else
				parent.rchild = tmp;
		}
	}

	public void find(Patient element, Node parent, Node currentNode) {
		/*
		 * This function finds the currentNode of the specified Node as well as
		 * the currentNode of its parent.
		 */

		this.currentNode = ROOT;
		this.parent = null;
		while ((this.currentNode != null)
				&& (this.currentNode.patient != element)) {
			this.parent = this.currentNode;
			if (element.age == this.currentNode.patient.age
					|| element.age < this.currentNode.patient.age)
				this.currentNode = this.currentNode.lchild;
			else
				this.currentNode = this.currentNode.rchild;
		}
	}

	public void inorder(Node ptr) // Performs the inorder traversal of the tree
	{	
		
		
		if (ROOT == null) {
			System.out.println("Tree is empty");
			return;
		}
		if (ptr != null) {
			inorder(ptr.lchild);			
			System.out.format("%-12s%-12s%3s\n",ptr.patient.firstName, ptr.patient.lastName, ptr.patient.age );
			//System.out.print(ptr.patient.firstName + " ");
			//System.out.print(ptr.patient.lastName + "   ");
			//System.out.println(ptr.patient.age + " ");
			inorder(ptr.rchild);
		}
	}

	public void displayInOrder()
	{
		this.inorder(ROOT);
	}
	
	public Node lowerLeftPatient()
	{
		Node currentNode = this.ROOT;
		while (currentNode.lchild != null)
		{
			currentNode = currentNode.lchild;
		}
		return currentNode;
	}
	
	public Node lowerRightPatient()
	{
		Node currentNode = this.ROOT;
		while (currentNode.rchild != null)
		{
			currentNode = currentNode.rchild;
		}
		return currentNode;
	}
	
	public Node rootPatient()
	{
		return this.ROOT;
	}
}
