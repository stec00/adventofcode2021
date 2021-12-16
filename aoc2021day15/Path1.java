package aoc2021day15;

import java.util.Arrays;

public class Path1 {
    private static final int INFINITY = Integer.MAX_VALUE / 2;
    private static int[][] distance;

    public static void main(String[] args) {
        int[][] origMatrix = {{4,5,5,2,2,8,5,9,8,9,4,4,1,1,2,4,7,1,9,7,9,8,4,6,5,8,2,5,7,7,3,3,1,8,2,5,2,2,6,9,4,2,2,6,2,5,7,3,1,6,2,8,8,5,1,1,5,5,1,2,3,1,2,3,6,8,7,1,5,1,4,1,2,1,7,1,2,2,4,2,9,8,2,7,1,6,2,5,2,4,9,6,6,2,3,2,8,1,7,5},{8,3,1,1,8,2,6,9,1,7,6,7,7,2,9,5,5,6,1,3,9,5,7,1,6,2,4,5,4,2,6,1,8,4,2,1,2,4,7,1,3,1,1,2,1,4,8,5,1,3,5,1,5,4,7,8,4,2,1,2,4,1,6,5,6,7,4,9,2,2,6,4,4,7,1,9,9,3,4,1,1,3,2,1,7,1,3,4,5,3,1,1,1,1,7,1,1,8,4,3},{3,1,3,4,1,5,5,5,2,8,2,3,1,2,9,6,3,1,3,2,9,2,9,5,1,6,8,9,3,7,1,6,7,1,6,1,1,3,5,5,1,9,9,4,2,9,3,1,3,2,6,1,2,2,6,3,9,2,9,9,1,1,2,9,9,5,9,2,9,3,2,1,2,4,6,1,2,8,9,4,1,1,3,9,3,2,6,3,1,8,1,2,1,3,1,2,2,3,9,8},{7,1,3,4,1,5,9,6,8,1,5,3,3,3,3,1,1,7,2,9,9,1,9,3,2,8,1,9,1,2,8,7,1,8,1,3,1,1,2,1,4,2,8,7,1,5,1,9,1,2,3,8,6,1,2,6,2,3,8,9,1,2,3,3,1,1,2,5,3,4,2,3,1,4,8,2,6,8,1,1,8,2,3,5,4,1,2,9,7,9,1,9,1,1,3,3,9,1,3,1},{3,2,9,1,6,2,2,1,2,1,8,9,3,8,2,1,2,5,8,2,1,5,1,1,1,5,3,1,6,1,4,2,3,3,9,9,9,6,6,1,6,4,9,2,7,1,8,1,1,8,7,1,5,2,9,4,6,1,2,1,1,1,1,5,7,3,9,8,2,1,3,8,8,9,7,3,6,1,1,1,8,3,5,1,7,6,5,1,5,6,7,3,1,4,8,4,6,3,4,9},{9,1,1,6,1,9,7,3,1,9,9,9,2,2,2,3,7,8,4,9,7,3,7,4,9,1,5,9,9,1,2,9,1,8,9,4,8,5,1,4,8,5,5,2,1,8,9,5,7,3,2,9,9,7,1,4,1,6,1,7,7,1,5,2,1,7,4,1,6,9,4,9,7,8,1,2,3,7,3,2,1,9,9,8,4,1,3,3,1,2,1,1,5,5,3,1,9,1,1,3},{4,9,6,8,4,3,9,1,1,4,1,3,5,9,9,6,9,2,3,9,3,9,6,2,1,5,2,1,2,2,7,4,3,8,6,1,6,4,3,2,2,6,2,9,6,2,5,7,2,5,5,3,4,5,1,3,3,3,1,4,1,5,9,1,6,4,1,1,2,1,3,1,1,1,2,9,9,1,3,8,1,2,8,9,2,2,9,3,1,7,9,1,1,4,2,3,1,7,2,1},{6,2,3,9,2,1,9,7,8,5,2,3,4,6,7,5,3,9,1,2,8,1,6,4,1,1,1,4,1,4,8,2,2,5,9,4,2,6,2,2,1,9,2,5,4,2,1,1,3,7,1,2,3,2,7,3,6,1,2,2,3,7,1,6,9,5,1,1,9,1,2,7,5,7,3,6,3,8,8,8,4,5,6,2,3,9,9,4,8,9,1,7,9,9,5,9,2,9,2,8},{1,9,3,9,2,7,3,1,5,2,1,1,4,1,6,5,8,1,5,6,2,1,8,9,8,1,3,1,7,4,1,6,2,5,1,4,2,2,7,3,7,5,7,4,1,1,1,4,1,6,7,3,1,1,2,2,5,9,8,9,7,3,5,8,2,9,9,2,2,2,2,6,9,1,9,1,1,9,1,2,1,4,3,2,1,7,5,8,2,4,5,3,2,6,1,9,9,8,1,4},{3,8,1,6,2,9,5,1,2,1,2,1,1,7,1,3,9,1,9,9,1,8,1,2,9,1,4,1,5,2,1,7,4,8,3,1,5,5,7,9,4,1,3,8,5,4,2,7,3,1,2,5,3,1,1,8,2,3,4,3,4,6,7,1,3,6,5,1,3,3,6,3,6,9,8,1,1,1,2,3,6,7,4,5,1,2,9,4,9,7,2,2,3,8,7,9,4,4,4,3},{2,8,5,2,1,7,4,3,9,2,1,7,5,2,1,7,8,9,1,2,9,2,7,6,9,2,9,7,3,2,9,7,3,4,1,4,1,5,2,9,2,8,8,3,1,8,1,8,1,2,2,1,9,5,3,2,1,2,1,3,7,3,1,3,8,5,8,9,1,1,2,2,2,7,2,7,4,2,4,1,3,4,3,1,9,7,8,2,3,2,4,8,3,9,6,1,6,2,2,9},{8,1,8,3,4,1,1,9,8,1,1,3,6,7,1,8,4,2,8,8,2,3,1,2,7,6,8,1,4,1,1,2,4,6,5,2,8,2,2,2,1,3,8,4,2,1,8,7,1,7,7,8,2,5,1,2,3,1,4,2,3,1,7,1,5,8,8,6,4,2,3,2,8,3,9,5,1,1,4,1,2,3,8,1,1,1,2,5,6,1,2,1,1,8,6,2,6,2,1,8},{3,3,3,8,4,1,8,9,5,8,8,1,8,2,2,9,3,3,1,3,9,9,5,1,3,6,9,1,9,2,1,9,2,1,8,6,9,9,2,2,4,1,3,1,3,6,1,9,4,4,2,1,8,2,8,2,9,1,1,9,7,1,3,2,7,9,1,8,1,2,2,2,2,2,4,1,6,3,3,4,6,1,4,2,6,9,3,8,6,2,1,4,6,2,1,1,8,9,9,9},{6,1,1,8,5,8,2,7,6,5,3,7,5,5,4,1,1,4,4,4,9,1,5,1,9,8,7,1,1,2,3,1,2,1,1,7,2,9,4,3,6,7,8,8,7,3,2,4,7,5,4,1,9,2,1,1,9,2,9,1,5,1,5,1,7,1,7,9,5,7,8,1,2,7,1,4,8,4,1,1,4,5,2,2,3,1,6,1,1,1,6,2,4,4,1,4,1,7,1,9},{1,4,6,9,2,5,7,4,1,8,3,1,3,2,1,8,9,5,1,2,1,1,5,1,1,5,9,1,2,2,4,2,8,1,8,6,8,4,3,3,2,8,5,5,1,8,8,9,6,5,7,1,8,6,8,9,7,3,9,9,6,7,7,6,3,9,1,9,1,6,4,2,1,1,7,9,8,6,3,5,2,4,3,4,2,1,4,4,1,6,6,2,7,3,7,8,3,9,1,2},{1,4,2,2,1,1,8,4,1,9,3,1,9,5,1,5,4,9,6,1,8,9,3,9,1,1,5,8,5,1,6,4,6,2,2,7,7,3,9,3,6,2,2,1,2,9,9,3,6,8,7,1,9,8,2,2,1,7,5,6,2,4,5,7,1,2,9,9,6,4,2,1,9,9,1,2,1,2,4,1,2,3,2,1,8,3,1,2,9,7,7,3,1,3,6,8,2,8,1,1},{8,1,6,2,5,4,6,1,3,9,9,5,2,1,3,6,1,8,9,9,1,1,1,7,7,5,3,3,3,5,7,8,2,1,2,5,2,8,9,1,9,7,5,9,6,5,2,1,8,1,5,2,1,8,4,1,1,2,1,3,2,3,6,7,2,4,5,4,8,6,7,4,7,2,1,2,2,1,4,3,3,3,3,2,4,2,2,1,1,1,9,9,5,1,5,2,8,1,1,4},{1,4,8,8,2,3,9,6,1,1,4,6,1,4,9,1,9,7,3,8,6,5,1,8,5,2,4,2,9,5,9,5,7,7,7,5,2,9,1,4,1,9,1,8,1,7,4,7,7,5,2,3,1,7,9,1,4,3,6,7,1,1,4,8,3,1,6,5,4,2,5,1,7,2,1,3,2,8,1,1,1,1,1,5,1,1,1,9,1,1,1,8,6,4,9,5,9,3,9,2},{2,2,1,8,9,1,7,6,6,1,8,6,8,1,3,3,1,4,1,2,4,3,8,1,9,9,6,2,4,1,3,2,1,6,1,3,1,9,7,9,9,1,3,2,3,2,7,9,9,9,8,8,8,7,1,9,1,3,9,3,9,1,1,1,8,2,3,3,1,7,4,2,1,7,1,2,8,2,4,9,9,4,5,4,2,9,9,2,7,9,2,2,5,5,2,2,3,5,6,1},{5,7,3,4,3,2,6,7,3,2,8,8,4,7,9,2,4,2,8,1,9,1,2,4,1,1,2,1,1,9,1,8,1,1,1,1,1,1,1,1,4,7,3,3,8,7,9,5,9,6,5,3,9,3,8,2,6,9,2,1,4,1,1,2,1,9,2,2,9,6,1,6,2,1,1,1,1,2,1,2,7,1,8,8,9,6,2,1,2,1,1,1,1,8,1,9,5,1,1,1},{1,5,1,1,9,3,5,1,1,1,8,6,1,1,2,1,9,3,5,7,4,1,7,6,8,3,3,8,9,2,3,1,2,8,1,2,4,6,6,1,8,1,9,1,9,1,9,2,5,1,3,7,1,2,1,5,9,1,3,2,1,2,2,9,1,2,1,1,1,1,7,5,5,2,1,9,8,1,1,2,1,2,1,8,2,1,2,1,7,4,2,7,7,8,1,7,2,2,2,4},{9,6,9,1,5,6,2,1,8,3,5,1,3,3,8,8,2,2,1,7,2,6,4,9,3,8,2,1,2,3,8,4,1,9,1,2,1,4,1,1,1,4,1,6,5,2,4,1,5,7,2,4,2,5,7,1,6,9,1,7,5,5,1,1,9,8,4,4,1,9,8,2,6,3,1,7,9,1,2,1,1,9,9,9,9,4,3,4,6,7,8,1,2,1,3,3,9,2,3,1},{2,7,2,9,2,3,7,5,3,2,9,5,9,4,4,4,7,3,3,2,2,5,4,3,5,9,9,1,1,1,9,4,6,1,9,2,1,9,1,6,8,8,2,4,3,5,5,8,6,1,1,2,3,1,1,2,2,3,1,2,4,1,4,1,1,8,6,3,1,2,4,8,8,2,1,8,1,2,9,1,4,9,8,1,2,5,1,5,6,5,8,1,7,1,8,6,3,4,2,5},{7,3,1,2,5,5,9,1,8,1,3,2,3,7,4,3,9,3,8,2,2,1,2,1,2,2,3,6,1,9,1,5,1,4,3,1,8,4,1,8,5,4,8,1,8,6,1,3,9,3,1,7,2,3,3,7,3,6,1,7,1,3,3,3,4,2,1,4,1,6,2,1,2,2,3,7,1,9,2,1,1,9,3,5,5,1,9,2,4,7,1,9,8,9,8,9,2,2,1,2},{9,4,1,5,7,4,7,7,3,8,3,4,6,1,4,1,6,9,1,4,1,8,8,2,5,1,9,7,1,7,3,1,9,2,5,1,5,2,1,9,2,6,6,1,7,2,1,3,6,4,5,5,4,5,2,8,1,5,1,6,2,5,1,7,4,7,5,8,8,3,8,6,3,1,4,3,2,3,9,1,1,2,1,1,6,1,4,1,8,4,1,1,4,8,4,5,1,7,4,9},{1,7,1,6,2,6,3,1,2,1,1,1,5,6,3,1,1,4,1,7,8,4,2,5,2,2,5,1,3,1,4,5,8,8,4,1,3,2,1,3,8,1,4,5,1,1,6,9,1,4,5,1,3,9,3,9,1,1,9,2,4,8,1,1,5,7,2,8,6,1,1,4,4,2,3,5,9,9,1,2,9,2,1,7,5,2,5,5,3,7,2,1,3,3,8,1,1,3,1,5},{2,1,1,3,4,1,4,9,1,1,7,3,1,1,6,4,9,6,2,3,4,2,2,2,3,4,2,1,3,1,7,9,2,1,6,4,7,4,6,1,4,9,1,2,6,8,1,1,7,3,8,6,8,1,5,4,3,3,9,1,1,1,1,2,5,4,1,5,1,1,1,3,1,1,1,4,7,6,1,9,5,9,2,5,3,1,2,3,1,2,8,1,1,2,8,1,9,3,1,2},{5,6,1,1,9,1,2,3,3,4,9,2,7,2,2,1,2,5,2,7,1,1,2,7,6,8,7,1,2,1,1,6,2,4,9,1,1,5,6,4,1,6,2,1,6,1,1,5,1,2,9,1,1,4,1,4,7,1,4,9,4,5,5,5,2,2,1,6,2,4,1,1,2,2,4,6,6,1,4,1,5,1,5,9,1,1,1,1,9,2,3,2,6,5,7,7,6,2,9,1},{1,2,3,2,3,1,3,2,7,1,1,1,3,5,5,4,1,8,9,9,5,5,4,1,3,1,5,5,1,1,2,6,9,9,1,6,3,1,1,4,8,2,1,9,1,1,3,5,3,1,7,1,3,4,1,2,1,5,4,8,5,2,5,2,6,4,7,8,8,9,6,4,6,6,1,9,2,3,6,2,5,3,6,8,8,4,8,2,3,5,1,3,1,5,7,3,5,3,6,9},{2,9,2,8,1,2,3,1,2,1,1,9,1,2,6,7,7,2,1,3,2,3,8,2,2,1,3,3,3,8,4,3,2,8,4,1,2,6,1,6,1,1,9,2,4,6,1,7,8,1,3,1,3,2,1,2,4,5,6,9,3,1,9,2,6,1,7,1,5,1,3,4,8,4,8,9,2,7,1,9,9,3,4,6,8,5,7,4,2,1,3,2,3,4,9,2,3,1,6,1},{3,7,3,8,1,5,2,5,4,4,6,2,5,5,1,6,9,1,6,6,9,3,6,4,2,7,3,8,5,7,3,1,9,3,8,1,8,3,7,9,6,3,5,2,4,1,1,1,2,2,9,9,5,6,8,6,1,1,5,1,1,4,3,2,1,7,4,5,1,9,8,5,5,1,3,3,8,5,9,2,2,7,1,3,9,7,1,2,6,9,1,9,3,1,1,6,3,4,5,4},{4,9,7,8,9,3,2,2,3,7,3,1,2,6,1,5,4,5,1,1,1,5,1,2,3,9,9,4,1,9,4,1,8,1,3,8,7,2,3,9,4,6,1,9,8,5,2,1,8,4,5,4,5,9,6,6,6,4,7,1,4,6,9,4,1,6,9,8,1,2,5,9,1,2,5,1,5,4,2,1,2,8,7,9,1,1,1,2,5,8,8,2,3,8,4,2,8,1,1,3},{3,9,1,2,8,9,9,1,8,2,7,9,8,9,1,6,6,2,8,9,1,8,1,3,1,9,7,9,3,7,1,1,1,2,2,2,6,9,5,3,5,1,2,8,1,4,1,1,1,3,1,1,1,2,8,3,8,1,1,1,9,5,4,8,2,2,1,1,9,9,6,1,6,4,7,8,8,6,8,3,3,1,8,7,5,3,3,3,1,8,6,4,8,1,1,2,1,1,7,5},{1,1,9,2,9,2,7,4,2,1,3,7,2,5,8,4,2,3,2,1,4,1,9,1,5,1,1,1,8,8,6,4,9,9,5,2,9,4,9,2,2,7,8,6,3,6,7,6,9,1,4,5,7,9,3,9,8,5,1,3,9,2,5,9,8,1,2,3,7,4,3,6,9,3,3,1,9,8,2,9,3,1,4,7,1,4,2,1,3,3,6,1,3,1,1,5,1,6,2,5},{3,9,1,1,1,8,5,2,1,5,5,8,2,4,3,4,8,4,4,1,9,3,1,6,1,9,2,5,1,5,1,1,2,1,2,8,6,7,2,1,2,9,2,8,4,2,8,1,1,1,1,9,3,6,2,2,1,1,4,8,4,1,1,2,1,4,3,9,2,1,9,5,6,2,1,1,7,2,4,1,5,7,1,2,2,5,3,9,8,3,7,4,9,2,3,9,4,4,9,2},{2,9,5,3,2,1,6,7,2,2,8,1,5,2,1,2,6,3,2,7,3,2,4,5,3,1,1,7,1,2,7,3,2,4,3,3,4,2,4,9,6,8,2,2,3,3,3,7,1,2,1,1,6,1,4,7,6,2,7,2,2,3,1,3,1,8,6,9,4,7,2,9,5,7,9,5,9,8,3,3,9,2,3,1,1,1,2,1,8,2,6,1,9,7,1,6,1,6,2,4},{1,1,9,8,3,8,2,7,6,7,2,1,8,3,1,2,2,7,9,6,8,2,2,7,8,1,9,1,8,2,2,3,7,4,5,5,9,2,9,3,7,9,3,8,7,3,1,7,4,4,9,9,2,1,1,5,1,6,4,3,6,3,7,2,4,3,1,3,7,1,9,6,1,6,4,8,2,8,2,1,4,6,2,8,3,9,3,5,2,9,3,2,2,4,8,8,3,9,1,2},{2,7,2,1,8,8,4,4,1,2,9,4,9,1,4,7,6,1,3,3,4,2,9,4,1,1,8,4,1,9,2,8,1,1,7,9,9,6,6,9,7,7,1,9,1,5,1,2,2,1,4,9,9,7,4,2,9,4,6,3,8,9,8,1,6,4,1,3,7,7,3,2,4,2,3,8,7,3,1,5,3,9,9,1,4,3,6,9,6,8,1,3,4,2,3,9,4,4,7,7},{3,1,1,5,1,1,8,2,2,6,2,5,7,1,1,2,1,7,2,2,1,4,5,3,1,4,8,4,1,9,1,9,7,9,1,2,1,2,1,2,6,2,9,6,1,1,9,4,1,8,2,9,7,2,9,4,7,5,1,4,2,2,1,4,9,1,9,2,1,6,1,8,3,1,1,2,7,9,8,1,1,9,1,3,2,1,3,1,2,9,9,9,2,9,9,2,9,6,9,9},{1,4,6,6,1,3,8,1,5,2,5,8,9,9,1,2,2,5,3,1,2,9,9,8,1,8,1,6,4,1,4,3,3,1,4,5,1,7,1,8,3,2,1,3,4,5,7,9,5,9,8,1,1,1,1,8,9,1,2,8,1,7,8,1,1,1,1,9,7,2,1,8,4,9,1,9,8,2,1,9,2,5,9,2,3,1,4,1,3,4,4,1,2,7,1,1,9,9,1,6},{9,1,2,2,1,3,4,4,5,2,8,4,6,2,2,6,1,1,1,1,5,8,1,2,8,4,9,1,2,9,1,1,2,1,1,4,5,9,2,1,2,2,2,6,1,1,1,9,1,9,4,8,9,3,1,8,1,1,1,2,3,7,5,1,2,2,6,2,2,1,7,1,6,7,1,9,1,6,6,8,4,3,7,6,6,8,2,3,6,1,5,4,6,3,2,7,1,9,3,2},{6,6,1,9,4,1,3,2,3,1,5,9,5,2,4,1,5,1,8,5,1,9,7,9,1,3,4,1,3,5,9,8,8,6,5,6,2,9,8,1,1,1,6,1,1,1,7,1,2,9,1,7,2,3,3,7,3,1,1,6,2,1,9,1,9,9,1,2,3,9,4,3,2,6,5,2,3,8,6,9,3,1,1,5,9,5,9,1,3,2,6,1,8,7,1,1,3,8,1,7},{1,5,9,1,8,4,5,5,5,9,1,6,2,7,7,1,8,4,7,3,2,1,1,5,2,8,2,5,1,8,7,2,2,1,3,9,1,2,1,1,1,2,2,5,4,1,2,8,1,2,4,4,7,5,4,1,1,9,2,9,2,9,7,9,5,4,8,9,8,4,4,9,3,1,6,2,9,9,1,9,1,9,9,5,9,7,1,4,9,3,4,3,2,2,3,3,7,9,1,6},{9,1,4,5,6,7,2,2,9,4,2,1,2,1,4,2,4,3,9,2,1,3,8,1,1,9,3,1,9,7,6,3,7,2,2,4,7,3,6,2,1,1,4,8,2,9,3,3,9,2,1,1,1,3,1,1,2,8,2,8,1,8,6,5,1,7,4,1,1,3,9,1,2,1,2,1,4,9,8,4,9,2,3,2,4,1,3,1,1,4,8,1,2,1,4,1,2,3,4,1},{1,7,5,6,3,8,1,9,6,7,9,1,3,4,3,2,2,2,2,1,1,2,2,2,6,1,9,3,1,3,2,1,1,1,1,2,1,1,6,3,7,3,1,1,9,2,1,3,1,1,4,3,7,8,2,1,1,9,2,9,9,3,1,1,6,6,6,7,5,1,4,2,2,5,1,1,1,9,3,1,6,1,9,1,2,3,1,1,1,7,7,2,5,5,3,1,1,4,9,1},{7,1,1,5,4,2,1,9,1,6,7,5,2,2,6,6,1,9,7,8,1,1,9,1,8,1,4,6,2,3,7,9,5,3,7,1,2,8,1,7,1,3,1,3,9,1,6,3,3,9,1,3,8,2,1,8,1,4,5,8,2,9,3,1,4,1,2,5,1,3,3,8,1,9,3,2,1,4,2,1,3,8,3,7,1,1,2,5,2,4,6,1,8,9,9,1,4,1,2,6},{1,5,9,8,7,5,9,3,7,6,3,9,2,5,1,4,4,1,7,8,2,2,1,9,5,2,8,4,1,1,8,1,3,3,4,7,2,2,1,1,8,7,2,1,8,3,4,2,4,1,3,1,3,6,1,2,9,2,7,8,1,1,1,3,4,4,2,7,5,1,7,4,5,4,3,2,1,7,3,3,3,7,6,1,2,9,7,3,6,4,2,1,8,1,8,1,9,9,1,1},{1,5,9,1,9,2,7,5,1,4,9,8,6,4,3,1,5,4,2,9,3,1,3,3,1,1,3,9,6,1,3,9,2,4,2,1,2,5,1,5,8,3,1,9,2,1,3,5,9,2,6,1,7,5,5,4,2,4,1,1,7,2,3,2,6,1,9,1,1,6,2,5,7,3,5,8,7,3,2,8,1,1,3,6,1,5,5,1,4,3,3,1,3,3,7,1,5,4,2,9},{2,2,1,2,1,1,1,7,8,6,2,6,8,5,1,8,3,8,8,6,7,7,9,2,3,2,1,1,5,3,3,1,8,8,3,4,5,9,3,9,1,4,1,4,3,1,4,2,3,3,2,2,7,4,1,1,8,5,3,8,8,8,1,8,7,4,6,9,3,7,9,3,3,3,1,6,1,3,9,5,9,6,9,6,3,9,1,7,1,1,5,1,5,6,5,1,3,6,2,8},{1,8,5,5,5,4,6,8,6,9,7,8,4,8,5,7,7,3,6,2,1,4,5,5,1,4,5,7,2,6,2,7,6,9,2,1,5,5,2,9,8,3,2,1,2,1,2,6,1,2,3,1,6,1,3,4,3,3,3,9,9,9,6,2,4,9,6,1,5,3,4,1,4,7,9,2,1,1,9,7,1,4,4,1,9,1,5,3,3,2,8,4,4,7,3,1,9,9,2,1},{3,5,1,1,4,1,5,8,7,1,7,1,3,3,4,1,5,1,7,2,5,9,5,6,5,2,3,2,1,1,6,4,3,3,9,8,1,3,5,1,4,2,1,6,7,8,1,3,5,3,2,1,1,9,1,4,1,5,2,2,1,8,3,7,2,9,5,4,1,4,2,9,2,7,6,4,7,8,8,2,3,1,1,1,4,8,2,6,3,1,2,1,6,2,3,4,1,8,3,4},{1,3,1,8,1,2,6,2,1,9,1,1,9,4,2,3,3,5,8,2,2,3,3,9,3,7,2,2,1,1,4,2,3,2,9,1,9,9,1,1,5,1,3,1,1,9,4,3,8,1,4,8,8,7,8,4,1,3,5,3,8,9,1,1,4,8,8,3,2,3,9,9,2,2,5,4,2,5,2,9,1,4,8,5,7,2,7,2,1,3,9,9,2,9,3,1,5,5,6,3},{4,2,8,9,2,2,6,8,7,2,4,1,9,2,9,1,8,6,1,1,1,1,3,8,3,5,3,8,1,1,1,2,1,9,1,1,2,7,2,3,1,2,1,1,3,1,5,9,1,9,7,1,6,8,8,2,9,3,1,1,6,1,9,1,2,4,3,1,7,2,3,2,7,9,1,2,1,2,2,5,3,1,1,5,1,2,2,8,9,3,1,1,6,3,8,2,5,3,6,1},{4,2,6,7,1,5,8,1,3,9,1,9,8,9,2,3,5,7,7,6,1,5,6,2,8,1,5,7,7,6,7,2,1,5,3,3,1,5,2,1,9,8,9,2,2,7,2,2,9,2,7,3,4,4,3,3,2,9,7,2,1,6,9,8,9,2,9,3,7,3,2,6,9,1,2,1,1,2,2,1,1,1,2,1,1,1,1,8,2,3,4,8,8,5,2,1,6,4,1,3},{1,7,2,1,2,8,1,3,9,2,3,5,3,2,4,8,9,1,8,1,7,1,1,1,1,3,4,8,4,3,1,6,3,2,1,9,2,8,8,5,9,8,3,4,3,3,1,9,2,9,1,1,6,7,3,1,4,3,2,1,2,3,1,4,8,3,5,8,2,4,2,5,1,4,3,7,3,9,2,1,6,3,1,3,1,1,7,2,6,7,1,1,3,3,2,1,4,2,1,1},{5,6,9,2,4,3,4,7,6,7,1,6,7,2,1,6,2,4,6,1,8,1,9,1,1,6,4,7,4,8,7,6,2,8,1,5,1,1,9,9,6,3,1,6,2,9,9,1,9,2,5,6,7,4,2,2,6,1,1,1,3,1,6,6,1,1,4,1,4,9,9,1,1,9,8,6,9,1,1,2,1,7,6,4,4,9,1,4,3,2,9,3,9,1,5,1,1,7,1,2},{3,1,7,1,7,7,8,9,7,9,1,3,3,3,8,4,8,2,1,4,1,5,9,1,1,9,1,5,9,3,1,1,1,2,6,1,4,4,1,1,1,6,1,4,4,3,5,1,9,1,8,8,2,2,1,5,1,8,1,1,7,9,9,1,1,5,1,8,2,2,1,9,3,1,2,1,4,7,1,2,1,2,1,1,8,5,1,6,1,7,1,6,1,2,1,9,4,4,8,1},{5,7,2,8,8,9,2,9,1,5,3,9,4,1,1,6,5,3,5,6,8,5,1,3,2,8,4,1,5,2,1,3,1,4,9,1,4,1,2,1,1,5,5,6,3,6,5,1,2,1,2,9,9,4,9,6,5,9,4,3,1,2,9,1,1,3,4,1,3,9,3,3,8,4,1,3,1,2,7,3,2,1,1,1,5,7,9,1,6,1,7,1,5,8,2,1,9,4,9,2},{5,9,2,2,8,6,1,3,1,9,1,6,1,2,1,1,5,9,5,2,8,7,2,3,2,1,1,2,2,1,9,4,3,7,8,1,1,2,2,2,3,5,2,6,6,6,1,5,1,9,2,9,9,9,5,4,3,1,1,1,1,4,4,4,3,6,4,1,1,9,3,2,1,3,5,8,2,5,6,3,1,4,9,8,1,4,4,7,2,8,3,2,6,1,2,3,9,1,8,4},{3,2,2,2,9,2,2,8,8,1,2,1,3,8,1,3,5,3,8,1,1,2,2,2,1,2,1,9,9,1,9,8,3,9,2,2,2,5,6,2,1,3,8,2,2,2,2,1,4,3,7,3,5,8,8,4,1,5,7,2,1,9,9,7,3,4,5,2,7,3,1,1,5,2,2,1,9,2,6,2,2,1,1,7,1,7,8,8,3,2,3,4,2,5,3,9,8,2,2,1},{7,1,2,1,8,9,2,2,8,9,4,7,1,7,5,7,7,1,4,1,6,4,1,9,2,3,1,7,1,9,9,8,8,9,3,2,1,5,2,5,2,8,9,1,6,1,1,9,1,6,8,4,6,2,7,1,2,7,2,3,1,6,2,2,1,2,1,8,1,3,2,2,8,1,6,4,9,2,8,1,7,1,7,1,1,8,8,3,1,3,1,4,1,1,1,7,1,1,1,5},{4,1,4,2,1,3,3,1,9,5,6,3,1,8,9,1,9,1,1,1,4,9,4,3,9,2,1,3,6,6,2,2,1,1,4,3,3,8,3,7,3,2,1,2,9,6,3,8,1,4,6,5,8,1,6,1,7,3,9,9,7,7,5,9,4,9,2,2,2,5,9,4,2,2,8,4,8,2,1,4,9,2,3,1,7,3,9,2,2,2,6,3,1,6,1,7,1,4,2,1},{7,1,7,1,7,6,7,9,5,2,2,1,8,5,1,6,8,5,9,1,1,1,9,2,1,3,8,2,9,8,1,4,1,2,1,1,7,8,4,5,1,5,5,5,3,1,4,1,4,9,2,9,2,8,5,8,4,4,6,1,9,2,8,1,3,3,8,1,5,1,9,1,3,7,4,6,9,2,2,2,2,9,4,1,8,5,2,1,3,2,9,5,9,5,3,2,9,1,3,2},{4,8,1,6,4,3,4,4,8,9,2,2,5,6,1,5,1,2,9,1,1,2,9,7,8,1,1,1,5,1,1,3,1,9,2,2,2,1,6,3,3,5,7,8,7,2,5,1,1,8,9,1,3,2,1,8,7,2,1,3,6,9,1,6,1,3,2,5,9,8,1,1,4,3,2,2,1,1,4,8,3,4,2,4,1,7,1,1,1,7,5,3,1,3,1,9,1,6,1,9},{2,5,1,4,6,6,9,1,5,2,1,9,1,2,6,4,4,2,9,1,2,2,5,2,7,5,5,4,9,1,5,6,2,1,5,2,5,2,3,2,9,8,2,2,1,4,1,2,7,9,2,2,5,9,1,1,2,4,6,1,7,4,2,1,2,2,7,9,8,6,1,9,2,1,7,2,4,6,4,5,2,1,1,7,1,5,5,4,1,1,3,2,9,3,2,4,1,2,5,5},{1,7,7,4,4,1,6,8,9,7,4,3,9,3,6,4,2,4,1,3,1,1,5,2,5,5,1,8,9,6,3,3,2,6,1,2,1,8,2,5,4,6,1,4,9,1,8,3,4,1,3,5,9,1,7,3,1,5,6,7,8,1,4,5,4,4,6,3,9,4,2,2,2,1,1,9,2,5,2,4,1,5,1,8,1,5,5,7,2,1,2,3,1,9,9,7,9,8,3,6},{2,9,2,4,4,1,8,1,7,1,2,1,2,1,6,6,3,7,6,2,1,7,3,3,2,2,1,9,9,2,8,5,2,4,1,2,5,1,6,1,1,5,1,3,8,1,3,5,2,2,8,3,9,8,1,2,4,9,2,1,9,5,3,6,8,1,1,1,8,9,5,9,3,1,9,1,1,9,1,5,9,9,8,2,8,1,5,3,9,1,2,1,2,4,7,7,1,1,5,3},{4,7,2,7,2,8,4,7,5,7,4,1,7,2,3,8,2,2,1,1,9,5,5,7,1,7,2,7,1,4,3,8,1,6,9,3,2,5,1,9,9,1,2,3,3,2,1,6,4,1,9,1,1,1,1,3,1,3,5,6,2,5,8,2,9,3,1,7,6,9,3,9,1,7,7,3,9,6,3,5,5,5,1,3,2,6,3,1,2,6,9,4,2,1,6,4,2,1,1,2},{1,8,2,6,1,7,6,1,3,2,9,3,2,5,9,1,2,1,1,8,1,1,2,8,1,4,9,4,1,8,4,1,2,4,6,4,9,6,7,1,1,4,4,9,3,5,5,5,1,5,3,6,2,2,2,1,2,9,6,7,5,1,3,2,7,3,2,1,1,2,3,1,4,3,3,3,1,3,1,8,8,3,1,7,3,9,2,8,2,1,6,1,2,4,3,4,3,1,3,6},{3,9,4,1,7,9,1,8,9,1,1,2,5,2,7,9,1,1,8,4,6,5,1,2,8,3,8,1,5,9,1,1,4,1,7,1,4,9,3,6,4,1,2,1,1,1,1,4,4,8,7,2,1,4,2,1,9,6,3,5,9,8,5,6,9,5,3,1,2,5,1,1,6,8,1,5,5,8,2,1,3,9,6,1,8,1,2,6,2,3,8,1,1,9,1,1,5,1,9,4},{6,3,8,4,1,1,7,1,5,2,7,7,1,5,1,4,9,7,9,5,5,2,4,7,1,4,4,2,8,8,1,9,4,1,7,5,5,3,9,8,7,2,2,4,4,6,8,8,6,7,9,1,4,1,3,2,3,9,1,1,4,5,6,1,6,7,1,9,3,1,4,8,2,1,2,6,1,2,3,8,9,5,1,8,3,7,2,2,9,3,3,1,2,3,6,5,3,3,8,6},{8,2,8,8,1,7,1,1,8,2,9,7,9,8,8,3,4,6,7,2,5,1,1,6,8,2,1,1,8,4,5,9,2,6,3,2,5,3,2,8,5,4,8,7,7,9,1,1,2,5,2,2,1,3,4,1,2,2,5,5,6,2,9,2,3,4,4,8,3,9,6,5,6,3,9,2,4,3,3,1,2,6,1,1,4,2,9,6,5,4,6,5,7,6,9,6,9,1,1,1},{2,1,3,8,9,8,9,1,9,1,1,2,1,1,7,3,1,9,8,1,1,4,3,1,5,2,3,2,5,2,5,3,8,3,5,9,1,4,8,5,3,7,5,3,3,9,3,6,3,4,1,9,5,1,4,3,5,2,5,1,7,5,7,3,2,2,1,1,2,1,1,7,1,9,3,3,4,1,3,2,5,4,9,2,1,4,1,8,5,1,3,7,4,2,6,3,1,8,3,1},{2,2,1,3,9,3,7,5,2,1,2,1,9,1,1,1,5,5,6,4,2,4,7,1,7,1,1,2,8,1,3,9,1,8,8,5,9,8,1,1,6,1,3,1,4,9,2,1,7,5,4,2,1,2,1,2,5,8,7,7,1,3,2,5,6,8,5,4,4,6,2,9,9,1,1,3,4,3,6,2,4,3,9,2,4,3,2,9,1,1,1,8,8,3,4,3,4,5,5,9},{5,6,1,7,4,1,1,2,1,2,7,2,9,9,1,4,4,9,4,1,8,2,2,1,9,7,7,3,3,1,6,9,3,2,2,8,1,9,1,9,1,5,5,5,9,3,2,7,7,1,3,1,4,2,3,8,5,9,4,4,8,6,2,6,5,2,1,7,2,2,1,1,7,8,7,3,7,2,8,6,9,4,5,4,9,8,2,3,5,4,1,9,1,2,3,1,2,2,3,1},{7,2,2,1,1,1,8,9,7,2,1,1,1,4,2,1,3,9,1,1,3,4,7,2,9,2,9,2,8,3,7,3,2,1,2,8,1,5,7,6,3,1,2,9,8,6,5,6,3,1,1,2,9,7,7,4,5,8,4,6,7,3,1,9,4,1,8,6,3,9,2,8,2,5,7,4,6,4,9,2,4,3,1,1,7,2,7,1,3,7,9,4,9,9,8,6,7,9,1,6},{7,4,8,1,3,8,1,6,8,1,2,1,4,1,1,3,3,2,9,8,3,9,1,1,8,5,1,8,9,9,3,9,1,1,9,8,7,1,9,9,7,4,3,4,4,9,9,2,9,1,1,9,4,9,7,1,4,1,2,2,9,9,3,1,3,1,7,3,1,5,3,4,7,9,5,3,9,5,8,7,6,1,5,5,8,4,2,3,8,1,8,1,4,4,7,1,4,9,1,4},{1,9,6,2,8,2,8,6,2,1,4,2,1,9,1,2,1,2,7,1,9,5,2,4,5,9,3,8,4,2,4,1,2,1,7,5,4,6,9,7,1,1,8,6,4,2,1,9,4,2,3,2,4,1,4,8,2,7,8,4,8,9,1,2,3,1,8,1,3,1,7,2,2,9,6,9,6,1,1,1,9,2,5,4,1,6,1,4,7,1,2,4,1,3,1,2,4,3,8,9},{1,4,5,3,4,1,4,9,1,6,6,6,1,1,1,8,7,9,6,1,9,3,1,2,3,1,8,9,1,6,9,6,2,7,9,3,4,9,4,3,1,9,5,1,3,1,5,8,7,1,2,7,1,3,5,1,1,1,4,4,1,9,8,8,9,2,1,2,1,5,1,2,1,9,7,1,4,6,1,3,2,3,9,9,5,3,1,1,7,6,1,1,9,2,2,5,4,7,7,8},{1,5,1,8,3,2,3,1,5,4,6,3,9,9,1,1,2,2,2,8,8,6,5,1,4,1,1,1,8,9,3,8,5,1,3,5,9,2,3,5,1,9,2,3,9,2,2,1,1,1,1,5,7,4,1,1,3,5,9,8,4,9,1,9,8,1,1,5,5,3,4,4,3,9,4,5,1,9,1,5,2,4,4,2,1,1,1,2,2,7,1,1,4,9,3,5,1,1,6,5},{2,1,2,4,6,1,9,1,1,8,9,2,8,8,1,2,4,8,8,8,3,2,4,1,2,3,1,9,3,7,8,2,2,2,6,2,2,4,4,1,9,2,7,3,3,2,9,2,5,5,8,7,4,9,1,8,1,4,1,3,3,3,6,7,1,3,9,2,2,8,5,1,9,2,1,9,1,5,9,5,1,2,1,5,9,7,8,1,8,3,9,6,6,1,3,9,1,2,5,2},{9,1,3,6,1,2,3,2,3,8,7,1,3,3,9,1,2,1,3,6,1,5,3,3,8,8,3,6,8,1,4,1,7,3,6,1,3,3,7,2,1,9,2,3,3,7,5,1,2,8,9,1,8,8,1,4,7,9,1,9,5,9,8,8,5,2,1,9,3,6,9,1,5,1,1,9,1,1,9,4,3,5,8,1,2,2,8,4,1,1,5,1,3,4,9,8,5,1,2,1},{3,1,8,7,2,6,1,9,8,5,3,1,3,1,1,8,1,1,6,9,7,2,5,7,1,8,2,1,2,1,2,9,1,3,9,1,1,9,6,3,7,1,4,6,3,1,1,2,6,7,3,1,2,2,1,2,6,6,3,1,4,5,2,9,1,9,6,5,4,1,1,1,9,3,2,2,5,7,1,1,3,7,3,1,2,9,9,5,7,4,4,9,2,3,6,3,1,5,4,4},{2,3,3,2,1,9,6,7,7,1,1,8,1,4,2,2,1,2,1,4,7,1,6,1,1,1,3,3,2,5,9,3,2,1,3,1,3,1,3,6,9,4,7,1,4,1,2,1,7,6,2,4,1,1,3,3,1,3,1,8,1,1,8,9,1,8,2,8,9,9,5,7,1,6,1,3,2,2,9,6,1,1,5,1,1,5,2,9,1,3,4,3,9,2,8,4,6,3,4,1},{2,2,5,1,1,1,9,4,2,5,2,1,2,2,7,7,1,5,1,2,1,5,2,9,1,7,8,1,1,8,9,3,1,4,9,7,5,2,2,1,7,1,9,4,1,3,1,3,4,9,6,7,6,6,5,3,1,1,8,6,9,1,1,4,5,2,1,7,2,9,4,9,9,1,2,1,1,1,6,2,1,3,8,8,5,1,6,3,7,4,6,1,1,1,5,3,5,1,3,7},{9,5,8,6,2,2,6,1,9,9,4,1,7,3,1,7,1,5,1,9,1,5,2,8,2,2,9,1,1,4,9,9,9,5,6,3,1,7,8,1,7,3,1,8,5,1,1,5,9,7,1,1,3,4,8,6,1,1,2,1,2,6,2,8,4,9,3,2,7,1,2,6,3,1,5,2,5,5,5,2,7,3,2,1,3,3,1,6,7,7,6,4,9,2,7,9,3,6,5,8},{9,9,1,2,6,2,6,8,4,1,1,2,9,2,5,1,2,1,9,1,5,1,2,1,7,8,3,3,9,1,2,9,7,3,3,1,1,2,2,3,7,7,2,8,1,4,4,9,6,5,9,3,2,9,7,4,7,1,7,3,1,3,5,9,8,1,8,9,9,1,6,9,9,1,4,7,9,8,9,9,2,8,2,4,3,8,9,4,3,1,3,2,4,7,5,3,2,2,3,1},{3,4,1,8,2,4,1,6,1,8,9,4,7,5,1,6,3,3,2,2,2,7,6,1,3,8,3,1,3,7,4,9,2,1,8,7,4,8,5,5,5,8,4,1,2,5,5,5,8,1,1,4,4,2,9,4,7,1,1,2,1,3,2,1,2,3,2,1,7,7,2,1,4,3,2,1,5,9,8,5,2,1,5,9,7,1,6,1,1,9,1,1,2,8,2,1,6,9,5,4},{8,8,2,2,6,1,6,1,2,3,2,7,4,8,6,1,4,1,1,7,6,9,1,2,8,2,1,3,4,2,1,2,3,2,1,1,3,1,7,5,7,9,2,1,7,8,7,1,3,1,5,3,3,5,1,7,4,4,8,5,6,5,2,1,3,9,6,1,2,8,1,1,7,1,4,7,1,8,2,7,1,2,4,4,3,4,1,1,5,1,2,1,9,8,5,4,7,6,2,1},{5,1,3,6,3,3,3,3,9,1,4,1,4,8,1,2,8,4,2,1,3,9,9,9,9,6,2,7,6,1,2,2,5,1,1,8,1,1,1,9,1,1,6,1,3,4,1,1,5,9,9,3,2,3,7,2,2,1,1,9,4,4,3,2,7,7,4,3,2,7,4,6,4,9,2,6,1,3,5,1,8,1,5,1,9,8,1,9,1,5,7,2,4,3,1,5,7,3,1,1},{3,2,5,1,7,1,2,3,8,4,2,2,1,2,2,9,3,3,9,1,1,1,1,9,7,2,3,9,3,6,5,1,1,4,1,8,9,1,7,6,8,1,9,9,5,2,3,8,4,1,2,5,8,3,1,1,1,1,9,7,5,1,4,8,5,7,1,1,8,4,6,5,2,3,8,7,1,2,1,2,5,7,4,8,1,1,3,3,3,1,1,9,8,1,2,3,8,5,1,4},{4,1,7,9,2,2,1,8,9,7,2,5,3,1,9,6,9,4,3,1,1,1,4,4,4,9,9,4,3,8,1,4,5,2,9,9,8,2,3,2,7,7,9,7,5,9,9,4,7,1,1,9,7,1,4,5,2,9,1,3,7,5,4,1,9,6,4,4,1,1,1,5,4,3,4,1,8,5,1,4,1,2,4,6,8,9,6,6,6,1,2,1,2,8,5,4,6,5,7,2},{3,5,6,1,5,1,1,8,6,1,9,7,6,9,1,5,2,8,8,8,1,9,1,3,6,2,3,7,4,7,1,5,6,9,1,9,9,9,9,1,2,2,1,8,1,1,1,2,8,6,1,1,5,9,5,2,9,9,1,2,1,1,1,7,9,4,2,3,2,9,6,2,1,1,2,4,9,1,1,1,9,4,5,1,1,4,8,4,2,5,9,3,1,7,2,1,1,3,3,9},{7,1,1,1,1,2,9,2,2,9,7,3,1,2,6,1,1,1,1,2,8,3,4,1,5,3,9,3,2,9,6,1,1,3,7,7,3,3,6,4,2,8,7,1,9,1,6,8,1,1,1,5,1,1,3,2,1,8,8,2,5,8,1,3,2,1,3,4,8,7,8,2,8,2,4,9,2,2,2,9,6,2,6,9,5,1,1,5,5,1,5,6,9,1,8,7,3,5,1,4},{7,3,2,9,4,1,1,1,8,2,3,4,3,1,4,8,3,3,7,1,3,3,4,6,1,1,4,4,1,8,1,9,3,1,2,1,9,1,1,8,2,7,9,3,3,6,6,3,8,6,8,8,6,4,3,3,6,6,2,7,1,8,2,1,2,5,5,1,7,1,2,2,4,1,4,7,6,4,1,1,9,8,1,8,1,9,1,8,2,3,6,5,2,2,3,6,7,6,4,1},{9,2,8,3,2,7,3,1,1,4,2,4,1,1,9,7,5,3,2,1,6,8,1,4,9,3,2,6,9,7,7,4,4,2,9,7,2,1,3,2,1,3,4,2,1,2,1,1,6,8,4,5,5,8,2,2,7,9,6,8,1,5,6,3,7,7,2,6,7,7,1,2,2,9,3,1,5,7,1,2,3,9,5,3,5,2,2,6,5,8,1,8,1,9,8,4,3,5,2,9},{1,9,9,8,8,2,6,2,1,1,2,4,3,4,6,5,1,4,2,3,1,4,1,7,1,4,9,4,1,1,5,6,3,8,9,4,7,3,1,2,3,9,7,5,8,9,3,6,2,1,9,3,7,1,1,3,8,5,1,7,9,6,1,9,2,1,6,3,3,2,3,1,1,1,9,5,1,9,2,9,1,9,7,9,7,7,6,6,4,2,3,1,1,1,7,6,9,1,7,1},{5,5,2,5,1,1,2,2,9,4,5,9,1,8,1,8,2,6,7,9,1,1,3,8,9,1,6,2,2,1,1,1,2,3,2,2,8,6,1,1,2,4,1,3,7,2,1,1,1,4,8,7,5,7,1,1,1,1,1,1,4,3,2,2,1,3,2,7,4,1,6,1,2,1,4,1,2,1,3,8,5,3,1,3,7,2,8,9,1,1,2,2,8,2,1,4,5,3,6,9},{3,7,4,9,1,1,2,3,4,9,3,7,9,7,8,8,1,1,9,3,7,2,8,5,1,5,7,2,6,9,4,9,7,2,2,5,5,2,2,1,1,4,1,1,7,2,8,3,8,2,1,3,5,5,7,1,1,1,1,9,6,1,1,7,2,5,5,9,3,2,7,8,7,2,6,6,7,3,9,8,8,5,2,1,9,6,6,7,1,1,5,5,9,5,8,7,8,1,1,5},{2,7,1,1,3,5,3,2,1,1,4,7,2,1,2,1,9,8,9,3,7,2,1,2,4,1,8,2,6,7,8,1,1,7,3,9,8,9,1,7,8,1,1,2,3,9,2,1,9,1,5,6,3,1,5,9,5,3,1,9,3,6,2,8,3,4,4,5,5,2,1,6,3,4,5,1,1,6,1,9,1,7,4,1,9,1,8,3,1,1,4,1,9,9,8,9,7,1,7,2}};
        int origH = origMatrix.length;
        int origW = origMatrix[0].length;
        int[][] riskMatrix = new int[origH * 5][origW * 5];
        int h = riskMatrix.length;
        int w = riskMatrix[0].length;

        for (int i = 0; i < origH; i++ ) {
            for (int j = 0; j < origW; j++ ) {
                riskMatrix[i][j] = origMatrix[i][j];
            }
        }

        for (int i = origH; i < h; i++ ) {
            for (int j = 0; j < w; j++ ) {
                riskMatrix[i][j] = (riskMatrix[i % origH][j] + (i / origH) - 1) % 9 + 1;
                if (riskMatrix[i][j] > 9) {
                    riskMatrix[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < h; i++ ) {
            for (int j = origW; j < w; j++ ) {
                riskMatrix[i][j] = (riskMatrix[i][j % origW] + (j / origW) - 1) % 9 + 1;
                if (riskMatrix[i][j] > 9) {
                    riskMatrix[i][j] = 1;
                }
            }
        }

        distance = new int[h][w];
        for (int[] row : distance)
            Arrays.fill(row, INFINITY);

        // Bellman–Ford algorithm
        distance[0][0] = riskMatrix[0][0];
        for (int i = 0; i < w * h; i++) {
            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    int temp = INFINITY;
                    temp = Math.min(getDistance(x - 1, y), temp);
                    temp = Math.min(getDistance(x + 1, y), temp);
                    temp = Math.min(getDistance(x, y - 1), temp);
                    temp = Math.min(getDistance(x, y + 1), temp);
                    distance[y][x] = Math.min(riskMatrix[y][x] + temp, distance[y][x]);
                }
            }
        }

        System.out.println("Answer: " + (distance[h - 1][w - 1] - riskMatrix[0][0]));
    }

    private static int getDistance(int x, int y) {
        if (y < 0 || y >= distance.length || x < 0 || x >= distance[y].length)
            return INFINITY;
        else
            return distance[y][x];
    }
//    private static void findMinPath(int[][] riskMatrix, int rowIndex, int colIndex, Set<String> oldVisited, int oldRisk) {
//        if (!oldVisited.contains(rowIndex + " " + colIndex)) {
//            Set<String> newVisited = new HashSet<>(oldVisited);
//            newVisited.add(rowIndex + " " + colIndex);
//            int newRisk = oldRisk + riskMatrix[rowIndex][colIndex];
//            if (newRisk < minRisk) {
//                if (rowIndex == riskMatrix.length - 1 && colIndex == riskMatrix[0].length - 1) {
//                    minRisk = newRisk;
//                } else {
//                    if (rowIndex < riskMatrix.length - 1) {
//                        findMinPath(riskMatrix, rowIndex + 1, colIndex, newVisited, newRisk);
//                    }
////                    if (rowIndex > 0) {
////                        findMinPath(riskMatrix, rowIndex - 1, colIndex, newVisited, newRisk);
////                    }
//                    if (colIndex < riskMatrix[0].length - 1) {
//                        findMinPath(riskMatrix, rowIndex, colIndex + 1, newVisited, newRisk);
//                    }
////                    if (colIndex > 0) {
////                        findMinPath(riskMatrix, rowIndex, colIndex - 1, newVisited, newRisk);
////                    }
//                }
//            }
//        }
//    }
}
