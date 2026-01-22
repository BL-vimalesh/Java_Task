function goToForm() {
  window.location.href = "form.html";
}

window.onload = function() {
  const data = JSON.parse(localStorage.getItem("EmployeePayrollList")) || [];
  const tbody = document.querySelector("#employeeTable tbody");

  data.forEach(emp => {
    const row = document.createElement("tr");
    row.innerHTML = `
      <td>${emp.name}</td>
      <td>${emp.gender}</td>
      <td>${emp.department.join(", ")}</td>
      <td>₹${emp.salary}</td>
      <td>${emp.startDate}</td>
      <td><button>Edit</button> <button>Delete</button></td>
    `;
    tbody.appendChild(row);
  });
};
