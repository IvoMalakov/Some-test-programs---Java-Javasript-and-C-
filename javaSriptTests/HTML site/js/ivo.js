"use strict";

function addPTag () {
    const pElement = document.createElement("p");
    const node = document.createTextNode("Ivo napisa tova s JavaSrcipt");
    pElement.appendChild(node);

    const element = document.getElementById("wrapper");
    element.append(pElement);
}
