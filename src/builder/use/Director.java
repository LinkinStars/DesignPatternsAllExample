package builder.use;

/**
 * 指挥者
 * Created by LinkinStar
 */
public class Director {

    public Product bulid(Builder builder){
        builder.buildAge();
        builder.buildStature();
        builder.buildWeight();
        return builder.getProduct();
    }
}
