/*
 * Terell Ashman
 * CPS 2232
 * Section 04
 * Fall 2022
 */


public class Soup implements Edible{

    private int temp = 0;
    private String type = "";
    
    public Soup(){}

    public Soup(String str, int num){
        type = str;
        temp = num;
    }

    public int getTemp(){
        return temp;
    }

    public void setTemp(int num){
        temp = num;
    }

    public String getType(){
        if(type == "")
            return "type of Soup never specified";
        return type;
    }

    public void setType(String str){
        type = str;
    }
    
    public String toString(){
        if(type == "")
            return "I dont know what type of soup this is you never let me know";
        return "This is " + type + " soup and it is " + temp + " degrees";
    }

    @Override
    public String howToEat() {
        return "You eat " + type + " Soup with a Spoon";
    }

    @Override
    public String howtoCook() {
        return "Recipe for " + type + " soup...";
    }
    
}