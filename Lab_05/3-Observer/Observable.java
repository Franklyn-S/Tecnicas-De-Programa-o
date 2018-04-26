import java.util.ArrayList;
abstract class Observable{
	List<Observer> observers = new ArrayList();

	void addObserver(Observer obj){
		observers.add(obj);
	}
	void deleteObserver(Observer obj){
		observers.remove(obj);
	}
	void notifyObservers(){
		Iterator<Observer> elements = observers.iterator();
		while (elements.hasNext()){
			Object e = elements.next();
			e.imprimir();
		}
	}
}