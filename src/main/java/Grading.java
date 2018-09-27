public class Grading {
    public int[] solution(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            int value = 5 - (grades[i] % 5) + grades[i];
            if (grades[i] < 38) {
                grades[i] = grades[i];
            } else {
                if (value - grades[i] < 3) {
                    grades[i] = value;
                }
            }
        }
        return grades;
    }
}
