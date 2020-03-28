/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */

package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {

    public static void main(String[] args) {
        /*
        object creation ofMyPriorityQueue class.
         */
        MyPriorityQueue mpq = new MyPriorityQueue();
        /*
        inserting values
         */
        mpq.insert("Yash",45);
        mpq.insert("Yash",45);
        mpq.insert("Yash",45);
        mpq.insert("Yash",45);
        mpq.insert("Yash",45);

        System.out.println("Students aaranged in ascending order according to their roll numbers are:");
        mpq.peep()
    }

}
