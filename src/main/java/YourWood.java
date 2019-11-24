import lombok.Getter;

import java.util.ArrayList;

public class YourWood {
    static VolumeDB db = new VolumeDB();
    @Getter
    private ArrayList<RoundVolume> wood;

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

    public void lengthFirstSortWood() {
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

    private void swap(int x, int y) {
        RoundVolume temporary = wood.get(x);
        wood.set(x,wood.get(y));
        wood.set(y,temporary);
    }
}
