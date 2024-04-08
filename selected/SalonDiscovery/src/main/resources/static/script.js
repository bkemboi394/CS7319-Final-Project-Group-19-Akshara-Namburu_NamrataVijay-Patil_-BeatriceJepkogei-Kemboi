// Listen for the submit event on the form
document.getElementById("searchForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent the default form submission behavior
    searchSalons(); // Call the searchSalons function when the form is submitted
});

function searchSalons() {
    var zipCode = document.getElementById("zipCode").value;

    fetch("http://localhost:8081/salons?zipCode=" + zipCode) // Use the correct endpoint URL
        .then(response => response.json())
        .then(data => displaySalons(data))
        .catch(error => {
            console.error('Error:', error);
            document.getElementById("salonList").innerHTML = "<p>An error occurred while searching for salons.</p>";
        });
}



function displaySalons(salons) {
    var salonList = document.getElementById("salonList");
    salonList.innerHTML = "";

    if (salons.length === 0) {
        salonList.innerHTML = "<p>No salons found for the entered zip code.</p>";
    } else {
        var ul = document.createElement("ul");
        salons.forEach(function(salon) {
            var li = document.createElement("li");
            var link = document.createElement("a");
            // Assuming the Service Selection project is accessible at localhost:8081
            // and you want to open the service selection in the same window/tab.
            link.href = `http://localhost:8082/service-selection.html?salonId=${salon.id}`;
            link.textContent = salon.name + " - " + salon.address;
            // Optionally, set target="_blank" to open in a new tab/window
            // link.target = "_blank";
            li.appendChild(link);
            ul.appendChild(li);
        });
        salonList.appendChild(ul);
    }
}
