package cl.ubb.agil.Model;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;

public class SanctionTest {

	@Test
	public void testReturnIDSanctionIs1234(){
		Sanction sanction= new Sanction(1234);
		
		int identifier = sanction.getID();
		
		assertThat(identifier,equalTo(1234));
	}
	
	@Test 
	public void testReturnIDSanctionIs4321(){
		Sanction sanction= new Sanction(4321);
		
		int identifier = sanction.getID();
		
		assertThat(identifier,equalTo(4321));
	}
	
	@Test
	public void testReturnDescriptionSanctionIsThisIsASanction(){
		Sanction sanction = new Sanction(1234,"This is a sanction");
		
		String description = sanction.getDescription();
		
		assertThat(description,equalTo("This is a sanction"));
	}
	@Test
	public void testReturnDescriptionSanctionIsThisIsAnotherSanction(){
		Sanction sanction = new Sanction(1111,"This is another sanction");
		
		String description = sanction.getDescription();
		
		assertThat(description,equalTo("This is another sanction"));
	}
}
