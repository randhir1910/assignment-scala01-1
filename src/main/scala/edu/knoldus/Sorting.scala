package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    var j, key = 0;
    for (i <- 1 to array.length - 1) {
      key = array(i)
      j = i - 1;
      while (j >= 0 && array(j) > key) {
        array(j + 1) = array(j)
        j = j - 1
      }
      array(j + 1) = key
    }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for (x <- 0 until array.length - 1) {
      var temp = x
      for (j <- x + 1 to array.length - 1) {
        if (array(temp) > array(j)) {
          temp = j
        }
      }
      val temp1 = array(x)
      array(x) = array(temp)
      array(temp) = temp1
    }
    array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for (x <- 0 until array.length - 1) {
      for (j <- 0 until array.length - x - 1) {
        if (array(j) > array(j + 1)) {
          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
    }
    array
  }

}
