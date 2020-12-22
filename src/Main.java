import javax.sound.midi.Soundbank;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) throws SQLException {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Press 1 TO ADD");
            System.out.println("Press 2 To Delete ");
            System.out.println("Press 3 to View ");
            System.out.println("Press 4 to Exit : ");
            System.out.println("press 5 to feedback :");
            int option=sc.nextInt();
            if(option==1)
            {
                System.out.println("Enter the Name first name  : ");
                String firstname =sc.next();
                System.out.println("Enter the Name Last name  : ");
                String lastname =sc.next();
                System.out.println("Enter Student EmailID : ");
               String studentEmail = sc.next();
                System.out.println("Enter the Student Phone Number : ");
              String studentNumber =sc.next();
                StudentDetails studentdetails = new StudentDetails(firstname,lastname, studentEmail,studentNumber);
                System.out.println(studentdetails);
                boolean answer=StudentDao.insertStudentToDB(studentdetails);
                if(answer){
                    System.out.println("Added Succesfully");
                }
                else
                {
                    System.out.println("Something went wrong please contact programmer .........");

                }

            }
            else if(option==2)
            {
                System.out.println("Enter the id to delete a student " );
                int id=sc.nextInt();

                boolean answer=StudentDao.deleteStudentFromDB(id);
                if(answer){
                    System.out.println("Deleted Successfully");
                }
                else
                {
                    System.out.println("Something went wrong please contact programmer .........");

                }


            }
            else if(option==3)
            {
                StudentDao.viewStudentsFromDB();

            }
            else if(option==4)
            {

            }
            else if(option==5)
            {
                AbstractionDao feedback=new AbstractionDao();
                feedback.studentComplaints();

            }
            else {
                System.out.println("Please Enter the correct Option : ");
            }
        }
    }
}
