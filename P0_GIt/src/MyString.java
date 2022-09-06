import java.util.Arrays;

public class MyString {

    private String contents;
    private int length;

    public MyString(String str) {
        this.contents = str;
        this.length = str.length();
    }

    public String getContents() {
        return this.contents;
    }

    public int getLength() {
        return this.length;
    }

    //I added String to String method
    public String toString() {
        String str = "";
        str += this.contents;

        return str;

    }
}
