AddressBook.prototype.countContacts = function() {
    return this.contacts.reduce(count => count + 1, 0);
};

console.log("Number of Contacts:", book.countContacts());
