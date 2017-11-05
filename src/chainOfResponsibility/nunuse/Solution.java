package chainOfResponsibility.nunuse;

/**
 * 处理请求
 * Created by LinkinStar
 */
public class Solution {

    public void solve(int value){
        if (value < 100) {
            System.out.println("当前处理金额小于100，为：" + value);
        } else if (value < 1000){
            System.out.println("当前处理金额小于1000，为：" + value);
        } else {
            System.out.println("当前处理金额大于1000，为：" + value);
        }
    }
}
