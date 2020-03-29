/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */

package problem5.circularqueue;


import problem5.node.Node;
import problem5.student.Student;

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


    public void removeBacklog()
    {
        while(count > 0)
        {
            count --;
            Student temp = front.getStudent();
            if(temp.getBacklog()-temp.getApcount() > 0)
            {
                front = front.getNext();
                rear = rear.getNext();
            }
            else
            {
                rear.setNext(front.getNext());
                front = front.getNext();
            }
        }
    }

    /*
    display method
     */

    public void display()
    {
        Node temp = front;
        System.out.println();
        while(temp.getNext()!=front)
        {
            System.out.println("ROLL NO :"+temp.getStudent().getRoll()+" Backlog "+temp.getStudent().getBacklog() + " Appearing Count "+temp.getStudent().getApcount());
            temp = temp.getNext();
        }
        System.out.println("ROLL NO :"+temp.getStudent().getRoll()+" Backlog "+temp.getStudent().getBacklog() + " Appearing Count "+temp.getStudent().getApcount());
    }


}

