package managment;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    public static void cleanResults() throws IOException {
        PrintWriter writer = new PrintWriter("src/main/resources/results.json");

        writer.print("");
        writer.close();
    }

    public static void saveResults(List<ResultsRepository> results) throws IOException {
        Writer writer = new FileWriter("src/main/resources/results.json", false);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        gson.toJson(results, writer);
        writer.close();
    }

    public static List<ResultsRepository> readResults() {
        ResultsRepository[] repository = new Gson().fromJson("src/main/resources/results.json", ResultsRepository[].class);

        return Arrays.asList(repository);
    }
}