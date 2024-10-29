package collectionsAndMap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsExample {
	public static void main(final String[] args) {
		// LISTY
		// ArrayList: dynamicznie zmienia rozmiar, szybki dostęp przez indeks, nie jest synchronizowany
		final List<String> arrayList = new ArrayList<>(); // ArrayList: [Apple, Banana, Cherry]
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");

		// LinkedList: przechowuje elementy w formie dwukierunkowej listy powiązanej, szybkie dodawanie/usuwanie na początku i końcu listy
		final List<String> linkedList = new LinkedList<>();
		linkedList.add("Dog");
		linkedList.add("Cat");
		linkedList.add("Fish");

		// Vector: synchronizowany, czyli bezpieczny do użycia w wątkach, wolniejszy od ArrayList
		final List<String> vector = new Vector<>();
		vector.add("One");
		vector.add("Two");
		vector.add("Three");

		// Stack: rozszerza Vector, działa w sposób LIFO (Last In, First Out)
		final Stack<String> stack = new Stack<>();
		stack.push("First");
		stack.push("Second");
		stack.push("Third");

		// Wyświetlenie list
		System.out.println("ArrayList: " + arrayList);
		System.out.println("LinkedList: " + linkedList);
		System.out.println("Vector: " + vector);
		System.out.println("Stack: " + stack);

		// SETY
		// HashSet: nie zachowuje kolejności, szybki dostęp do elementów, tylko unikalne elementy
		final Set<String> hashSet = new HashSet<>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Blue");

		// LinkedHashSet: zachowuje kolejność dodania elementów, unikalne elementy
		final Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Circle");
		linkedHashSet.add("Square");
		linkedHashSet.add("Triangle");

		// TreeSet: przechowuje elementy posortowane, unikalne elementy, wolniejszy od HashSet i LinkedHashSet
		final Set<String> treeSet = new TreeSet<>();
		treeSet.add("Alpha");
		treeSet.add("Beta");
		treeSet.add("Gamma");

		// Wyświetlenie setów
		System.out.println("HashSet: " + hashSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);
		System.out.println("TreeSet: " + treeSet);

		// KOLEJKI
		// PriorityQueue: sortuje elementy zgodnie z ich naturalnym porządkiem lub dostarczonym komparatorem, FIFO
		final Queue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Low");
		priorityQueue.add("Medium");
		priorityQueue.add("High");

		// ArrayDeque: dwukierunkowa kolejka, szybkie dodawanie/usuwanie na początku i końcu, działa jako stos i kolejka
		final Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("Front");
		arrayDeque.add("Middle");
		arrayDeque.add("End");

		// LinkedList jako Queue: dwukierunkowa kolejka, implementuje zarówno List jak i Queue
		final Queue<String> linkedListQueue = new LinkedList<>();
		linkedListQueue.add("Start");
		linkedListQueue.add("Process");
		linkedListQueue.add("Finish");

		// Wyświetlenie kolejek
		System.out.println("PriorityQueue: " + priorityQueue);
		System.out.println("ArrayDeque: " + arrayDeque);
		System.out.println("LinkedList Queue: " + linkedListQueue);

		// MAPY
		// HashMap: przechowuje klucze i wartości, brak zachowania kolejności, szybkie operacje
		final Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "One");
		hashMap.put(2, "Two");
		hashMap.put(3, "Three");

		// LinkedHashMap: zachowuje kolejność dodania elementów
		final Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(1, "Apple");
		linkedHashMap.put(2, "Banana");
		linkedHashMap.put(3, "Cherry");

		// TreeMap: przechowuje elementy posortowane według kluczy
		// Wynik: {1=Sunday, 2=Monday, 3=Tuesday, 4=Saturday, 5=Friday}
		final Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Sunday");
		treeMap.put(2, "Monday");
		treeMap.put(3, "Tuesday");
		treeMap.put(5, "Friday");
		treeMap.put(4, "Saturday");

		// Hashtable: synchronizowana mapa, nie przyjmuje wartości null
		final Map<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "Red");
		hashtable.put(2, "Green");
		hashtable.put(3, "Blue");

		// Wyświetlenie map
		System.out.println("HashMap: " + hashMap);
		System.out.println("LinkedHashMap: " + linkedHashMap);
		System.out.println("TreeMap: " + treeMap);
		System.out.println("Hashtable: " + hashtable);
	}
}
