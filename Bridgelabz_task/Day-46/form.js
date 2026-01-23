const form = document.getElementById("empForm");
const nameInput = document.getElementById("name");
const deptInput = document.getElementById("department");
const salaryInput = document.getElementById("salary");

let employees = JSON.parse(localStorage.getItem("employees")) || [];
let editIndex = localStorage.getItem("editIndex");

// If edit
if (editIndex !== null) {
  const emp = employees[editIndex];
  nameInput.value = emp.name;
  deptInput.value = emp.department;
  salaryInput.value = emp.salary;
}

form.onsubmit = function (e) {
  e.preventDefault();

  const empData = {
    name: nameInput.value,
    department: deptInput.value,
    salary: salaryInput.value
  };

  if (editIndex !== null) {
    employees[editIndex] = empData;
  } else {
    employees.push(empData);
  }

  localStorage.setItem("employees", JSON.stringify(employees));
  window.location.href = "home.html";
};

function goBack() {
  window.location.href = "home.html";
}
