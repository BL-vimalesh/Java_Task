AddressBook.prototype.viewByCityOrState = function(city, state) {
    return this.contacts
        .filter(c => c.city === city || c.state === state)
        .map(c => c.toString());
};

console.log("Contacts in Chennai:", book.viewByCityOrState("Chennai", null));
console.log("Contacts in TamilNadu:", book.viewByCityOrState(null, "TamilNadu"));
