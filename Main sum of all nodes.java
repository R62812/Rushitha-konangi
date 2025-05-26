class Main {
	int data;
	Main left;
	Main right;
	Main(int data) {
		this.data=data;
		this.left=null;
		this.right=null;

	}
	static int inorder(Main root, int[] s) {
		if(root==null) {
			return s[0];

		}
		inorder(root.left,s);
		s[0]=s[0]+root.data;
		inorder(root.right,s);
		return s[0];
		

	}
	

	public static void main(String args[]) {
		Main n1=new Main(10);
		Main n2=new Main(20);
		Main n3=new Main(30);
		Main n4=new Main(40);
		Main n5=new Main(50);
		Main n6=new Main(60);
		Main n7=new Main(70);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		int[] s={0};
		System.out.println(inorder(n1,s));
		

	}
}