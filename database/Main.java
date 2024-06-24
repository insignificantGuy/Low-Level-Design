package database;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        database.addTable("Users");

        Table users = database.getTable("Users");
        users.addColumn("Age", ColoumnType.INT, true);
        users.addColumn("Name", ColoumnType.STRING, true);
        users.addColumn("Address", ColoumnType.STRING, false);

        Map<String,Object> entry = new HashMap<>();
        entry.put("Age",10);
        entry.put("Name", "Rahul");
        entry.put("Address","123 Lane");
        users.addRecords(entry);

        Map<String,Object> entry2 = new HashMap<>();
        entry2.put("Age",20);
        entry2.put("Name", "John");
        users.addRecords(entry2);

        Map<String,Object> entry3 = new HashMap<>();
        entry3.put("Age",10);
        entry3.put("Name", "Simran");
        users.addRecords(entry3);
        users.printRecords();

        System.out.println("Filterting Data now");

        users.filterRecord("Age",10);
    }
}
