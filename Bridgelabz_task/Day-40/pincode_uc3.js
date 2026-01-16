function validatePincode(pincode) {
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
validatePincode("638111");  
validatePincode("400088b"); 
validatePincode("012345");  
validatePincode("400088");  
