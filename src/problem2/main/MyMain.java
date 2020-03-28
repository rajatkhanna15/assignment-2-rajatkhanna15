/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */


package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree


import problem1.mybst.MyBinarySearchTree;

public class MyMain {

    public static void main(String[] args) {
        /*
        Creating object of MyBinarySearchTree class of problem 1 to create binary tree.
         */
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        /*
        inserting values in the tree.
         */
        mbst.insert(2);
        mbst.insert(10);
        mbst.insert(5);
        mbst.insert(7);
        mbst.insert(27);
        mbst.insert(59);
        mbst.insert(40);
        mbst.insert(25);
        mbst.insert(7);
        mbst.insert(11);
        /*
        printing the required result.
         */

        mbst.preOrder(mbst.root);
        System.out.println();

        mbst.postOrder(mbst.root);


        System.out.println("First statement is true");
        System.out.println("Second statement is false as we didn't get the middle point same.");

    }

}
