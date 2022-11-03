package com.ozerbayraktar.SortingAndHeap

class HeapSortingAlgorthm {

    fun heapify(arr: ArrayList<Int>, n: Int, i:Int) {
        var largest = i
        var l = 2 * i + 1
        var r = 2 * i + 2

        if (l<n && arr[largest] < arr[l])
            largest=l
        if (r<n && arr[largest] < arr[r])
            largest=r

        if (largest != i) {
            arr[i]=arr[largest].also { arr[largest]=arr[i] }
            heapify(arr,n,largest)
        }
    }

    fun heapSort(arr:ArrayList<Int>): ArrayList<Int> {
        var n=arr.size

        //MAX-HEAP
        for (i in n downTo (0)) {
            heapify(arr,n,i)
        }
        //Swap(arr[0] - > her zaman root, ile i=son elamanı yer değiştiriyoruz.)
        for (i in n - 1 downTo (0)) {
            arr[i]=arr[0].also { arr[0]=arr[i] }
            heapify(arr,i,0)
        }
        return arr

    }
}