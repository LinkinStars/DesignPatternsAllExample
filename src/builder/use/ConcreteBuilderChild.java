package builder.use;

/**
 * 具体建造者-小孩
 * Created by LinkinStar
 */
public class ConcreteBuilderChild extends Builder {
    @Override
    public void buildAge() {
        product.setAge("10岁");
    }

    @Override
    public void buildStature() {
        product.setStature("身高1米");
    }

    @Override
    public void buildWeight() {
        product.setWeight("体重35kg");
    }
}
