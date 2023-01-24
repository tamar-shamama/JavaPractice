function reverseStr (str) {

    var newStr = "";

    for (let i = str.length-1; i >= 0; i--) {
        newStr += str[i];
    }
    return newStr;
}

console.log(reverseStr("abcde"));
console.log(reverseStr("the cat in the hat"));



function reverseStr2(str) {
    return str.split("").reverse().join("");
}

console.log(reverseStr2("abcde"));