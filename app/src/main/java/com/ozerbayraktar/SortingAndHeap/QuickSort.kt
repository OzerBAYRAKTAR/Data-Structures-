package com.ozerbayraktar.SortingAndHeap

class QuickSort {
    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if(low < high) {
            val pivot: Int = partition(arr, low, high)
            quickSort(arr, low, pivot)
            quickSort(arr, pivot + 1, high)
        }
    }

    fun partition(arr: IntArray, low: Int, high: Int): Int {

        val pivot = arr[low]
        var i: Int = low
        var j: Int = high

        while(i < j) {
            while(arr[i] <= pivot && i < high) {
                i++
            }

            while(arr[j] > pivot && j > low) {
                j--
            }

            if(i < j) {
                val temp: Int = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        arr[low] = arr[j]
        arr[j] = pivot

        return j
    }

    fun printArray(arr: IntArray) {
        val lastIndex: Int = arr.size - 1
        for (i in 0..lastIndex) {
            val num = arr[i]
            print("$num ")
        }
        println("")
    }
}