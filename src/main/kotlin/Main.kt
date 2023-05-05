fun main(){
    println(details("cynthia",19,"kenya"))
    println(stringLength("mumbua"))
//    myname("Cynthia")
    myName("muema")
    takeVowels("jeniffer")

}
//Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x,
// I am y years old and I am from z.” Where x, y, and z
// are the provided name, age, and country respectively.
fun details(name:String,age:Int,country:String):String{
    return "Hi,my name is $name,i am $age years  old and i am from $country"

}
//Write a function that takes in a String and returns its length
fun stringLength(str:String):Int{
    var str=str.length
    return str
}
//Write a function that takes in a name and prints out
//“That’s me!” when your name is passed to it,
//otherwise, it prints out “I don’t know who that is”
fun myName(name: String){
    if (name==String()){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }

}
//Write a Kotlin function that takes in a string will
// all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output.
fun takeVowels(str:String){
    var vowels="a,e,i,o,u"
    vowels.filter { vowels->str==str }
    var str=str.replace("vowels","*")
    println("Hi,my name is $str")
}


