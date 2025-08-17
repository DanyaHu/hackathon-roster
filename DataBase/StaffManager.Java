

public class StaffManager {


    private final String TABLE_NAME = "staff";


    //Setup Function:
    public void setup() throws SQLException {
        try(Connection connection = Database.getConnection();
            Statement stmt = connection.createStatement()) {
                String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ("
                + "staff_id INT PRIMARY KEY,"
                + "name VARCHAR(50) NOT NULL,"
                + "maxHoursPerWeek INT NOT NULL"
                + "employeeType VARCHAR(50) NOT NULL";
                stmt.executeUpdate(query);

                String skills_query = "CREATE TABLE IF NOT EXISTS skills ("
                + "staff_id INT,"
                + "skill VARCHAR(50) NOT NULL,"
                + "FOREIGN KEY (staff_id) REFENCES staff(staff_id))";
                stmt.executeUpdate(skills_query);
    
            }
            
    }



    //Insert
    /*
        @Staff object
        return bool

    */
    public boolean insert_staff_info(/* Todo       */) {

    }

    //Any
    public boolean any() {
        //Select count(*) from Staff
    }

    //Delete
    //Search
    //Edit










}