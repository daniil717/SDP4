package memento;

public class MementoExample {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hello, ");
        history.saveState(editor);

        editor.write("Daniil!");
        history.saveState(editor);

        System.out.println("Current text: " + editor.getText());

        // Отменяем последние изменения
        history.undo(editor);
        System.out.println("After cancellation: " + editor.getText());

        // Еще раз отменяем
        history.undo(editor);
        System.out.println("After the second cancellation: " + editor.getText());
    }
}
