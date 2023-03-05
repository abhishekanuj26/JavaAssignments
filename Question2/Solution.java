package Question2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static final String COMMA_DELIMITER = String.valueOf(',');

    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Question2/employees.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        List<List<String>> result = new ArrayList<>();

        for (int i = 1; i < records.size(); i++) {
            List<String> record = records.get(i);
            if (record.get(2).equals("R&D") && record.get(1).equals("Manager"))
                result.add(record);
            else if (!record.get(0).contains(" ")) {
                result.add(record);
            }

        }


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Question2/manager.csv"));

            for (List<String> record : result) {
                String collect = String.join(",", record);
                System.out.println(collect);
                writer.write(collect);
                writer.newLine();
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
