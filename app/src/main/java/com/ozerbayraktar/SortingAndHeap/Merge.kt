package com.ozerbayraktar.SortingAndHeap

class Merge {


    fun merge(arr1: List<Int>, arr2: List<Int>): List<Int> {
        var fp=0
        var sp=0

        var mergedList : MutableList<Int> = mutableListOf()

        while (fp < arr1.count() && sp < arr2.count()) {
            if (arr1[fp] <= arr2[sp]) {
                mergedList.add(arr1[fp])
                fp++
            } else {
                mergedList.add(arr2[sp])
                sp++
            }
        }
        while (fp < arr1.size) {
            mergedList.add(arr1[fp])
            fp++
        }
        while (sp < arr2.size) {
            mergedList.add(arr2[sp])
            sp++
        }
        return mergedList

    }

    fun mergeSort(arr: List<Int>) : List<Int> {

        if (arr.size <= 1) {
            return arr
        }
        val midPoint=(arr.size)/2
        val leftPart=arr.subList(0,midPoint)
        val rightPart=arr.subList(midPoint,arr.size)

        return merge(mergeSort(leftPart),mergeSort(rightPart))


    }
}