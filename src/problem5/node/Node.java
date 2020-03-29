package problem5.node;/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
import problem5.student.*;

// to define node properties

 public class Node {
    /*
    Variables to be used.
     */
    Student student;
    Node next;


    public Student getStudent() {
        return student;
    }



    public void setStudent(Student student) {
        this.student = student;
    }



    public Node getNext() {
        return next;
    }



    public void setNext(Node next) {
        this.next = next;
    }

}

