const submitButton = document.querySelector("#submit");

submitButton.addEventListener("click", function() {
    const text = document.querySelector("#text").value;
    const sub = document.querySelector("#sub").value;
    const decipher = document.querySelector("#decipher").checked;
    if(!text || !sub) {
        document.getElementById("result").textContent = "Miski on puudu.";
        return;
    }
    const xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("result").textContent = xhttp.responseText;
        }
    };
    xhttp.open("GET", `subcipher/${text}/${sub}/${decipher}`, true);
    xhttp.send();
});