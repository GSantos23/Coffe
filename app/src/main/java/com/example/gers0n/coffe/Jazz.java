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

class Biblio extends Jazz implements Comparable<Biblio>{
    // Coffe Variables	***************************************************************************
    int 	Jzid;
    String 	Jzname;
    float 	Jzprice;
    int 	Jzcalories;
    // Constructor  *******************************************************************************
    public Biblio (int Jzid, String Jzname, float Jzprice, int Jzcalories) {
        this.Jzid = Jzid;
        this.Jzname = Jzname;
        this.Jzprice = Jzprice;
        this.Jzcalories = Jzcalories;
    }
    // get name	method	****************************************************************************
    public String getNameJ() {
        return Jzname;
    }
    // get price method	****************************************************************************
    public float getPriceJ() { return Jzprice; }
    //Check Strings	********************************************************************************
    public String toString()
    {
        return "\n" + Jzname + "\n$" + Jzprice + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + Jzcalories
                + " Cal";
    }
    //**********************************************************************************************
    @Override
    public int compareTo(Biblio s) {
        return this.Jzid - s.Jzid;
    }
    //**********************************************************************************************
    public static Comparator<Biblio> NameComparatorJ = new Comparator<Biblio>() {

        @Override
        public int compare(Biblio e1, Biblio e2) {
            return e1.getNameJ().compareTo(e2.getNameJ());
        }
    };
    //**********************************************************************************************
    public static Comparator<Biblio> CaloriesComparatorJ = new Comparator<Biblio>() {
        public int compare (Biblio c1, Biblio c2) {
            return c1.Jzcalories - c2.Jzcalories;
        }
    };
    //*********************************************************************************************
    public static Comparator<Biblio> PriceComparatorJ = new Comparator<Biblio>() {
        public int compare(Biblio p1, Biblio p2) {
            Float precio1 = Float.valueOf(p1.getPriceJ());
            Float precio2 = Float.valueOf(p2.getPriceJ());
            return precio1.compareTo(precio2);
        }
    };
    //*********************************************************************************************
}

public class Jazz extends AppCompatActivity {

    public List<Biblio> rtnList(){
        ArrayList<Biblio> listJazz = new ArrayList<Biblio>();
        // Add items
        listJazz.add(new Biblio(1,"Regular or Decaf", 1.89f, 0));
        listJazz.add(new Biblio(2,"Iced Coffee", 2.39f, 130));
        listJazz.add(new Biblio(3, "Cappuccino", 2.89f, 120));
        listJazz.add(new Biblio(4, "Latte", 2.89f, 110));
        listJazz.add(new Biblio(5,"Mocha", 3.39f, 280));
        listJazz.add(new Biblio(6,"Espresso", 1.69f, 0));
        listJazz.add(new Biblio(7,"Americano", 2.19f, 0));
        listJazz.add(new Biblio(9,"Cafe au Lait", 2.49f, 220));
        listJazz.add(new Biblio(10,"Caramel Delight", 3.89f, 370));
        listJazz.add(new Biblio(11,"Caramel Latte", 3.89f, 290));
        listJazz.add(new Biblio(12,"Tuxedo", 4.19f, 340));
        listJazz.add(new Biblio(13,"White Chocolate Mocha", 3.89f, 270));
        listJazz.add(new Biblio(14,"Creme Brulee", 4.19f, 360));
        listJazz.add(new Biblio(15,"Hot Chocolate", 2.69f, 300));
        listJazz.add(new Biblio(16,"Flavored Steamer", 2.19f, 200));
        listJazz.add(new Biblio(17,"Mocha Blast", 3.89f, 350));
        listJazz.add(new Biblio(18,"Caramel Blast", 3.89f, 380));
        listJazz.add(new Biblio(19,"White Chocolate Blast", 3.89f, 340));
        listJazz.add(new Biblio(20,"Caramel Delight Blast", 3.89f, 430));
        listJazz.add(new Biblio(21,"Tuxedo Blast", 4.19f, 400));
        listJazz.add(new Biblio(22,"Creme Brulee Blast", 4.19f, 420));
        listJazz.add(new Biblio(23,"Smoothies", 3.69f, 0));
        listJazz.add(new Biblio(24,"Iced Blueberry Green Tea", 2.19f, 60));
        listJazz.add(new Biblio(25,"Iced Tea", 1.89f, 100));
        listJazz.add(new Biblio(26,"Hot Tea", 2.19f, 0));
        listJazz.add(new Biblio(27,"Hot or Iced Tea Latte", 3.39f, 200));
        return  listJazz;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz);

        List<Biblio> A = rtnList();
        ListView listView;
        listView = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio> arrayAdapter = new ArrayAdapter<Biblio>(
                this,
                android.R.layout.simple_list_item_1,
                A);

        listView.setAdapter(arrayAdapter);
    }
    // Grande Button    ****************************************************************************
    public void JazzGrandeList(View view) {
        Intent jgrdIntent = new Intent(this, jazzGrandeSize.class);
        startActivity(jgrdIntent);
    }
    // Supreme Button   ****************************************************************************
    public void JazzSupremeList(View view) {
        Intent jsprIntent = new Intent(this, jazzSupremeSize.class);
        startActivity(jsprIntent);
    }
    //**********************************************************************************************
    public void BoxName (View view) {

        List<Biblio> listo = rtnList();
        ListView listView2;
        listView2 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio> arrayAdapter = new ArrayAdapter<Biblio>(
                this,
                android.R.layout.simple_list_item_1,
                listo);

        Collections.sort(listo, Biblio.NameComparatorJ);
        listView2.setAdapter(arrayAdapter);

    }
    //**********************************************************************************************
    public void BoxCalories (View v) {
        List<Biblio> listCal = rtnList();
        ListView listView3;
        listView3 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio> arrayCal = new ArrayAdapter<Biblio>(
          this,
                android.R.layout.simple_list_item_1,
                listCal
        );

        Collections.sort(listCal, Biblio.CaloriesComparatorJ);
        listView3.setAdapter(arrayCal);
    }
    //**********************************************************************************************
    public void BoxPrice (View v) {
        List<Biblio> listPrice = rtnList();
        ListView listView4;
        listView4 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio> arrayPrice = new ArrayAdapter<Biblio>(
          this,
                android.R.layout.simple_list_item_1,
                listPrice
        );

        Collections.sort(listPrice, Biblio.PriceComparatorJ);
        listView4.setAdapter(arrayPrice);
    }
    //**********************************************************************************************
    public void BoxDefault (View x) {
        List<Biblio> listDefault = rtnList();
        ListView listView5;
        listView5 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio> arrayDefault = new ArrayAdapter<Biblio>(
          this,
                android.R.layout.simple_list_item_1,
                listDefault
        );

        listView5.setAdapter(arrayDefault);
    }
    //**********************************************************************************************
}