package com.ozerbayraktar.SortingAndHeap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozerbayraktar.graph.R

class MainActivity : AppCompatActivity() {
    private var myGraph= Graph<Any>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bublesort=BubbleSort()

        val numbers = mutableListOf(38,27,43,3,9,82,10)
        val secList=arrayListOf<Int>(1,6,3,15,2,45,21)
        val insertList=arrayListOf<Int>(1,7,3,35,2,15,61)

       // println(bublesort.bubleSort(myList))

        val selection = SelectionSort()
        //println(selection.selectSort(secList))

        val insert = InsertionSort()
        //println(insert.insertSort(insertList))

        val mergee = Merge()
        println(mergee.mergeSort(numbers))


    }

}