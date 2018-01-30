package com.danrosg;

import java.util.Stack;

public class TreeProgram {

    public static  void main (String[] args)
    {
        TreeProgram program =new TreeProgram();
        TreeNode root=program.initializeTree();

        program.inOrderTraversal(root);
        System.out.println("End");
        program.inOrderTraversalStack(root);



    }

    public void inOrderTraversal(TreeNode root){

        if (root!=null)
        {
            inOrderTraversal(root.left);
            System.out.print(root.data.toString()+" ");
            inOrderTraversal(root.right);

        }

    }

    public void inOrderTraversalStack(TreeNode root) {


        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root != null)
            stack.push(root);


        while (!stack.empty()) {


            if (stack.peek().left != null)
            {   stack.push(stack.peek().left);
                //current = root.left;
            }
            else
            {
                TreeNode node = stack.pop();
                System.out.print(node.data.toString());
                node =stack.pop();
                System.out.print(node.data.toString());

                if(node.right!=null)
                    stack.push(node.right);

            }


        }
    }



    public TreeNode initializeTree()
    {
        TreeNode root=new TreeNode("F");
        root.left=new TreeNode("B");
        root.right=new TreeNode("G");
        root.left.left=new TreeNode("A");
        root.left.right=new TreeNode("D");
        root.left.right.left =new TreeNode("C");
        root.left.right.right =new TreeNode("E");

        root.right.right=new TreeNode("I");
        root.right.right.left=new TreeNode("H");


        return root;
    }

    class TreeNode{

        Object data;
        TreeNode left;
        TreeNode right;

        TreeNode(Object data)
        {
            this.data=data;
        }

    }
}
