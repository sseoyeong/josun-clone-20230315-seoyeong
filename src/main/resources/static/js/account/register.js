const loginForwardButton = document.querySelectorAll(".btnSC")[1];

loginForwardButton.onclick = () => {
    location.href = "/account/login";
}

const registerButton = document.querySelectorAll(".btnSC")[2];

registerButton.onclick = () => {
    const accountInputs = document.querySelectorAll(".account-input");
    
    let user = {
        familyName: accountInputs[0].value,
        firstName: accountInputs[1].value,
        email: accountInputs[2].value,
        password: accountInputs[3].value
    }

    $.ajax({
        async: false,                      
        type: "post",                       
        url: "/api/account/register",       
        contentType: "application/json",  
        data: JSON.stringify(user),        
        dataType: "json",                  
        success: (response) => {                                                   
            alert("회원가입 요청 성공");
            console.log(response);
        },
        error: (error) => {                 
            alert("회원가입 요청 실패");
            console.log(error.responseJSON.data);
            loadErrorMessage(error.responseJSON.data)
        }
    });

}

function loadErrorMessage(errors) {
    const errorList = document.querySelector(".errors");
    const errorMsgs = document.querySelector(".error-msgs");
    const errorsArray = Object.values(errors);

    errorMsgs.innerHTML = "";

    errorsArray.forEach(error => {
        errorMsgs.innerHTML += `
            <li>${error}</li>
        `;
    });

    errorList.classList.remove("errors-invisible");
}