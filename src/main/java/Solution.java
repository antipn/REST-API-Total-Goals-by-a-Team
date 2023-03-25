import java.io.*;
import java.net.URISyntaxException;

public class Solution {

    public static void main(String[] args) throws IOException, URISyntaxException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String team = bufferedReader.readLine();
//
//        int year = Integer.parseInt(bufferedReader.readLine().trim());
//
//        int result = Result.getTotalGoals(team, year);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        Result.getTotalGoals("Barcelona",2011);

    }
}
