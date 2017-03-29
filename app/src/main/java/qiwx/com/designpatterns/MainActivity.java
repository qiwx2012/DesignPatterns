package qiwx.com.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import qiwx.com.designpatterns.Chain.AbstractLogger;
import qiwx.com.designpatterns.Chain.ConsoleLogger;
import qiwx.com.designpatterns.Chain.ErrorLogger;
import qiwx.com.designpatterns.Chain.FileLogger;
import qiwx.com.designpatterns.absfactory.AbsFactory;
import qiwx.com.designpatterns.absfactory.FactoryProducer;
import qiwx.com.designpatterns.adapter.AudioPlayer;
import qiwx.com.designpatterns.bridge.Circle;
import qiwx.com.designpatterns.bridge.GreenCircle;
import qiwx.com.designpatterns.bridge.RedCircle;
import qiwx.com.designpatterns.builder.Meal;
import qiwx.com.designpatterns.builder.MealBuilder;
import qiwx.com.designpatterns.command.Broker;
import qiwx.com.designpatterns.command.BuyStock;
import qiwx.com.designpatterns.command.SellStock;
import qiwx.com.designpatterns.command.Stock;
import qiwx.com.designpatterns.common.Rectangle;
import qiwx.com.designpatterns.common.Shape;
import qiwx.com.designpatterns.composite.Employee;
import qiwx.com.designpatterns.decorator.RedShapeDecorator;
import qiwx.com.designpatterns.facade.ShapeMaker;
import qiwx.com.designpatterns.factory.ShapeFactory;
import qiwx.com.designpatterns.filter.AndCriteria;
import qiwx.com.designpatterns.filter.Criteria;
import qiwx.com.designpatterns.filter.CriteriaFemale;
import qiwx.com.designpatterns.filter.CriteriaMale;
import qiwx.com.designpatterns.filter.CriteriaSingle;
import qiwx.com.designpatterns.filter.OrCriteria;
import qiwx.com.designpatterns.filter.Person;
import qiwx.com.designpatterns.flyweight.ShapFactory1;
import qiwx.com.designpatterns.expression.AndExpression;
import qiwx.com.designpatterns.expression.Expression;
import qiwx.com.designpatterns.expression.OrExpression;
import qiwx.com.designpatterns.expression.TerminalExpression;
import qiwx.com.designpatterns.iterator.ConcreteAggregate;
import qiwx.com.designpatterns.mediator.User;
import qiwx.com.designpatterns.memento.CareTaker;
import qiwx.com.designpatterns.memento.Originator;
import qiwx.com.designpatterns.prototype.ShapeCache;
import qiwx.com.designpatterns.singleton.SingleObtect;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btn10).setOnClickListener(this);
        findViewById(R.id.btn11).setOnClickListener(this);
        findViewById(R.id.btn12).setOnClickListener(this);
        findViewById(R.id.btn13).setOnClickListener(this);
        findViewById(R.id.btn14).setOnClickListener(this);
        findViewById(R.id.btn15).setOnClickListener(this);
        findViewById(R.id.btn16).setOnClickListener(this);
        findViewById(R.id.btn17).setOnClickListener(this);
        findViewById(R.id.btn18).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //工厂模式
            case R.id.btn1:
                Shape shape = new ShapeFactory().getShape("circle");
                shape.draw();
                break;
            //抽象工厂
            case R.id.btn2:
                //图形
                AbsFactory absFactory = FactoryProducer.getFactory("shape");
                Shape shape1 = absFactory.getShape("circle");
                shape1.draw();
                //颜色
                FactoryProducer.getFactory("color").getColors("red").fill();
                break;
            //单例
            case R.id.btn3:
                SingleObtect.getInstance().showMessage();
                break;
            //builder
            case R.id.btn4:
                MealBuilder builder = new MealBuilder();
                Meal vegMeal = builder.prepareVegMeal();
                System.out.println("Veg Meal");
                vegMeal.showItems();
                System.out.println("Total Cost: " + vegMeal.getCost());
                Meal nonVegMeal = builder.prepareNonVegMeal();
                System.out.println("Non-Veg Meal");
                nonVegMeal.showItems();
                System.out.println("Total Cost: " + nonVegMeal.getCost());
                break;
            //原型
            case R.id.btn5:
                ShapeCache.loadCache();

                qiwx.com.designpatterns.prototype.Shape clonedShape = (qiwx.com.designpatterns.prototype.Shape) ShapeCache.getShape("1");
                System.out.println("Shape : " + clonedShape.getType());

                qiwx.com.designpatterns.prototype.Shape clonedShape2 = (qiwx.com.designpatterns.prototype.Shape) ShapeCache.getShape("2");
                System.out.println("Shape : " + clonedShape2.getType());
                break;
            //适配器
            case R.id.btn6:
                AudioPlayer audioPlayer = new AudioPlayer();
                audioPlayer.play("mp3", "horizon.mp3");
                audioPlayer.play("mp4", "alone.mp4");
                audioPlayer.play("vlc", "away.vlc");
                audioPlayer.play("avi", "me.avi");
                break;
            //桥接
            case R.id.btn7:
                qiwx.com.designpatterns.bridge.Shape redCircle = new Circle(100, 100, 10, new RedCircle());
                qiwx.com.designpatterns.bridge.Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
                redCircle.draw();
                greenCircle.draw();
                break;
            //过滤器模式
            case R.id.btn8:
                List<Person> persons = new ArrayList<>();

                persons.add(new Person("Robert", "Male", "Single"));
                persons.add(new Person("John", "Male", "Married"));
                persons.add(new Person("Laura", "Female", "Married"));
                persons.add(new Person("Diana", "Female", "Single"));
                persons.add(new Person("Mike", "Male", "Single"));
                persons.add(new Person("Bobby", "Male", "Single"));

                Criteria male = new CriteriaMale();
                Criteria female = new CriteriaFemale();
                Criteria single = new CriteriaSingle();
                Criteria singleMale = new AndCriteria(single, male);
                Criteria singleOrFemale = new OrCriteria(single, female);

                System.out.println("Males: ");
                printPersons(male.meetCriteria(persons));

                System.out.println("\nFemales: ");
                printPersons(female.meetCriteria(persons));

                System.out.println("\nSingle Males: ");
                printPersons(singleMale.meetCriteria(persons));

                System.out.println("\nSingle Or Females: ");
                break;
            //组合模式
            case R.id.btn9:
                testComposite();
                break;
            //装饰器模式
            case R.id.btn10:
                Shape circle = new qiwx.com.designpatterns.common.Circle();

                Shape redCircle1 = new RedShapeDecorator(circle);

                Shape redRectangle = new RedShapeDecorator(new Rectangle());
                System.out.println("正常图形");
                circle.draw();

                System.out.println("\n带描边圆形");
                redCircle1.draw();

                System.out.println("\n带描边三角形");
                redRectangle.draw();
                break;
            //外观模式
            case R.id.btn11:
                ShapeMaker shapeMaker = new ShapeMaker();
                shapeMaker.drawCircle();
                shapeMaker.drawSquare();
                break;
            //享元模式
            case R.id.btn12:
                String colors[] = {"Red", "Green", "Blue", "White", "Black"};
                for (int i = 0; i < 20; ++i) {
                    qiwx.com.designpatterns.flyweight.Circle circle2 = (qiwx.com.designpatterns.flyweight.Circle) ShapFactory1.getCircle(colors[(int) (Math.random() * colors.length)]);
                    circle2.setX((int) (Math.random() * 100));
                    circle2.setY((int) (Math.random() * 100));
                    circle2.setRadius(100);
                    circle2.draw();
                }
                break;
            //责任链模式
            case R.id.btn13:

                AbstractLogger loggerChain = getChainOfLoggers();

                loggerChain.logMessage(AbstractLogger.INFO,
                        " 这是一条标准信息");
                loggerChain.logMessage(AbstractLogger.DEBUG,
                        "这是一条degug信息");

                loggerChain.logMessage(AbstractLogger.ERROR,
                        "这是一条错误信息");
                break;
            //命令模式
            case R.id.btn14:
                Stock abcStock = new Stock();

                BuyStock buyStockOrder = new BuyStock(abcStock);
                SellStock sellStockOrder = new SellStock(abcStock);

                Broker broker = new Broker();
                broker.takeOrder(buyStockOrder);
                broker.takeOrder(sellStockOrder);

                broker.placeOrders();
                break;
            //解释器模式
            case R.id.btn15:
                Expression isMale = getMaleExpression();
                Expression isMarriedWoman = getMarriedWomanExpression();

                System.out.println("John is male? " + isMale.interpret("John"));
                System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Ju11lie"));
                break;
            //中介者模式
            case R.id.btn16:
                User robert = new User("Robert");
                User john = new User("John");
                robert.sendMessage("Hi! John!");
                john.sendMessage("Hello! Robert!");
                break;
            //备忘录模式
            case R.id.btn17:
                Originator originator = new Originator();
                CareTaker careTaker = new CareTaker();
                originator.setState("State #1");
                originator.setState("State #2");
                //首次保存
                careTaker.add(originator.saveStateToMemento());
                originator.setState("State #3");
                //二次保存
                careTaker.add(originator.saveStateToMemento());
                originator.setState("State #4");
                System.out.println("Current State: " + originator.getState());

                originator.getStateFromMemento(careTaker.get(0));
                System.out.println("First saved State: " + originator.getState());
                originator.getStateFromMemento(careTaker.get(1));
                System.out.println("Second saved State: " + originator.getState());

                break;
            //迭代器
            case R.id.btn18:
                qiwx.com.designpatterns.iterator.List list=new ConcreteAggregate();
                list.add("a");
                list.add("b");
                list.add("c");
                list.add("d");
                list.iterator();
                qiwx.com.designpatterns.iterator.Iterator it=list.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }
                break;
        }

    }


    public Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public  Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    //责任链
    private AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
//        return consoleLogger;
//        return fileLogger;
    }

    //组合模式类似与现实中的部门关系
    private void testComposite() {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales", 20000);

        Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }


    }

    public static void printPersons(List<Person> persons) {

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }
}
