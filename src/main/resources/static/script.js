const apiUrl = "/api/fabrications";

document.addEventListener("DOMContentLoaded", () => {
    loadItems();

    document.getElementById("fabricationForm").addEventListener("submit", async (e) => {
        e.preventDefault();
        const item = {
			customerName:document.getElementById("customerName").value,
            itemName: document.getElementById("itemName").value,           
            quantity: parseInt(document.getElementById("quantity").value)
        };
        await fetch(apiUrl, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(item)
        });
        e.target.reset();
        loadItems();
    });
});

async function loadItems() {
    const response = await fetch(apiUrl);
    const items = await response.json();

    const tbody = document.querySelector("#fabTable tbody");
    tbody.innerHTML = "";

    items.forEach(item => {
        const tr = document.createElement("tr");
        tr.innerHTML = `
            <td>${item.id}</td>
			<td>${item.customerName}</td>
            <td>${item.itemName}</td>            
            <td>${item.quantity}</td>
            <td>
                <button onclick="deleteItem(${item.id})">Delete</button>
            </td>
        `;
        tbody.appendChild(tr);
    });
}

async function deleteItem(id) {
    await fetch(`${apiUrl}/${id}`, {
        method: "DELETE"
    });
    loadItems();
}
