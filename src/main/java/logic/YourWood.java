package logic;

import lombok.Getter;

import java.util.ArrayList;

public class YourWood {
    private static VolumeDB db = new VolumeDB();

    @Getter
    private ArrayList<RoundVolume> wood;
    private int price;

    public YourWood() {
        wood = new ArrayList<RoundVolume>();
    }

    public void addWood(double length, int diameter) throws NullPointerException {
        String key = Double.toString(length) + diameter;
        if (db.getVolumes().containsKey(key)) {
            wood.add(db.getVolumes().get(key));
        }
        else throw new NullPointerException();
    }



    public void lengthFirstSortWood() { //сортування вибором
        int min;
        for(int i = 0; i < wood.size(); ++i) {
            min = i;
            for (int j = i; j < wood.size(); ++j) {
                if(wood.get(j).getLength() < wood.get(min).getLength() ||
                        wood.get(j).getLength() == wood.get(min).getLength() && wood.get(j).getDiameter() < wood.get(min).getDiameter()) {
                    min = j;
                }
            }
            swap(i,min);
        }
    }

    public void diameterFirstSortWood() { //сортування вставками
        for (int i = 1; i < wood.size(); ++i) {
            RoundVolume key = wood.get(i);
            int j = i;
            while (j > 0 && (wood.get(j - 1).getDiameter() > key.getDiameter()
                    || wood.get(j - 1).getDiameter() ==  key.getDiameter() && wood.get(j - 1).getLength() > key.getLength())) {
                swap(j, j - 1);
                --j;
            }
            wood.set(j,key);
        }
    }

    private void swap(int x, int y) {
        RoundVolume temporary = wood.get(x);
        wood.set(x,wood.get(y));
        wood.set(y,temporary);
    }

    private double getTotalVolume() {
        double totalVolume = 0.0;
        for (RoundVolume rv: wood) {
            totalVolume += rv.getVolume();
        }
        return totalVolume;
    }
}
