package DesignPatterns.Memento;

public class Editor {
    private String content;

    public String getContent() 
    {
        return content;
    }

    public String setContent(String content)
    {
        return this.content = content;
    }
}
