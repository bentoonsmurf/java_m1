import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TEST_deplacement {
	private TechosBob LeBricoleur;
	@Before
	public void init() {
		LeBricoleur =  new TechosBob();
		RobotStatique r1=new RobotStatique();

		RobotMobile r2=new RobotMobile();

		RobotMobile r3=new RobotMobile();		

		LeBricoleur.add(r2);
		LeBricoleur.add(r3);
		
		
	}
	@Test
	public void testCreation() {
		assertFalse(LeBricoleur == null);// aucun bricoleur ne peut etre null 
										// ca n'a pas de sens mais je test quand meme
		
	}
	@Test
	public void test() {
		LeBricoleur.avancerTous();
	}

}
