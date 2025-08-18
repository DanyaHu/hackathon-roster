import java.time.DayOfWeek;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.Objects;
public class WeeklyAvilability {
    private final int staffId;
    private Map<DayOfWeek, EnumSet<ShiftType>> canDoByDay = new EnumMap<>();
    private java.util.Set<java.time.LocalData> unavilableDates = new java.util.HashSet<>();

    public WeeklyAvilability(int staffId){
        this.staffId = staffId;
        for(DayOfWeek d: DayOfWeek.values()){
            canDoByDay.put(d, EnumSet.noneOf(ShiftType.class));
        }
    }

    public int getStaffId(){
        return staffId;
    }

    //To be continued...
}