package com.gbsplus.contatcmanager;

import java.util.HashMap;
import java.util.Map;

public class ContactManager {

    private Map<String, Contact> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    // validate if a contact with same email exists or not

    public boolean checkIfExists(Contact contact) {
        return contacts.containsKey(contact.getEmail().toLowerCase());
    }

    public void addContact(String name, String phone, String email) {
        Contact contact = new Contact(name, phone, email);
        if (!checkIfExists(contact)) {
            contacts.put(email.toLowerCase(), contact);
        } else {
            throw new InvalidContactException("Contact with email " + email + " already exists.");
        }
    }

    public void removeContact(String email) {
        if (contacts.containsKey(email.toLowerCase())) {
            contacts.remove(email.toLowerCase());
        } else {
            throw new ContactNotFoundException("Contact with email " + email + " does not exist.");
        }
    }

    public Contact getContact(String email) {
        if (contacts.containsKey(email.toLowerCase())) {
            return contacts.get(email.toLowerCase());
        } else {
            throw new ContactNotFoundException("Contact with email " + email + " does not exist.");
        }
    }


}
