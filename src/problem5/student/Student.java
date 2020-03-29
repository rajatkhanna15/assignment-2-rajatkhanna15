/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */

package problem5.student;
// to store student information and properties
public class Student {
    /*
    Variables to be used.
     */
    String name;
    int roll;
    int apcount;
    int backlog;


    /*
    getter and setter methods of variables.
     */

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getRoll() {
        return roll;
    }



    public void setRoll(int roll) {
        this.roll = roll;
    }



    public int getApcount() {
        return apcount;
    }



    public void setApcount(int apcount) {
        this.apcount = apcount;
    }


    public int getBacklog() {
        return backlog;
    }

    public void setBacklog(int backlog) {
        this.backlog = backlog;
    }
}
