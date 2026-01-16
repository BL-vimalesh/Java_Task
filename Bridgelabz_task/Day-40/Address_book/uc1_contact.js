class Contact {
    constructor(firstName, lastName, address, city, state, zip, phoneNumber, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;

        this.validate(); 
    }

    validate() {
        const namePattern = /^[A-Z][a-zA-Z]{2,}$/;          
        const addressPattern = /^.{4,}$/;                   
        const cityStatePattern = /^[A-Za-z]{4,}$/;          
        const zipPattern = /^[1-9][0-9]{5}$/;               
        const phonePattern = /^[6-9][0-9]{9}$/;             
        const emailPattern = /^[a-zA-Z0-9]+([_\+\-\.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\.[a-z]{2,}(\.[a-z]{2})?$/;

        if (!namePattern.test(this.firstName)) throw new Error("Invalid First Name");
        if (!namePattern.test(this.lastName)) throw new Error("Invalid Last Name");
        if (!addressPattern.test(this.address)) throw new Error("Invalid Address");
        if (!cityStatePattern.test(this.city)) throw new Error("Invalid City");
        if (!cityStatePattern.test(this.state)) throw new Error("Invalid State");
        if (!zipPattern.test(this.zip)) throw new Error("Invalid Zip Code");
        if (!phonePattern.test(this.phoneNumber)) throw new Error("Invalid Phone Number");
        if (!emailPattern.test(this.email)) throw new Error("Invalid Email");
    }

    toString() {
        return `${this.firstName} ${this.lastName}, ${this.address}, ${this.city}, ${this.state}, ${this.zip}, Phone: ${this.phoneNumber}, Email: ${this.email}`;
    }
}
