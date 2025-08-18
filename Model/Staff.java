package Model;
import java.util.List;
import java.util.Random;
public class Staff {
    private final int staffId;
    private String name;
    private List<String> skills;
    private int maxHoursPerWeek;
    private String employeeType;

    //constructor
    public Staff(String name, List<String> skills, int maxHoursPerWeek, String employeeType){
        this.staffId = generatedRandomId();
        this.name = name;
        this.skills = skills;
        this.maxHoursPerWeek = maxHoursPerWeek;
        this.employeeType = employeeType;
    }

    // Random
    private int generatedRandomId(){
        int number;
        Random rand = new Random();
        number = 1000 + rand.nextInt(9000); 
        return number;
    }

    //Getter
    public int getid(){
        return staffId;
    }

    public String getname(){
        return name;
    }

    public List<String> getSkills(){
        return skills;
    }

    public int getMaxHoursPerWeek(){
        return maxHoursPerWeek;
    }

    public String getEmployeeType(){
        return employeeType;
    }

    //Setter
    public void setSkills(List<String> skills){
        this.skills = skills;
    }

    public void setMaxHoursPerWeek(int maxHoursPerWeek){
        this.maxHoursPerWeek = maxHoursPerWeek;
    }

    public void setEmployeeType(String employeeType){
        this.employeeType = employeeType;
    }

    @Override
    public String toString(){
        return "Staff ID: " + staffId + "\n"
            + "Name: " + name + "\n"
            + "Skills: " + skills + "\n"
            + "Max Hour/Week: " + maxHoursPerWeek + "\n"
            + "Employee Type: " + employeeType + "\n";
    }

}
