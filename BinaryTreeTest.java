package assignment.binarytree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomPatientNames name = new RandomPatientNames();
		BinarySearchTree tree = new BinarySearchTree();
		Patient p = null;
		
		for (int i = 0; i < 100; i++)
		{
			p = new Patient();
			p.firstName = name.FirstName();
			p.lastName = name.LastName();
			p.age = 1 + (int)(Math.random() * 85);
			tree.insert( p );
		}
		
		
		System.out.println("Lower left Node:");
		System.out.print(tree.lowerLeftPatient().patient.firstName + " ");
		System.out.print(tree.lowerLeftPatient().patient.lastName + " ");
		System.out.println(tree.lowerLeftPatient().patient.age + "\n");
		
		System.out.println("Root Node:");
		System.out.print(tree.rootPatient().patient.firstName + " ");
		System.out.print(tree.rootPatient().patient.lastName + " ");
		System.out.println(tree.rootPatient().patient.age + "\n");
		
		System.out.println("Lower right Node:");
		System.out.print(tree.lowerRightPatient().patient.firstName + " ");
		System.out.print(tree.lowerRightPatient().patient.lastName + " ");
		System.out.println(tree.lowerRightPatient().patient.age + "\n");
		

		System.out.println("------------------------------------------");
		
		//tree.inorder(tree.ROOT);

	}
	

}
