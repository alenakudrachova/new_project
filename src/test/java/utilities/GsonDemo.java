package utilities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.DataJsonModel;

import java.io.FileReader;
import java.io.IOException;

public class GsonDemo {

    public static void getJsonFromObject() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try(FileReader fr = new FileReader("src/test/resources/data.json")) {
            DataJsonModel dataJsonModel = gson.fromJson(fr, DataJsonModel.class);
            System.out.println(gson.toJson(dataJsonModel));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        getJsonFromObject();
    }
}
