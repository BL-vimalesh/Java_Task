AddressBook.prototype.countByCity = function(city) {
    return this.contacts.filter(c => c.city === city).length;
};

AddressBook.prototype.countByState = function(state) {
    return this.contacts.filter(c => c.state === state).length;
};


console.log("Count in Chennai:", book.countByCity("Chennai"));
console.log("Count in TamilNadu:", book.countByState("TamilNadu"));
