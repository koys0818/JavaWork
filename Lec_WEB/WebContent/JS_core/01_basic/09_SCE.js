// 논리연산자
// &&  and 연산자
// ||  or 연산자
// ! not 연산자


console.log(true && true)
console.log(true && false)

let a = 100;
console.log(a > 10 || a+ 10 < 10)
console.log(a < 10 || a + 10 < 10)

console.log(a > 10 && a + 10 < 10)
console.log(a < 10 && a + 10 < 10)

console.log("Hello" || "world")
console.log(0 || "world")

console.log(5 && 100)
console.log(5 && 0)
console.log(null && 'hello')
console.log(100 - 100 && [10, 20, 30])

let n = 15;
(n % 5 === 0) && console.log('5의 배수입니다')

n = 7
(n % 5 === 0) || console.log('5의 배수가 아닙니다')


































