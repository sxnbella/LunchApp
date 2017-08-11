import LunchApp.dataInterface;
import LunchApp.Rest;



public class Main {

    public static void main(String[] args) {
        dataInterface.addRest("Japanese He");
        dataInterface.addRest("Shabu");
        dataInterface.addRest("8.8");
        dataInterface.addRest("Pepper Lunch");
        dataInterface.addRest("Pho near lena");
        dataInterface.addRest("Fang Ma");
        dataInterface.addRest("Gao Shi Lin");
        dataInterface.addRest("Indian Restaurant", 5);
        dataInterface.addRest("Pho city");
        dataInterface.addRest("Japanese noodle city");
        

        Rest res = dataInterface.dataBase.get(0);
        res.addWeight(10);

        for (int i = 0; i < 20; i++) {
            Rest r = dataInterface.getRandomRest();
            System.out.println(r.getName() +"  " + r.getWeight());
        }
    }
}
