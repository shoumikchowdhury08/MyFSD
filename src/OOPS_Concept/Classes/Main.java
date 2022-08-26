package OOPS_Concept.Classes;

public class Main {
    public static void main(String[] args) {
        Student shoumik = new Student(15, "Shoumik", 90.5f);
        Student random = new Student();
//        int rno = 15;
//        String name;
//        float marks = 89.5f;
        shoumik.greeting();
        shoumik.changeName("Shoe Lover");
        System.out.println(shoumik.rno);
        System.out.println(shoumik.name);
        System.out.println(shoumik.marks);
        System.out.println("This is for the random guy:");
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);
    }

    static class Student {
      int rno;
      String name;
      float marks;

      void greeting(){
          System.out.println("Hello, My name is "+ this.name);
      }

      void changeName(String newName){
          this.name = newName;
      }
      Student(){
          this.rno = 36;
          this.name = "Shoumik Chowdhury";
          this.marks = 91.5f;
      }

      Student(int rno, String name, float marks){
          this.rno = rno;
          this.name = name;
          this.marks = marks;
      }
    }
}