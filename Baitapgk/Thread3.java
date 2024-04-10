package Baitapgk;

import java.util.List;

public class Thread3 implements Runnable {
    List<Student> students;

    public Thread3(List<Student> students) {
        this.students = students;
    }

    public void run() {
        for (Student student : students) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(student.sum); i++) {
                if (student.sum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("ID: " + student.id + " Name: " + student.name + " Address: " + student.address + " Age: " + student.age + " Sum of date of birth digits: " + student.sum + " is a prime number");
            } else {
                System.out.println("ID: " + student.id + " Name: " + student.name + " Address: " + student.address + " Age: " + student.age + " Sum of date of birth digits: " + student.sum + " is not a prime number");
            }
        }
    }
}
