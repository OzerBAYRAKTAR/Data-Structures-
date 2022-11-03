package com.ozerbayraktar.tree

class fibonacci {

    fun fib(n: Int): Int {
        if(n<=0){
            return 0
        }
         if (n == 1 || n == 2) {
            return 1
        } else {
            fib(n - 1) + fib(n - 2)
        }
        return fib(n)

    }
    fun fibIterative(n: Int):Int {
        var x=0
        var y=1
        for (i in 1..n) {
            var temp=x
            x=y
            y=temp+y
        }
        return x
    }

}