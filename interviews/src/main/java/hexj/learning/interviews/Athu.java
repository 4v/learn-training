package hexj.learning.interviews;

/**
 * Created by hexj on 6/9/17.
 */
public class Athu {
    public static void main(String[] args) {
        refactor();
    }

    public static void refactor() {
        System.out.println("Hello");
        String[] strarr = new String[20];
        int authArr[] = new int[20];
        for (int i = 0; i < authArr.length ; i++) {
            authArr[i] = i;
        }
        int typex = getXor(authArr);
        System.out.println(typex);
    }

    static int getXor(int[] authArr) {
        int typex = 1;
        for (int i = 0; i < authArr.length; i++) {
            typex ^= authArr[i];
        }
        return typex;
    }

}
