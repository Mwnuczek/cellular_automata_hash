package com.company;
// 1 1 1   0
// 1 1 0   0
// 1 0 1   0
// 1 0 0   1
// 0 1 1   1
// 0 1 0   1
// 0 0 1   1
// 0 0 0   0

public class Check {
    boolean returnStatusRule30(boolean left, boolean center, boolean right ) {
        if (left && !center && !right) return true;
        if (!left && center && right) return true;
        if (!left && center && !right) return true;
        if (!left && !center && right) return true;
        else return false;
    }
}
