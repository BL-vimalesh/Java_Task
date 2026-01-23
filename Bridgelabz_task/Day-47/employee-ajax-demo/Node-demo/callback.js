function getEmployee(callback) {
  setTimeout(() => {
    const employee = {
      id: 1,
      name: "Vimalesh",
      department: "Engineering",
      salary: 60000
    };
    callback(employee);
  }, 2000);
}

console.log("Fetching employee data...");

getEmployee((data) => {
  console.log("Employee Data Received:");
  console.log(data);
});
