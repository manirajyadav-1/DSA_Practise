//
//
//
//
//class Student {
//    private int regNo;
//    private String name;
//    private String department;
//    private float marks;
//    private int attendance;
//
//    public Student(int regNo, String name, String department) {
//        this.regNo = regNo;
//        this.name = name;
//        this.department = department;
//        this.marks = 0;
//        this.attendance = 0;
//    }
//
//    public void display() {
//        System.out.println("Reg No: " + regNo);
//        System.out.println("Name: " + name);
//        System.out.println("Department: " + department);
//        System.out.println("Marks: " + marks);
//        System.out.println("Attendance: " + attendance + "%");
//    }
//
//    public void setMarks(float marks) {
//        this.marks = marks;
//    }
//
//    public void setAttendance(int attendance) {
//        this.attendance = attendance;
//    }
//
//    public float getMarks() {
//        return marks;
//    }
//
//    public int getAttendance() {
//        return attendance;
//    }
//}
//
//
//class Teacher {
//    private int teacherId;
//    private String name;
//    private String department;
//    private String designation;
//
//    public Teacher(int teacherId, String name, String department, String designation) {
//        this.teacherId = teacherId;
//        this.name = name;
//        this.department = department;
//        this.designation = designation;
//    }
//
//    public void enterMarks(Student student, float marks) {
//        student.setMarks(marks);
//        System.out.println("Marks updated for student " + student.getMarks());
//    }
//
//    public void enterAttendance(Student student, int attendance) {
//        student.setAttendance(attendance);
//        System.out.println("Attendance updated for student: " + student.getAttendance() + "%");
//    }
//
//    public void display() {
//        System.out.println("Teacher ID: " + teacherId);
//        System.out.println("Name: " + name);
//        System.out.println("Department: " + department);
//        System.out.println("Designation: " + designation);
//    }
//}
//
//
//
//public class Demo1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student student1 = new Student(101, "Maniraj Yadav", "Computer Science and Engineering");
//
//        Teacher teacher1 = new Teacher(5001, "Dr. Sunny", "Computer Science and Engineering", "Asst. Professor");
//
//        System.out.println("\nBefore Updating:");
//        student1.display();
//
//        System.out.println("\nEnter student mark(floating value): ");
//        float mark = sc.nextFloat();
//        teacher1.enterMarks(student1, mark);
//
//        System.out.println("\nEnter student attendance: ");
//        int attendance = sc.nextInt();
//        teacher1.enterAttendance(student1, attendance);
//
//        System.out.println("\nAfter Updating:");
//        student1.display();
//
//        System.out.println("\nTeacher Details:");
//        teacher1.display();
//    }
//}
