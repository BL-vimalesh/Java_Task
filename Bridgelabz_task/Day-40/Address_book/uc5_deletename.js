AddressBook.prototype.deleteContact = function(name) {
    const index = this.contacts.findIndex(c => c.firstName === name || c.lastName === name);
    if (index === -1) throw new Error("Contact not found");

    this.contacts.splice(index, 1);
    console.log("Contact deleted successfully");
};
