package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Table {
    String tableName;
    List<Column>columnList;
    List<Map<String,Object>>alllRecords;

    public Table(String tableName){
        this.tableName = tableName;
        this.columnList = new ArrayList<>();
        this.alllRecords = new ArrayList<>();
    }

    public void addColumn(String name, ColoumnType columnType, boolean isRequired){
        columnList.add(new Column(name, columnType, isRequired));
    }

    public void addRecords(Map<String,Object>currRecord){
        if(validation(currRecord)){
            alllRecords.add(currRecord);
        }
        else{
            System.out.println("Please enter the data according to the correct format of the table");
        }
    }

    public boolean validation(Map<String,Object>currRecord){
        for(Column column: columnList){
            if(column.isColumnRequire() && !currRecord.containsKey(column.getName())){
                System.out.println("The Coloumn " + column.getName() + " is marked as mandatory however no data is provided.");
                return false;
            }

            if(currRecord.containsKey(column.getName())){
                Object value = currRecord.get(column.getName());
                if(column.getColoumnType()==ColoumnType.STRING){
                    if(!(value instanceof String) || ((String) value).length()>20){
                        System.out.println("Invalid value for coloumn " + column.getName());
                        return false;
                    }
                    else{
                        return true;
                    }
                }
                else if(column.getColoumnType()==ColoumnType.INT){
                    if(!(value instanceof Integer) || ((Integer)value)<-1024 || ((Integer)value)>1024){
                        System.out.println("Invalid value of coloumn " + column.getName());
                    }
                    else{
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public void removeRecords(int rowNumber){
        if(alllRecords.size()>rowNumber){
            alllRecords.remove(rowNumber);
        }
        else{
            System.out.println("The row Number does not exist in the table");
        }
    }

    public void printRecords(){
        for(Map<String,Object> currRecord: alllRecords){
            System.out.println(currRecord);
        }
    }

    public void filterRecord(String columnName, Object object){
        for(Map<String,Object> currRecord :alllRecords){
            if(currRecord.containsKey(columnName) && currRecord.get(columnName).equals(object)){
                System.out.println(currRecord);
            }
        }
    }
}
