package com.ozerbayraktar.linkedlist

//Doubly linked list
data class Nodee<T:Any>(
    var value:T,
    var next:Nodee<T>?=null,
    var prev:Nodee<T>?=null
) {



}