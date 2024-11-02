package parcial02.c12023.ej02;

import java.util.*;

public class AddressBook{
    private final TreeMap<AddressBookGroup, TreeMap<String, Contact>> contacts = new TreeMap<>();

    public void addContact(AddressBookGroup group, String name, String phoneNumber) {
        contacts.putIfAbsent(group, new TreeMap<>());
        contacts.get(group).put(name, new Contact(name, phoneNumber));
    }

    public Contact getContact(AddressBookGroup group, String name) {
        if (!contacts.getOrDefault(group, new TreeMap<>()).containsKey(name)) {
            throw new IllegalArgumentException("No such contact " + name);
        }
        return contacts.get(group).get(name);
    }

    public void renameContact(AddressBookGroup group, String oldName, String newName) {
        Contact oldContact = getContact(group, oldName);
        contacts.get(group).remove(oldName);
        addContact(group, newName, oldContact.getPhoneNumber());
    }

    public Collection<Contact> getAllContacts(AddressBookGroup group) {
        return contacts.getOrDefault(group, new TreeMap<>()).values();
    }

    public Collection<Contact> getAllContacts() {
        ArrayList<Contact> result = new ArrayList<>();
        for (TreeMap<String, Contact> map : contacts.values()) {
            result.addAll(map.values());
        }
        return result;
    }
}
