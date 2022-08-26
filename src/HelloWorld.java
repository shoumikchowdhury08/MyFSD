package com.company;
class Employee{
    int emp_num;
}

class HelloWorld{
    public static void main(String[] args){
        Employee e1 = new Employee();
        System.out.println(e1.emp_num);
        Employee e2 = e1;

//        e2.emp_num=4;
//        System.out.println(e1.emp_num + e2.emp_num);
    }
}
