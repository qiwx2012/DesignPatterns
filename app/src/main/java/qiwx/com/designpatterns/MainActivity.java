package qiwx.com.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import qiwx.com.designpatterns.absfactory.AbsFactory;
import qiwx.com.designpatterns.absfactory.FactoryProducer;
import qiwx.com.designpatterns.adapter.AudioPlayer;
import qiwx.com.designpatterns.bridge.Circle;
import qiwx.com.designpatterns.bridge.GreenCircle;
import qiwx.com.designpatterns.bridge.RedCircle;
import qiwx.com.designpatterns.builder.Meal;
import qiwx.com.designpatterns.builder.MealBuilder;
import qiwx.com.designpatterns.composite.Employee;
import qiwx.com.designpatterns.factory.Shape;
import qiwx.com.designpatterns.factory.ShapeFactory;
import qiwx.com.designpatterns.filter.AndCriteria;
import qiwx.com.designpatterns.filter.Criteria;
import qiwx.com.designpatterns.filter.CriteriaFemale;
import qiwx.com.designpatterns.filter.CriteriaMale;
import qiwx.com.designpatterns.filter.CriteriaSingle;
import qiwx.com.designpatterns.filter.OrCriteria;
import qiwx.com.designpatterns.filter.Person;
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
        }

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
