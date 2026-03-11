package Aggregation;

/*Aggregation is a special form of association. It is a relationship between two classes
  like association, however it's a directional association,
  which means it is strictly a one way association. It represents a HAS-A relationship.*/
class Address {
    String city;
    int pinCode;

     Address(String city, int pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }
}

class Student {
    String name;
    //Creating HAS-A relationship with Address class
    Address address;

     Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address("Patna", 800001);
        Student student = new Student("Rajesh", address);
        System.out.println(student.name);
        System.out.println(student.address.city);
        System.out.println(student.address.pinCode);
    }

}
