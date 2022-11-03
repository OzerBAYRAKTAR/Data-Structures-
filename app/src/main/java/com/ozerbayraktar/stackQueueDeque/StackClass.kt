package com.ozerbayraktar.stackqueuedeque

import java.util.*


class StackClass {
    var elements= mutableListOf<Any>()
    var myQueue:Deque<Int> = LinkedList()


    fun isEmpty() :Boolean{

        return elements.isEmpty()
    }

    fun Push(item: Any): List<Any> {

        elements.plus(item)
        return elements
    }

    fun Pop():List<Any> {
        elements.dropLast(1)
        return elements

    }
    fun showLast() : Any {
        return elements.lastIndexOf(elements)
    }
    fun size() :Any{
        return elements.size
    }

    //-1 e kadar git tüm elemanları al başa ekle , son elemanı at.
    fun popup(): Int {
        for (i in 0..myQueue.size - 1) {
            myQueue.add(myQueue.pop())
        }
        return myQueue.pop()


    }


}