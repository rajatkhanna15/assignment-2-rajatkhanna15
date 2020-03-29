/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */

package problem4.myqueue;
// to create queue to store pre - order successor


import problem1.node.TreeNode;
import problem4.node.Node;

public class MyQueue {
    /*
    Variables to be used.
     */
    Node front;
    Node rear;

    /*
    Default constructor.
     */

    public MyQueue()
    {
        front = null;
        rear = null;
    }


    public void enqueue(int data)
    {
        /*
        Creating object of node class.
         */
        Node newNode = new Node();
        newNode.setData(data);
        /*
        CHecking if queue is empty or not
         */
        if(front == null)
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.setNext(newNode);
            rear = newNode;
        }
    }


    public void preOrderSuccessor(TreeNode root)
    {
        if(root != null)
        {
            enqueue(root.getData());
            preOrderSuccessor(root.getLeft());
            preOrderSuccessor(root.getRight());
        }
    }

    /*
    displaying the required result.
     */
    public void dispPreOrderSuccessor()
    {
        Node temp = front.getNext();
        while(temp != null)
        {
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
        }
    }


}
