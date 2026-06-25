const stocks = [
    { name: "Apple", price: 212.45 },
    { name: "Microsoft", price: 498.10 },
    { name: "Google", price: 183.72 },
    { name: "Amazon", price: 224.11 },
    { name: "Tesla", price: 318.55 },
    { name: "NVIDIA", price: 162.48 }
];

function buyStock() {

    const company =
        document.getElementById("company").value;

    const quantity =
        parseInt(
            document.getElementById("quantity").value
        );

    if (!quantity || quantity <= 0) {
        alert("Enter valid quantity");
        return;
    }

    let portfolio =
        JSON.parse(
            localStorage.getItem("portfolio")
        ) || {};

    portfolio[company] =
        (portfolio[company] || 0) + quantity;

    localStorage.setItem(
        "portfolio",
        JSON.stringify(portfolio)
    );

    alert(
        quantity +
        " shares of " +
        company +
        " purchased successfully!"
    );
}

window.onload = function () {

    const ctx =
        document.getElementById(
            "stockChart"
        );

    new Chart(ctx, {

        type: "line",

        data: {

            labels: [
                "Jan",
                "Feb",
                "Mar",
                "Apr",
                "May",
                "Jun",
                "Jul"
            ],

            datasets: [

                {
                    label: "Apple",

                    data: [
                        180,
                        185,
                        190,
                        200,
                        205,
                        210,
                        212
                    ],

                    borderColor: "#38bdf8",

                    tension: 0.4
                },

                {
                    label: "Microsoft",

                    data: [
                        420,
                        430,
                        445,
                        460,
                        475,
                        490,
                        498
                    ],

                    borderColor: "#22c55e",

                    tension: 0.4
                }

            ]
        },

        options: {

            responsive: true,

            plugins: {

                title: {

                    display: true,

                    text:
                        "Stock Growth Simulation"
                }
            }
        }
    });
};