const setEmployeePayrollObject = () => {
  if (!isUpdate) employeePayrollObj.id = createNewEmployeeId();
  employeePayrollObj._name = getInputValueById('#name');
  employeePayrollObj._profilePic = getSelectedValues('[name=profile]').pop();
  employeePayrollObj._gender = getSelectedValues('[name=gender]').pop();
  employeePayrollObj._department = getSelectedValues('[name=department]');
  employeePayrollObj._salary = getInputValueById('#salary');
  employeePayrollObj._note = getInputValueById('#notes');
  let date = getInputValueById('#day') + " " +
             getInputValueById('#month') + " " +
             getInputValueById('#year');
  employeePayrollObj._startDate = date;
};
