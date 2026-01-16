AddressBook.prototype.sortByCity = function() {
    this.contacts.sort((a, b) => a.city.localeCompare(b.city));
    console.log("Contacts sorted by City:");
    this.contacts.forEach(c => console.log(c.toString()));
};

AddressBook.prototype.sortByState = function() {
    this.contacts.sort((a, b) => a.state.localeCompare(b.state));
    console.log("Contacts sorted by State:");
    this.contacts.forEach(c => console.log(c.toString()));
};

AddressBook.prototype.sortByZip = function() {
    this.contacts.sort((a, b) => a.zip.localeCompare(b.zip));
    console.log("Contacts sorted by Zip:");
    this.contacts.forEach(c => console.log(c.toString()));
};