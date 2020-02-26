package ex2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TEST_ex2 {
	private vendeur v;
	private manager m;
	private employe e;
	
 @Before
 	public void init(){
		 v=new vendeur(15,450);
		 m=new manager(15);
		 e=new employe(15); 
 }
 
	@Test
	public void test_construction() {

		assertFalse(m == null);
		assertFalse(v == null);
		assertFalse(e == null);
		
	}
	
	@Test
	public void test() {

		assertFalse(m == null);
		assertNotEquals( m.getSalaire() , e.getSalaire());
		assertTrue(v.getSalaire()>m.getSalaire());

		assertTrue(v.getSalaire()>e.getSalaire());
	}

}
