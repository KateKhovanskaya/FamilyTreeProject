package org.example.ui;

import java.util.ArrayList;
import java.util.List;

import org.example.ui.commands.AddMember;
import org.example.ui.commands.Command;
import org.example.ui.commands.Finish;
import org.example.ui.commands.GetAllMembers;
import org.example.ui.commands.GetMemberByName;

public class MainMenu {
    private List<Command> commandList;
    private View view;

    public MainMenu(View view) {
        this.view = view;
        commandList = new ArrayList<>();
        commandList.add(new AddMember(view));
        commandList.add(new GetAllMembers(view));
        commandList.add(new GetMemberByName(view));
        commandList.add(new Finish(view));
    }

    public String print(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    public void execute(int numCommand){
        commandList.get(numCommand - 1).execute();
    }

    public int size(){
        return commandList.size();
    }
}
