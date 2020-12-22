
import java.sql.*;

public class StudentDao {
    public static boolean insertStudentToDB(StudentDetails studentDetails) throws SQLException {
        boolean f=false;

            Connection connection = DatabaseDao.getConnection();
            //Statement statement = connection.createStatement();
            String insertQuery="insert into student (firstName ,lastname,emailId,phone) values (?,?,?,?) ";
            //statement.setString(1,studentDetails.getFirstName());
        //statement.executeUpdate(insertQuery);
        PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
        preparedStatement.setString(1,studentDetails.getFirstName());
        preparedStatement.setString(2, studentDetails.getLastName());
        preparedStatement.setString(3, studentDetails.getStudentEmailId());
        preparedStatement.setString(4, studentDetails.getStudentPhoneNumber());
        preparedStatement.executeUpdate();
        f=true;
        return f;
        }


    public static boolean deleteStudentFromDB(int id) throws SQLException {
        boolean f=false;

        Connection connection = DatabaseDao.getConnection();
        //Statement statement = connection.createStatement();
        String deleteQuery="delete from student where StudentId=? ";
        //statement.setString(1,studentDetails.getFirstName());
        //statement.executeUpdate(insertQuery);
        PreparedStatement preparedStatement= connection.prepareStatement(deleteQuery);
        preparedStatement.setInt(1, id);
        // preparedStatement.setString(1, String.valueOf(id));



        preparedStatement.executeUpdate();
        f=true;
        return f;

    }

    public static void viewStudentsFromDB() throws SQLException {
        Connection connection = DatabaseDao.getConnection();
        Statement statement = connection.createStatement();
        String selectQuery="select * from student ";
         ResultSet set= statement.executeQuery(selectQuery);


    }
}

