package com.ozerbayraktar.SortingAndHeap

class BubbleSort {

    fun bubleSort(arr: ArrayList<Int>): ArrayList<Int> {
        for (i in 0 until arr.size-1) {
            for (j in 0..i) {
                if (arr[j] > arr[j+1]) {
                    arr[j]=arr[j+1].also { arr[j+1]=arr[j] }
                }
            }

        }
        return arr
    }
}