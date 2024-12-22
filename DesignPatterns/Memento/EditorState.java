package DesignPatterns.Memento;

public class EditorState {
    private final String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public EditorState(String content) 
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }
}
