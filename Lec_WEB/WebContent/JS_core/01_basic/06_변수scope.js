// 변수의 유효범위
// scope

// const, let 의 유효범위
//  ==> Block Scope
//    { ... }

// 블럭
{
    const name = 'Mark'  // 블럭 안에서만 사용가능
    console.log(`name = ${name}`)
}
// 블럭 밖에서 사용하려 하면 에러!
//console.log(`name = ${name}`)

{
    //console.log('name2 = ', name2) // 초기화 안되었다고 에러!
    const name2 = 'Mark'
}

{  // Block scope 를 가진 변수는 Block 내에서 사용 가능. 
    console.log('value1 = ', value1);   // 에러는 아니다, undefined 가 나올뿐.
    var value1 = 200;

    //console.log('value2 = ', value2);   // 에러! 선언 된 적이 없을뿐
}

// Hoisting
// https://developer.mozilla.org/ko/docs/Glossary/Hoisting

// 이러한 현상을 hoisting 이라 하는데
// hoisting 현상은 함수에서만 발생하는게 아니다.

// hoising 
// 아래에 있는 선언을(만) 끌어올린다.

// hoising 때문에 동작의 오류처럼 보이는 증상 겪게 됨

// hoising 현상은 처음부터 있었으나
// 용어 자체는 ES2015 및 그 이전에는 사용되지 않음


