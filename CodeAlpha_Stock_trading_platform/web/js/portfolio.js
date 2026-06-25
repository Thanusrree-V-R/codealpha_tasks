function loadPortfolio() {

    const portfolio =
        JSON.parse(
            localStorage.getItem("portfolio")
        ) || {};

    const table =
        document.getElementById(
            "portfolioTable"
        );

    table.innerHTML = "";

    for (let company in portfolio) {

        const row =
            document.createElement("tr");

        row.innerHTML =
            "<td>" +
            company +
            "</td>" +
            "<td>" +
            portfolio[company] +
            "</td>";

        table.appendChild(row);
    }
}

function sellStock() {

    const company =
        document.getElementById("sellCompany").value;

    const quantity =
        parseInt(
            document.getElementById("sellQuantity").value
        );

    let portfolio =
        JSON.parse(
            localStorage.getItem("portfolio")
        ) || {};

    if (
        !portfolio[company] ||
        portfolio[company] < quantity
    ) {

        alert(
            "Not enough shares available"
        );

        return;
    }

    portfolio[company] -= quantity;

    if (portfolio[company] === 0) {
        delete portfolio[company];
    }

    localStorage.setItem(
        "portfolio",
        JSON.stringify(portfolio)
    );

    loadPortfolio();

    alert("Stock Sold Successfully");
}

window.onload = loadPortfolio;