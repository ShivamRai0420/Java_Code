public class Constructors {
    public static void main(String args[]){
        Student obj=new Student();
        Student obj1=new Student(10);
    }
}
class Student{
    Student(){
        System.out.println("This is default constructor");
    }
    Student(int a){
        int x=a;
        System.out.println("This is parameterized constructor values= "+x);
    }
}
