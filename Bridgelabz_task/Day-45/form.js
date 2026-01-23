document.getElementById("payrollForm").addEventListener("submit", function(e) {
  e.preventDefault();

  const name = document.getElementById("name").value;
  const gender = document.getElementById("gender").value;
  const salary = document.getElementById("salary").value;
  const startDate = document.getElementById("startDate").value;
  const notes = document.getElementById("notes").value;

  const departments = [];
  document.querySelectorAll("input[type=checkbox]:checked").forEach(cb => {
    departments.push(cb.value);
  });

  const employee = {
    name,
    gender,
    department: departments,
    salary,
    startDate,
    notes
  };

  const existing = JSON.parse(localStorage.getItem("EmployeePayrollList")) || [];
  existing.push(employee);
  localStorage.setItem("EmployeePayrollList", JSON.stringify(existing));

  window.location.href = "home.html";
});

function cancel() {
  window.location.href = "home.html";
}
