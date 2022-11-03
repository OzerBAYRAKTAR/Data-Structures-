package com.ozerbayraktar.stackqueuedeque

import java.util.Stack

class BaseBallGame {

    var myInput = mutableListOf<String>("5", "2", "C", "D", "+")


    fun solution()  {
        val myStack=Stack<Int>()

        for (op in myInput) {
            when (op) {
                "C" -> myStack.removeLast()
                "D" -> myStack.push(myStack.peek()*2)
                "+" -> {
                    val b = myStack.pop()
                    val a = myStack.pop()
                    myStack.push(a)
                    myStack.push(b)
                    myStack.push(a + b)
                }

                else -> myStack.add(op.toInt())
            }
        }
        println(myStack.sum())

    }
    fun calPoints() {
        val stack = Stack<Int>()
        for (op in myInput) {
            when (op) {
                "C" -> stack.pop()
                "D" -> stack.push(stack.peek() * 2)
                "+" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a)
                    stack.push(b)
                    stack.push(a + b)
                }
                else -> stack.push(op.toInt())
            }
        }
         println(stack.sum())
    }
}




