package com.tobiasekman;

import com.google.common.primitives.Ints;

public class CoolNumbersClass {

    private final int[] numArray;

    public CoolNumbersClass(int[] numArray) {

        this.numArray = numArray;

    }

    public int getSumFromLowestAndHighestNumber() {

        return this.lowestNum() + this.highestNum();

    }

    public int lowestNum() {

        return Ints.min(numArray);

    }

    public int highestNum() {

        return Ints.max(numArray);

    }
}
