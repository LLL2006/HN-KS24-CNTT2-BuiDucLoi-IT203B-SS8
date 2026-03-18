package G1;

import java.util.Stack;

public class RemoteControl {
    private Command[] buttons = new Command[5];
    private Stack<Command> history = new Stack<>();

    public void setCommand(int slot, Command command) {
        buttons[slot] = command;
        System.out.println("Đã gán " + command.getClass().getSimpleName() + " cho nút " + (slot + 1));
    }

    public void pressButton(int slot) {
        if (buttons[slot] != null) {
            buttons[slot].execute();
            history.push(buttons[slot]);
        } else {
            System.out.println("Nút này chưa được gán lệnh!");
        }
    }

    public void pressUndo() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        } else {
            System.out.println("Không còn lệnh nào để Undo!");
        }
    }
}
