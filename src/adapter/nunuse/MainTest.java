package adapter.nunuse;

/**
 * 不使用适配器模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        //现在我们有电灯Lamp，手电筒Touch
        //我们现在需要光线，于是我们点亮电灯
        Lamp lamp = new Lamp();
        lamp.Light();
        //但是现在电灯坏了，我们需要用手电筒造个灯
        Lamp unrealLamp = new Lamp();
        Torch torch = new Torch();
        unrealLamp.setLight(torch.light());
        unrealLamp.Light();

        /**
         * 遇到的问题：
         * 1、这里只是我们模拟的情况，或许有点奇怪，但是现实中出现的状况就是：
         *      调用类和被调用类的接口不符合，而且两边均不能被改变（可能被别处依赖）
         *      现实情况却是需要被调用类
         * 2、我们的相当于在调用的时候，手动组装了一遍参数（现实的参数会比这个多的多），所以会让调用的代码变得复杂
         */
    }
}
