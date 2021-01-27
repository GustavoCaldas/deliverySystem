"use strict";
exports.__esModule = true;
var pizza_svg_1 = require("./pizza.svg");
function ProductCard() {
    return (React.createElement("div", { className: "order-card-container" },
        React.createElement("h3", { className: "order-card-title" }, "Pizza Calabresa"),
        React.createElement(pizza_svg_1.ReactComponent, { className: "order-card-image" }),
        React.createElement("h3", { className: "order-card-price" }, "R$ 35.90"),
        React.createElement("div", { className: "order-card-description" },
            React.createElement("h3", null, "Descri\u00E7\u00E3o"),
            React.createElement("p", null, "Descri\u00E7\u00E3o Uma deliciosa combina\u00E7\u00E3o de Lingui\u00E7a Calabresa, rodelas de cebolas frescas, azeitonas pretas, mussarela, polpa de tomate, or\u00E9gano e massa especial."))));
}
exports["default"] = ProductCard;
