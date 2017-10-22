package adapter.use;

/**
 * 电灯
 * Created by LinkinStar
 */
public class Lamp implements Target {
    private String light = "电灯的光线";

    @Override
    public void Light() {
        System.out.println(light);
    }

    public void setLight(String light) {
        this.light = light;
    }
}
