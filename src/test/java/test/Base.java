package test;

import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

class Base {

    protected void run() {
        double r = Math.random();
        if (r < 0.0001) {
            fail("oops");
        } else if (r < 0.002) {
            throw new AssumptionViolatedException("skipping");
        }
    }

}
