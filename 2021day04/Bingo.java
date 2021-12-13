import java.util.*;

public class Bingo {
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(14,30,18,8,3,10,77,4,48,67,28,38,63,43,62,12,68,88,54,32,17,21,83,64,97,53,24,2,60,96,86,23,20,93,65,34,45,46,42,49,71,9,61,16,31,1,29,40,59,87,95,41,39,27,6,25,19,58,80,81,50,79,73,15,70,37,92,94,7,55,85,98,5,84,99,26,66,57,82,75,22,89,74,36,11,76,56,33,13,72,35,78,47,91,51,44,69,0,90,52);
    
    List<List<List<Integer>>> boards = Arrays.asList(Arrays.asList(Arrays.asList(13, 62, 38, 10, 41), Arrays.asList(93, 59, 60, 74, 75), Arrays.asList(79, 18, 57, 90, 28), Arrays.asList(56, 76, 34, 96, 84), Arrays.asList(78, 42, 69, 14, 19)), Arrays.asList(Arrays.asList(96, 38, 62, 8, 7), Arrays.asList(78, 50, 53, 29, 81), Arrays.asList(88, 45, 34, 58, 52), Arrays.asList(33, 76, 13, 54, 68), Arrays.asList(59, 95, 10, 80, 63)), Arrays.asList(Arrays.asList(36, 26, 74, 29, 55), Arrays.asList(43, 87, 46, 70, 21), Arrays.asList(9, 17, 38, 58, 63), Arrays.asList(56, 79, 85, 51, 2), Arrays.asList(50, 57, 67, 86, 8)), Arrays.asList(Arrays.asList(29, 78, 3, 24, 79), Arrays.asList(15, 81, 20, 6, 38), Arrays.asList(97, 41, 28, 42, 82), Arrays.asList(45, 68, 89, 85, 92), Arrays.asList(48, 33, 40, 62, 4)), Arrays.asList(Arrays.asList(68, 38, 43, 2, 27), Arrays.asList(74, 92, 49, 11, 22), Arrays.asList(33, 97, 73, 87, 30), Arrays.asList(42, 28, 60, 39, 67), Arrays.asList(3, 66, 35, 94, 47)), Arrays.asList(Arrays.asList(6, 65, 2, 30, 88), Arrays.asList(69, 3, 33, 61, 23), Arrays.asList(62, 40, 37, 7, 43), Arrays.asList(55, 12, 70, 36, 73), Arrays.asList(15, 20, 85, 38, 44)), Arrays.asList(Arrays.asList(99, 36, 10, 83, 69), Arrays.asList(31, 58, 93, 87, 56), Arrays.asList(33, 25, 82, 59, 30), Arrays.asList(45, 86, 79, 12, 2), Arrays.asList(39, 57, 51, 53, 13)), Arrays.asList(Arrays.asList(48, 46, 11, 20, 69), Arrays.asList(89, 9, 96, 45, 76), Arrays.asList(67, 78, 82, 6, 97), Arrays.asList(30, 41, 37, 32, 64), Arrays.asList(47, 31, 93, 29, 75)), Arrays.asList(Arrays.asList(49, 93, 50, 83, 64), Arrays.asList(54, 4, 18, 1, 76), Arrays.asList(75, 30, 19, 78, 12), Arrays.asList(84, 55, 28, 3, 57), Arrays.asList(16, 77, 87, 25, 2)), Arrays.asList(Arrays.asList(15, 57, 86, 92, 60), Arrays.asList(87, 66, 76, 12, 52), Arrays.asList(62, 74, 93, 88, 78), Arrays.asList(39, 13, 44, 20, 46), Arrays.asList(59, 31, 40, 91, 79)), Arrays.asList(Arrays.asList(82, 16, 73, 45, 42), Arrays.asList(21, 79, 97, 62, 5), Arrays.asList(96, 52, 53, 74, 49), Arrays.asList(38, 84, 85, 69, 68), Arrays.asList(35, 44, 92, 1, 47)), Arrays.asList(Arrays.asList(8, 22, 61, 35, 88), Arrays.asList(84, 86, 33, 26, 11), Arrays.asList(57, 24, 83, 25, 64), Arrays.asList(46, 47, 28, 6, 96), Arrays.asList(58, 99, 3, 29, 40)), Arrays.asList(Arrays.asList(61, 49, 56, 59, 81), Arrays.asList(68, 58, 98, 50, 23), Arrays.asList(92, 33, 43, 65, 16), Arrays.asList(94, 47, 74, 21, 60), Arrays.asList(83, 69, 35, 31, 27)), Arrays.asList(Arrays.asList(4, 32, 91, 53, 18), Arrays.asList(41, 84, 26, 69, 31), Arrays.asList(25, 81, 0, 71, 57), Arrays.asList(39, 11, 43, 14, 63), Arrays.asList(24, 73, 58, 17, 95)), Arrays.asList(Arrays.asList(3, 50, 57, 9, 94), Arrays.asList(48, 43, 42, 96, 15), Arrays.asList(25, 0, 38, 12, 39), Arrays.asList(45, 56, 77, 47, 53), Arrays.asList(19, 95, 24, 28, 54)), Arrays.asList(Arrays.asList(78, 67, 64, 33, 40), Arrays.asList(29, 48, 8, 17, 38), Arrays.asList(22, 79, 71, 46, 83), Arrays.asList(11, 45, 47, 87, 80), Arrays.asList(3, 84, 26, 5, 28)), Arrays.asList(Arrays.asList(77, 92, 70, 44, 61), Arrays.asList(59, 78, 12, 8, 50), Arrays.asList(60, 58, 55, 98, 85), Arrays.asList(66, 2, 52, 83, 81), Arrays.asList(34, 79, 20, 30, 38)), Arrays.asList(Arrays.asList(67, 3, 44, 4, 91), Arrays.asList(78, 64, 32, 54, 31), Arrays.asList(89, 41, 94, 18, 8), Arrays.asList(58, 23, 48, 62, 16), Arrays.asList(24, 12, 80, 53, 28)), Arrays.asList(Arrays.asList(76, 54, 87, 69, 88), Arrays.asList(16, 36, 90, 48, 5), Arrays.asList(75, 62, 15, 96, 23), Arrays.asList(70, 42, 61, 1, 41), Arrays.asList(71, 22, 45, 92, 8)), Arrays.asList(Arrays.asList(34, 99, 93, 83, 80), Arrays.asList(31, 9, 43, 12, 57), Arrays.asList(18, 59, 10, 53, 0), Arrays.asList(76, 87, 74, 38, 39), Arrays.asList(61, 48, 60, 16, 3)), Arrays.asList(Arrays.asList(98, 1, 32, 7, 97), Arrays.asList(87, 99, 14, 53, 46), Arrays.asList(54, 26, 43, 57, 49), Arrays.asList(89, 72, 5, 0, 40), Arrays.asList(11, 28, 76, 84, 85)), Arrays.asList(Arrays.asList(58, 65, 14, 33, 32), Arrays.asList(13, 27, 30, 44, 35), Arrays.asList(45, 56, 10, 1, 31), Arrays.asList(68, 93, 96, 38, 26), Arrays.asList(17, 53, 72, 6, 86)), Arrays.asList(Arrays.asList(85, 34, 72, 52, 11), Arrays.asList(92, 22, 79, 55, 47), Arrays.asList(12, 3, 86, 95, 14), Arrays.asList(84, 81, 17, 20, 67), Arrays.asList(31, 16, 69, 61, 2)), Arrays.asList(Arrays.asList(40, 10, 23, 8, 61), Arrays.asList(88, 11, 86, 87, 49), Arrays.asList(36, 3, 73, 58, 20), Arrays.asList(33, 62, 98, 38, 93), Arrays.asList(63, 95, 6, 90, 18)), Arrays.asList(Arrays.asList(49, 15, 55, 14, 57), Arrays.asList(41, 36, 32, 1, 35), Arrays.asList(78, 70, 79, 54, 26), Arrays.asList(23, 0, 34, 21, 77), Arrays.asList(96, 48, 51, 47, 82)), Arrays.asList(Arrays.asList(29, 61, 54, 64, 35), Arrays.asList(79, 11, 31, 55, 42), Arrays.asList(0, 88, 20, 34, 3), Arrays.asList(84, 59, 46, 68, 50), Arrays.asList(43, 6, 12, 17, 73)), Arrays.asList(Arrays.asList(53, 91, 64, 39, 5), Arrays.asList(23, 51, 33, 13, 55), Arrays.asList(25, 66, 56, 20, 98), Arrays.asList(6, 46, 72, 70, 3), Arrays.asList(19, 38, 54, 16, 34)), Arrays.asList(Arrays.asList(14, 94, 60, 28, 2), Arrays.asList(97, 80, 93, 89, 83), Arrays.asList(71, 86, 74, 52, 5), Arrays.asList(77, 69, 64, 10, 81), Arrays.asList(21, 22, 95, 39, 78)), Arrays.asList(Arrays.asList(79, 33, 4, 61, 66), Arrays.asList(31, 49, 67, 30, 98), Arrays.asList(43, 71, 84, 72, 52), Arrays.asList(29, 39, 81, 35, 37), Arrays.asList(2, 95, 94, 13, 14)), Arrays.asList(Arrays.asList(77, 19, 40, 46, 96), Arrays.asList(37, 81, 64, 75, 95), Arrays.asList(47, 68, 83, 25, 69), Arrays.asList(70, 35, 11, 17, 91), Arrays.asList(31, 92, 1, 44, 14)), Arrays.asList(Arrays.asList(68, 66, 30, 84, 55), Arrays.asList(87, 76, 73, 29, 53), Arrays.asList(37, 58, 23, 12, 35), Arrays.asList(1, 7, 20, 34, 82), Arrays.asList(27, 86, 16, 60, 54)), Arrays.asList(Arrays.asList(11, 68, 61, 36, 13), Arrays.asList(78, 38, 98, 22, 73), Arrays.asList(56, 89, 93, 8, 10), Arrays.asList(5, 82, 60, 40, 76), Arrays.asList(45, 39, 72, 48, 75)), Arrays.asList(Arrays.asList(35, 22, 88, 77, 8), Arrays.asList(75, 30, 90, 6, 41), Arrays.asList(12, 69, 48, 73, 61), Arrays.asList(18, 1, 58, 32, 79), Arrays.asList(37, 36, 85, 9, 17)), Arrays.asList(Arrays.asList(81, 76, 31, 87, 10), Arrays.asList(27, 69, 36, 57, 15), Arrays.asList(44, 72, 30, 59, 9), Arrays.asList(24, 91, 13, 73, 61), Arrays.asList(20, 84, 55, 51, 26)), Arrays.asList(Arrays.asList(95, 74, 5, 11, 44), Arrays.asList(16, 26, 91, 58, 53), Arrays.asList(82, 55, 27, 61, 76), Arrays.asList(40, 4, 20, 78, 33), Arrays.asList(32, 28, 98, 9, 15)), Arrays.asList(Arrays.asList(20, 1, 36, 71, 23), Arrays.asList(56, 42, 0, 73, 45), Arrays.asList(92, 64, 5, 50, 43), Arrays.asList(69, 37, 87, 53, 7), Arrays.asList(57, 84, 61, 70, 58)), Arrays.asList(Arrays.asList(25, 95, 78, 27, 43), Arrays.asList(77, 97, 74, 13, 68), Arrays.asList(20, 81, 18, 37, 4), Arrays.asList(61, 9, 55, 92, 73), Arrays.asList(72, 16, 80, 41, 57)), Arrays.asList(Arrays.asList(86, 74, 92, 16, 62), Arrays.asList(97, 82, 26, 66, 41), Arrays.asList(73, 46, 6, 40, 83), Arrays.asList(48, 50, 67, 13, 3), Arrays.asList(20, 27, 61, 10, 81)), Arrays.asList(Arrays.asList(53, 24, 29, 60, 79), Arrays.asList(57, 39, 31, 34, 15), Arrays.asList(12, 38, 13, 8, 30), Arrays.asList(94, 98, 14, 54, 6), Arrays.asList(47, 82, 65, 22, 42)), Arrays.asList(Arrays.asList(72, 69, 86, 31, 40), Arrays.asList(19, 77, 21, 9, 52), Arrays.asList(53, 97, 7, 27, 20), Arrays.asList(35, 46, 22, 23, 39), Arrays.asList(11, 43, 50, 29, 28)), Arrays.asList(Arrays.asList(34, 10, 81, 75, 42), Arrays.asList(27, 67, 59, 20, 87), Arrays.asList(45, 17, 46, 23, 76), Arrays.asList(40, 4, 77, 25, 96), Arrays.asList(18, 8, 88, 53, 32)), Arrays.asList(Arrays.asList(39, 37, 52, 22, 70), Arrays.asList(51, 15, 69, 23, 64), Arrays.asList(65, 50, 43, 29, 91), Arrays.asList(3, 67, 1, 84, 76), Arrays.asList(96, 72, 54, 28, 42)), Arrays.asList(Arrays.asList(45, 81, 20, 22, 59), Arrays.asList(94, 70, 27, 61, 77), Arrays.asList(4, 83, 44, 68, 42), Arrays.asList(13, 93, 1, 30, 34), Arrays.asList(84, 37, 35, 8, 48)), Arrays.asList(Arrays.asList(24, 91, 55, 76, 74), Arrays.asList(48, 64, 59, 58, 44), Arrays.asList(99, 29, 3, 34, 87), Arrays.asList(20, 4, 42, 68, 65), Arrays.asList(90, 13, 82, 93, 78)), Arrays.asList(Arrays.asList(61, 36, 18, 56, 26), Arrays.asList(81, 41, 1, 96, 78), Arrays.asList(68, 54, 84, 4, 86), Arrays.asList(71, 52, 28, 59, 39), Arrays.asList(60, 72, 40, 58, 37)), Arrays.asList(Arrays.asList(66, 91, 90, 56, 73), Arrays.asList(30, 28, 22, 8, 6), Arrays.asList(19, 70, 95, 17, 72), Arrays.asList(46, 20, 10, 21, 36), Arrays.asList(53, 64, 99, 9, 79)), Arrays.asList(Arrays.asList(93, 62, 37, 28, 17), Arrays.asList(51, 42, 76, 58, 65), Arrays.asList(99, 71, 12, 66, 11), Arrays.asList(19, 13, 3, 97, 22), Arrays.asList(86, 50, 36, 39, 16)), Arrays.asList(Arrays.asList(10, 32, 80, 74, 2), Arrays.asList(38, 59, 90, 63, 98), Arrays.asList(51, 7, 9, 57, 24), Arrays.asList(19, 48, 75, 79, 30), Arrays.asList(40, 86, 72, 71, 54)), Arrays.asList(Arrays.asList(10, 99, 7, 84, 46), Arrays.asList(16, 79, 74, 55, 57), Arrays.asList(54, 12, 63, 30, 82), Arrays.asList(49, 81, 33, 39, 14), Arrays.asList(65, 58, 67, 98, 61)), Arrays.asList(Arrays.asList(60, 53, 43, 12, 2), Arrays.asList(26, 25, 49, 61, 54), Arrays.asList(17, 73, 75, 47, 19), Arrays.asList(9, 95, 67, 46, 98), Arrays.asList(86, 8, 35, 81, 77)), Arrays.asList(Arrays.asList(45, 1, 88, 26, 31), Arrays.asList(53, 37, 64, 11, 28), Arrays.asList(7, 39, 32, 9, 72), Arrays.asList(75, 51, 50, 70, 3), Arrays.asList(82, 79, 71, 90, 8)), Arrays.asList(Arrays.asList(58, 26, 97, 61, 76), Arrays.asList(24, 90, 98, 15, 80), Arrays.asList(62, 75, 34, 69, 4), Arrays.asList(10, 0, 64, 73, 99), Arrays.asList(46, 83, 40, 23, 65)), Arrays.asList(Arrays.asList(11, 42, 17, 59, 88), Arrays.asList(71, 25, 27, 60, 96), Arrays.asList(43, 72, 69, 46, 37), Arrays.asList(29, 1, 66, 12, 76), Arrays.asList(22, 34, 81, 47, 80)), Arrays.asList(Arrays.asList(14, 24, 36, 83, 31), Arrays.asList(26, 59, 8, 60, 21), Arrays.asList(57, 90, 85, 89, 32), Arrays.asList(64, 4, 91, 99, 81), Arrays.asList(33, 1, 54, 73, 40)), Arrays.asList(Arrays.asList(70, 57, 10, 81, 68), Arrays.asList(16, 97, 21, 11, 88), Arrays.asList(56, 24, 51, 61, 5), Arrays.asList(38, 80, 31, 23, 9), Arrays.asList(48, 95, 30, 91, 41)), Arrays.asList(Arrays.asList(53, 15, 91, 12, 87), Arrays.asList(83, 72, 98, 0, 58), Arrays.asList(49, 42, 94, 39, 77), Arrays.asList(6, 59, 90, 48, 26), Arrays.asList(2, 78, 62, 93, 33)), Arrays.asList(Arrays.asList(59, 13, 31, 24, 71), Arrays.asList(18, 30, 3, 33, 34), Arrays.asList(15, 61, 56, 91, 75), Arrays.asList(38, 58, 29, 72, 26), Arrays.asList(81, 50, 88, 82, 40)), Arrays.asList(Arrays.asList(26, 44, 95, 42, 3), Arrays.asList(52, 12, 51, 20, 68), Arrays.asList(45, 34, 36, 11, 77), Arrays.asList(99, 54, 85, 47, 75), Arrays.asList(22, 63, 82, 32, 15)), Arrays.asList(Arrays.asList(52, 34, 81, 57, 70), Arrays.asList(44, 51, 31, 39, 80), Arrays.asList(14, 82, 12, 8, 75), Arrays.asList(28, 38, 5, 58, 45), Arrays.asList(22, 26, 21, 92, 74)), Arrays.asList(Arrays.asList(88, 47, 20, 17, 0), Arrays.asList(50, 52, 53, 43, 57), Arrays.asList(40, 38, 33, 9, 36), Arrays.asList(78, 93, 63, 12, 14), Arrays.asList(65, 67, 91, 48, 98)), Arrays.asList(Arrays.asList(25, 56, 93, 76, 12), Arrays.asList(39, 51, 97, 86, 94), Arrays.asList(74, 10, 77, 1, 5), Arrays.asList(66, 55, 79, 89, 48), Arrays.asList(92, 58, 80, 78, 87)), Arrays.asList(Arrays.asList(72, 55, 75, 34, 69), Arrays.asList(31, 73, 42, 86, 70), Arrays.asList(81, 11, 33, 45, 17), Arrays.asList(96, 27, 65, 50, 35), Arrays.asList(18, 88, 98, 84, 39)), Arrays.asList(Arrays.asList(91, 51, 90, 93, 6), Arrays.asList(77, 35, 13, 50, 17), Arrays.asList(89, 75, 57, 39, 36), Arrays.asList(92, 64, 56, 20, 78), Arrays.asList(12, 80, 34, 69, 9)), Arrays.asList(Arrays.asList(99, 59, 14, 76, 4), Arrays.asList(84, 19, 72, 30, 40), Arrays.asList(75, 6, 68, 66, 3), Arrays.asList(51, 28, 60, 2, 63), Arrays.asList(85, 77, 62, 65, 5)), Arrays.asList(Arrays.asList(29, 23, 24, 20, 87), Arrays.asList(96, 0, 6, 40, 98), Arrays.asList(13, 80, 41, 82, 3), Arrays.asList(62, 88, 25, 10, 99), Arrays.asList(32, 59, 31, 94, 9)), Arrays.asList(Arrays.asList(22, 53, 42, 6, 33), Arrays.asList(40, 29, 54, 68, 27), Arrays.asList(19, 30, 77, 37, 61), Arrays.asList(17, 62, 57, 36, 44), Arrays.asList(69, 50, 32, 1, 20)), Arrays.asList(Arrays.asList(87, 88, 94, 41, 91), Arrays.asList(75, 85, 67, 78, 9), Arrays.asList(89, 46, 34, 59, 25), Arrays.asList(74, 20, 77, 97, 56), Arrays.asList(62, 11, 54, 17, 38)), Arrays.asList(Arrays.asList(85, 99, 89, 0, 98), Arrays.asList(82, 90, 62, 8, 24), Arrays.asList(23, 72, 51, 59, 77), Arrays.asList(78, 31, 60, 10, 29), Arrays.asList(44, 46, 26, 58, 68)), Arrays.asList(Arrays.asList(39, 71, 56, 63, 33), Arrays.asList(66, 83, 68, 58, 69), Arrays.asList(93, 73, 70, 15, 88), Arrays.asList(55, 76, 4, 92, 38), Arrays.asList(47, 28, 36, 94, 89)), Arrays.asList(Arrays.asList(12, 22, 20, 14, 51), Arrays.asList(30, 11, 86, 57, 97), Arrays.asList(56, 6, 93, 59, 18), Arrays.asList(28, 40, 90, 67, 94), Arrays.asList(16, 50, 89, 95, 88)), Arrays.asList(Arrays.asList(15, 26, 31, 56, 21), Arrays.asList(47, 77, 23, 22, 66), Arrays.asList(86, 51, 49, 24, 54), Arrays.asList(53, 2, 0, 84, 63), Arrays.asList(60, 92, 48, 17, 4)), Arrays.asList(Arrays.asList(16, 74, 15, 19, 53), Arrays.asList(86, 13, 59, 8, 39), Arrays.asList(44, 77, 25, 90, 70), Arrays.asList(92, 3, 33, 60, 37), Arrays.asList(10, 22, 20, 28, 14)), Arrays.asList(Arrays.asList(21, 72, 63, 91, 41), Arrays.asList(46, 6, 8, 73, 71), Arrays.asList(9, 54, 52, 78, 43), Arrays.asList(10, 27, 23, 42, 48), Arrays.asList(2, 25, 80, 20, 37)), Arrays.asList(Arrays.asList(46, 70, 1, 56, 35), Arrays.asList(20, 33, 52, 25, 63), Arrays.asList(71, 57, 40, 45, 30), Arrays.asList(26, 51, 95, 3, 47), Arrays.asList(58, 55, 98, 83, 74)), Arrays.asList(Arrays.asList(47, 23, 58, 98, 59), Arrays.asList(28, 49, 32, 81, 18), Arrays.asList(83, 54, 34, 67, 3), Arrays.asList(4, 95, 27, 74, 22), Arrays.asList(2, 45, 30, 44, 33)), Arrays.asList(Arrays.asList(67, 77, 0, 29, 76), Arrays.asList(15, 25, 34, 63, 42), Arrays.asList(21, 68, 18, 1, 99), Arrays.asList(7, 69, 94, 79, 4), Arrays.asList(50, 8, 17, 81, 53)), Arrays.asList(Arrays.asList(29, 90, 98, 59, 39), Arrays.asList(15, 6, 91, 7, 76), Arrays.asList(22, 66, 27, 23, 37), Arrays.asList(12, 33, 38, 54, 31), Arrays.asList(86, 48, 85, 16, 11)), Arrays.asList(Arrays.asList(62, 57, 12, 76, 59), Arrays.asList(41, 66, 13, 27, 43), Arrays.asList(55, 83, 78, 95, 65), Arrays.asList(82, 51, 77, 53, 14), Arrays.asList(34, 45, 94, 92, 19)), Arrays.asList(Arrays.asList(13, 71, 1, 27, 41), Arrays.asList(45, 6, 60, 91, 20), Arrays.asList(90, 2, 98, 76, 32), Arrays.asList(94, 92, 84, 54, 78), Arrays.asList(51, 21, 40, 50, 47)), Arrays.asList(Arrays.asList(58, 47, 98, 68, 23), Arrays.asList(92, 63, 28, 82, 73), Arrays.asList(64, 93, 94, 37, 31), Arrays.asList(12, 20, 41, 61, 35), Arrays.asList(44, 83, 36, 95, 99)), Arrays.asList(Arrays.asList(0, 47, 37, 21, 64), Arrays.asList(79, 17, 46, 70, 97), Arrays.asList(5, 89, 76, 36, 32), Arrays.asList(51, 38, 19, 59, 31), Arrays.asList(3, 50, 63, 45, 9)), Arrays.asList(Arrays.asList(65, 86, 43, 8, 77), Arrays.asList(38, 18, 49, 14, 88), Arrays.asList(87, 28, 27, 26, 32), Arrays.asList(19, 9, 45, 98, 76), Arrays.asList(85, 80, 5, 7, 25)), Arrays.asList(Arrays.asList(67, 65, 23, 88, 28), Arrays.asList(70, 71, 83, 35, 13), Arrays.asList(91, 6, 47, 54, 2), Arrays.asList(15, 76, 59, 74, 62), Arrays.asList(46, 80, 95, 27, 18)), Arrays.asList(Arrays.asList(34, 68, 61, 1, 86), Arrays.asList(28, 97, 29, 56, 24), Arrays.asList(87, 73, 44, 94, 36), Arrays.asList(58, 8, 49, 72, 47), Arrays.asList(83, 54, 30, 39, 41)), Arrays.asList(Arrays.asList(24, 71, 72, 5, 11), Arrays.asList(37, 30, 88, 86, 22), Arrays.asList(18, 94, 48, 10, 47), Arrays.asList(64, 0, 20, 74, 12), Arrays.asList(87, 46, 59, 92, 33)), Arrays.asList(Arrays.asList(90, 77, 97, 61, 75), Arrays.asList(2, 10, 5, 63, 69), Arrays.asList(43, 32, 83, 24, 13), Arrays.asList(78, 1, 50, 70, 53), Arrays.asList(87, 47, 68, 73, 0)), Arrays.asList(Arrays.asList(58, 95, 26, 35, 23), Arrays.asList(8, 2, 83, 41, 56), Arrays.asList(60, 44, 75, 84, 92), Arrays.asList(88, 78, 53, 31, 55), Arrays.asList(80, 70, 25, 81, 0)), Arrays.asList(Arrays.asList(10, 59, 62, 74, 86), Arrays.asList(42, 64, 58, 36, 14), Arrays.asList(93, 51, 45, 1, 3), Arrays.asList(52, 69, 94, 5, 44), Arrays.asList(4, 50, 48, 8, 12)), Arrays.asList(Arrays.asList(38, 40, 21, 97, 74), Arrays.asList(98, 17, 3, 56, 58), Arrays.asList(57, 63, 44, 93, 70), Arrays.asList(10, 48, 49, 81, 73), Arrays.asList(12, 55, 86, 41, 82)), Arrays.asList(Arrays.asList(93, 29, 38, 58, 5), Arrays.asList(9, 95, 45, 67, 97), Arrays.asList(16, 64, 99, 65, 94), Arrays.asList(43, 34, 14, 23, 66), Arrays.asList(0, 88, 87, 50, 78)), Arrays.asList(Arrays.asList(72, 70, 87, 50, 31), Arrays.asList(90, 91, 69, 18, 75), Arrays.asList(42, 21, 11, 86, 81), Arrays.asList(20, 63, 13, 43, 2), Arrays.asList(56, 92, 29, 30, 73)), Arrays.asList(Arrays.asList(63, 98, 32, 50, 17), Arrays.asList(71, 79, 4, 67, 44), Arrays.asList(7, 68, 45, 58, 80), Arrays.asList(59, 12, 55, 83, 34), Arrays.asList(90, 94, 86, 25, 0)), Arrays.asList(Arrays.asList(15, 24, 92, 39, 53), Arrays.asList(63, 7, 30, 77, 28), Arrays.asList(65, 97, 68, 98, 35), Arrays.asList(88, 23, 85, 96, 70), Arrays.asList(18, 69, 99, 42, 75)), Arrays.asList(Arrays.asList(65, 75, 12, 20, 21), Arrays.asList(29, 31, 57, 45, 13), Arrays.asList(34, 81, 97, 78, 28), Arrays.asList(63, 38, 51, 19, 37), Arrays.asList(53, 67, 49, 14, 74)), Arrays.asList(Arrays.asList(75, 35, 42, 5, 89), Arrays.asList(56, 50, 3, 90, 62), Arrays.asList(7, 15, 45, 16, 14), Arrays.asList(40, 8, 84, 97, 65), Arrays.asList(46, 51, 27, 9, 18)), Arrays.asList(Arrays.asList(62, 42, 24, 0, 53), Arrays.asList(41, 94, 70, 88, 33), Arrays.asList(32, 19, 43, 21, 23), Arrays.asList(84, 98, 60, 39, 36), Arrays.asList(5, 4, 49, 76, 82)), Arrays.asList(Arrays.asList(99, 24, 90, 5, 76), Arrays.asList(78, 66, 72, 53, 85), Arrays.asList(56, 94, 14, 79, 7), Arrays.asList(83, 6, 27, 26, 69), Arrays.asList(67, 41, 54, 68, 91)), Arrays.asList(Arrays.asList(5, 72, 83, 53, 49), Arrays.asList(48, 6, 9, 38, 15), Arrays.asList(99, 84, 90, 82, 70), Arrays.asList(69, 85, 4, 67, 20), Arrays.asList(87, 16, 61, 21, 39)), Arrays.asList(Arrays.asList(18, 43, 78, 0, 77), Arrays.asList(91, 37, 88, 32, 71), Arrays.asList(15, 54, 2, 62, 17), Arrays.asList(30, 98, 69, 38, 94), Arrays.asList(83, 63, 89, 39, 14)), Arrays.asList(Arrays.asList(26, 70, 3, 5, 89), Arrays.asList(94, 49, 35, 43, 99), Arrays.asList(82, 36, 62, 78, 37), Arrays.asList(90, 73, 9, 38, 40), Arrays.asList(60, 68, 8, 2, 53)));

    for (Integer number: numbers) {
      for (List<List<Integer>> board : boards) {
        int rowNum = 0;
        for (List<Integer> row : board) {
          int colNum = 0;
          for (Integer cell : row) {
            if (cell.equals(number)) {
              row.set(colNum, -cell - 1);
              if (isBingo(board, rowNum, colNum)) {
                System.out.println("Answer " + sumOfUnmarked(board) * cell);
                System.exit(0);
              }
            }
            colNum++;
          }
          rowNum++;
        }
      }
    }
  }

  public static boolean isBingo(List<List<Integer>> board, int rowNum, int colNum) {
    // Check currentRow
    List<Integer> currentRow = board.get(rowNum);
    for (Integer cell : currentRow) {
      if (cell >= 0) {
        // Check column
        for (List<Integer> row : board) {
          Integer rowCell = row.get(colNum);
          if (rowCell >= 0) {
            return false;
          }
        }

        return true;
      }
    }

    return true;
  }

  public static int sumOfUnmarked(List<List<Integer>> board) {
    int sum = 0;
    for (List<Integer> row : board) {
      for (Integer cell : row) {
        if (cell >= 0) sum += cell;
      }
    }
    return sum;
  }
}