
public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.idCard="226104";
        s.idCardValid=true;
        s.semester=3;
        s.grade=4.33;

        System.out.println(s.name + " " + s.age);

        s.sayHello();
        s.displayName();
        s.displayAge();
        s.displayData();
        s.displayIdCard();
        s.displayDataIdCard();

        Student s2 = new Student();
        s2.name = "Anna";
        s2.age = 23;
        s2.idCard="226004";
        s2.idCardValid=true;
        s2.semester=6;
        s2.grade=3.33;

        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        s2.displayData();
        s2.displayIdCard();
        s2.displayDataIdCard();

        



    }





}
    
