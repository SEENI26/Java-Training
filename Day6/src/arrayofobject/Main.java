package arrayofobject;

public class Main {
	public static void main(String[] args) {
        // Declare and create an array of Student objects
        Student[] students = new Student[3];

        // Initialize the objects within the array
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 22);
        students[2] = new Student("Charlie", 19);

        // Access and use the objects
        for (Student student : students) {
            student.display(); // Call the display method for each student
        }
    }


}
