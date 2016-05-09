package cl.ubb.agil.Model;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class SanctionTest {

	@Test
	public void testReturnIDSanctionIs1234(){
		Sanction sanction= new Sanction(1234);
		
		int id = sanction.getID();
		
		assertThat(id,equalTo(1234));
	}
	
	@Test 
	public void testReturnIDSanctionIs4321(){
		Sanction sanction= new Sanction(4321);
		
		int id = sanction.getID();
		
		assertThat(id,equalTo(4321));
	}
	
}
