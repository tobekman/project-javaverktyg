package com.tobiasekman;

import com.tobiasekman.CoolNumbersClass;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CoolNumbersClassTest {

    int[] numArray = new int[] {5, 3, 10, 1};
    CoolNumbersClass coolNumbersClass = new CoolNumbersClass(numArray);

    @Test
    void returnsLowestNumber() {

        assertThat(coolNumbersClass.lowestNum()).isEqualTo(1);

    }

    @Test
    void returnsHighestNumber() {

        assertThat(coolNumbersClass.highestNum()).isEqualTo(10);

    }

    @Test
    void returnsSumOfLowestAndHighest() {

        assertThat(coolNumbersClass.getSumFromLowestAndHighestNumber()).isEqualTo(11);

    }

}