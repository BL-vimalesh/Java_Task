function validatePincode(pincode) {
    let pin = pincode.toString().replace(/\s+/g, "");
    
    try {
        const pinPattern = /^[1-9][0-9]{5}$/; 

        if (!pinPattern.test(pincode.toString())) {
            throw new Error("Invalid Pincode");
        }
        console.log("Valid Pincode", pincode);
    } catch (err) {
        console.error("Validation Error:", err.message);
    }
}

// Test cases
validatePincode("638 111");  
validatePincode("400 088"); 
validatePincode("012 345");  
validatePincode("400088");  
