//var, let, const

//var를 사용한 변수 선언
var a = 100;
console.log('a = '+a)

a = 200;
console.log('a = '+a)

var a = 500;    //중복 선언 가능
console.log('a = '+a)

let value = 177;
console.log('value = ' + value)

value = 555;
console.log('value = ' + value)

// let value = 222;    let 은 중복 선언 불가
const b = 1;
console.log('b = ' + b)
// b = 2;   오류 const 는 값을 바꿀수없다


//var 은 오늘날 JS 환경에서는 그닥 권장하진 않음.
// var 와 let
// IE9, IE10  와 같은 구형 브라우저에서는
//  let, const 를 사용 못함.

// 개발 단계에서는 '바벨' 등을 사용하여
// 우리가 개발한 코드가 구형 브라우저 에서동 동작케 함.

let c;
c = 200;    // 초기화를 따로 해도 가능

// ` : back tick
console.log(`c = ${c}`);    //Template Literal (ES6 <=)

let value2 = 100;   //number 타입

console.log(value2, typeof value2)  //typeof 연산자 : 변수의 타입을 보여줌

//JS 는 대입되는 값에 따라서 타입 바뀜
value2 = "hello"    //string 타입

console.log(value2, typeof value2) 

value2 = 'hello'    // "~~"     '~~' 둘다 가능
















