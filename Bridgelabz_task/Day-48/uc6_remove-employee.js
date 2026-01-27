const remove = (node) => {
  let empPayrollData = empPayrollList.find(empData => empData.id == node.id);
  if (!empPayrollData) return;

  const index = empPayrollList
    .map(empData => empData.id)
    .indexOf(empPayrollData.id);
  empPayrollList.splice(index, 1);

  if (site_properties.use_local_storage === "true") {
    localStorage.setItem("EmployeePayrollList", JSON.stringify(empPayrollList));
    createInnerHtml(); 
  } else {
    const deleteURL = site_properties.server_url + "/" + empPayrollData.id.toString();
    makeServiceCall("DELETE", deleteURL, false)
      .then(responseText => {
        createInnerHtml(); 
      })
      .catch(error => {
        console.log("DELETE Error Status: " + JSON.stringify(error));
      });
  }
};
