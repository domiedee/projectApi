//package apithree.demo;
//
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "students")
//public class Student {
//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    private  Long id;
//
//    @Column(name = "student_name")
//    private String studentName;
//    @Column(name = "student_gender")
//    private String studentGender;
//
//    @ManyToOne
//    @JoinColumn(name = "university_id")
//    private University university;
//
//    public Student(String studentName, String studentGender, University university) {
//        this.studentName = studentName;
//        this.studentGender = studentGender;
//        this.university = university;
//    }
//    private Student(){}
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getStudentGender() {
//        return studentGender;
//    }
//
//    public void setStudentGender(String studentGender) {
//        this.studentGender = studentGender;
//    }
//
//    public University getUniversity() {
//        return university;
//    }
//
//    public void setUniversity(University university) {
//        this.university = university;
//    }
//}
