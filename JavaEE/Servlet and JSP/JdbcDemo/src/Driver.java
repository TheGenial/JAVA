import java.sql.*;
public class Driver {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String username = "root";
        String password = "1234";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
            try{
                //1. Get a connection
                    connection = DriverManager.getConnection(url,username,password);
                //2. Create a Statement
                    Statement statement = connection.createStatement();
                //3. Execute SQL Query
                    /*Print all from table*/
                    resultSet= statement.executeQuery("SELECT * FROM arif");

                    /*insert into table*/
                    String sql = "insert into arif (id,fname,lname) values ('09','MD','Kabir2')";
                    /*Update into table*/
                    String sql1 = "UPDATE arif SET fname='ARIF2' WHERE id=1";
                    /*Delete operation*/
                    String sql2 = "delete from arif where id=8";
                    int rowAffected = statement.executeUpdate(sql2);
                //4. process the result set
                    /*Show Row wise all value*/
                    while(resultSet.next())
                    {
                        System.out.println(resultSet.getString("fname") +" ," + resultSet.getString("lname") );
                    }
                    /*Insertion Operation*/
                        statement.executeUpdate(sql);
                        System.out.println("Insertion Complete");
                    /*Update Operation*/
                        statement.executeUpdate(sql1);
                        System.out.println("Update Complete");
                    /*Delete Operation*/
                        System.out.println("Row Affected" +rowAffected);
                        System.out.println("Delete Complete");

            } catch(Exception e){
                e.printStackTrace();
            }
            finally {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (connection != null) {
                    connection.close();
                }
            }


    }
}
