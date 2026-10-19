public class StudentManagement{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentId(101);
        s1.setName("Rahim");
        s1.setMarks(85.5);

        s1.displayInfo();

        s1.setName("Karim");
        s1.setMarks(95);
        s1.setMarks(120);

        s1.displayInfo();
        
        s1.setStudentId(102);
        s1.setStudentId(-101);

        s1.displayInfo();

        
    }

}