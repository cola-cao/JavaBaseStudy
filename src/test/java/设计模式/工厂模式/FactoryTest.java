package 设计模式.工厂模式;

/**
 * Created on 2021/6/16.
 *
 * @author 曹可乐
 */

// 有两个产品  形状和颜色
interface Shape {
    void draw();
}

interface Color {
    void fill();
}

// 分别实现产品
//长方形
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
//方形
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
//圆形
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

//红色
class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
//绿色
class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
//蓝色
class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

//现在有两个工厂 分别实现
abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}

//形状工厂 简单工厂
class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}

//颜色工厂 简单工厂
class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}


// 工厂生产器 来构建需要的工厂
class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}


public class FactoryTest {

    public static void main(String[] args) {

//        //获取形状工厂
//        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
//
//        //获取形状为 Circle 的对象
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//
//        //调用 Circle 的 draw 方法
//        shape1.draw();
//
//        //获取形状为 Rectangle 的对象
//        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//
//        //调用 Rectangle 的 draw 方法
//        shape2.draw();
//
//        //获取形状为 Square 的对象
//        Shape shape3 = shapeFactory.getShape("SQUARE");
//
//        //调用 Square 的 draw 方法
//        shape3.draw();
//
//        //获取颜色工厂
//        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
//
//        //获取颜色为 Red 的对象
//        Color color1 = colorFactory.getColor("RED");
//
//        //调用 Red 的 fill 方法
//        color1.fill();
//
//        //获取颜色为 Green 的对象
//        Color color2 = colorFactory.getColor("Green");
//
//        //调用 Green 的 fill 方法
//        color2.fill();
//
//        //获取颜色为 Blue 的对象
//        Color color3 = colorFactory.getColor("BLUE");
//
//        //调用 Blue 的 fill 方法
//        color3.fill();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory("SHAPE");
        Shape square = shapeFactory2.getShape("SQUARE");
        square.draw();
    }
}
