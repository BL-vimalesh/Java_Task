AddressBook.prototype.addContact = function(contact) {
    let duplicate = this.contacts.filter(c => 
        c.firstName === contact.firstName && c.lastName === contact.lastName
    );
    if (duplicate.length > 0) {
        throw new Error("Duplicate contact not allowed");
    }
    this.contacts.push(contact);
    console.log("Contact added successfully");
};
