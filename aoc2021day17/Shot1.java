package aoc2021day17;

public class Shot1 {
    public static void main(String[] args) {
        int[][] target = {{192, 251}, {-89, -59}};
        int[] velocity = {1, 1};
        int[] finalPos = new int[2];
        int[] maxHeightWrapper = { 0 };
        int prevMaxHeight = 0;
        while (velocity[0] <= target[0][1] && !hitsTarget(velocity[0], velocity[1], target, finalPos, maxHeightWrapper)) {
            if (finalPos[1] == 0) {
                break;
            } else {
                velocity[1]++;
            }
            prevMaxHeight = maxHeightWrapper[0];
        }
        System.out.println("Answer: " + prevMaxHeight);
    }

    private static boolean hitsTarget(int xVelocity, int yVelocity, int[][] target, int[] finalPos, int[] maxHeightWrapper) {
        int x = 0;
        int y = 0;
        int maxHeight = 0;
        while (y >= target[1][0]) {
            finalPos[0] = x;
            finalPos[1] = y;
            x += xVelocity;
            y += yVelocity;
            if (y > maxHeight) {
                maxHeight = y;
            }
            xVelocity = xVelocity == 0 ? xVelocity : (xVelocity > 0 ? xVelocity - 1 : xVelocity + 1);
            yVelocity--;
        }
        boolean hitTarget = finalPos[0] >= target[0][0] && finalPos[0] <= target[0][1] && finalPos[1] >= target[1][1] && finalPos[1] <= target[1][0];
        //if (hitTarget) {
            maxHeightWrapper[0] = Math.max(maxHeightWrapper[0], maxHeight);
        //}
        return hitTarget;
    }
}