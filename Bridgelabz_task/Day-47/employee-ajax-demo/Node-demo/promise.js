function getEmployee() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const employee = {
        id: 1,
        name: "Vimalesh",
        department: "Engineering",
        salary: 60000
      };
      resolve(employee);
    }, 2000);
  });
}

console.log("Fetching employee data...");

getEmployee()
  .then((data) => {
    console.log("Employee Data Received:");
    console.log(data);
  })
  .catch((error) => {
    console.log("Error:", error);
  });
