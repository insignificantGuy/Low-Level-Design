package observer;

public class Main {
    public static void main(String[] args){
        Observable observable = new ObservableClass();
        User user1 = new User("Rahul","manu.rahul28@gmail.com",observable);
        User user2 = new User("John Doe", "johnDoe@gmail.com", observable);
        observable.add(user1);
        observable.add(user2);
        observable.setData(true);
        System.out.println("The state has been changed");
        observable.setData(false);
    }
}
