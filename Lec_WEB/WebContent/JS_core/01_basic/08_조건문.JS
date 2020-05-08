


a= 100;


if(a + 1 > 100){
    let a = 10;
    console.log('if 안의 a 값은 ' + a)
}


// Falsy 로 평가될때!
// false, 0, '', null, undefine, NaN   <-- 'Falsy 한 값'이라 한다

// Truthy 로 평가될때
// true, 37, 'Mark', {}, []   <-- 'Truthy 한 값' 이라 한다



function print(data){
    if(data){   //참(truthy) 거짓(Falsy) 판정
        console.log(data, typeof data), '---truthy'
        
    }else{
        console.log(data, typeof data), '---flasy'

    }
}

print(true)
print(false)
print(100)  // T
print(0)  // F
print(-1)  // T 
print('hello') // T
print("") // F
print([10, 20, 30])  // T
print([])  // T  , ★ 파이썬 과는 다르다!
print({'name' : 'John', 'age': 32})  // T
print({}) // T  , ★ 파이썬 과는 다르다!
print(null)
print(undefined)
print(NaN)
console.log(100 / 0)  // Infinity
print(100 / 0)  // T
print()  // 호출시 전달인자 없으면 undefined 값으로 동작함

console.log()
// Falsy 값에 ! 결과 => true (boolean)
console.log(!undefined)
console.log(!null)
console.log(!0)
console.log(!"")
console.log(!NaN)

// Truthy 값에 ! 결과 => false (boolean)
console.log(!3)
console.log(!"Hello")
console.log(!" ")
console.log(![10, 20, 30])
console.log(![])
console.log(!{})


// Truthy, Falsy 판정결과--> boolean 
// 1. 삼항연산자 사용

let value ={'a' : 100}
let istrue = value ? true : false;
console.log('istrue = ', istrue)

// 2. !! 사용하면 가능
istrue = !!value
console.log('istrue = ', istrue)

console.log()

function printName(person){
    console.log('이름은', person.name)
}

let myBrother = {name : "John"}

printName(myBrother)
// printName()  undifined 값이 person 에 넘겨짐

//함수 정의 할때 매개변수 체크 필요
function printName(person){
    
    if(person === undefined || person === null) return;

    console.log('이름은', person.name)
}


















console.log("\n프로그램종료\n\n\n\n\n\n\n\n\n\n\n");



























