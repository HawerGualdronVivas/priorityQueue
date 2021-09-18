package views;

import javax.swing.JOptionPane;


import presenters.MenuOption;

public class Window {

    private static final String MENU_TEXT = "Por favor escoja una opción:";
    private static final String ERROR = "Error";
    private static final String INFORMATION = "Información:";

    public MenuOption showMenu(){
        int option = JOptionPane.showOptionDialog(null, MENU_TEXT, INFORMATION,
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        MenuOption.values(), MenuOption.values()[0]);
        return MenuOption.values()[option];
    }
}
