package database;

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<String,Table>allTables;

    public Database(){
        this.allTables = new HashMap<>();
    }

    public void addTable(String tableName){
        allTables.put(tableName, new Table(tableName));
    }

    public void removeTable(String tableName){
        if(allTables.containsKey(tableName)){
            allTables.remove(tableName);
        }
        else{
            System.out.println("The table " +  tableName + " does not exist in the database");
        }
    }

    public Table getTable(String tableName){
        return allTables.get(tableName);
    }
}
