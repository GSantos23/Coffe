package com.example.gers0n.coffe;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Siren3 extends ventiSize implements Comparable<Siren3> {
    // Coffe Variables	****************************************************************************
    int 	id3;
    String 	name3;
    float 	price3;
    int 	calories3;
    // Constructor	********************************************************************************
    public Siren3(int id3, String name3, float price3, int calories3) {
        this.id3 = id3;
        this.name3 = name3;
        this.price3 = price3;
        this.calories3 = calories3;
    }
    // get name	method	****************************************************************************
    public String getName3() {
        return name3;
    }
    // get price method	****************************************************************************
    public float getPrice3() {
        return price3;
    }
    // Check Strings	****************************************************************************
    public String toString() {
        return "\n" + name3 + "\n$" + price3 + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + calories3 +
                " Cal";
    }
    //**********************************************************************************************
    @Override
    public int compareTo(Siren3 s) { return this.id3 - s.id3;  }
    //**********************************************************************************************
    public static Comparator<Siren3> NameComparator3 = new Comparator<Siren3>() {

        @Override
        public int compare(Siren3 e1, Siren3 e2) {
            return e1.getName3().compareTo(e2.getName3());
        }
    };
    //**********************************************************************************************
    public static Comparator<Siren3> PriceComparator3 = new Comparator<Siren3>() {
        public int compare(Siren3 p1, Siren3 p2) {
            Float precio1_3 = Float.valueOf(p1.getPrice3());
            Float precio2_3 = Float.valueOf(p2.getPrice3());
            return precio1_3.compareTo(precio2_3);
        }
    };
    //**********************************************************************************************
    public static Comparator<Siren3> CaloriesComparator3 = new Comparator<Siren3>() {
        public int compare (Siren3 c1, Siren3 c2) {
            return c1.calories3 - c2.calories3;
        }
    };
    //**********************************************************************************************
}

public class ventiSize extends AppCompatActivity {
    public List<Siren3> rtnBkList3() {
        ArrayList<Siren3> listStarbuck3 = new ArrayList<>();
        // Add Items
        listStarbuck3.add(new Siren3(1,"Maple Pecan", 5.45f, 540));
        listStarbuck3.add(new Siren3(2, "Pumpkin Spice", 5.45f, 500));
        listStarbuck3.add(new Siren3(3, "Salted Caramel Mocha", 5.45f, 570));
        listStarbuck3.add(new Siren3(4, "Dark Mocha", 5.25f, 580));
        listStarbuck3.add(new Siren3(5,"Caramel", 5.25f, 510));
        listStarbuck3.add(new Siren3(6, "Java Chip", 5.25f, 600));
        listStarbuck3.add(new Siren3(7, "Vanilla Bean Creme", 4.75f, 490));
        listStarbuck3.add(new Siren3(8, "Double Chocolaty Chip Creme", 5.25f, 540));
        listStarbuck3.add(new Siren3(9, "Strawberries & Creme", 5.25f, 460));
        listStarbuck3.add(new Siren3(10, "Green Tea Creme", 5.25f, 550));
        listStarbuck3.add(new Siren3(11, "Strawberry Acai", 4.25f, 130));
        listStarbuck3.add(new Siren3(12, "Very Berry Hibiscus", 4.25f, 100));
        listStarbuck3.add(new Siren3(13, "Shaken Iced Tea Infusions", 3.75f, 60));
        listStarbuck3.add(new Siren3(14, "Shaken Iced Tea Infusions Lemonades", 4.25f, 100));
        listStarbuck3.add(new Siren3(15, "Shaken Iced Tea", 2.75f, 60));
        listStarbuck3.add(new Siren3(16, "Shaken Iced Tea Lemonades", 3.65f, 130));
        listStarbuck3.add(new Siren3(17, "Lightly Sweet Chai Latte", 4.45f, 240));
        listStarbuck3.add(new Siren3(18, "Classic Chai Tea Latte", 4.45f, 310));
        listStarbuck3.add(new Siren3(19, "Green Tea Latte", 4.45f, 320));
        listStarbuck3.add(new Siren3(20, "London Fog Tea Latte", 4.45f, 230));
        listStarbuck3.add(new Siren3(21, "Full-Leaf Brewed Tea", 2.65f, 0));
        listStarbuck3.add(new Siren3(23, "Iced Caramel Macchiato", 5.25f, 350));
        listStarbuck3.add(new Siren3(24, "White Chocolate Mocha", 4.95f, 530));
        listStarbuck3.add(new Siren3(25, "Caffe Mocha", 4.75f, 450));
        listStarbuck3.add(new Siren3(26, "Flat White", 3.95f, 170));
        listStarbuck3.add(new Siren3(27, "Caffe Latte", 4.25f, 250));
        listStarbuck3.add(new Siren3(28, "Pumpkin Spice Chai Latte", 4.95f, 360));
        listStarbuck3.add(new Siren3(29, "Freshly Brewed Coffee", 2.45f, 5));
        listStarbuck3.add(new Siren3(30, "Narinyo 70 Cold Brew", 3.75f, 5));
        listStarbuck3.add(new Siren3(31, "Vanilla Sweet Cream Cold Brew", 3.95f, 200));
        listStarbuck3.add(new Siren3(32, "Iced Coffe", 2.95f, 130));
        listStarbuck3.add(new Siren3(33, "Caramel Apple Spice", 3.95f, 450));
        return  listStarbuck3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venti_size);

        List<Siren3> Z = rtnBkList3();
        ListView lvVenti;
        lvVenti = (ListView) findViewById(R.id.BkList3);

        ArrayAdapter<Siren3> adpter1 = new ArrayAdapter<Siren3>(
                this,
                android.R.layout.simple_list_item_1,
                Z
        );

        lvVenti.setAdapter(adpter1);
    }
    //**********************************************************************************************
    public void BoxNameSiren3 (View view) {

        List<Siren3> Z2 = rtnBkList3();
        ListView lv2Venti;
        lv2Venti = (ListView) findViewById(R.id.BkList3);

        ArrayAdapter<Siren3> adpter2 = new ArrayAdapter<Siren3>(
                this,
                android.R.layout.simple_list_item_1,
                Z2);

        Collections.sort(Z2, Siren3.NameComparator3);
        lv2Venti.setAdapter(adpter2);
    }
    //**********************************************************************************************
    public void BoxCaloriesSiren3 (View view) {
        List<Siren3> Z3 = rtnBkList3();
        ListView lv3Venti;
        lv3Venti = (ListView) findViewById(R.id.BkList3);

        ArrayAdapter<Siren3> adpter3 = new ArrayAdapter<Siren3>(
                this,
                android.R.layout.simple_list_item_1,
                Z3
        );

        Collections.sort(Z3, Siren3.CaloriesComparator3);
        lv3Venti.setAdapter(adpter3);
    }
    //**********************************************************************************************
    public void BoxPriceSiren3 (View view) {
        List<Siren3> Z4 = rtnBkList3();
        ListView lv4Venti;
        lv4Venti = (ListView) findViewById(R.id.BkList3);

        ArrayAdapter<Siren3> adpter4 = new ArrayAdapter<Siren3>(
                this,
                android.R.layout.simple_list_item_1,
                Z4
        );

        Collections.sort(Z4, Siren3.PriceComparator3);
        lv4Venti.setAdapter(adpter4);
    }
    //**********************************************************************************************
    public void BoxDefaultSiren3 (View view) {
        List<Siren3> Z5 = rtnBkList3();
        ListView lv5Venti;
        lv5Venti = (ListView) findViewById(R.id.BkList3);

        ArrayAdapter<Siren3> adpter5 = new ArrayAdapter<Siren3>(
                this,
                android.R.layout.simple_list_item_1,
                Z5
        );

        lv5Venti.setAdapter(adpter5);
    }
    //**********************************************************************************************
}
