package OOPS_Concept;

import java.sql.SQLOutput;

class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    Student() {

        }

}

public class OOPS {
    public static void main(String[] args) {
//        Pen pen1 = new Pen();
//        pen1.color = "Blue";
//        pen1.type = "Gel";
//
//        Pen pen2 = new Pen();
//        pen2.color = "Black";
//        pen2.type = "ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();

          Student s1 = new Student();
          s1.name = "Shoumik";
          s1.age = 27;

          Student s2 = new Student(s1);
          s2.printInfo();
    }
}