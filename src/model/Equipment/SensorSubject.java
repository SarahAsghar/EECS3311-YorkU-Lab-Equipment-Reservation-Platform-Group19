package model.Equipment;

public interface SensorSubject {
  void attach(Observer observer);
  void detach(Observer observer);
  void notifyObservers();
}
