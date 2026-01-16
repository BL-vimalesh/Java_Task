function validateEmail(email) {
    try {
        const emailPattern = /^[a-zA-Z0-9]+([_\+\-\.][a-zA-Z0-9]+)?@bridgelabz\.co(\.[a-z]{2})?$/;

        if (!emailPattern.test(email)) {
            throw new Error("Invalid Email");
        }
        console.log("Valid Email", email);
    } catch (err) {
        console.error("Validation Error:", err.message);
    }
}

// Valid cases
validateEmail("abc@bridgelabz.co");
validateEmail("abc@bridgelabz.co.in");
validateEmail("abc.xyz@bridgelabz.co.in");
validateEmail("abc-xyz@bridgelabz.co.in");
validateEmail("abc+xyz@bridgelabz.co");

// Invalid cases
validateEmail("abc@bridgelabz.com");   
validateEmail("abc@bridge.co");        
validateEmail("abc@bridgelabz.co.ind");
validateEmail("abc$xyz@bridgelabz.co"); 
