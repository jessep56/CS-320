
public class ContactTest {
	
	public static void main(String[] args) {
		ContactTest contactTest = new ContactTest();
		
		contactTest.testGetters();
		contactTest.testSetters();
	}
	
	public void testGetters() {
		Contact contact = new Contact("0123456789", "Jimmy", "John", "0123456789", "123 1st Ave");
		
		assert contact.getContactId().equals("0123456789");
		assert contact.getFirstName().equals("Jimmy");
		assert contact.getLastName().equals("Johns");
		assert contact.getPhone().equals("0123456789");
		assert contact.getAddress().equals("123 1st Ave");
	}
	
	public void testSetters() {
		Contact contact = new Contact("0123456789", "Jimmy", "Johns", "0123456789", "123 1st Ave");
		
		contact.setFirstName("Jessica");
		assert contact.getFirstName().equals("Jessica");
	}
}
