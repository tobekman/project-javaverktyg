import com.google.common.primitives.Ints;

public class CoolNumbersClass {

    private final int[] numArray;

    public CoolNumbersClass(int num1, int num2, int num3) {

        this.numArray = new int[] { num1, num2, num3 };

    }

    public int lowestNum() {

        return Ints.min(numArray);

    }

    public int highestNum() {

        return Ints.max(numArray);

    }
}
