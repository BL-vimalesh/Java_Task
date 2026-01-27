  <script>
    // Utility function
    function makeServiceCall(method, url, async = true, data = null) {
      return new Promise((resolve, reject) => {
        const xhr = new XMLHttpRequest();
        xhr.open(method, url, async);
        xhr.setRequestHeader("Content-Type", "application/json");
        xhr.onload = () => {
          if (xhr.status.toString().startsWith("2")) {
            resolve(xhr.responseText);
          } else {
            reject({ status: xhr.status, statusText: xhr.statusText });
          }
        };
        xhr.onerror = () => reject({ status: xhr.status, statusText: xhr.statusText });
        xhr.send(data ? JSON.stringify(data) : null);
      });
    }

    // GET
    const getElem = document.querySelector("#get_services");
    const getURL = "http://127.0.0.1:3000/EmployeePayrollDB/1";
    makeServiceCall("GET", getURL, true)
      .then(responseText => {
        getElem.textContent = "Get User Data: " + responseText;
      })
      .catch(error => {
        getElem.textContent = "GET Error Status: " + JSON.stringify(error);
      });

    // DELETE
    const deleteElem = document.querySelector("#delete_services");
    const deleteURL = "http://127.0.0.1:3000/EmployeePayrollDB/3";
    makeServiceCall("DELETE", deleteURL, false)
      .then(responseText => {
        deleteElem.textContent = "Delete Data: " + responseText;
      })
      .catch(error => {
        deleteElem.textContent = "DELETE Error Status: " + JSON.stringify(error);
      });

    // POST
    const empPayrollData = {
      _name: 'Amrapa Shashanka Keerthi Kumar',
      _gender: 'female',
      _department: ['Sales'],
      _salary: '400000',
      _startDate: '29 Oct 2019',
      _note: '',
      _profilePic: '../assets/profile-images/Ellipse -1.png'
    };

    const postElem = document.querySelector("#post_services");
    const postURL = "http://127.0.0.1:3000/EmployeePayrollDB/";
    makeServiceCall("POST", postURL, true, empPayrollData)
      .then(responseText => {
        postElem.textContent = "New User Data: " + responseText;
      })
      .catch(error => {
        postElem.textContent = "POST Error Status: " + JSON.stringify(error);
      });
  </script>
</body>
</html>
