const save = (event) => {
  event.preventDefault();
  event.stopPropagation();
  try {
    setEmployeePayrollObject();
    if (site_properties.use_local_storage === "true") {
      createAndUpdateStorage();
      resetForm();
      window.location.replace(site_properties.home_page);
    } else {
      createOrUpdateEmployeePayroll();
    }
  } catch (e) {
    console.error("Save failed:", e);
    return;
  }
};

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

const createOrUpdateEmployeePayroll = () => {
  let postURL = site_properties.server_url;
  let methodCall = "POST";
  if (isUpdate) {
    methodCall = "PUT";
    postURL = postURL + "/" + employeePayrollObj.id.toString();
  }
  makeServiceCall(methodCall, postURL, true, employeePayrollObj)
    .then(responseText => {
      resetForm();
      window.location.replace(site_properties.home_page);
    })
    .catch(error => {
      console.error("Server error:", error);
      throw error;
    });
};
