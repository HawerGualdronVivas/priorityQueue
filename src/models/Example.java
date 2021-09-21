package models;

public class Example {

	private static final int SIZE_ARRAY = 10;

	public Example() {

	}

	public Person[] patients = new Person[SIZE_ARRAY];

	public boolean addPatient(Person pat) {
		for (int i = 0; i < patients.length; i++) {
			if (patients[i] == null) {
				patients[i] = pat;

				return true;
			}
		}
		return false;

	}

}
