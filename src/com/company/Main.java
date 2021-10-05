package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        var names = new ArrayList<String>();
        var custID = new ArrayList<Integer>();
        var filename = "TestData.txt";
        var filePath = Paths.get(filename);
        var allLines = Files.readAllLines(filePath);
        for (var line : allLines) {
            var splitLine = line.split(",");
            names.add(splitLine[0]);
            custID.add(Integer.parseInt(splitLine[1]));
            var theStore = new Store();
            theStore.runStore();

        }
    }
}
