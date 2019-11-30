package logic;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class VolumeDB {
    static ObjectMapper mapper = new ObjectMapper();

    @Getter
    private HashMap<String, RoundVolume> volumes;


    public VolumeDB() {
        volumes = new HashMap<String, RoundVolume>();
        try {
            RoundVolume [] array = mapper.readValue(new File("Gost/GOST.json"),RoundVolume[].class);
            for (RoundVolume rv: array) {
                volumes.put(Double.toString(rv.getLength()) + rv.getDiameter(),rv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
