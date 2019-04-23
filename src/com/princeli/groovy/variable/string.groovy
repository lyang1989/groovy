package com.princeli.groovy.variable


//String str = "123"
def str = 'a single string'
println str

println str.class


def str2 = '''\
1
2
3
'''
println str2.class

def str3 = "123"
println str3.class

def name = "gupao"
def str4 = "Hello: ${name}"
println str4

def str5 = "1 add 2 equals ${1 + 2}"
println str5

def result = hello(str3)

String hello(String message){
    return message;
}
println result

def str6 = "grovvy hello"
println str6.center(8,"1")
println str6.padLeft(8,"1")

def str7 = "hello"
println str6 - str7

println str6[0..1]

println str6.reverse()

println str6.capitalize()