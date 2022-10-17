/*
 * Terell Ashman
 * CPS 2232
 * Section 04
 * Fall 2022
 */


 public class Sushi implements Edible{

    private String type = "";

    public Sushi(){}

    public Sushi(String str){
        type = str;
    }

    public String getType(){
        if(type == "")
            return "Type of Sushi never specified";
        return type;
    }

    public void setType(String str){
        type = str;
    }

    public String toString(){
        if(type == "")
            return "I dont know what type of sushi this is you never let me know";
        return "This is Sushi of type " + type;
    }

    @Override
    public String howToEat(){
        return "You use chopsticks to eat " + type + " sushi";
    }

    @Override
    public String howtoCook() {
        return "Recipe for " + type + " sushi...";
    }

 }