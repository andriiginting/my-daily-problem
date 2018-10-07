public class Kangaroo {
    public String solution(int x1, int x2, int v1, int v2) {
        String res = "NO";
        int rangeCount = Math.abs(x1 - x2);
        int speedCount = Math.abs(v1 - v2);
        if (v1 < v2) {
            res = "NO";
        }

        if ((x1 < x2) && (v1 > v2)) {
            if (rangeCount % speedCount == 0) {
                res = "YES";
            } else {
                res = "NO";
            }
        }

        return res;
    }
}
