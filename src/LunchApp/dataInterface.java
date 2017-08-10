package LunchApp;

import java.util.ArrayList;
import java.util.Random;

public class dataInterface {

    public static ArrayList<Rest> dataBase = new ArrayList<>();

    public static void addRest(String name, int weight){
        dataBase.add(new Rest(name, weight));
    }

    public static void addRest(String name){
        dataBase.add(new Rest(name));
    }

    public static void addRest(Rest target, int weight){
        target.addWeight(10);
    }

    public static Rest getRandomRest(){
        int idx = getRandomIdx();
        return dataBase.get(idx);
    }

    private static int getRandomIdx(){
        int total_weight = 0;
        for (Rest r : dataBase){
            total_weight += r.getWeight();
        }
        Random rand = new Random();
        ArrayList<Double> scoreList = new ArrayList<>();
        for (int i = 0; i<dataBase.size(); i++){
            scoreList.add(rand.nextDouble() * dataBase.get(i).getWeight());
        }

        double max = scoreList.get(0);
        int max_idx = 0;
        for (int j = 0; j<scoreList.size(); j++){
            if(scoreList.get(j)>max){
                max = scoreList.get(j);
                max_idx = j;
            }
        }
        return max_idx;
    }


}
