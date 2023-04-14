let prompt = require("prompt-sync")();

function binaryToDecimal(binary){
    let decimal = 0;
    let powerOfTwo = 1;

    while (binary > 0){
        let digit = binary % 10;
        decimal += digit * powerOfTwo;
        powerOfTwo *= 2;
        binary = Math.floor(binary/10);
    }
    return decimal;
}
let binary = prompt("Enter a binary number: ");
let decimal = binaryToDecimal(binary);
console.log("Decimal equivalent: " + decimal);

