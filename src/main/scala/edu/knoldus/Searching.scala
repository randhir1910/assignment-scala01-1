package edu.knoldus

class Searching {
  def binarySearch1(list: Array[Int], left: Int, right: Int, element: Int): Boolean = {
    if (right >= left) {
      val mid: Int = left + (right - left) / 2;
      if (element == list(mid))
        return true
      if (element < list(mid))
        return binarySearch1(list, left, mid - 1, element)
      else
        return binarySearch1(list, mid + 1, right, element)
    }
    false
  }

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    var obj = new Searching
    return obj.binarySearch1(array, 0, array.length - 1, elem);
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    for (x <- array) {
      if (elem == x) {
        return true
      }
    }
    false

  }


}
