import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        // write your code here
        MyIntArray array1 = new MyIntArray(10);
        System.out.println("test case examples:");
        array1.set(0,1);
        array1.set(1,2);
        array1.set(2,2);
        array1.set(3,3);
        array1.set(4,5);
        array1.set(5,15);
        array1.set(6,15);
        array1.set(7,15);
        array1.set(8,16);
        array1.set(9,17);
        System.out.println("The original array1: " + array1);

        MyIntArray array2 = new MyIntArray(7);
        array2.set(0,1);
        array2.set(1,2);
        array2.set(2,3);
        array2.set(3,4);
        array2.set(4,5);
        array2.set(5,6);
        array2.set(6,7);
        System.out.println("The original array2: " + array2);

        MyIntArray array3 = new MyIntArray(3);
        array3.set(0,1);
        array3.set(1,1);
        array3.set(2,1);


        System.out.println("The original array3: " + array3);
       // array.set(10,15);
        //System.out.println(array.get(0));
      //  System.out.println(array.get(1));
        //System.out.println(array.get(2));
       // System.out.println(array.toString());
        //System.out.println(arr.get(2));
      //  arr.set(2,2);
        //arr.get(0);
       //System.out.println(Arrays.toString(arr));
       // System.out.println(Integer.toString(arr));
       // System.out.println((arr.toString()));
        System.out.println("method 1:");
        System.out.println("The reversed array1: " + Practice.reverseOrder(array1));
        System.out.println("The reversed array2: " + Practice.reverseOrder(array2));
        System.out.println("The reversed array3: " + Practice.reverseOrder(array3));
       // System.out.println("FindClumps");

        System.out.println("method 2:");
        System.out.println(Practice.findClumps(array1));
        System.out.println(Practice.findClumps(array2));
        System.out.println(Practice.findClumps(array3));


        System.out.println("method 3:");
        MyString helloworld = new MyString("hello world");
        MyString ll = new MyString("ll");
        MyString o = new MyString("l");
        MyString aaa = new MyString("aaa");
       System.out.println(Practice.removeMyString(helloworld, ll));
        System.out.println(Practice.removeMyString(helloworld, o));
        System.out.println(Practice.removeMyString(helloworld, aaa));
        System.out.println("Practice.removeMyString2(helloworld, ll):");
        System.out.println(Practice.removeMyString2(helloworld, ll));

        System.out.println("method 4:");
        MyString word1 = new MyString("ABABABabababa");
        MyString word2 = new MyString("zzyyaa");
        System.out.println(Practice.countChar(helloworld, 'e'));
        System.out.println(Practice.countCharHelper("helloworld", 'l',0));
        System.out.println(Practice.countChar(word1, 'a')) ;
        System.out.println(Practice.countChar(word2, '2')) ;







        System.out.println("Part II:");
        Nation Aztec = new Nation("Aztec", 2045);
        Nation Mongolia = new Nation("Mongolia", 3045);
        Nation Sum = new Nation("Sum", 5045);
        //System.out.println("set Aztec");
        //System.out.println(Aztec);
        //System.out.println("set Ally");
        Aztec.setAlly(Mongolia);
        Aztec.setEnemy(Sum);
        System.out.println(Aztec);
        System.out.println(Sum);
        System.out.println(Mongolia);
       // Mongolian.setAlly(Aztec);
        //Sum.setEnemy(Aztec);
        Aztec.backstab();
        System.out.println(Aztec);
        //should be enemy
       System.out.println(Aztec.getRelationship(Mongolia));
        //should be ally
      //  System.out.println(Aztec.getRelationship(Sum));
        FireNation aztec = new FireNation("Aztec", 2045,"Eagle Warrior", 390);
        System.out.println(aztec);
        aztec.setAlly(Sum);
        System.out.println(aztec);
    }
}
