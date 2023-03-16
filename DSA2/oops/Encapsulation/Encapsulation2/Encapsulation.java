package oops.Encapsulation.Encapsulation2;
class Student {
    private int rollno;
    private String name;
    private int age;

    Student(){
        System.out.println("new Student is registerd");
    }
    Student(int rollno,String name,int age){
        this.name=name;
        this.rollno=rollno;
        this.age=age;
    }

//    public void setRollno(int rollno){
//        this.rollno=rollno;
//    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if(age>0)
        this.age=age;
        else
            System.out.println("age cannot give negative");
    }
    public int getrollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    void printDeatisl(){
        System.out.println("ROLLNO :"+rollno);
        System.out.println("NAME :"+name);
        System.out.println("AGE :"+age);
    }
}
public class Encapsulation {
    public static void main(String args[]){
        Student std1=new Student(10,"vishnu",50);
//        std1.setAge(900);
        std1.printDeatisl();

    }
}
