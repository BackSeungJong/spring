const log = sessionStorage.getItem("log");
console.log(log);

if (log === null) {
    location.href = "/";
}

window.onload = () =>
{
    $('span#log').append(`${log}님 환영합니다!`);
}

function logout() {
    sessionStorage.removeItem("log");
    location.href = "/";

}