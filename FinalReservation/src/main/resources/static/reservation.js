document.addEventListener('DOMContentLoaded', function() {
    const urlParams = new URLSearchParams(window.location.search);
    const sessionId = urlParams.get('sessionId'); // Assume sessionId is passed as a URL query parameter

    if (!sessionId) {
        console.error('Session ID is missing');
        // Handle missing session ID appropriately
        return;
    }

    const servicesList = document.getElementById('selectedServicesList');

    // Adjusted URL to match the provided server-side endpoint
    fetch(`http://localhost:8082/session/servicesForSession/{{sessionId}}`) // Corrected endpoint
        .then(response => response.json())
        .then(services => {
            services.forEach(service => {
                const listItem = document.createElement('li');
                // Adjust to match your SalonService object structure
                listItem.textContent = `${service.name} - $${service.price}`; // Assuming `name` and `price` are the correct properties
                servicesList.appendChild(listItem);
            });
        })
        .catch(error => console.error('Failed to load selected services:', error));

    const form = document.getElementById('reservationForm');
    form.onsubmit = function(event) {
        event.preventDefault();

        const reservationData = {
            customerName: document.getElementById('name').value,
            contact: document.getElementById('contact').value,
            dateTime: document.getElementById('dateTime').value,
            sessionId: sessionId // Include the session ID in the reservation
        };

        // The URL is correct as per your server-side setup
        fetch('/reservations', {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify(reservationData)
        })
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok.');
                }
                return response.json();
            })
            .then(data => {
                alert('Reservation submitted successfully.');
                // Additional success logic here
            })
            .catch(error => {
                console.error('Failed to submit reservation:', error);
                alert('Failed to submit reservation.');
            });

    }

});
