package logic;

import logic.RoundVolume;
import logic.VolumeDB;
import logic.YourWood;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

import static org.junit.Assert.fail;

public class YourWoodTest {

    @Test
    public void addingCorrectVolume() {
        YourWood yourWood = new YourWood();
        yourWood.addWood(1.0,10);
        Assertions.assertEquals(yourWood.getWood().get(0),new VolumeDB().getVolumes().get("1.010"));
    }

    @Test(expected = NullPointerException.class)
    public void addingIncorrectVolumeMustThrowNullPointerException() {
        YourWood yourWood = new YourWood();
        yourWood.addWood(112.43,1345);
    }

    @Test
    public void sortingWithSelection() {
        YourWood yourWood = new YourWood();
        Random random = new Random();

        for (int size = 2; size < 2000; size *= 10) {

            for (int i = 0; i < size; ++i) {
                yourWood.getWood().add(new RoundVolume(random.nextDouble() + random.nextDouble(),random.nextInt(150),random.nextDouble() + random.nextDouble()));
            }
            yourWood.lengthFirstSortWood();


            for (int i = 0; i < yourWood.getWood().size() - 1; ++i) {
                Assertions.assertTrue(yourWood.getWood().get(i).getLength() <= yourWood.getWood().get(i + 1).getLength());
                if(yourWood.getWood().get(i).getLength() == yourWood.getWood().get(i + 1).getLength()) {
                    Assertions.assertTrue(yourWood.getWood().get(i).getDiameter() <= yourWood.getWood().get(i + 1).getDiameter());
                }
            }
        }
    }

    @Test
    public void sortingWithInsertion() {
        YourWood yourWood = new YourWood();
        Random random = new Random();

        for (int size = 2; size < 2000; size *= 10) {

            for (int i = 0; i < size; ++i) {
                yourWood.getWood().add(new RoundVolume(random.nextDouble() + random.nextDouble(),random.nextInt(150),random.nextDouble() + random.nextDouble()));
            }

            yourWood.diameterFirstSortWood();

            for (int i = 0; i < yourWood.getWood().size() - 1; ++i) {
                Assertions.assertTrue(yourWood.getWood().get(i).getDiameter() <= yourWood.getWood().get(i + 1).getDiameter());
                if(yourWood.getWood().get(i).getDiameter() == yourWood.getWood().get(i + 1).getDiameter()) {
                    Assertions.assertTrue(yourWood.getWood().get(i).getLength() <= yourWood.getWood().get(i + 1).getLength());
                }
            }
        }
    }

    @Test
    @Ignore
    public void falseTest() {
        fail();
    }
}
