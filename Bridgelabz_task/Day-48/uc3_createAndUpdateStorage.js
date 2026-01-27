const createAndUpdateStorage = () => {
  let employeePayrollList = JSON.parse(localStorage.getItem("EmployeePayrollList"));
  if (employeePayrollList) {
    let empPayrollData = employeePayrollList.find(empData => empData.id == employeePayrollObj.id);
    if (!empPayrollData) {
      employeePayrollList.push(employeePayrollObj);
    } else {
      const index = employeePayrollList
        .map(empData => empData.id)
        .indexOf(empPayrollData.id);
      employeePayrollList.splice(index, 1, employeePayrollObj);
    }
  } else {
    employeePayrollList = [employeePayrollObj];
  }
  localStorage.setItem("EmployeePayrollList", JSON.stringify(employeePayrollList));
};

const checkName = (name) => {
  let nameRegex = RegExp('^[A-Z]{1}[a-zA-Z\\s]{2,}$');
  if (!nameRegex.test(name)) throw 'Name is Incorrect!';
};

const checkStartDate = (startDate) => {
  let now = new Date();
  if (startDate > now) throw 'Start Date is a Future Date!';
  var diff = Math.abs(now.getTime() - startDate.getTime());
  if (diff / (1000 * 60 * 60 * 24) > 30)
    throw 'Start Date is beyond 30 Days!';
};

window.addEventListener('DOMContentLoaded', (event) => {
  const name = document.querySelector('#name');
  name.addEventListener('input', function () {
    if (name.value.length == 0) {
      setTextValue('.text-error', "");
      return;
    }
    try {
      checkName(name.value);
      setTextValue('.text-error', "");
    } catch (e) {
      setTextValue('.text-error', e);
    }
  });

  const date = document.querySelector('#date');
  date.addEventListener('input', function () {
    let startDate = getInputValueById('#day') + " " +
                    getInputValueById('#month') + " " +
                    getInputValueById('#year');
    try {
      checkStartDate(new Date(Date.parse(startDate)));
      setTextValue('.date-error', "");
    } catch (e) {
      setTextValue('.date-error', e);
    }
  });

  const salary = document.querySelector('#salary');
  salary.addEventListener('input', function () {
    setTextValue('.salary-output', salary.value);
  });

  document.querySelector('#cancelButton').href = site_properties.home_page;
});
