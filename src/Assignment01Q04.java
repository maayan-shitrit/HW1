import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        int sign = switch (direction) {
            case 'R' -> 1;
            case 'L' -> -1;
            default -> 0;
        };

        int shift = Math.floorMod(sign * move, array.length);

        int[] arrayCopy = array.clone();

        for (int i = 0; i < array.length; i++) {
            array[(i + shift) % array.length] = arrayCopy[i];
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 0, 8, 9, 5, 6 }, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] {}, 3, 'R'))); // []
    }
}