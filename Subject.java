import java.util.Scanner;

class Subject {
    String name;
    int marks;

    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

abstract class Student {
    String name;
    Subject[] subjects;

    public Student(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    abstract double calculateAggregate();

    String getGrade() {
        double aggregate = calculateAggregate();
        if (aggregate > 75) {
            return "DISTINCTION";
        } else if (aggregate >= 60) {
            return "FIRST DIVISION";
        } else if (aggregate >= 50) {
            return "SECOND DIVISION";
        } else if (aggregate >= 40) {
            return "THIRD DIVISION";
        } else {
            return "FAIL";
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the marks in Python: ");
        Subject python = new Subject("Python", scanner.nextInt());

        System.out.print("Enter the marks in C Programming: ");
        Subject cProgramming = new Subject("C Programming", scanner.nextInt());

        System.out.print("Enter the marks in Mathematics: ");
        Subject mathematics = new Subject("Mathematics", scanner.nextInt());

        System.out.print("Enter the marks in Physics: ");
        Subject physics = new Subject("Physics", scanner.nextInt());

        System.out.print("Enter the marks in Chemistry: ");
        Subject chemistry = new Subject("Chemistry", scanner.nextInt());

        System.out.print("Enter the marks in Professional Ethics: ");
        Subject professionalEthics = new Subject("Professional Ethics", scanner.nextInt());

        Subject[] subjects = {python, cProgramming, mathematics, physics, chemistry, professionalEthics};
        Student student = new Student(name, subjects) {
            Override
            double calculateAggregate() {
                int total = 0;
                for (Subject subject : subjects) {
                    total += subject.marks;
                }
                return (double) total / subjects.length;
            }
        };

        System.out.println("Total= " + student.calculateTotal());
        System.out.println("Aggregate = " + student.calculateAggregate());
        System.out.println("Class: " + student.getGrade());
    }
}