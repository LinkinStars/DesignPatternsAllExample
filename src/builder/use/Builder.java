package builder.use;

/**
 * 抽象建造者
 * Created by LinkinStar
 */
public abstract class Builder {

    protected Product product = new Product();

    public abstract void buildAge();
    public abstract void buildStature();
    public abstract void buildWeight();

    public Product getProduct(){
        return this.product;
    }
}
