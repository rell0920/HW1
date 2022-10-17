/*
 * Terell Ashman
 * CPS 2232
 * Section 04
 * Fall 2022
 */


public class HW1{

    public static void main(String[] args){
        String chiType, chowType;
        int chiTemp, chowTemp;
        Soup chi = new Soup("Chicken Noodle", 100);
        Soup chow = new Soup();
        chiType = chi.getType();
        chowType = chow.getType();
        chiTemp = chi.getTemp();
        chowTemp = chow.getTemp();
        System.out.println("Before changes to soup\n");
        System.out.println(chi);
        System.out.println(chow);
        System.out.println("(Values in chi)type: " + chiType + " temp: " + chiTemp);
        System.out.println("(Values in chow)type: " + chowType + " temp: " + chowTemp);


        chow.setType("Chowder");
        chow.setTemp(96);
        chi.setTemp(77);
        chiType = chi.getType();
        chowType = chow.getType();
        chiTemp = chi.getTemp();
        chowTemp = chow.getTemp();


        System.out.println("\nAfter changes to soup\n");
        System.out.println(chi);
        System.out.println(chow);
        System.out.println("(Values in chi)type: " + chiType + " temp: " + chiTemp);
        System.out.println("(Values in chow)type: " + chowType + " temp: " + chowTemp);
        System.out.println("\n");
        

        String calType, sasType;
        Sushi cal = new Sushi("California Roll");
        Sushi sas = new Sushi();
        calType = cal.getType();
        sasType = sas.getType();
        System.out.println("Before changes to sushi\n");
        System.out.println(cal);
        System.out.println(sas);
        System.out.println("(Values in cal)type: " + calType);
        System.out.println("(Values in sas)type: " + sasType);


        sas.setType("Sashimi");
        calType = cal.getType();
        sasType = sas.getType();


        System.out.println("\nAfter changes to sushi\n");
        System.out.println(cal);
        System.out.println(sas);
        System.out.println("(Values in chi)type: " + calType);
        System.out.println("(Values in chow)type: " + sasType);
        System.out.println("\n");

        System.out.println(sas.howToEat() + "\t\t" + sas.howtoCook());
        System.out.println(chi.howToEat() + "\t\t" + chi.howtoCook());
        Edible[] lst = {chi, chow, cal, sas};
        for(Edible food: lst){
            if(food.getClass().getSimpleName() == "Sushi"){
                System.out.println("(Sushi)\n " +  food);
            }
            else
                System.out.println("(Soup)\n" + food);
        }

    }

    

}