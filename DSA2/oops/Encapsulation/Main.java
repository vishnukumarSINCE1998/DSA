package oops.Encapsulation;

class Student{
    private int rollno;
    private String name;
    private int age;

    Student(){
        System.out.println("student registesrd");
    }
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
//    public void setRollno(int r){
//        rollno=r;
//    }
    public void setName(String str){
        name=str;
    }
    public void setAge(int a){
        if(a>0)
        age=a;
        else
            System.out.println("age can not negative");
    }
    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    void msg(){
        System.out.println("Details are");
    }
    void printdetails(){
        System.out.println("ROLL NO: "+rollno);
        System.out.println("NAME :"+name);
        System.out.println("AGE :"+age);
    }

}

public class Main {
    public static void main(String args[]) {
        Student std1=new Student(101,"cv",10);
//  std1.setAge(90);
        std1.msg();
        std1.printdetails();
    }
    }

