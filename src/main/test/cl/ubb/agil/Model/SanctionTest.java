package cl.ubb.agil.Model;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class SanctionTest {

	@Test
	public void testReturnIDSanctionIs1234(){
		Sanction sanction= new Sanction();
		
		int id = sanction.getID();
		
		assertThat(id,equalTo(1234));
	}
	
}
