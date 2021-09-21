package models;

import java.util.PriorityQueue;

public class HealthService {

	private static final int SIZE_ARRAY = 10;
	PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();

	public HealthService() {

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
