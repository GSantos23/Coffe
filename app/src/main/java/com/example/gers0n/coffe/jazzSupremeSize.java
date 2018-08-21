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


class Biblio3 extends  jazzSupremeSize implements Comparable<Biblio3> {
    // Coffe Variables	***************************************************************************
    int 	Jzid3;
    String 	Jzname3;
    float 	Jzprice3;
    int 	Jzcalories3;
    // Constructor  *******************************************************************************
    public Biblio3 (int Jzid3, String Jzname3, float Jzprice3, int Jzcalories3) {
        this.Jzid3 = Jzid3;
        this.Jzname3 = Jzname3;
        this.Jzprice3 = Jzprice3;
        this.Jzcalories3 = Jzcalories3;
    }
    // get name	method	****************************************************************************
    public String getNameJ3() {
        return Jzname3;
    }
    // get price method	****************************************************************************
    public float getPriceJ3() { return Jzprice3; }
    //Check Strings	********************************************************************************
    public String toString()
    {
        return "\n" + Jzname3 + "\n$" + Jzprice3 + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + Jzcalories3
                + " Cal";
    }
    //**********************************************************************************************
    @Override
    public int compareTo(Biblio3 s) {
        return this.Jzid3 - s.Jzid3;
    }
    //**********************************************************************************************
    public static Comparator<Biblio3> NameComparatorJ3 = new Comparator<Biblio3>() {

        @Override
        public int compare(Biblio3 e1, Biblio3 e2) {
            return e1.getNameJ3().compareTo(e2.getNameJ3());
        }
    };
    //**********************************************************************************************
    public static Comparator<Biblio3> CaloriesComparatorJ3 = new Comparator<Biblio3>() {
        public int compare (Biblio3 c1, Biblio3 c2) {
            return c1.Jzcalories3 - c2.Jzcalories3;
        }
    };
    //*********************************************************************************************
    public static Comparator<Biblio3> PriceComparatorJ3 = new Comparator<Biblio3>() {
        public int compare(Biblio3 p1, Biblio3 p2) {
            Float precio1_3J = Float.valueOf(p1.getPriceJ3());
            Float precio2_3J = Float.valueOf(p2.getPriceJ3());
            return precio1_3J.compareTo(precio2_3J);
        }
    };
    //*********************************************************************************************
}

public class jazzSupremeSize extends AppCompatActivity {

    public List<Biblio3> rtnList3() {
        ArrayList<Biblio3> listJazz3 = new ArrayList<Biblio3>();
        // Add items
        listJazz3.add(new Biblio3(1,"Regular or Decaf", 2.39f, 0));
        listJazz3.add(new Biblio3(2,"Iced Coffee", 2.89f, 130));
        listJazz3.add(new Biblio3(3, "Cappuccino", 4.19f, 170));
        listJazz3.add(new Biblio3(4, "Latte", 4.19f, 160));
        listJazz3.add(new Biblio3(5,"Mocha", 4.69f, 360));
        listJazz3.add(new Biblio3(6,"Espresso", 2.39f, 0));
        listJazz3.add(new Biblio3(7,"Americano", 3.19f, 0));
        listJazz3.add(new Biblio3(9,"Cafe au Lait", 2.99f, 250));
        listJazz3.add(new Biblio3(10,"Caramel Delight", 5.19f, 530));
        listJazz3.add(new Biblio3(11,"Caramel Latte", 4.89f, 400));
        listJazz3.add(new Biblio3(12,"Tuxedo", 5.39f, 510));
        listJazz3.add(new Biblio3(13,"White Chocolate Mocha", 5.19f, 360));
        listJazz3.add(new Biblio3(14,"Creme Brulee", 5.39f, 490));
        listJazz3.add(new Biblio3(15,"Hot Chocolate", 3.39f, 440));
        listJazz3.add(new Biblio3(16,"Flavored Steamer", 2.69f, 310));
        listJazz3.add(new Biblio3(17,"Mocha Blast", 5.19f, 480));
        listJazz3.add(new Biblio3(18,"Caramel Blast", 5.19f, 540));
        listJazz3.add(new Biblio3(19,"White Chocolate Blast", 5.19f, 470));
        listJazz3.add(new Biblio3(20,"Caramel Delight Blast", 5.19f, 640));
        listJazz3.add(new Biblio3(21,"Tuxedo Blast", 5.39f, 640));
        listJazz3.add(new Biblio3(22,"Creme Brulee Blast", 5.39f, 630));
        listJazz3.add(new Biblio3(23,"Smoothies", 4.69f, 0));
        listJazz3.add(new Biblio3(24,"Iced Blueberry Green Tea", 2.89f, 100));
        listJazz3.add(new Biblio3(25,"Iced Tea", 2.69f, 190));
        listJazz3.add(new Biblio3(26,"Hot Tea", 2.59f, 0));
        listJazz3.add(new Biblio3(27,"Hot or Iced Tea Latte", 4.39f, 300));
        return  listJazz3;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz_supreme_size);

        List<Biblio3> C = rtnList3();
        ListView listViewSupreme;
        listViewSupreme = (ListView) findViewById(R.id.DspList3);

        ArrayAdapter<Biblio3> arrayAdapterS = new ArrayAdapter<Biblio3>(
                this,
                android.R.layout.simple_list_item_1,
                C);

        listViewSupreme.setAdapter(arrayAdapterS);
    }
    //**********************************************************************************************
    public void BoxName3 (View view) {

        List<Biblio3> lstName = rtnList3();
        ListView listViewS2;
        listViewS2 = (ListView) findViewById(R.id.DspList3);

        ArrayAdapter<Biblio3> arrayName = new ArrayAdapter<Biblio3>(
                this,
                android.R.layout.simple_list_item_1,
                lstName);

        Collections.sort(lstName, Biblio3.NameComparatorJ3);
        listViewS2.setAdapter(arrayName);
    }
    //**********************************************************************************************
    public void BoxCalories3 (View v) {
        List<Biblio3> listCal3 = rtnList3();
        ListView listViewS3;
        listViewS3 = (ListView) findViewById(R.id.DspList3);

        ArrayAdapter<Biblio3> arrayCal3 = new ArrayAdapter<Biblio3>(
                this,
                android.R.layout.simple_list_item_1,
                listCal3
        );

        Collections.sort(listCal3, Biblio3.CaloriesComparatorJ3);
        listViewS3.setAdapter(arrayCal3);
    }
    //**********************************************************************************************
    public void BoxPrice3 (View v) {
        List<Biblio3> listPrice3 = rtnList3();
        ListView listViewS4;
        listViewS4 = (ListView) findViewById(R.id.DspList3);

        ArrayAdapter<Biblio3> arrayPrice3 = new ArrayAdapter<Biblio3>(
                this,
                android.R.layout.simple_list_item_1,
                listPrice3
        );

        Collections.sort(listPrice3, Biblio3.PriceComparatorJ3);
        listViewS4.setAdapter(arrayPrice3);
    }
    //**********************************************************************************************
    public void BoxDefault3 (View x) {
        List<Biblio3> listDefault3 = rtnList3();
        ListView listViewS5;
        listViewS5 = (ListView) findViewById(R.id.DspList3);

        ArrayAdapter<Biblio3> arrayDefault3 = new ArrayAdapter<Biblio3>(
                this,
                android.R.layout.simple_list_item_1,
                listDefault3
        );

        listViewS5.setAdapter(arrayDefault3);
    }
    //**********************************************************************************************
}
