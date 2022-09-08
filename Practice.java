public class Practice {
    /*
    /*Part I.
The following questions will require you to use Practice.java, MyString.java, MyIntArray.java,
and Test.java. For each question, an implemented solution is provided for you. This solution is
incorrect. Your job is to figure out the ways in which it is incorrect and fix it. For each question,
you must:
● Write test cases (in Test.java) to figure out why the solution is incorrect
● In a comment above the method (in Practice.java), explain how the initial implementation
is incorrect
● Fix the method in Practice.java
     */


/*1) Write a method called reverseOrder that takes an MyIntArray object as its parameter
and returns a new array in reserved order.
reverseOrder([1, 2, 3, 4, 5]) should return [5, 4, 3, 2, 1]
reverseOrder([]) should return []*/

    /**
     * // * @param MyIntArray arr
     *
     * @return MyIntArray reversedArray: arr in reversed order
     */
    /**
     * Errors in method 1 reversedOrder:
     * the variable reveredArray is not initiated
     * the original array did not take into account of what to do with the element being replaced
     * Hence, the array must be split in half when looped through.
     */

    public static MyIntArray reverseOrder(MyIntArray arr) {
        //the integer variable s is set to the size of arr
        int s = arr.size;
        //object reveredArray is initialized
        MyIntArray reversedArray = new MyIntArray(s);
        //loop through half the array
        for (int i = 0; i < arr.size / 2; i++) {
            //set the variable val to the ith element in the array counting forwards
            int val = arr.get(i);

            //System.out.println(arr.size);
            // System.out.println("size" + arr.size);
            //  for (int j = 0; j < arr.size; j++) {
            // arr.set(arr.size - i - 1, arr.get(i));
            //arr.set(i, v);

            //set variable z to the arr.size minus 1 which will receive the element that is being replaced with val
            int z = (arr.get(arr.size - i - 1));
            //place val in arr.size minus 1
            arr.set(arr.size - i - 1, val);
            //place z in the ith index
            arr.set(i, z);

            //v = arr.get(i);
            // System.out.println("i" + i);
            // System.out.println("x" + x);
            //  System.out.println("val" + val);

            //set reversedArray to the new array
            reversedArray = arr;


            //System.out.println("size" + arr.size);
            //System.out.println("i" +i);
            //System.out.println("val" +v);
            // arr.set(val, arr.size-i-1);

        }


        return reversedArray;

    }


/*2) Write a method called findClumps that takes a MyIntArray object as its parameter and
returns the number of clumps found in the MyIntArray. A clump in an array is a series of 2
or more adjacent elements of the same values.
findClumps([1, 2, 3, 3, 1]) should return 1 since the only clump is 3, 3
findClumps([1, 1, 1, 1, 1]) should return 1 since the only clump is 1, 1, 1, 1, 1
findClumps([1, 1, 2, 1, 1]) should return 2 since there are 2 series of
adjacent 1s in the array.
findClumps([1, 2, 2, 3, 5, 5, 1]) should return 2 since there are 2 clumps -
2, 2, and 5, 5.
*/

    /**
     * // * @param MyIntArray arr
     *
     * @return int clumps : the number of clumps found
     */
    /**
     * // *
     * Errors in method 2 findClumps:
     * int clumps should be set to zero
     * Boolean inClump must be set to True or False
     * the original method did not take into account of if the consecutive value is the same for more than two places
     */


    public static int findClumps(MyIntArray arr) {

        int clumps = 0;
        //int flag = 0;

        //int i = 0;
        for (int i = 0; i < arr.size - 1; i++) {
            Boolean inClump = false;
            while (i < arr.size - 1 && arr.get(i) == arr.get(i + 1)) {
                inClump = true;

                i++;
                // System.out.println("clumps" +clumps);
                // System.out.println("arr.get(i)" + arr.get(i));
                // System.out.println("arr.get(i+1)"+arr.get(i+1));
                // flag += 1;
                // inClump = true;
            }
            if (inClump)
                clumps++;
            //break;
            //System.out.println(i);

        }
        //System.out.println("clumps " + clumps);
        return clumps;

    }


    /*
    3) Write a method, removeMyString, that takes two MyString objects, base and remove,
    as its parameters and returns a version of the base string where all the instances of the
    remove string have been removed. You may assume that the removed string has at least 1
    character.
    removeMyString(“Hello World”, “ll”) should return “Heo World”
    removeMyString(“Hello World”, “o”) should return “Hell Wrld”
    removeMyString(“Hello World”, “aaa”) should return “Hello World”*/

    /**
     * @param myString base: the original myString
     * @param myString remove: the sequence to remove from myString
     * @return base = base - remove
     */

    /**
     * Errors in method 3
     * cannot implement base.contents as contents is labeled as private
     * Hence, must use the getter method to get the contents of base and remove
     * the description for the method mentions to return a version of the base String
     */
    public static String removeMyString(MyString base, MyString remove) {
        //base.contents.replace(remove.contents, "");
        String bas;
        String rem;
        //MyString.contents.base.replace(remove.contents, "");
        bas = base.getContents();
        rem = remove.getContents();
        // bas.replace(rem, "");
        //bas.remove(rem);
        bas = bas.replaceAll(remove.getContents(), "");
        // base.getContents().replace(remove.getContents(), "");
        //base.remove(remove);
        //MyString.base.contents.replace(remove.contents, "");
        //System.out.println(base);
        //System.out.println(bas.replaceAll(remove.getContents(), ""));
        return bas;

    }

    /**
     * @param myString base: the original myString
     * @param myString remove: the sequence to remove from myString
     * @return base = base - remove
     */

    /**
     * Errors in method 3
     * cannot implement base.contents as contents is labeled as private
     * Hence, must use the getter method to get the contents of base and remove
     * the description for the method mentions to return a version of the base String
     */
    //don't know how to return the newbase --> I thought that implememting the methods woukd alter the base
    public static MyString removeMyString2(MyString base, MyString remove) {
        //base.contents.replace(remove.contents, "");
        //String bas;
        // String rem;
        //MyString.contents.base.replace(remove.contents, "");
        //base.replace(remove.contents, "");
        //base.getContents();
        //System.out.println(base);
        //System.out.println(base.getContents().replaceAll(remove.getContents(), ""));
        //base.getContents();
        String bas;
        bas = base.getContents().replaceAll(remove.getContents(), "");
        //base.remove;
        MyString base1= new MyString(bas);

        //base.getContents().replaceAll(remove.getContents(), "");
        // rem = remove.getContents();
        // bas.replace(rem, "");
        //bas.remove(rem);
        //base.replace(remove.getContents(), "");
        // base.getContents().replace(remove.getContents(), "");
        //base.remove(remove);
        //MyString.base.contents.replace(remove.contents, "");
        //System.out.println(base);
        //System.out.println(base.replaceAll(remove.getContents(), ""));
        //base.toString();
        // System.out.println(base.toString());
        return base1;

    }

    /*
    4) Write a method (using recursion) called countChar that takes a MyString and a
    character as its parameters and returns the number of times that character appeared in
    the string. Assume that string and character are both case sensitive.
    countChar(“ABABABabababa”, ‘a’) should return 4.
    countChar(“zzyyaa”, ‘2’) should return 0.

        /**
         * @param MyString base
         * @param char c
         * @return the number of times c appears in base
         */
    /**
     * Errors in method 4 countChar:
     * to recieve the contents of base the method getContents() must be used as the contents of base has private access
     */
    public static int countChar(MyString base, char c) {

        String baseString = base.getContents();
        return countCharHelper(baseString, c, 0);

    }


    /**
     * @param String baseString
     * @param char   c
     * @param int    index
     * @return the number of times c appears in base
     */
    /**
     * Errors in method countCharHelper
     * The first check or the base case must check if the index is equal to the length of the baseString
     *
     */
    public static int countCharHelper(String baseString, char c, int index) {
        // System.out.println(countCharHelper(baseString, c, index +1));

        if (index == baseString.length()) {
            return 0;
        }
        else if (baseString.charAt(index) == c) {
            //System.out.println(index);
           // System.out.println(baseString.charAt(index));
            //System.out.println(countCharHelper(baseString, c, index));
            return 1 + (countCharHelper(baseString, c, index +1));
        } else {
            //System.out.println(index);
           // System.out.println(baseString);
            //System.out.println(baseString.length());
            return 0 + (countCharHelper(baseString, c, index + 1)) ;
            // return countCharHelper(baseString, c, index)+1;
            //return 0;

        }

    }
 }
