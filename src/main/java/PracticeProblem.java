public class PracticeProblem {
    public static String[] towerOfHanoi(int n) {
        if (n == 0) {
            return new String[0];
        }
        int totalMoves = (int) Math.pow(2, n) - 1;
        String[] moves = new String[totalMoves];
        int[] index = new int[1];
        solve(n, 'L', 'R', 'M', moves, index);
        return moves;
    }
    private static void solve(int n, char from, char to, char aux, String[] moves, int[] index) {
        if (n == 0) {
            return;
        }
        solve(n - 1, from, aux, to, moves, index);
        moves[index[0]] = "" + from + to;
        index[0]++;
        solve(n - 1, aux, to, from, moves, index);
    }
}