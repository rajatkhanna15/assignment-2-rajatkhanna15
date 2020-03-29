/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */

package problem5.main;

import problem5.circularqueue.MyCircularQueue;

//executable class
public class MyMain {

    public static void main(String[] args) {
        /*
        Creating object of MyCircularQueue class
         */
        MyCircularQueue mcq = new MyCircularQueue();
        /*
        inserting values
         */
        mcq.enqueue(1,4,0);
        mcq.enqueue(2,2,1);
        mcq.enqueue(3,3,2);
        mcq.enqueue(4,1,2);
        mcq.enqueue(5,0,1);
        mcq.enqueue(6,2,0);
        mcq.enqueue(7,0,2);
        mcq.enqueue(8,1,1);
        mcq.enqueue(9,0,2);
        mcq.enqueue(10,0,0);



    }
}


