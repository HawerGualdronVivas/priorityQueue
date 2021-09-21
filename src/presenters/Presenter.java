package presenters;

import models.Example;
import models.Person;
import views.Window;

public class Presenter {

    private Example example;
    private Window window;

    public Presenter() {
        window = new Window();
        showMenu();
    }

    private void showMenu() {
        MenuOption option = window.showMenu();
        switch (option) {
            case ADD_PATIENT:
                patientManager();
                break;
            case EXIT:
                return;
        }
        showMenu();
    }

    public void patientManager() {
        String name = "";
        int id = 9;
        int age = 34;

        example.addPatient(new Person(name, id, age));

    }

}
