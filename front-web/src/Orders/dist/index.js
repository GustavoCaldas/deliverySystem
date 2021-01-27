"use strict";
exports.__esModule = true;
var react_1 = require("react");
var ProductsList_1 = require("./ProductsList");
var StepsHeader_1 = require("./StepsHeader");
require("./styles.css");
function Orders() {
    react_1.useEffect(function () {
    }, []);
    return (React.createElement("div", { className: "orders-container" },
        React.createElement(StepsHeader_1["default"], null),
        React.createElement(ProductsList_1["default"], null)));
}
exports["default"] = Orders;
