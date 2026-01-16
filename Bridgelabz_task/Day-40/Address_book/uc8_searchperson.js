AddressBook.prototype.searchByCityOrState = function(name, city, state) {
    return this.contacts.filter(c => 
        (c.firstName === name || c.lastName === name) &&
        (c.city === city || c.state === state)
    );
};

let searchResult = book.searchByCityOrState("John", "Bangalore", "TamilNadu");
console.log("Search Result:", searchResult.map(c => c.toString()));
