/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */

package problem3.myqueue;


import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    /*
    Variables to be used
     */
    Node head;

    /*
    default constructor.
     */
    public MyPriorityQueue()
    {
        head = null ;
    }

    /*
    insert() method to insert values.
     */
    public void insert(String name,int roll)
    {
        /*
        Node class object creation.
         */
        Node newNode = new Node();
        /*
        Student class object creation
         */
        Student obj = new Student;
        obj.setName(name);
        obj.setRoll(roll);
        newNode.setObj(obj);
        Node temp = head;
        /*
        checking if queue is empty
         */
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            if(head.getObj().getRoll()>roll)
            {
                newNode.setNext(head);
                head = newNode;
            }
            else
            {
                while(temp.getNext()!=null && temp.getNext().getObj().getRoll()<roll)
                {
                    temp = temp.getNext();
                }
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
            }
        }
    }


}
