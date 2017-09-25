package strategy.oop.nonuse.extend;

/**
 * 策略的父类
 * Created by LinkinStar
 */
abstract class Solution {
    /**
     * 需要每个类都重写的计算方法
     */
    protected abstract int caculate(int data);
}
