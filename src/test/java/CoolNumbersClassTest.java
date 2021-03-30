import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CoolNumbersClassTest {

    CoolNumbersClass coolNumbersClass = new CoolNumbersClass(5, 3, 10);

    @Test
    void returnsLowestNumber() {

        assertThat(coolNumbersClass.lowestNum()).isEqualTo(3);

    }

    @Test
    void returnsHighestNumber() {

        assertThat(coolNumbersClass.highestNum()).isEqualTo(10);

    }

}