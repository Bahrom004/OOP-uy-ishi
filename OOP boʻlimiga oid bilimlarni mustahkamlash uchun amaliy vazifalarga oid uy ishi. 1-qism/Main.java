public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "123 Main St", "CS", 2023, 10000);
        Staff staff = new Staff("Bob", "456 Maple Ave", "Engineering", 50000);

        System.out.println(student);
        System.out.println(staff);
    }
}
