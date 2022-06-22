package managment;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class  FileManager {
    public static void cleanResults() throws IOException {
        PrintWriter writer = new PrintWriter("results.json");

        writer.print("");
        writer.close();
    }

    public static void saveResults(ArrayList<ResultsRepository> results) throws IOException {
        Writer writer = new FileWriter("results.json", false);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        gson.toJson(results, writer);
        writer.close();
    }

    public static ResultsRepository[] readResults() {
        Gson gson = new Gson();

        return gson.fromJson("results.json", ResultsRepository[].class);
    }
}