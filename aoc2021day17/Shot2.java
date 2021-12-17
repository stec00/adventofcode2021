package aoc2021day17;

public class Shot2 {
    public static void main(String[] args) {
        int[][] target = {{192, 251}, {-89, -59}};
        int[] velocity = new int[2];
        int hits = 0;
        for (velocity[1] = -89; velocity[1] <= 88; velocity[1]++) {
            for (velocity[0] = 1; velocity[0] <= 252; velocity[0]++) {
                if (hitsTarget(velocity[0], velocity[1], target)) {
                    hits++;
                }
            }
        }
        System.out.println("Answer: " + hits);
    }

    private static boolean hitsTarget(int xVelocity, int yVelocity, int[][] target) {
        int x = 0;
        int y = 0;
        boolean hitTarget = false;
        while (y >= target[1][0]) {
            x += xVelocity;
            y += yVelocity;
            xVelocity = xVelocity == 0 ? xVelocity : (xVelocity > 0 ? xVelocity - 1 : xVelocity + 1);
            yVelocity--;
            hitTarget = hitTarget || (x >= target[0][0] && x <= target[0][1] && y >= target[1][0] && y <= target[1][1]);
        }
        return hitTarget;
    }
}