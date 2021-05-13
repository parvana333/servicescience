const ADD_USER_ENDPOINT = "http://localhost:8080"+ "/user/save";

$("#addUser").on("click", ()=>{
    console.log("sdfghj")
    let user={
        name: $("#name").val(),
        surname:$("#username").val(),
        occupation:$("#occupation").val(),
        email:$("email").val(),
        password:$("#password").val()
    }

    $.ajax({
        url:ADD_USER_ENDPOINT,
        method:"POST",
        dataType:"json",
        contentType:"application/json",
        data: JSON.stringify(user),

        succes:(data)=>{
            window.location.replace(ADD_USER_ENDPOINT)

        }


    });


})