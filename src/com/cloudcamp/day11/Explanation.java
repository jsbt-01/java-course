package com.cloudcamp.day11;

public class Explanation {

  /**
   *
   *
   * 0 1 2 3 4 5 6 7 8 9
   * 3 3 3 3 3 3 3 3
   *
   * give me an element from position 5
   *
   * ADD = CREATE
   * FIND = SEARCH
   * REMOVE = DELETE
   *
   * ArrayList/array
   * ADD -> always at the end
   *
   * FIND ->
   *      find by position = fast
   *      find by element = slow {first we ll find position then get element}
   *
   * REMOVE
   *      Slow operation, because it involves left shifting the elements after removing one in middle
   *
   *
   * promising of arrayList
   *  1. Growable in nature
   *  2. Adding elements is fast
   *  3. finding by position is fast
   *  4. insertion order is preserved
   *  5. duplicates are stored
   *
   *
   * Not promising
   *  1. Searching by element very slow
   *  2. removing an element is slow
   *  3. No guarantee on removing duplicates
   *
   * 0  1 2 3 4  5  6 7 8 9   = 10 positions
   *            15
   *    7
   *
   * insert element 15
   * 15 * 3 = 45
   *
   * 45 % size of array (10) = 5
   *
   * insert element 7
   * 7 * 3 = 21     hashing * prime numbers
   * 21 % 10 = 1     hash to index
   *
   * search 15?
   * 15 * 3 = 45
   * 45 % 10 = 5
   * what is there in 5th position? 15
   *
   * insert element 15
   * 15 * 3 = 45
   * 45 % 10 = 5
   *
   *
   */




}
