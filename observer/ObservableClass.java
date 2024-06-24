package observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableClass implements Observable{
    private List<Observer> allObservers;
    private boolean isInStock;

    public ObservableClass(){
        this.allObservers = new ArrayList<>();
        this.isInStock = false;
    }

    public void add(Observer observer){
        allObservers.add(observer);
    }

    public void remove(Observer observer){
        allObservers.remove(observer);
    }

    public void notifyobservers(){
        for(Observer observer: allObservers){
            observer.update();
        }
    }

    public void setData(boolean stocked){
        if(isInStock!=stocked){
            isInStock = stocked;
            notifyobservers();
        }
    }

    public String getData(){
        if(isInStock){
            return "In Stock";
        }
        return "Out of Stock";
    }

}
