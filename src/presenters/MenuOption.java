package presenters;

public enum MenuOption{
   ADD_ATHLETE, ADD_RECORD, SHOW_ATHLETES, REMOVE_PHASE_ONE,
    REMOVE_PHASE_TWO, SHOW_PODIUM, EXIT;

   @Override
   public String toString() {
      return super.toString().replaceAll("_", " ");
   }
}