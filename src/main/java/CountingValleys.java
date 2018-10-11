public class CountingValleys {

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {
    int seaLevel = 0;
    int totalValleys = 0;
    char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      char currentChar = chars[i];
      if (currentChar == 'D') {
        seaLevel -= 1;
      }
      if (currentChar == 'U') {
        seaLevel += 1;
      }
      if (seaLevel == 0 && currentChar == 'U') {
        totalValleys += 1;
      }
    }
    return totalValleys;
  }

  public static void main(String[] args) {
    System.out.println(countingValleys(8, "UDDDUDUU"));
    System.out.println(countingValleys(12, "DDUUDDUDUUUD"));
  }

}
