package com.example.gers0n.coffe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Siren extends Bucks implements Comparable<Siren> {
    // Coffe Variables	****************************************************************************
    int 	id;
    String 	name;
    float 	price;
    int 	calories;
    // Constructor	********************************************************************************
    public Siren(int id, String name, float price, int calories) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
    // get name	method	****************************************************************************
    public String getName() {
        return name;
    }
    // get price method	****************************************************************************
    public float getPrice() {
        return price;
    }
    // Check Strings	****************************************************************************
    public String toString()
    {
        return "\n" + name + "\n$" + price + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calories +
                " Cal";
    }
    //**********************************************************************************************
    @Override
    public int compareTo(Siren s) { return this.id - s.id;  }
    //**********************************************************************************************
    public static Comparator<Siren> NameComparator = new Comparator<Siren>() {

        @Override
        public int compare(Siren e1, Siren e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    //**********************************************************************************************
    public static Comparator<Siren> PriceComparator = new Comparator<Siren>() {
        public int compare(Siren p1, Siren p2) {
            Float precio1 = Float.valueOf(p1.getPrice());
            Float precio2 = Float.valueOf(p2.getPrice());
            return precio1.compareTo(precio2);
        }
    };
    //**********************************************************************************************
    public static Comparator<Siren> CaloriesComparator = new Comparator<Siren>() {
        public int compare (Siren c1, Siren c2) {
            return c1.calories - c2.calories;
        }
    };
    //**********************************************************************************************
}

public class Bucks extends AppCompatActivity {
    public List<Siren> rtnBkList() {
        ArrayList<Siren> listStarbuck = new ArrayList<>();
        // Add Items
        listStarbuck.add(new Siren(1,"Maple Pecan", 4.45f, 300));
        listStarbuck.add(new Siren(2, "Pumpkin Spice", 4.45f, 300));
        listStarbuck.add(new Siren(3, "Salted Caramel Mocha", 4.45f, 340));
        listStarbuck.add(new Siren(4, "Dark Mocha", 3.95f, 310));
        listStarbuck.add(new Siren(5,"Caramel", 3.95f, 300));
        listStarbuck.add(new Siren(6, "Java Chip", 3.95f, 340));
        listStarbuck.add(new Siren(7, "Vanilla Bean Creme", 3.45f, 280));
        listStarbuck.add(new Siren(8, "Double Chocolaty Chip Creme", 3.95f, 310));
        listStarbuck.add(new Siren(9, "Strawberries & Creme", 3.95f, 270));
        listStarbuck.add(new Siren(10, "Green Tea Creme", 3.95f, 320));
        listStarbuck.add(new Siren(11, "Strawberry Acai", 3.25f, 80));
        listStarbuck.add(new Siren(12, "Very Berry Hibiscus", 3.25f, 60));
        listStarbuck.add(new Siren(13, "Shaken Iced Tea Infusions", 2.75f, 30));
        listStarbuck.add(new Siren(14, "Shaken Iced Tea Infusions Lemonades", 3.25f, 50));
        listStarbuck.add(new Siren(15, "Shaken Iced Tea", 1.95f, 30));
        listStarbuck.add(new Siren(16, "Shaken Iced Tea Lemonades", 2.65f, 70));
        listStarbuck.add(new Siren(17, "Lightly Sweet Chai Latte", 3.45f, 140));
        listStarbuck.add(new Siren(18, "Classic Chai Tea Latte", 3.45f, 190));
        listStarbuck.add(new Siren(19, "Green Tea Latte", 3.45f, 190));
        listStarbuck.add(new Siren(20, "London Fog Tea Latte", 3.45f, 140));
        listStarbuck.add(new Siren(21, "Full-Leaf Brewed Tea", 2.25f, 0));
        listStarbuck.add(new Siren(23, "Iced Caramel Macchiato", 3.95f, 180));
        listStarbuck.add(new Siren(24, "White Chocolate Mocha", 3.95f, 340));
        listStarbuck.add(new Siren(25, "Caffe Mocha", 3.45f, 290));
        listStarbuck.add(new Siren(26, "Flat White", 3.95f, 170));
        listStarbuck.add(new Siren(27, "Caffe Latte", 2.95f, 150));
        listStarbuck.add(new Siren(28, "Pumpkin Spice Chai Latte", 3.95f, 220));
        listStarbuck.add(new Siren(29, "Freshly Brewed Coffee", 1.95f, 5));
        listStarbuck.add(new Siren(30, "Narinyo 70 Cold Brew", 2.95f, 0));
        listStarbuck.add(new Siren(31, "Vanilla Sweet Cream Cold Brew", 3.25f, 100));
        listStarbuck.add(new Siren(32, "Iced Coffe", 2.45f, 60));
        listStarbuck.add(new Siren(33, "Caramel Apple Spice", 3.25f, 300));
        return listStarbuck;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucks);

        List<Siren> X = rtnBkList();
        ListView lv;
        lv = (ListView) findViewById(R.id.BksList);

        ArrayAdapter<Siren> arryDapter = new ArrayAdapter<Siren>(
          this,
                android.R.layout.simple_list_item_1,
                X
        );

        lv.setAdapter(arryDapter);

    }
    // Grande Button   *****************************************************************************
    public void GrandeList(View view) {
        Intent grdIntent = new Intent(this, grandeSize.class);
        startActivity(grdIntent);
    }
    // Venti Button   ******************************************************************************
    public void VentiList(View view) {
        Intent vntIntent = new Intent(this, ventiSize.class);
        startActivity(vntIntent);
    }
    //**********************************************************************************************
    public void BoxNameSiren (View view) {

        List<Siren> X2 = rtnBkList();
        ListView lv2;
        lv2 = (ListView) findViewById(R.id.BksList);

        ArrayAdapter<Siren> arryDapter2 = new ArrayAdapter<Siren>(
                this,
                android.R.layout.simple_list_item_1,
                X2);

        Collections.sort(X2, Siren.NameComparator);
        lv2.setAdapter(arryDapter2);

    }
    //**********************************************************************************************
    public void BoxCaloriesSiren (View view) {
        List<Siren> X3 = rtnBkList();
        ListView lv3;
        lv3 = (ListView) findViewById(R.id.BksList);

        ArrayAdapter<Siren> arryDapter3 = new ArrayAdapter<Siren>(
          this,
                android.R.layout.simple_list_item_1,
                X3
        );

        Collections.sort(X3, Siren.CaloriesComparator);
        lv3.setAdapter(arryDapter3);
    }
    //**********************************************************************************************
    public void BoxPriceSiren (View view) {
        List<Siren> X4 = rtnBkList();
        ListView lv4;
        lv4 = (ListView) findViewById(R.id.BksList);

        ArrayAdapter<Siren> arryDapter4 = new ArrayAdapter<Siren>(
          this,
                android.R.layout.simple_list_item_1,
                X4
        );

        Collections.sort(X4, Siren.PriceComparator);
        lv4.setAdapter(arryDapter4);
    }
    //**********************************************************************************************
    public void BoxDefaultSiren (View view) {
        List<Siren> X5 = rtnBkList();
        ListView lv5;
        lv5 = (ListView) findViewById(R.id.BksList);

        ArrayAdapter<Siren> arryDapter5 = new ArrayAdapter<Siren>(
          this,
                android.R.layout.simple_list_item_1,
          X5
        );

       lv5.setAdapter(arryDapter5);
    }
    //**********************************************************************************************
}