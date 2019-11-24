import lombok.Data;

@Data
public class RoundVolume {

    private double length;
    private int diameter;
    private double volume;

    public RoundVolume() {
    }

    public RoundVolume(double length, int diameter, double volume) {
        this.length = length;
        this.diameter = diameter;
        this.volume = volume;
    }
}
