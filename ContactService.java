import java.util.HashMap;
import java.util.Map;

public class ContactService {
	private final Map<String, Contact> contacts;
	
	public ContactService() {
		this.contacts = new HashMap<>();
	}
	
	//adds contact with unique id
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getContactId())) {
			throw new IllegalArgumentException("Contact ID must be unique");
		}
		contacts.put(contact.getContactId(), contact);
	}
	
	//deletes a contact by id
	public void deleteContact(String contactId) {
		if(!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		contacts.remove(contactId);
	}
	
	//updates contact fields by id
	public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		if (!contacts.containsKey(contactId)) {
			throw new IllegalArgumentException("Contact ID not found");
		}
		
		Contact contactToUpdate = contacts.get(contactId);
		
		if (firstName != null) {
			contactToUpdate.setFirstName(firstName);
		}
		if (lastName != null) {
			contactToUpdate.setLastName(lastName);
		}
		if (phone != null) {
			contactToUpdate.setPhone(phone);
		}
		if (address != null) {
			contactToUpdate.setAddress(address);
		}
		
		contacts.put(contactId, contactToUpdate);
	}
	public Contact getContact(String contactId) {
		return contacts.get(contactId);
	}
}
