const submitButton = document.querySelector("#submit");

submitButton.addEventListener("click", function() {
    const text = document.querySelector("#text").value;
    const step = document.querySelector("#step").value;
    const decipher = document.querySelector("#decipher").checked;
    if(!text || !step) {
        document.getElementById("result").textContent = "Miski on puudu.";
        return;
    }
    const xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("result").textContent = xhttp.responseText;
        }
    };
    xhttp.open("GET", `caesarcipher/${text}/${step}/${decipher}`, true);
    xhttp.send();
});