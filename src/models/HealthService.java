package models;

import java.util.PriorityQueue;

public class HealthService {

	PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();

	public HealthService() {
		personPriorityQueue.add(new Person("Jose", 1024, 25));
		personPriorityQueue.add(new Person("Pepe", 1025, 61));
		personPriorityQueue.add(new Person("Anna", 1026, 47));
	}

	public void addPerson(String name, int id, int age) {
		personPriorityQueue.add(new Person(name, id, age));
		return;
	}

	public Person calculatePriorityAccordingToTheAgeOfThePersons() {
		while (!personPriorityQueue.isEmpty()) {
			return personPriorityQueue.remove();
        }
		return null;
	}

}
