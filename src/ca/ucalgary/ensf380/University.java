package ca.ucalgary.ensf380;

public class University {
    public static void main(String[] args) {
        Address addr1 = new Address("123 Main St", "Calgary", "AB", "T2N 1N4", "Canada");
        Address addr2 = new Address("456 Elm St", "Calgary", "AB", "T3A 2K1", "Canada");

        Professor prof1 = new Professor("Dr. John Smith", "403-123-4567", "jsmith@university.ca", addr1, "P001", 85000);
        Professor prof2 = new Professor("Dr. Jane Doe", "403-987-6543", "jdoe@university.ca", addr2, "P002", 90000);

        Student stud1 = new Student("Alice Johnson", "403-333-2222", "ajohnson@university.ca", addr1, "S001", prof1, 78.5);
        Student stud2 = new Student("Bob Brown", "403-444-5555", "bbrown@university.ca", addr2, "S002", prof2, 82.3);


    }
}
