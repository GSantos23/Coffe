package com.example.gers0n.coffe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Siren2 extends grandeSize implements Comparable<Siren2> {
    // Coffe Variables	****************************************************************************
    int 	id2;
    String 	name2;
    float 	price2;
    int 	calories2;
    // Constructor	********************************************************************************
    public Siren2(int id2, String name2, float price2, int calories2) {
        this.id2 = id2;
        this.name2 = name2;
        this.price2 = price2;
        this.calories2 = calories2;
    }
    // get name	method	****************************************************************************
    public String getName2() {
        return name2;
    }
    // get price method	****************************************************************************
    public float getPrice2() {
        return price2;
    }
    // Check Strings	****************************************************************************
    public String toString() {
        return "\n" + name2 + "\n$" + price2 + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calories2 +
                " Cal";
    }
    //**********************************************************************************************
    @Override
    public int compareTo(Siren2 s) { return this.id2 - s.id2;  }
    //**********************************************************************************************
    public static Comparator<Siren2> NameComparator2 = new Comparator<Siren2>() {

        @Override
        public int compare(Siren2 e1, Siren2 e2) {
            return e1.getName2().compareTo(e2.getName2());
        }
    };
    //**********************************************************************************************
    public static Comparator<Siren2> PriceComparator2 = new Comparator<Siren2>() {
        public int compare(Siren2 p1, Siren2 p2) {
            Float precio1_2 = Float.valueOf(p1.getPrice2());
            Float precio2_2 = Float.valueOf(p2.getPrice2());
            return precio1_2.compareTo(precio2_2);
        }
    };
    //**********************************************************************************************
    public static Comparator<Siren2> CaloriesComparator2 = new Comparator<Siren2>() {
        public int compare (Siren2 c1, Siren2 c2) {
            return c1.calories2 - c2.calories2;
        }
    };
    //**********************************************************************************************
}

public class grandeSize extends AppCompatActivity {
    public List<Siren2> rtnBkList2() {
        ArrayList<Siren2> listStarbuck2 = new ArrayList<>();
        // Add Items
        listStarbuck2.add(new Siren2(1,"Maple Pecan", 4.95f, 440));
        listStarbuck2.add(new Siren2(2, "Pumpkin Spice", 4.95f, 450));
        listStarbuck2.add(new Siren2(3, "Salted Caramel Mocha", 4.95f, 440));
        listStarbuck2.add(new Siren2(4, "Dark Mocha", 4.75f, 470));
        listStarbuck2.add(new Siren2(5,"Caramel", 4.75f, 420));
        listStarbuck2.add(new Siren2(6, "Java Chip", 4.75f, 470));
        listStarbuck2.add(new Siren2(7, "Vanilla Bean Creme", 3.95f, 400));
        listStarbuck2.add(new Siren2(8, "Double Chocolaty Chip Creme", 4.75f, 420));
        listStarbuck2.add(new Siren2(9, "Strawberries & Creme", 4.75f, 370));
        listStarbuck2.add(new Siren2(10, "Green Tea Creme", 4.75f, 430));
        listStarbuck2.add(new Siren2(11, "Strawberry Acai", 3.75f, 90));
        listStarbuck2.add(new Siren2(12, "Very Berry Hibiscus", 3.75f, 70));
        listStarbuck2.add(new Siren2(13, "Shaken Iced Tea Infusions", 3.25f, 45));
        listStarbuck2.add(new Siren2(14, "Shaken Iced Tea Infusions Lemonades", 3.75f, 70));
        listStarbuck2.add(new Siren2(15, "Shaken Iced Tea", 2.45f, 45));
        listStarbuck2.add(new Siren2(16, "Shaken Iced Tea Lemonades", 3.25f, 90));
        listStarbuck2.add(new Siren2(17, "Lightly Sweet Chai Latte", 4.15f, 190));
        listStarbuck2.add(new Siren2(18, "Classic Chai Tea Latte", 4.15f, 240));
        listStarbuck2.add(new Siren2(19, "Green Tea Latte", 4.15f, 240));
        listStarbuck2.add(new Siren2(20, "London Fog Tea Latte", 4.15f, 180));
        listStarbuck2.add(new Siren2(21, "Full-Leaf Brewed Tea", 2.45f, 0));
        listStarbuck2.add(new Siren2(23, "Iced Caramel Macchiato", 4.65f, 250));
        listStarbuck2.add(new Siren2(24, "White Chocolate Mocha", 4.65f, 430));
        listStarbuck2.add(new Siren2(25, "Caffe Mocha", 4.15f, 360));
        listStarbuck2.add(new Siren2(26, "Flat White", 3.95f, 170));
        listStarbuck2.add(new Siren2(27, "Caffe Latte", 3.65f, 190));
        listStarbuck2.add(new Siren2(28, "Pumpkin Spice Chai Latte", 4.65f, 290));
        listStarbuck2.add(new Siren2(29, "Freshly Brewed Coffee", 2.25f, 5));
        listStarbuck2.add(new Siren2(30, "Narinyo 70 Cold Brew", 3.45f, 5));
        listStarbuck2.add(new Siren2(31, "Vanilla Sweet Cream Cold Brew", 3.75f, 110));
        listStarbuck2.add(new Siren2(32, "Iced Coffe", 2.75f, 90));
        listStarbuck2.add(new Siren2(33, "Caramel Apple Spice", 3.75f, 380));
        return  listStarbuck2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grande_size);

        List<Siren2> Y = rtnBkList2();
        ListView lvGrande;
        lvGrande = (ListView) findViewById(R.id.BkList2);

        ArrayAdapter<Siren2> adapter = new ArrayAdapter<Siren2>(
                this,
                android.R.layout.simple_list_item_1,
                Y
        );

        lvGrande.setAdapter(adapter);
    }
    //**********************************************************************************************
    public void BoxNameSiren2 (View view) {

        List<Siren2> Y2 = rtnBkList2();
        ListView lv2Grande;
        lv2Grande = (ListView) findViewById(R.id.BkList2);

        ArrayAdapter<Siren2> adapter2 = new ArrayAdapter<Siren2>(
                this,
                android.R.layout.simple_list_item_1,
                Y2);

        Collections.sort(Y2, Siren2.NameComparator2);
        lv2Grande.setAdapter(adapter2);
    }
    //**********************************************************************************************
    public void BoxCaloriesSiren2 (View view) {
        List<Siren2> Y3 = rtnBkList2();
        ListView lv3Grande;
        lv3Grande = (ListView) findViewById(R.id.BkList2);

        ArrayAdapter<Siren2> adapter3 = new ArrayAdapter<Siren2>(
                this,
                android.R.layout.simple_list_item_1,
                Y3
        );

        Collections.sort(Y3, Siren2.CaloriesComparator2);
        lv3Grande.setAdapter(adapter3);
    }
    //**********************************************************************************************
    public void BoxPriceSiren (View view) {
        List<Siren2> Y4 = rtnBkList2();
        ListView lv4Grande;
        lv4Grande = (ListView) findViewById(R.id.BkList2);

        ArrayAdapter<Siren2> adapter4 = new ArrayAdapter<Siren2>(
                this,
                android.R.layout.simple_list_item_1,
                Y4
        );

        Collections.sort(Y4, Siren2.PriceComparator2);
        lv4Grande.setAdapter(adapter4);
    }
    //**********************************************************************************************
    public void BoxDefaultSiren (View view) {
        List<Siren2> Y5 = rtnBkList2();
        ListView lv5Grande;
        lv5Grande = (ListView) findViewById(R.id.BkList2);

        ArrayAdapter<Siren2> adapter5 = new ArrayAdapter<Siren2>(
                this,
                android.R.layout.simple_list_item_1,
                Y5
        );

        lv5Grande.setAdapter(adapter5);
    }
    //**********************************************************************************************
}
