import LunchApp.dataInterface;
import LunchApp.Rest;



public class Main {

    public static void main(String[] args) {
        dataInterface.addRest("Russian");
        dataInterface.addRest("Noodle");
        dataInterface.addRest("Rice");
        dataInterface.addRest("Soup");
        dataInterface.addRest("Beef");
        dataInterface.addRest("Pork");
        dataInterface.addRest("Ramen");
        dataInterface.addRest("CHN", 5);

        Rest res = dataInterface.dataBase.get(0);
        res.addWeight(10);

        for (int i = 0; i < 20; i++) {
            Rest r = dataInterface.getRandomRest();
            System.out.println(r.getName() +"  " + r.getWeight());
        }
    }
}
