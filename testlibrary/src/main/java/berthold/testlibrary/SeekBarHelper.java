package berthold.testlibrary;

/**
 * Created by Berthold on 7/23/17.
 */

public class SeekBarHelper {

    double min;
    double max;
    double step;

    public SeekBarHelper(double min, double max, double step){
        this.min=min;
        this.max=max;
        this.step=step;
    }

    public int setMax(){
        return ((int)(((max-min)/step)));
    }

    public double getSliderValue(int progress) {
        return min + (progress * step);
    }

    public int setProgress(double progress){
        return (int)((progress-min));
    }

}
