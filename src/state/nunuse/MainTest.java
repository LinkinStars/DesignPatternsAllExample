package state.nunuse;

/**
 * 不使用状态模式的情况下
 * Created by LinkinStar
 */
public class MainTest {

    public static void main(String[] args) {
        int state = 1;//1：代表常温的水，2：代表热水，3：代表冰水
        //加热
        state = heat(state);
        //加热
        state = heat(state);
        //冷却
        state = ice(state);
        //冷却
        state = ice(state);
        //冷却
        state = ice(state);

        /**
         * 遇到的问题：
         * 1、如果增加状态，那么修改很麻烦，状态越多if判断语句过多
         * 2、如果增加改变的行为，那么修改也很麻烦，行为越多方法越多
         * 3、用数字代码表示状态不利于后期维护
         */
    }

    static int heat(int state){
        if (state == 1) {
            System.out.println("当前加热后成为热水");
            return 2;
        } else if (state == 2) {
            System.out.println("当前已经是热水");
            return 2;
        } else if (state == 3) {
            System.out.println("当前加热后成为常温的水");
            return 1;
        }
        return state;
    }

    static int ice(int state){
        if (state == 1) {
            System.out.println("当前冷却后成为冰水");
            return 3;
        } else if (state == 2) {
            System.out.println("当前冷却后成为常温的水");
            return 1;
        } else if (state == 3) {
            System.out.println("当前已经为冰水");
            return 3;
        }
        return state;
    }
}
