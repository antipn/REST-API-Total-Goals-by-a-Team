

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class Result {


    public static int getTotalGoals(String team, int year) throws URISyntaxException, IOException {

        URI urlHost = new URI("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1=" + team + "&page=1");
        URI urlGuest = new URI("https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team2=" + team + "&page=1");

        System.out.println(getJson(urlHost));
        System.out.println(getJson(urlGuest));


        return 0;
    }

    public static String getJson(URI url) throws MalformedURLException {

        try (InputStream inputHost = url.toURL().openStream()) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputHost);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String str = reader.readLine();



            return str;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
