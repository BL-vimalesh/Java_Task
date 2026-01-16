class AddressBook {
    constructor() {
        this.contacts = [];
    }

    addContact(contact) {
        if (this.contacts.some(c => c.firstName === contact.firstName && c.lastName === contact.lastName)) {
            throw new Error("Duplicate contact not allowed");
        }
        this.contacts.push(contact);
        console.log("Contact added successfully");
    }

    displayContacts() {
        this.contacts.forEach(c => console.log(c.toString()));
    }
}
