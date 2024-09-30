package MementoDesignPattern;

public class MementoDesignPatternMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        editor.write("Hello, ");
        caretaker.save(editor);  // Save state 1

        editor.write("world!");
        caretaker.save(editor);  // Save state 2

        System.out.println("Current Text: " + editor.getText());

        // Undo last change
        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getText());

        // Undo again
        caretaker.undo(editor);
        System.out.println("After Undo: " + editor.getText());
        caretaker.undo(editor);
    }
}
