package MementoDesignPattern;

public class TextEditor {
    private StringBuilder text;

    public TextEditor(){
        this.text= new StringBuilder();
    }

    public void write(String newText){
        text.append(newText);
    }

    public TextMemento save(){
        return new TextMemento(text.toString());
    }

    public void restore(TextMemento memento){
        this.text=new StringBuilder(memento.getText());
    }

    public String getText(){
        return text.toString();
    }
}

