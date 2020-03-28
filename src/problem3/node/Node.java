/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */


package problem3.node;


import problem5.student.Student;

public class Node {
    /*
    Some variables to be used.
     */
    Student obj;
    Node next;



    public Student getObj() {
        return obj;
    }


    public void setObj(Student obj)
    {

        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
