package com.ozerbayraktar.SortingAndHeap

class TwoSum {

    var myList= mutableListOf<Int>(2,7,11,15,20,25,35,45)

    fun twoSum(nums: IntArray, target: Int): IntArray? {

        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val number=target-nums[i]
            if (map.contains(number)) {

                //map[number] gives us first index,and second index is i
                return intArrayOf(map[number]!!,i)
            }else{
                //eğer bu değer listede yoksa, targettan çıkardığımız değeri map'in içine koy, yanına da indexi koy.
                map.put(nums[i],i)
            }



        }
        return intArrayOf()

    }

}


