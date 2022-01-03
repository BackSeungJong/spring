function checkInfo(form){
    const id = form.id.value;
    const pw = form.pw.value;
    if(id === "" || pw === ""){
        alert("모든 필드는 필수값입니다.");
    }
    else{
        const log = form.id.value;
        sessionStorage.setItem("log", log);
        form.submit();
    }
}

