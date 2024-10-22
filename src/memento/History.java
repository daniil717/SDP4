package memento;

import java.util.Stack;

public class History {
    private Stack<Memento> history = new Stack<>();

    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }
    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}