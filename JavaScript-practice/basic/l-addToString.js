// substring take a part of a string from the first position given
// to the one before last position giver (splice at the sec position )


function addPyToString(someString) {

    if (someString.substring(0,2)==="Py") {
        return someString;
    } else {
        return "Py" + someString;
    }
}


console.log(addPyToString("Python"));
console.log(addPyToString("thon"));



function removeSecChar(someString) {

    if (someString.length >= 2) {

        return someString.substring(0,1) + someString.substring(2,someString.length);
    
    } else {
        return someString;
    }
}

console.log(removeSecChar("blabla"));
console.log(removeSecChar("cat"));
console.log(removeSecChar("a"));