public class StudentDetails {
    private int studentId;
    private String firstName;
    private String lastName ;
    private String studentEmailId;
    private String studentPhoneNumber;

    public StudentDetails(String firstName, String lastName, String studentEmailId, String studentPhoneNumber  ) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.studentEmailId = studentEmailId;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentEmailId() {
        return studentEmailId;
    }

    public void setStudentEmailId(String studentEmailId) {
        this.studentEmailId = studentEmailId;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentEmailId='" + studentEmailId + '\'' +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                '}';
    }
}

