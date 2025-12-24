package Array;

public class ArraySyntex {
}
// int [] arr = new int[3]; array declaration with size data type change ho sakta hai int,float,string
// int [] arr = { 12,32,12,43,,22,2} direct declaration with giving the size
//2d array
// int [][] arr = new int[4][3]
// int[][] arr = { {1,2},{3,4},{5,6}} 3 row 4 coloum
// length le liye function hota hai
// sout(name.length)

// array ke elements ko hami index no se use kar sakte hai
// ex arr[0] 1d
// ex arr[0][0] 2d

//for each, pure array pe chalega
//for(int variable : array_name){
//    code
//        }

// shallow copy me referance ki copy banti hai memory ki nahi
// arr1[3]
// int arr2 = arr1[3]  isme referance ki copy ban rahi hai , jab ki address dono ka same hai , ek me change ho ga to dushra bhi change hoga
//Deep copy
//int arr2 = arr1.clone(); is se arr2 ko atual memory allot hogi
// neche bale array library le funtions hai
// int arr2 = Arrays.copyOf(arrayKaName,array ki lenght);
// int arr2 = Arrays.copyOfRange(arrar name,from,to); from include hoga par to exclude hoga

/*
🔥 1. Instance Variable (Non-static variable)

Default type → Non-static hota hai

Example:

class Demo {
    int a;   // non-static (instance variable)
}


✔ Har object ki apni copy hoti hai
✔ Access karne ke liye object banana padta hai
❌ Static method isko direct access nahi kar sakta

🔥 2. Static Variable (Class Variable)

Static variable tabhi banta hai jab explicitly static keyword lagao:

class Demo {
    static int b;  // static variable
}


✔ Puri class me sirf ek copy
✔ Without object access ho sakta hai
✔ Static method isko access kar sakta hai

⭐ Ultimate Rule:
👉 Class ke andar jo variable static keyword ke bina likha ho → NON STATIC hota hai
👉 Static keyword lagane par hi wo static banta hai
✔ Example to Understand
class Car {
    int speed;        // non-static (instance variable)
    static int wheels = 4;  // static (class variable)
}


Agar tum likho:

Car.speed;   // ❌ Error (object chahiye)
Car.wheels;  // ✔ OK

✔ So Answer:
❌ Class ke andar ke variables default se static nahi hote
✔ Default se NON-STATIC (instance variables) hote hain
✔ Static banane ke liye “static” keyword lagana padta hai
 */

//Local Variable
//✔ Method ke andar declare hota hai
//✔ Sirf method ke andar hi use ho sakta hai
//✔ Default value nahi milती
//✔ Use karne se pehle initialize karna zaroori hai