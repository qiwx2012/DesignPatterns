package qiwx.com.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import qiwx.com.designpatterns.absfactory.AbsFactory;
import qiwx.com.designpatterns.absfactory.FactoryProducer;
import qiwx.com.designpatterns.builder.Meal;
import qiwx.com.designpatterns.builder.MealBuilder;
import qiwx.com.designpatterns.factory.Shape;
import qiwx.com.designpatterns.factory.ShapeFactory;
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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //抽象工厂模式
            case R.id.btn1:
                Shape shape = new ShapeFactory().getShape("circle");
                shape.draw();
                break;
            case R.id.btn2:
                //图形
                AbsFactory absFactory = FactoryProducer.getFactory("shape");
                Shape shape1 = absFactory.getShape("circle");
                shape1.draw();
                //颜色
                FactoryProducer.getFactory("color").getColors("red").fill();
                break;
            case R.id.btn3:
                SingleObtect.getInstance().showMessage();
                break;
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
            case R.id.btn5:
                ShapeCache.loadCache();

                qiwx.com.designpatterns.prototype.Shape clonedShape = (qiwx.com.designpatterns.prototype.Shape) ShapeCache.getShape("1");
                System.out.println("Shape : " + clonedShape.getType());

                qiwx.com.designpatterns.prototype.Shape clonedShape2 = (qiwx.com.designpatterns.prototype.Shape) ShapeCache.getShape("2");
                System.out.println("Shape : " + clonedShape2.getType());
                break;
        }

    }
}
