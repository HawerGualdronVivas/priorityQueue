package presenters;

public enum MenuOption{
   ADD_PATIENT, EXIT;

   @Override
   public String toString() {
      return super.toString().replaceAll("_", " ");
   }
}