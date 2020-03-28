/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class


import problem1.mybst.MyBinarySearchTree;

public class MyMain {

    public static void main(String[] args) {
        /*
        Creating object of MyBinarySearchTree class.
         */
        MyBinarySearchTree mbst = new MyBinarySearchTree();
        /*
        inserting values
         */
        mbst.insert(22);
        mbst.insert(18);
        mbst.insert(65);
        mbst.insert(87);
        mbst.insert(23);
        mbst.insert(19);
        mbst.insert(60);
        mbst.insert(55);
        mbst.insert(27);
        mbst.insert(1);

        /*
        Printing the required result.
         */
        System.out.println("Left Child Nodes are:");
        mbst.printLeftNode(mbst.root);
        System.out.println();



    }
}
