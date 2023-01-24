const a = 5;
const b = 6;
const c = 7;

let triangle = {sideA:a, sideB:b, sideC:c};


function findArea() {

    const s = (triangle.sideA + triangle.sideB + triangle.sideC)/2;
    const squerArea = s * (s-triangle.sideA) * (s-triangle.sideB) * (s-triangle.sideC);
    const area = Math.sqrt(squerArea);

    console.log("the area is :" + area);
}

findArea();