package sg.edu.rp.id18044455.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvFood;
    ArrayAdapter arrayAdapter;
    ArrayList<Food> foodList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFood = findViewById(R.id.lvFood);

        foodList = new ArrayList<Food>();
        foodList.add(new Food("Ah Lat Coffee", false));
        foodList.add(new Food("Rocky Choc", true));
        foodList.add(new Food("Kid Cat Choc", true));

        arrayAdapter = new FoodAdapter(this, R.layout.row, foodList);
        lvFood.setAdapter(arrayAdapter);
        

    }//end of onCreate

}//end of class