/**
 * 策略模式:
 *      策略模式定义了算法族, 分别封装起来, 让它们之间可以
 *      相互替换, 此模式让算法的变化独立于使用算法的客户
 * 
 * 设计原则:
 *      01.找出应用中可能需要变化之处, 把它们独立起来, 不
 *      要和那些不需要变化的代码混在一起
 * 
 *      02.针对接口编程, 而不是针对实现编程
 * 
 *      03.多用组合, 少用继承
 */
public class Demo{
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}