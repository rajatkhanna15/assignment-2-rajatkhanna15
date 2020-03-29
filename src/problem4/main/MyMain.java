/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */

package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    /*
    main() method.
     */

    public static void main(String[] args) {
        /*
        Creating object of MyBinarySearchTree class of problem 1.
         */
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        /*
        inserting values in tree.
         */
        mbst.insert(10);
        mbst.insert(20);
        mbst.insert(40);
        mbst.insert(17);
        mbst.insert(48);
        mbst.insert(21);
        mbst.insert(11);
        mbst.insert(98);
        mbst.insert(4);
        mbst.insert(1);

        /*
        creation of object of MyQueue class
         */
        MyQueue mq = new MyQueue();
        mq.preOrderSuccessor(mbst.root);
        /*
        Displaying the result
         */
        System.out.println("Pre Order Successor of all the nodes are :");
        mq.dispPreOrderSuccessor();

    }

}
