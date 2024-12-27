// Function to fetch customer data and populate the table
function fetchCustomers() {
    const customerApiUrl = "http://localhost:8082/customers/all"
    fetch(customerApiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok " + response.statusText);
            }
            return response.json();
        })
        .then(data => {
            const customerTableBody = document.getElementById("customerTableBody");
            customerTableBody.innerHTML = "";

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


window.onload = function () {
    fetchOrders();
    fetchCustomers();
};