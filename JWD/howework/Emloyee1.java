package howework;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Emloyee1 {
   private int EmpId;
    private String name;
	@Override
	public String toString() {
		return "Emloyee1 [EmpId=" + EmpId + ", name=" + name + "]";
	}
    
    
    
    
}
