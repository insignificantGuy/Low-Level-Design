package database;

public class Column {
    String name;
    ColoumnType coloumnType;
    boolean isRequired;

    public Column(String name, ColoumnType coloumnType, boolean isRequired){
        this.name = name;
        this.coloumnType = coloumnType;
        this.isRequired = isRequired;
    }

    public String getName(){
        return name;
    }

    public ColoumnType getColoumnType(){
        return coloumnType;
    }

    public boolean isColumnRequire(){
        return isRequired;
    }

}
