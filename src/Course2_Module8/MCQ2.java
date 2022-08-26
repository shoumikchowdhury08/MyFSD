package Course2_Module8;

class Employee{
    int id;
}

public class MCQ2 {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.id = 2;
        System.out.println(employee.id);

        Employee temp = employee;
        temp.id = 4;
        System.out.println(employee.id);
    }
}


