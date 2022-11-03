package com.ozerbayraktar.SortingAndHeap

class SelectionSort {

    fun selectSort(arrr: ArrayList<Int>): ArrayList<Int> {
        for (i in 0 until arrr.size-1) {
            var minIndex=i
            for (j in (i + 1)until arrr.size) {
                if (arrr[j] < arrr[minIndex]) {
                    minIndex = j
                }
            }
            if (i != minIndex) {
                arrr[i]=arrr[minIndex].also { arrr[minIndex]=arrr[i] }

            }
        }
        return arrr
    }
}