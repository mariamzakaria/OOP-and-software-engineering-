package assignment3;

import java.util.Scanner;



public class cs {
	

	static class NODE{
	char node;
	NODE right ;
	NODE left ;
	NODE(char data ) {
        this.node = data;
        right = null;
        left = null;
    }
}



static class  Tree {
	 
    NODE root;
  
    Tree() 
    { 
        root = null; 
    } 
   
public  void add(char data) {
      root= addfn(root, data);
    }
public void traverseinOrder() {
	traversePreOrder(root);
    }
 
    }
 public static NODE addfn(NODE current, char data) {
	    if (current == null) {
	        return new NODE(data);
	    }
	 
	    if (data < current.node) {
	        current.left = addfn(current.left, data);
	    } else if (data > current.node) {
	        current.right = addfn(current.right, data);
	    } else {
	        // value already exists
	        return current;
	    }
	 
	    return current;
	}

 public static void traversePreOrder(NODE node) {
	    if (node != null) {
	        System.out.println("%s" + node.node);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree bt = new Tree() ;
		Scanner in = new Scanner(System.in);
		System.out.println("enter string");
          String string=in.nextLine();
          for (int i=0;i<string.length();i++) {
        	  bt.add(string.charAt(i));
        	 
          }
          bt.traverseinOrder();
          
          //System.out.println('a'>'b');
// System.out.println(string.charAt(i)>(string.charAt(i-1)));
	}

}
