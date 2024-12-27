function fetchOrders() {
    const apiUrl = "http://localhost:8083/orders/all";

    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error("Network response was not ok " + response.statusText);
            }
            return response.json();
        })
        .then(data => {
            console.log("Fetched Orders:", data);
            const tableBody = document.getElementById("orderTableBody");
            tableBody.innerHTML = "";

            if (data.length === 0) {
                console.log("No orders to display.");
                return;
            }


            data.forEach(order => {
                const row = `
                    <tr>
                        <td>${order.id}</td>
                        <td>${order.customerId}</td>
                        <td>${order.bookId}</td>
                        <td>${order.quantity}</td>
                    </tr>
                `;
                tableBody.insertAdjacentHTML("beforeend", row);
            });
        })
        .catch(error => {
            console.error("Error fetching orders:", error);
        });
}