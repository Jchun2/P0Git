import java.util.Arrays;

public class MyIntArray {

    private int[] array;
    //public int[] array;
    public int size;

    public MyIntArray(int s) {
        this.array = new int[s];
        this.size = s;
    }

    public int get(int idx) {
        return this.array[idx];
    }

    public void set(int idx, int val) {

       // this.array[idx] = val;
        this.array[idx] = val;

    }

    public String toString() {
        String str = "";
        //format the NumberNode data so there are only two digits after the decimal point\
        //to do this use String.format("%.2f", data)
        str += Arrays.toString(array);

        return str;
    }
}
