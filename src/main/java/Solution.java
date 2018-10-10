import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Count
  // Game   Score  Minimum  Maximum     Min Max
  //    0      12       12       12       0   0
  //    1      24       12       24       0   1
  //    2      10       10       24       1   1
  //    3      24       10       24       1   1

  // Given Maria's scores for a season,
  // find and print the number of times she breaks her records for most and least points scored during the season.


  // Complete the breakingRecords function below.
  static int[] breakingRecords(int[] scores) {
    int increaseScoreCount = 0;
    int decreaseScoreCount = 0;
    int lowestScore = scores[0];
    int highestScore = scores[0];

    int[] highestScores = new int[scores.length];
    int[] lowestScores = new int[scores.length];

    for (int i = 1; i < scores.length; i++) {
      if (lowestScore > scores[i]) {
        lowestScore = scores[i];
        lowestScores[i] = lowestScore;
      }
      if (highestScore < scores[i]) {
        highestScore = scores[i];
        highestScores[i] = highestScore;
      }
    }

    for (int value : highestScores) {
      if (value != 0) {
        increaseScoreCount += 1;
      }
    }
    for (int value : lowestScores) {
      if (value != 0) {
        decreaseScoreCount += 1;
      }
    }

    int[] output = new int[2];
    output[0] = increaseScoreCount;
    output[1] = decreaseScoreCount;
    return output;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {

    int[] sampleInput = {10, 5, 20, 20, 4, 5, 2, 25, 1};

    for (int value : breakingRecords(sampleInput)) {
      System.out.println(value);
    }
  }
}