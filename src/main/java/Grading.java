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

    //Rizqi Aryansa
    public int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];

        for(int i = 0; i < grades.length; i++) {
            if(grades[i] >= 38) {
                if(grades[i] % 5 < 3) {
                    result[i] = grades[i];
                } else if(grades[i] % 5 == 3) {
                    result[i] = grades[i] + 2;
                } else if(grades[i] % 5 == 4) {
                    result[i] = grades[i] + 1;
                }
            } else {
                result[i] = grades[i];
            }
        }
        return result;
    }
}
