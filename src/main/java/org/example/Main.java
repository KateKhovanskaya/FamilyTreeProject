package org.example;

import org.example.Presenter.Presenter;
import org.example.Model.Service;
import org.example.Model.fileHandler.FileHandler;
import org.example.ui.Console;
import org.example.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new Console();
        FileHandler fileHandler = new FileHandler();
        Service service = new Service(fileHandler);
        Presenter presenter = new Presenter(view, service);

        view.start();

    }
}