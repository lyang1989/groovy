package com.princeli.groovy.variable

//def clouser = {
//    return  "hello"
//}
//
//println clouser.call()

//def clouser2 = { -> return  "hello ${it}"}
//println clouser2.call("gupao")

//c = {it}
//println c("run")

//def clouser3 = {println item ++}
//clouser3.call()

//int x = 10
//
//int fab(int number){
//    int result = 1
//    1.upto(number,{num -> result *= num})
//    return  result
//}
//
//println fab(5)

//3.times {
//    println it
//}
//
//int cal(int number){
//    int result = 0;
//    number.times {
//        num -> result += num
//    }
//    return result
//}
//
//println cal(5)

//String str = 'abc123'
//str.each {
//    String temp  -> println(temp)
//}
//
//println str.find{
//    String s -> s.isNumber()
//}


//def scriptClourser = {
//    println "scriptClourser this:"+this
//    println "scriptClourser owner:"+owner
//    println "scriptClourser delegate:"+delegate
//
//}
//scriptClourser.call()


//class Person {
//    def static classClouser = {
//        println "scriptClourser this:"+this
//        println "scriptClourser owner:"+owner
//        println "scriptClourser delegate:"+delegate
//    }
//
//    def static say(){
//        def classClouser = {
//            println "scriptClourser this:"+this
//            println "scriptClourser owner:"+owner
//            println "scriptClourser delegate:"+delegate
//        }
//        classClouser.call()
//    }
//}
//
//Person.classClouser.call()
//Person.say()

def nestClouser = {
    def innerClouser = {
            println "innerClouser this:"+this
            println "innerClouser owner:"+owner
            println "innerClouser delegate:"+delegate
    }
    innerClouser.call()

    println "nestClouser this:"+this
    println "nestClouser owner:"+owner
    println "nestClouser delegate:"+delegate
}
nestClouser.call()
