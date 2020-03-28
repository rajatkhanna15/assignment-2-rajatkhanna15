/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;


import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    /*
    Some variables to be used.
     */
    public TreeNode root;
    int count;

    //BinaryTree structure creation starts


    public MyBinarySearchTree() {
        root = null;
    }

    /*
    insert method to insert a node
     */
    public void insert(int value)
    {
        /*
        creating object of TreeNode class.
         */
        TreeNode newNode = new TreeNode();
        newNode.setData(value);

        /*
        checking if tree is empty.
         */
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            TreeNode current = root;
            TreeNode parent;
            while(true)
            {
                parent = current;
                /*
                if the value to be inserted is less than the root then value is
                inserted at left of the root otherwise at the right.
                 */
                if(value < current.getData())
                {
                    current = current.getLeft();
                    if(current == null)
                    {
                        parent.setLeft(newNode);
                        return;
                    }
                }
                else
                {
                    current = current.getRight();
                    if(current == null)
                    {
                        parent.setRight(newNode);
                        return;
                    }
                }
            }
        }
    }



    public int getCount() {
        return count;
    }


}
