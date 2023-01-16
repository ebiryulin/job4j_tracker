package ru.job4j.inherirance;

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        return "{\n"
                + "\t\"name\" : " + "\""+ name + "\",\n"
                + "\t\"body\" : " + "\""+ body + "\"\n"
                + "}";

    }

    public static void main(String[] args) {
        JSONReport jsonReport = new JSONReport();
        String text = jsonReport.generate("name1", "body1");
        System.out.println(text);
    }
}
