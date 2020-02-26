import java.util.ArrayList;
import java.util.List;

public class TechosBob {
	
	public List<RobotMobile> l;
	public TechosBob() {
		l= new ArrayList<RobotMobile>();
		
	}
	
	public void add(RobotMobile r) {
		l.add(r);
	}
	public void clear() {
		l.clear();
	}
	public RobotMobile get() {
		return l.get(0);
	}
	
	
	public void avancerTous() {
		for (RobotMobile robot : l) 
		{ 
			robot.avance();
		}
		
	
	}
}
