const registerButton = document.querySelector(".btnSC");

registerButton.onclick = () => {
    const accountInputs = document.querySelectorAll(".serve");
    
    let user = {
        reservationName: accountInputs[0].value,
        familyName: accountInputs[1].value,
        firstName: accountInputs[2].value,
        phone: accountInputs[3].value,
        phone2: accountInputs[4].value
    }

    $.ajax({
        async: false,                      
        type: "post",                       
        url: "/api/booking/reserve",       
        contentType: "application/json",  
        data: JSON.stringify(user),        
        dataType: "json",                  
        success: (response) => {                                                   
            alert("결제 요청 성공");
            console.log(response);
        },
        error: (error) => {                 
            alert("결제 요청 실패");
            console.log(error.responseJSON.data);
            loadErrorMessage(error.responseJSON.data)
        }
    });

}

function loadErrorMessage(error) {
    const errorList = document.querySelector(".error");
    const errorMsg = document.querySelector(".error-msg");
    const errorArray = Object.values(error);

    errorMsg.innerHTML = "";

    errorArray.forEach(error => {
        errorMsg.innerHTML += `
            <li>${error}</li>
        `;
    });

    errorList.classList.remove("error-invisible");
}