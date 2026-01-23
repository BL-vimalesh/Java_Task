const empTableBody = document.getElementById("empTableBody");
const addEmployeeBtn = document.getElementById("addEmployeeBtn");

let employees = JSON.parse(localStorage.getItem("employees")) || [];

// Load employees
function renderEmployees() {
  empTableBody.innerHTML = "";
  employees.forEach((emp, index) => {
    empTableBody.innerHTML += `
      <tr>
        <td>${emp.name}</td>
        <td>${emp.department}</td>
        <td>${emp.salary}</td>
        <td>
          <button onclick="editEmployee(${index})">Edit</button>
          <button onclick="deleteEmployee(${index})">Delete</button>
        </td>
      </tr>
    `;
  });
}

addEmployeeBtn.onclick = () => {
  localStorage.removeItem("editIndex");
  window.location.href = "form.html";
};

function editEmployee(index) {
  localStorage.setItem("editIndex", index);
  window.location.href = "form.html";
}

function deleteEmployee(index) {
  employees.splice(index, 1);
  localStorage.setItem("employees", JSON.stringify(employees));
  renderEmployees();
}

renderEmployees();
