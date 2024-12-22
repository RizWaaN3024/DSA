package DesignPatterns.Memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("A");
        editor.setContent("B");
        editor.setContent("C");
        editor.getContent();
    }
}
