package com.ozerbayraktar.SortingAndHeap

class InsertionSort {

    fun insertSort(arr: ArrayList<Int>): ArrayList<Int> {
        for (i in 1 until arr.size-1) {
            val temp=arr[i]
            var ji = i - 1
            while (temp < arr[ ji ] ) {
                arr[ji+1]=arr[ji]
                arr[ji]=temp
                ji-=1
            }
        }
        return arr
    }
}