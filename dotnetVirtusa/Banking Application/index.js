


//Get All Account Details
var submit = document.getElementById('submit');
submit.addEventListener("click", displayDetails);

var row = 1;
function displayDetails() {
    var name = document.getElementById("custName").value;
    var contact = document.getElementById("custCont").value;
    var gender = document.getElementById("gen").value;
    var address = document.getElementById("Address").value;
    var age = document.getElementById("age").value;
    var email = document.getElementById("email").value;
    var accountType = document.getElementById("AT").value;

    if (!name || !contact || !gender || !address || !age || !email || !accountType) {
       alert("Please fill all the deatils");
       return;
    }

    var display = document.getElementById("display");
    var newRow = display.insertRow(row);
    var cell1 = newRow.insertCell(0);
    var cell2 = newRow.insertCell(1);
    var cell3 = newRow.insertCell(2);
    var cell4 = newRow.insertCell(3);
    var cell5 = newRow.insertCell(4);
    var cell6 = newRow.insertCell(5);
    var cell7 = newRow.insertCell(6);

    cell1.innerHTML = name;
    cell2.innerHTML = contact;
    cell3.innerHTML = gender;
    cell4.innerHTML = address;
    cell5.innerHTML = age;
    cell6.innerHTML = email;
    cell7.innerHTML = accountType;

    row++;

}

//Get All Account Details Display


const GetDetails = document.getElementById('GAD');

    GetDetails.addEventListener('click', () => {
    const table = document.getElementById('table');

    if (table.style.display === 'none') {
        // 👇️ this SHOWS the form
        table.style.display = 'block';
    } else {
        // 👇️ this HIDES the form
        table.style.display = 'none';
    }
});
