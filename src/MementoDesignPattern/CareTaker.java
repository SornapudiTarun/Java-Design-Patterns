package MementoDesignPattern;

import java.util.Stack;

public class CareTaker {
    private Stack<TextMemento> mementos = new Stack<>();

    public void save(TextEditor editor){
        mementos.push(editor.save());
    }

    public void undo(TextEditor editor){
        if (!mementos.isEmpty()){
            editor.restore(mementos.pop());
        }else {
            System.out.println("No more undo's");
        }
    }
}
