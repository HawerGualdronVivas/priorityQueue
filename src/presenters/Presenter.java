package presenters;

import models.HealthService;
import models.Person;
import views.Window;

public class Presenter {

    private HealthService example;
    private Window window;

    public Presenter() {
        window = new Window();
        showMenu();
    }

    private void showMenu() {
        MenuOption option = window.showMenu();
        switch (option) {
            case ADD_PATIENT:
                break;
            case EXIT:
                return;
        }
        showMenu();
    }


    }

}
