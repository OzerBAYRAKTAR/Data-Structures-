package com.ozerbayraktar.SortingAndHeap

class Graph<T> {

    var adjDict: HashMap<T,HashSet<T>> = HashMap()

    /*
    fun addVertex(vertex:Int):Boolean {

        if (vertex !in adjDict.keys) {
            adjDict[vertex]= ("")
            return true
        }
        return false

    }
    */
    fun addEdge(sourceVertex: T, destinationVertex: T):Boolean {
        if (sourceVertex !in adjDict.keys && destinationVertex !in adjDict.keys){
       adjDict
           .computeIfAbsent(sourceVertex) {HashSet()}
           .add(destinationVertex)
        adjDict
            .computeIfAbsent(destinationVertex) {HashSet()}
            .add(sourceVertex)
            return true
        }
        return false
    }
    /*
    fun removeEdge(v1:Any,v2:Any):Boolean {
        if (v1 in adjDict.keys && v2 in adjDict.keys) {
            try {
                adjDict[v1]?.drop(v2 as Int)
                adjDict[v2]?.drop(v1 as Int)
            } catch (e: Exception) {
                error("error")
            }
            return true
        }
        return false


    }
    fun removeVertex(vertex: Any) {
        if (vertex in adjDict) {


        }
    }
    */
    fun printGraph() {
        for (vertex in adjDict) {
            println("$vertex -> $adjDict[vertex]")
        }
    }

   /* override fun toString(): String =StringBuffer().apply{
        for (key in adjDict.keys) {
            append("$key ->")
            append(adjDict[key]?.joinToString(",","[","]\n"))
        }
    }.toString()

    */


}