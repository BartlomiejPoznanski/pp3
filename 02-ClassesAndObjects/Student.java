public class Student {
    String name;
    int age;
    String idCard;
    Boolean idCardValid;
    int semester;
    double grade;

        void sayHello(){
        System.out.println("Hello from "+ name);
    }
        void displayName(){
        System.out.println(name);
    }
        void displayAge(){
        System.out.println(age);
    }
        void displayData(){
        System.out.println(name+semester+grade);
    }
        void displayIdCard(){
        System.out.println(idCardValid);
    }
        void displayDataIdCard(){
        System.out.println(name+idCard+idCardValid);
    }
}