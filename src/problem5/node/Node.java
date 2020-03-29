/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */

package problem5.node;
// to define node properties
import package problem5.student.Student;
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
