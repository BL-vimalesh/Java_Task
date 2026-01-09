let max = 0;
let min = 999;   
const LENGTH = 5;

for (let i = 0; i < LENGTH; i++) {
    let random = Math.floor(Math.random() * 900 + 100); 
    console.log(random);

    if (random > max) {
        max = random;
    }
    if (random < min) {
        min = random;
    }
}

console.log("Maximum:", max);
console.log("Minimum:", min);
