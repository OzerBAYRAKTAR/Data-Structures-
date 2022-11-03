package com.ozerbayraktar.linkedlist

fun main() {




    val node1 = Node(1)
    val node2 = Node(5)
    val node3 = Node(7)

    node1.next=node2
    node2.next=node3

    //println(node1)


    val list=Node(1,next=Node(2,next=Node(3,next=Node(4,next=Node(5)))))



    /*
    var x = Nodee(5)
    var y = Nodee(10)
    var z = Nodee(15)

    x.next=y
    y.prev=x

    y.next=z
    z.prev=y
    println(x.next!!.next!!.value)

     */




}