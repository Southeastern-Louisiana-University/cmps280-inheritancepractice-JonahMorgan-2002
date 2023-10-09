package chapter13;

public class DynamicBindingDemo {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("object.toString() " + object.toString());
        Person person = new Person();
        System.out.println("person.toString() " + person.toString());
        Student student = new Student();
        System.out.println("student.toString() " + student.toString());
        GradStudent gradstudent = new GradStudent();
        System.out.println("gradstudent.toString() " + gradstudent.toString());

        Object object1 = new GradStudent();

        methodDBD(object);
        methodDBD(person);
        methodDBD(student);
        methodDBD(gradstudent);

        if (object1 instanceof GradStudent){
            System.out.println("GradStudent identified");
        }
        else
            System.out.println("Not GradStudent");
    }
    public static void methodDBD(Object object){
        System.out.println((object.toString()));
    }
}
    class Person extends Object {
        public String toString(){
            return "\tPerson\n";

        }

    }
    class Student extends Person {
        public String toString() {
            return "\tStudent\n";
        }
    }
class GradStudent extends Student {
    public String toString() {
        return "\tGradStudent\n";
    }
}