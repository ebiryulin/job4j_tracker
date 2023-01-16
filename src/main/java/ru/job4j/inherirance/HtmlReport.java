package ru.job4j.inherirance;

public class HtmlReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>"
                + "<br/>"
                + "<span>" + body + "</span>";
    }

}
