async function fetchData(serviceType) {
    let url = '';

    // Set the URL based on the selected service
    if (serviceType === 'orders') {
        url = 'http://localhost:8083/orders/all';
    } else if (serviceType === 'customers') {
        url = 'http://localhost:8082/customers/all';
    } else if (serviceType === 'books') {
        url = 'http://localhost:8081/books/all';
    }

    // Fetch data from the selected service
    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Error fetching ${serviceType}`);
        }
        const data = await response.json();
        displayData(serviceType, data); // Call the function to display data in the table
    } catch (error) {
        console.error(error);
        alert('Failed to fetch data. Please try again.');
    }
}

// Function to display data in the table
function displayData(serviceType, data) {
    const tableBody = document.getElementById("data-body");
    tableBody.innerHTML = ''; // Clear previous data

    // Generate rows based on service type
    data.forEach(item => {
        const row = document.createElement("tr");
        let htmlContent = '';

        // Display data differently based on the service type
        if (serviceType === 'orders') {
            htmlContent = `
                <td>${item.id}</td>
                <td>${item.bookId}</td>
                <td>${item.customerId}</td>
                <td>${item.quantity}</td>
            `;
        } else if (serviceType === 'customers') {
            htmlContent = `
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.email}</td>
            `;
        } else if (serviceType === 'books') {
            htmlContent = `
                <td>${item.id}</td>
                <td>${item.author}</td>
                <td>${item.price}</td>
                <td>${item.title}</td>
            `;
        }

        row.innerHTML = htmlContent;
        tableBody.appendChild(row);
    });
}