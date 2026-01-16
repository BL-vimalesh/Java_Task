AddressBook.prototype.sortByName = function() {
    this.contacts.sort((a, b) => {
        let nameA = (a.firstName + " " + a.lastName).toLowerCase();
        let nameB = (b.firstName + " " + b.lastName).toLowerCase();
        return nameA.localeCompare(nameB);
    });
    console.log("Contacts sorted by Name:");
    this.contacts.forEach(c => console.log(c.toString()));
};
