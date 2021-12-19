package aoc2021day18;

public class Snailfish1 {
    public static void main(String[] args) {
        String[] numbers = {"[[[[2,2],7],[[9,2],[5,2]]],[4,[[8,9],9]]]", "[[8,8],[5,[[2,9],1]]]", "[0,[3,[[9,2],[3,1]]]]", "[9,[[4,5],[5,[3,2]]]]", "[[0,[4,3]],[2,[[1,4],[3,0]]]]", "[[[9,[0,2]],[[2,6],9]],2]", "[1,[[[6,0],[2,6]],[[7,5],[5,6]]]]", "[[[1,[6,6]],[6,[5,2]]],[[[5,6],4],9]]", "[6,[[7,[1,4]],4]]", "[[[[7,6],[0,5]],[[5,4],0]],[[3,[2,3]],[[0,2],[6,4]]]]", "[[[3,4],7],[[[8,1],7],[3,[1,8]]]]", "[[[[6,5],0],[[5,2],6]],[[1,3],[0,[5,2]]]]", "[[[1,2],3],[[0,[3,7]],[4,[5,2]]]]", "[[[[4,4],3],2],[2,[6,3]]]", "[[[4,5],[[6,4],[8,5]]],[[[5,1],3],[8,3]]]", "[[6,[[9,0],6]],[3,[[3,3],3]]]", "[[8,[5,[1,7]]],[[4,5],[1,2]]]", "[[[[9,1],0],[[1,6],9]],[[8,[7,4]],9]]", "[[[3,1],[3,[5,5]]],[[[8,4],[2,9]],[6,[0,1]]]]", "[[7,4],[[6,3],[[8,3],[2,3]]]]", "[[[2,[5,6]],[[7,9],[8,7]]],[[3,5],[[1,7],[9,8]]]]", "[[[[2,8],1],[[1,9],[7,6]]],6]", "[[[[1,9],[5,5]],[7,8]],[[3,9],[2,[5,1]]]]", "[[4,[[6,7],6]],[1,[6,[6,5]]]]", "[[[[0,3],[2,7]],[7,1]],[[4,3],[[1,0],6]]]", "[[[[0,8],7],[[5,4],[8,6]]],[[1,[6,5]],5]]", "[[6,[[0,3],5]],[[9,[9,8]],0]]", "[[0,1],9]", "[[[[3,0],4],4],4]", "[[[0,8],[[1,7],1]],[[9,1],[4,[2,4]]]]", "[[5,[[6,1],2]],[[4,[5,9]],[[8,6],6]]]", "[[4,9],[[5,0],[[4,4],3]]]", "[[[[7,7],3],[3,[0,0]]],[1,[[0,8],[9,9]]]]", "[[[1,6],[9,1]],4]", "[[4,4],[[[0,0],9],[[2,0],[8,7]]]]", "[[7,[[6,8],9]],[[2,[7,6]],[6,[8,1]]]]", "[[[[7,9],[6,9]],[7,[2,5]]],[[[4,8],[3,7]],8]]", "[[[8,7],[[9,8],[3,6]]],[[[2,1],[4,7]],[[3,9],5]]]", "[[0,[[9,8],[5,3]]],[[9,6],[1,6]]]", "[9,[[[7,4],[9,9]],5]]", "[[9,[[6,7],[2,6]]],[[[2,8],[1,9]],[[4,1],[6,2]]]]", "[[1,[9,5]],[0,[[1,8],0]]]", "[[3,[7,6]],[8,[[3,2],[3,0]]]]", "[[4,6],[6,3]]", "[[[1,5],[[7,8],[6,4]]],[[3,[5,4]],[[9,8],1]]]", "[[[[8,5],5],[[7,9],8]],[[5,2],[8,6]]]", "[[[[3,4],9],[2,8]],[1,[9,8]]]", "[[[6,9],8],[[7,9],[6,[8,5]]]]", "[[[[7,4],9],1],7]", "[[[[0,5],[3,4]],[9,[9,7]]],[[1,6],5]]", "[6,[[[9,9],6],[[5,6],7]]]", "[[[1,4],[[4,6],[9,4]]],[[[0,3],2],[[1,9],6]]]", "[[8,[1,8]],[1,[5,[2,0]]]]", "[[[4,5],[[6,6],1]],[[4,0],[[9,9],[3,6]]]]", "[[9,[[0,0],[5,3]]],[[5,1],7]]", "[[[9,4],[[5,1],[2,7]]],[6,[6,1]]]", "[[8,5],[[[0,2],[2,6]],[3,[5,0]]]]", "[[[[4,8],[3,6]],[3,[3,1]]],[0,[6,3]]]", "[[[5,[9,6]],[3,[1,7]]],[[1,[9,2]],[6,5]]]", "[[[[5,2],[9,4]],[[6,5],7]],[[4,8],[[7,1],2]]]", "[[[5,[1,5]],5],[[[5,1],[0,9]],6]]", "[[4,[3,[9,9]]],[[[7,1],[6,5]],2]]", "[8,[[7,6],[8,7]]]", "[[[[4,2],5],[3,2]],[[2,7],[[7,2],[9,2]]]]", "[[[8,1],1],[5,[[0,9],[5,9]]]]", "[[[[2,2],[4,0]],2],[[9,[5,4]],[[2,9],[8,6]]]]", "[[[[6,8],0],[4,[1,5]]],[6,[[8,0],[6,6]]]]", "[[[3,0],2],5]", "[[[2,6],[5,[9,9]]],2]", "[[[[4,8],7],[0,0]],[[8,6],[[9,6],9]]]", "[[[1,4],0],[[[8,8],[9,3]],5]]", "[[[7,[8,8]],[[0,9],3]],7]", "[[[[3,1],[9,9]],[[7,9],7]],[[6,5],[[4,7],5]]]", "[[[1,3],2],[8,0]]", "[[8,[[5,0],[4,4]]],2]", "[[3,4],[[[4,8],4],[[3,4],8]]]", "[[4,[5,1]],[[8,[8,2]],[[3,5],[6,4]]]]", "[[[[7,6],5],[9,[7,3]]],[[4,[6,4]],[[6,1],9]]]", "[[0,[3,1]],[[4,[5,7]],6]]", "[[2,[[7,2],[4,5]]],1]", "[[[0,2],[3,[2,8]]],[[0,[0,6]],[1,[7,7]]]]", "[[1,[0,[7,0]]],[[[1,2],[1,9]],[4,[1,4]]]]", "[[[5,[7,4]],[[5,9],[7,0]]],[[[7,9],3],[[5,5],1]]]", "[[[[7,9],[3,0]],3],[8,8]]", "[[[[6,7],4],[[0,3],3]],[[2,[5,3]],8]]", "[[0,5],[3,[[6,6],[5,2]]]]", "[9,[[2,[8,7]],[6,[2,6]]]]", "[7,[[[1,9],[2,9]],[[1,0],5]]]", "[[5,0],[8,[2,2]]]", "[[3,[2,[8,0]]],3]", "[[[0,2],[6,[4,5]]],[3,[9,[0,4]]]]", "[[[6,7],7],[[8,[4,5]],[4,[1,7]]]]", "[[[[2,7],[9,6]],[5,0]],3]", "[[[[3,2],5],[8,3]],[[4,1],[[8,8],[6,4]]]]", "[[[2,[5,3]],[1,4]],[[[3,9],9],[[7,8],[5,7]]]]", "[5,[[[8,2],[0,4]],[[5,3],0]]]", "[[[3,4],3],[3,[[3,8],[2,1]]]]", "[5,[[[3,8],[5,2]],2]]", "[[[[3,8],6],[8,9]],[[3,[7,5]],[[4,4],2]]]", "[[[2,[3,9]],[[4,5],[7,9]]],5]"};
        String total = null;
        for (String number : numbers) {
            number = number.replace("[", "(");
            number = number.replace("]", ")");
            if (total == null) {
                total = number;
            } else {
                total = add(total, number);
            }
        }
        System.out.println("Answer: " + getMagnitude(total));
    }

    private static String add(String number1, String number2) {
        String total = "(" + number1 + "," + number2 + ")";
        return reduce(total);
    }

    private static String reduce(String number) {
        String oldNumber;
        do {
            oldNumber = number;
            number = doExplosions(number);
            if (number.equals(oldNumber)) {
                number = doSplits(number);
            }
        } while (!number.equals(oldNumber));

        return number;
    }

    private static String doExplosions(String number) {
        String prevNumber = new String(number);
        int nestLevel = 0;
        int prevNumberPos = -1;
        char explodeRhs = 0;
        boolean exploding = false;
        for (int pos = 0; pos < number.length(); pos++) {
            char ch = number.charAt(pos);
            if (ch == '(') {
                nestLevel++;
            } else if (ch == ')') {
                nestLevel--;
            } else if (ch >= '0') {
                if (exploding) {
                    number = number.substring(0, pos)
                            + ((char) (ch + explodeRhs - '0'))
                            + number.substring(pos + 1);
                    break;
                } else if (nestLevel > 4) {
                    // Explode
                    exploding = true;
                    explodeRhs = number.charAt(pos + 2);
                    if (prevNumberPos >= 0) {
                        number = number.substring(0, prevNumberPos)
                                + ((char) (number.charAt(prevNumberPos) + number.charAt(pos) - '0'))
                                + number.substring(prevNumberPos + 1);
                    }
                    number = number.substring(0, pos - 1)
                            + "0"
                            + number.substring(pos + 4);
                }
                prevNumberPos = pos;
            }
        }

        return number;
    }

    private static String doSplits(String number) {
        String prevNumber = new String(number);
        for (int pos = 0; pos < number.length(); pos++) {
            char c = number.charAt(pos);
            if (c > '9') {
                number = number.substring(0, pos) + "("
                        + ((char) ('0' + (c - '0') / 2))
                        + ","
                        + (char) ('0' + Math.ceil((c - '0') / 2.0))
                        + ")"
                        + number.substring(pos + 1);
                break;
            }
        }

        return number;
    }

    private static int getMagnitude(String number) {
        return getMagnitude(getPart(number, 0), getPart(number, 1));
    }

    private static int getMagnitude(String part0, String part1) {
        if (part0.length() == 1 && part1.length() == 1) {
            return 3 * Integer.parseInt(part0) + 2 * Integer.parseInt(part1);
        } else if (part0.length() > 1 && part1.length() > 1) {
            return 3 * getMagnitude(getPart(part0, 0), getPart(part0, 1))
                    + 2 * getMagnitude(getPart(part1, 0), getPart(part1, 1));
        } else if (part0.length() > 1) {
            return 3 * getMagnitude(getPart(part0, 0), getPart(part0, 1)) + 2 * Integer.parseInt(part1);
        } else {
            return 3 * Integer.parseInt(part0) + 2 * getMagnitude(getPart(part1, 0), getPart(part1, 1));
        }
    }

    private static String getPart(String number, int partIndex) {
        String part = "";
        int nestedLevel = 0;
        if (partIndex == 0) {
            char firstChar = number.charAt(1);
            if (firstChar == '(') {
                for (int pos = 1; pos < number.length() - 1; pos++) {
                    char c = number.charAt(pos);
                    part += c;
                    if (c == '(') {
                        nestedLevel++;
                    } else if (c == ')') {
                        nestedLevel--;
                        if (nestedLevel == 0) {
                            break;
                        }
                    }
                }
            } else {
                return String.valueOf(firstChar);
            }
        } else {
            char lastChar = number.charAt(number.length() - 2);
            if (lastChar == ')') {
                for (int pos = number.length() - 2; pos > 0; pos--) {
                    char c = number.charAt(pos);
                    part = c + part;
                    if (c == '(') {
                        nestedLevel++;
                        if (nestedLevel == 0) {
                            break;
                        }
                    } else if (c == ')') {
                        nestedLevel--;
                    }
                }
            } else {
                return String.valueOf(lastChar);
            }
        }

        return part;
    }
}
