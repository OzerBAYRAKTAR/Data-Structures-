package com.ozerbayraktar.stackqueuedeque

class QueueClass {

    var elements = mutableListOf<Any>()

    fun isEmpty() : Boolean {
        return elements.isEmpty()
    }
    fun enqueue(element: Any) {
        elements.add(element)

    }
    fun dequeue() {
            elements.removeLast()
    }
    fun size(): Int {
        return elements.size
    }
}