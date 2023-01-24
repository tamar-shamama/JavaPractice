function toNextLetter(str) {

    var arr = str.split("");

    for (let i = 0; i < arr.length; i++) {
        
        if (arr[i] === "z") {
            arr[i] = "a";

        } else if (arr[i] === "Z") {
            arr[i] = "A";
        
        } else {
            let newCharAsCode = arr[i].charCodeAt(0) + 1;
            arr[i] = String.fromCharCode(newCharAsCode);
        }
    }
    return arr.join("");
}

console.log(toNextLetter("abcde"));
console.log(toNextLetter("a1b2c3"));
console.log(toNextLetter("ab yz"));