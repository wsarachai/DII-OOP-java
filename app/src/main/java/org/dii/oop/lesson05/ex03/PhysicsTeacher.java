package org.dii.oop.lesson05.ex03;

public class PhysicsTeacher extends Teacher {
    String mainSubject = "Physics";

    public static void main(String args[]) {
        PhysicsTeacher obj = new PhysicsTeacher();
        /*
         * Note: we are not accessing the data members directly we are using public
         * getter method to access the private members of parent class
         */
        System.out.println(obj.getCollegeName());
        System.out.println(obj.getDesignation());
        System.out.println(obj.mainSubject);
        obj.work();
    }
}
