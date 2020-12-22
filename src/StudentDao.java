
import java.sql.*;

public class StudentDao {
    public static boolean insertStudentToDB(StudentDetails studentDetails) throws SQLException {
        boolean f = false;
        try {

            Connection connection = DatabaseDao.getConnection();
            //Statement statement = connection.createStatement();
            String insertQuery = "insert into student (firstName ,lastname,emailId,phone) values (?,?,?,?) ";
            //statement.setString(1,studentDetails.getFirstName());
            //statement.executeUpdate(insertQuery);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, studentDetails.getFirstName());
            preparedStatement.setString(2, studentDetails.getLastName());
            preparedStatement.setString(3, studentDetails.getStudentEmailId());
            preparedStatement.setString(4, studentDetails.getStudentPhoneNumber());
            preparedStatement.executeUpdate(insertQuery);
            f = true;

        }

        catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }


    public static boolean deleteStudentFromDB(int id) throws SQLException {
        boolean f=false;
        try {

            Connection connection = DatabaseDao.getConnection();
            //Statement statement = connection.createStatement();
            String deleteQuery = "delete from student where StudentId=? ";
            //statement.setString(1,studentDetails.getFirstName());
            //statement.executeUpdate(insertQuery);
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
            preparedStatement.setInt(1, id);
            // preparedStatement.setString(1, String.valueOf(id));


            preparedStatement.executeUpdate();
            f = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return f;

    }

    public static void viewStudentsFromDB() throws SQLException {
        try {
            Connection connection = DatabaseDao.getConnection();
            Statement statement = connection.createStatement();
            String selectQuery = "select * from student ";
            ResultSet set = statement.executeQuery(selectQuery);
            while (set.next()) {
                int sId = set.getInt(1);
                String fName = set.getString(2);
                String lName = set.getString(3);
                String sEmail = set.getString(4);
                String sPhone = set.getString(5);
                System.out.println("####################################");
                System.out.println("#########Another Student############");
                System.out.println("####################################");
                System.out.println(" Student id : " + sId);
                System.out.println(" Student First Name  : " + fName);
                System.out.println(" Student Last Name  : " + lName);
                System.out.println(" Student Email Id  : " + sEmail);
                System.out.println(" Student Phone Number : " + sPhone);
            }
        }
         catch(Exception  e)
        {
            e.printStackTrace();
        }




    }
}

