console.log('Hello world');

var a = 10;     // number
var b = "Hello"; // String
var c = true; // Boolean

console.log('a: ', a);
console.log('b: ', b);
console.log('c: ', c);

a = 2 + 4; // +, -, *, /, %, ++, --
console.log('Sum: ', a);

a = 10 > 5; // >, <, >=, <=, ==
console.log('a: ', a);

a = 6;
b = '6';

c = a == b; // Number comparing with String without type
console.log('Comparison 1: ', c);

c = a === b; // Number comparing with String with type
console.log('Comparison 2: ', c);

var value = 20;
console.log(`Value: ${value}`); // String interpolation

function sum(a, b) {
  return a + b;
}

var result = sum(10, 20);
console.log('Sum Result: ', result);


function double(a) {
  var temp = a * 2;

  if (true) {
    var sample = 5; // Hoisting
    let val1 = 5;
    val1 = 8;
    const val2 = 7;
    // val2 = 10; ERROR
  }
  console.log('Sample: ', sample);
  // console.log('val1: ', val1); ERROR
  // console.log('val2: ', val2); ERROR

  return temp;
}

result = double(10);
console.log('Double Result: ', result);
// console.log('Temp: ', temp);


// JSON -> JavaScript Object Notation
const p1 = {
  "name": "Rajesh",
  "age": 25,
  "location": "Hyderabad",
  getDoubleOfAge: function () {
    return this.age * 2;
  }
}
console.log('P1: ', p1);
console.log('Age double: ', p1.getDoubleOfAge());
console.log('Name: ', p1.name);
console.log('Age: ', p1['age']);

class Person {
  constructor(firstName, lastName, age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  getFullName() {
    return this.firstName + ' ' + this.lastName;
  }
}

const p2 = new Person('Prashant', 'Kumar', 25);
console.log('P2: ', p2);
console.log('Full name: ', p2.getFullName());


const arr = [10, 20, 30, 40];
console.log('length: ', arr.length);
console.log('Second element: ', arr[1]);

arr.push(50);
console.log('Arr: ', arr);

console.log('Traditional looping');
for(let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}

console.log('Foreach looping');
for(const a of arr) {
  console.log(a);
}

const p3 = {
  "name": "Varun",
  "age": 28,
  "location": "Vizag"
}

console.log('Traversing through the object');
for(const a in p3) {
  console.log(a, ': ', p3[a]);
}

let res1 = null;      // Value missing
let res2 = undefined; // Not even defined
