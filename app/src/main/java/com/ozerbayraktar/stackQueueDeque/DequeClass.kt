package com.ozerbayraktar.stackqueuedeque

class DequeClass {

    var elements = mutableListOf<Any>()


    fun addLeft(element: Any) {
        elements.add(0,element)
    }

    fun addRight(element: Any) {
            elements= (elements+mutableListOf(element)) as MutableList<Any>
    }
    fun removeLeft() {
        elements.removeFirst()
    }
    fun removeLast() {
        elements.removeLast()
    }

}