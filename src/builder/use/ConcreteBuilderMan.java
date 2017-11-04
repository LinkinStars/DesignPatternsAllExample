package builder.use;

/**
 * 具体建造者-大人
 * Created by LinkinStar
 */
public class ConcreteBuilderMan extends Builder {
    @Override
    public void buildAge() {
        product.setAge("20岁");
    }

    @Override
    public void buildStature() {
        product.setStature("身高2米");
    }

    @Override
    public void buildWeight() {
        product.setWeight("体重70kg");
    }
}
