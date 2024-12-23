// Function to fetch customer data and populate the table
function fetchCustomers() {
    // API endpoint for CustomerService
    const customerApiUrl = "http://localhost:8082/customers/all"; // Adjust if CustomerService runs on a different port

    // Fetch the customer data
    fetch(customerApiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok " + response.statusText);
            }
            return response.json();
        })
        .then(data => {
            // Populate the customer table with the fetched data
            const customerTableBody = document.getElementById("customerTableBody");
            customerTableBody.innerHTML = ""; // Clear any existing data

            data.forEach(customer => {
                const row = `
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.name}</td>
                        <td>${customer.email}</td>
                    </tr>
                `;
                customerTableBody.insertAdjacentHTML("beforeend", row);
            });
        })
        .catch(error => {
            console.error("Error fetching customers:", error);
        });
}

// Call the function when the page loads
window.onload = function () {
    fetchOrders(); // Fetch and display order data
    fetchCustomers(); // Fetch and display customer data
};