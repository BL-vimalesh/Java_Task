AddressBook.prototype.editContact = function(name, newDetails) {
    let contact = this.contacts.find(c => c.firstName === name || c.lastName === name);
    if (!contact) throw new Error("Contact not found");

    for (let key in newDetails) {
        if (contact.hasOwnProperty(key)) {
            contact[key] = newDetails[key];
        }
    }
    contact.validate(); 
    console.log("Contact updated successfully");
};
