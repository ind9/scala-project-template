package com.indix.hdfs.spike


object CheckFunction extends App {

  def solve(s: String): Int =  {
    val lookup = Array(6,2,5,5,4,5,6,3,7,6)
    s.foldLeft(0)((res, c) => res + lookup(c - '0'))
  }
}