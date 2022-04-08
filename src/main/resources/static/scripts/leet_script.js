const submitButton = document.querySelector("#submit");

submitButton.addEventListener("click", function() {
    const text = document.querySelector("#text").value;
    if(!text) {
        document.getElementById("result").textContent = "Miski on puudu.";
        return;
    }
    const xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4 && this.status === 200) {
            document.getElementById("result").textContent = xhttp.responseText;
        }
    };
    xhttp.open("GET", `Leetcodecipher/${text}`, true);
    xhttp.send();
});