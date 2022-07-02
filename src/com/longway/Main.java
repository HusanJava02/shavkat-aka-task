package com.longway;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        robot(new int[][]{{0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}});
    }

    public static void robot(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (list[i][j] == 1) {
                    System.out.println(Math.abs((3 - i)) + Math.abs((3 - j)));
                    break;
                }
            }
        }
    }
}
