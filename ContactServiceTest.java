
public class ContactServiceTest {

	public static void main(String[] args) {
		ContactServiceTest contactServiceTest = new ContactServiceTest();
		
		contactServiceTest.testAddContact();
		contactServiceTest.testDeleteContact();
		contactServiceTest.testUpdateContact();
	}
	
	public void testAddContact() {
		ContactService contactService = new ContactService();
		
		Contact contact = new Contact("0123456789", "Jimmy", "Johns", "0123456789", "123 1st Ave");
		
		contactService.addContact(contact);
		
		if (contactService.getContact("0123456789") != null){
			System.out.println("Contact added successfully");
		} else {
			System.out.println("Failed to add contact");
		}
	}
	
	public void testDeleteContact() {
		ContactService contactService = new ContactService();
		
		Contact contact = new Contact("0123456789", "Jimmy", "Johns", "0123456789", "123 1st Ave");
		contactService.addContact(contact);
		
		contactService.deleteContact("0123456789");
		
		if (contactService.getContact("0123456789") == null) {
			System.out.println("Contact deleted successfully");
		} else {
			System.out.println("Failed to delete contact");
		}
	}
	
	public void testUpdateContact() {
		ContactService contactService = new ContactService();
		
		Contact contact = new Contact("0123456789", "Jimmy", "Johns", "0123456789", "123 1st Ave");
		contactService.addContact(contact);
		
		contactService.updateContact("0123456789", "Jessica", "Johns", "0123456789", "456 2nd Ave");
		
		Contact updatedContact = contactService.getContact("0123456789");
		
		if (updatedContact != null && updatedContact.getFirstName().equals("Jessica")) {
			System.out.println("Contact updated successfully");
		} else {
			System.out.println("Failed to update contact");
		}
	}
}
