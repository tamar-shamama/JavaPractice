var phrase = "abcdefg";
console.log("the original phrase is: " + phrase);


// const length = phrase.length;

// var newPhrase = new String();

// newPhrase += phrase[length-1];

// for (i=0; i<length-2; i++) {
//     newPhrase += phrase[i];
// }
    


phrase = phrase[phrase.length-1] + phrase.substring(0, phrase.length-1);

console.log("the rotated phrase is: " + phrase);