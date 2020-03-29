/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */

package problem5.circularqueue;


import problem5.node.*;
import problem5.student.*;

//to implement circular queue
public class MyCircularQueue {
    /*
    Variables to be used.
     */
    Node front;
    Node rear;
    int count;


    public MyCircularQueue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }


    public void enqueue(int roll,int backlog,int apcount)
    {
        /*
        Creating object of student class
         */
        Student st = new Student;
        /*
        Creating object of node class
         */
        Node newNode = new Node;
        newNode.setStudent(st);
        if(front == null)
        {
            front = newNode;
        }
        else
        {
            rear.setNext(front);
        }
        rear = newNode;
        rear.setNext(front);
        count++;
    }


}
