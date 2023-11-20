package com.main;

import java.util.Arrays;

public class App4 {

  public static void main(String[] args) {
    char[] vowels = new char[] { 'a', 'e', 'i', 'o', 'u' };

    System.out.println(Arrays.toString(vowels));
    System.out.println("Length of 'vowels' array: " + vowels.length);

    char[] jumbledVowels = new char[] { 'o', 'e', 'a', 'u', 'i' };

    System.out.println(
      "Jumbled Vowels Before Sorting: " + Arrays.toString(jumbledVowels)
    );

    Arrays.sort(jumbledVowels);

    System.out.println(
      "Jumbled Vowels After Sorting: " + Arrays.toString(jumbledVowels)
    );

    char[] jumbledVowels2 = new char[] { 'o', 'e', 'a', 'u', 'i' };

    Arrays.sort(jumbledVowels2, 1, 4);
    System.out.printf(
      "Partial Sorting of 'vowels' Array: %s\n",
      Arrays.toString(jumbledVowels2)
    );

    String[] array1 = { "SKN", "Wang So" };
    String[] array2 = { "SKN", "Wang So" };

    boolean check = array1 == array2;

    System.out.printf("array1 is equal to array2: %b\n", check); // returns false

    String string1 = "SKN";
    String string2 = "SKN";

    boolean check2 = string1 == string2;

    System.out.printf("string1 is equal to string2: %b\n", check2); // returns true
    // Array is recognised with reference that's why two equal array even if their contents are same, aren't same at all.

    char[] vowels2 = { 'e', 'o', 'u', 'i', 'a' };
    Arrays.sort(vowels2);

    // To use Array's Binary Search Method, The Array Must Be Sorted!!!
    int startingIndex = 0;
    int endingIndex = 4;

    int foundIndex = Arrays.binarySearch(
      vowels2,
      startingIndex,
      endingIndex,
      'u'
    );

    System.out.printf("vowels2: %s\n", Arrays.toString(vowels2));
    System.out.printf("'u' is found in %d\n", foundIndex);

    Arrays.fill(vowels2, 1, 3, 'x');
    System.out.printf("vowels2: %s\n", Arrays.toString(vowels2));

    //* Array Aliases
    // To create an alias of an array, just use an assignment operator
    //! WARNING: Don't use this way as a way to copy an array
    int[] numbers = { 1, 2, 3, 4, 5 };
    int[] numbers2 = numbers;

    //Arrays.fill(numbers, 0);

    System.out.printf("numbers Array: %s\n", Arrays.toString(numbers));
    System.out.printf("numbers2 Array: %s\n", Arrays.toString(numbers2));

    //* Array Copying
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int[] nums2 = Arrays.copyOf(nums, nums.length);
    int[] nums3 = Arrays.copyOf(nums, nums.length + 3);
    int[] nums4 = Arrays.copyOf(nums, nums.length - 2);

    Arrays.fill(nums, 0);

    System.out.printf("nums1: %s\n", Arrays.toString(nums));
    System.out.printf("nums2: %s\n", Arrays.toString(nums2));
    System.out.printf("nums3: %s\n", Arrays.toString(nums3));
    System.out.printf("nums4: %s\n", Arrays.toString(nums4));

    // Copying With first & last indices
    int[] nums5 = Arrays.copyOfRange(nums2, 1, 5);
    int[] nums6 = Arrays.copyOfRange(nums2, 1, 9);

    System.out.printf("nums5: %s\n", Arrays.toString(nums5));
    System.out.printf("nums6: %s\n", Arrays.toString(nums6));

    // Equality Check
    int[] nums7 = Arrays.copyOf(nums2, nums2.length);

    System.out.printf("nums2: %s\n", Arrays.toString(nums2));
    System.out.printf("nums7: %s\n", Arrays.toString(nums7));
    System.out.println(nums2 == nums7); // returns false even if they are same. Arrays shouldn't be compared like this
    System.out.println(Arrays.equals(nums2, nums7)); //returns true

    //* Array Print
    // Must use Arrays.toString() method to print an array
    // ArrayList can be printed directly
    String[] skn = { "SKN", "Wang So", "Akaza" };

    System.out.printf("skn Array: %s\n", Arrays.toString(skn));
  }
}
