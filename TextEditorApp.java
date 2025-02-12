import java.util.Scanner;

class TextState {
String content;
TextState prev, next;
TextState(String content) {
this.content = content;
this.prev = this.next = null;
}
}
class TextEditor {
TextState head, current;
int maxHistory = 10;
int size = 0;
void addState(String content) {
TextState newState = new TextState(content);
if (current == null) {
head = current = newState;
size = 1;
return;
}
current.next = newState;
newState.prev = current;
current = newState;
size++;
if (size > maxHistory) {
head = head.next;
head.prev = null;
size--;
}
}
void undo() {
if (current != null && current.prev != null) {
current = current.prev;
}
}
void redo() {
if (current != null && current.next != null) {
current = current.next;
}
}
void displayCurrentState() {
if (current != null) {
System.out.println("Current Text: " + current.content);
} else {
System.out.println("No text available.");
}
}
}

public class TextEditorApp {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
TextEditor editor = new TextEditor();
editor.addState("Hello");
editor.addState("Hello World");
editor.displayCurrentState();
editor.undo();
editor.displayCurrentState();
editor.redo();
editor.displayCurrentState();
scanner.close();
}
}

