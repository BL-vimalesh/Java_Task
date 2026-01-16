function uc15_validateEmployee(empId, salary, gender, startDate) {
    try {
        const idPattern = /^[1-9][0-9]*$/;        
        const salaryPattern = /^[1-9][0-9]*$/;    
        const genderPattern = /^[MF]$/;           
        const datePattern = /^\d{4}-\d{2}-\d{2}$/;

        if (!idPattern.test(empId)) {
            throw new Error("Invalid Employee ID");
        }

        if (!salaryPattern.test(salary)) {
            throw new Error("Invalid Salary");
        }

        if (!genderPattern.test(gender)) {
            throw new Error("Invalid Gender");
        }

        if (!datePattern.test(startDate)) {
            throw new Error("Invalid Date Format");
        }

        const date = new Date(startDate);
        const today = new Date();
        if (date > today) {
            throw new Error("Date cannot be in the future");
        }

        console.log("All validations passed");
    } catch (err) {
        console.error("Validation Error:", err.message);
    }
}


validateEmployee("101", "50000", "M", "2025-12-31"); 
validateEmployee("0", "50000", "M", "2025-12-31");   
validateEmployee("102", "0", "F", "2027-01-01");     
