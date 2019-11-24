import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class YourWoodTest {

    @Test
    public void addingCorrectVolume() {
        YourWood yourWood = new YourWood();
        yourWood.addWood(1.0,10);
        Assertions.assertEquals(yourWood.getWood().get(0),new VolumeDB().getVolumes().get("1.010"));
    }

    @Test(expected = NullPointerException.class)
    public void addingIncorrectVolume() {
        YourWood yourWood = new YourWood();
        yourWood.addWood(112.43,1345);
    }

    @Test
    public void sortingWithInsertion() {
        YourWood yourWood = new YourWood();

        yourWood.addWood(10.0,30);
        yourWood.addWood(7.1,12);
        yourWood.addWood(5.0,72);
        yourWood.addWood(7.6,22);
        yourWood.addWood(7.1,80);
        yourWood.addWood(7.1,64);

        yourWood.lengthFirstSortWood();

        for (RoundVolume rv: yourWood.getWood()) {
            System.out.println(rv.toString());
        }

        for (int i = 0; i < yourWood.getWood().size() - 1; ++i) {
            Assertions.assertTrue(yourWood.getWood().get(i).getLength() <= yourWood.getWood().get(i + 1).getLength());
            if(yourWood.getWood().get(i).getLength() == yourWood.getWood().get(i + 1).getLength()) {
                Assertions.assertTrue(yourWood.getWood().get(i).getDiameter() <= yourWood.getWood().get(i + 1).getDiameter());
            }
        }
    }



}
