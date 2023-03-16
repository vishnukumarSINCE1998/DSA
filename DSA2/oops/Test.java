package oops;
class Student{
    int rollno;
    String name;
    int age;
    int height;
}
public class Test {

        public static void main(String args[]){
            Student std1=new Student();
            std1.rollno=1;
            std1.name="chinna";
            std1.age=24;
            std1.height=150;

            System.out.println("ROLL NO :"+std1.rollno);
            System.out.println("AGE :"+std1.age);
            System.out.println("NAME : "+std1.name);
            System.out.println("HEIGHT :"+std1.height);


            Student std2= new Student();
            std2.rollno=2;
            std2.age=25;
            std2.name="vishnu";
            std2.height=180;

            System.out.println("\n");
            System.out.println("ROLL NO :"+std2.rollno);
            System.out.println("AGE :"+std2.age);
            System.out.println("NAME : "+std2.name);
            System.out.println("HEIGHT :"+std2.height);


        }
    }

