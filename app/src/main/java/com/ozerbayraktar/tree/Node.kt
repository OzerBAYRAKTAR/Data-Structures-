package com.ozerbayraktar.tree

data class Node<T:Comparable<T>>(
    var value:T,
    var left:Node<T>?=null,
    var right:Node<T>?=null

)
    class BinarySearchTree<T:Comparable<T>>{
        private var root:Node<T>?=null


        //insert elemen
        // t to BST ->

        fun insert(input: T) {
            var newNode=Node(input)
            if (root == null) {
                root = newNode
            }
            else {
                var tempNode=root
                while (true) {
                    if(newNode.value==tempNode!!.value)
                        return
                    if (newNode.value > tempNode.value) {
                        if (tempNode.right != null)
                            tempNode = tempNode.right
                         else
                            tempNode.right = newNode
                    } else {
                        if (tempNode.left != null)
                            tempNode=tempNode.left
                        else
                            tempNode.left=newNode

                    }
                }
            }
        }


        fun contains(input: T): Node<T>? {
            var tempNode=root
            while (tempNode != null) {
                if (tempNode==input)
                    return tempNode
                tempNode=if (tempNode.value > input) tempNode.left else tempNode.right
            }
            return null

        }

        fun minOfNode(t: Node<T>?) {
                var currentNode=t
            while (currentNode!!.left != null) {
                currentNode=currentNode.left

            }
        }
        fun maxOfNode(x: Node<T>?) {
            var currentNode=x
            while (currentNode!!.right != null) {
                currentNode=currentNode.right

            }
        }
        fun BFS(): MutableList<Int> {

            var currentNode=root
            var myQueue = mutableListOf<Node<T>>()
            var values = mutableListOf<Int>()

            myQueue.plus(currentNode)

            while (myQueue.size > 0) {

               // currentNode=myQueue.drop(0)
                values.plus(currentNode!!.value)
                if (currentNode.left != null) {
                    myQueue.plus(currentNode.left)
                }
                if (currentNode.right != null) {
                    myQueue.plus(currentNode.right)
                }
            }
            return values
        }
    }


