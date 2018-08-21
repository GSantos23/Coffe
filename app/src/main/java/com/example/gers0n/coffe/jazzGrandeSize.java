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

class Biblio2 extends  jazzGrandeSize implements Comparable<Biblio2> {
    // Coffe Variables	***************************************************************************
    int 	Jzid2;
    String 	Jzname2;
    float 	Jzprice2;
    int 	Jzcalories2;
    // Constructor  *******************************************************************************
    public Biblio2 (int Jzid2, String Jzname2, float Jzprice2, int Jzcalories2) {
        this.Jzid2 = Jzid2;
        this.Jzname2 = Jzname2;
        this.Jzprice2 = Jzprice2;
        this.Jzcalories2 = Jzcalories2;
    }
    // get name	method	****************************************************************************
    public String getNameJ2() {
        return Jzname2;
    }
    // get price method	****************************************************************************
    public float getPriceJ2() { return Jzprice2; }
    //Check Strings	********************************************************************************
    public String toString()
    {
        return "\n" + Jzname2 + "\n$" + Jzprice2 + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + Jzcalories2
                + " Cal";
    }
    //**********************************************************************************************
    @Override
    public int compareTo(Biblio2 s) {
        return this.Jzid2 - s.Jzid2;
    }
    //**********************************************************************************************
    public static Comparator<Biblio2> NameComparatorJ2 = new Comparator<Biblio2>() {

        @Override
        public int compare(Biblio2 e1, Biblio2 e2) {
            return e1.getNameJ2().compareTo(e2.getNameJ2());
        }
    };
    //**********************************************************************************************
    public static Comparator<Biblio2> CaloriesComparatorJ2 = new Comparator<Biblio2>() {
        public int compare (Biblio2 c1, Biblio2 c2) {
            return c1.Jzcalories2 - c2.Jzcalories2;
        }
    };
    //*********************************************************************************************
    public static Comparator<Biblio2> PriceComparatorJ2 = new Comparator<Biblio2>() {
        public int compare(Biblio2 p1, Biblio2 p2) {
            Float precio1_j2 = Float.valueOf(p1.getPriceJ2());
            Float precio2_j2 = Float.valueOf(p2.getPriceJ2());
            return precio1_j2.compareTo(precio2_j2);
        }
    };
    //*********************************************************************************************
}

public class jazzGrandeSize extends AppCompatActivity {

    public List<Biblio2> rtnList2() {
        ArrayList<Biblio2> listJazz2 = new ArrayList<Biblio2>();
        // Add items
        listJazz2.add(new Biblio2(1,"Regular or Decaf", 2.09f, 0));
        listJazz2.add(new Biblio2(2,"Iced Coffee", 2.69f, 130));
        listJazz2.add(new Biblio2(3, "Cappuccino", 3.59f, 140));
        listJazz2.add(new Biblio2(4, "Latte", 3.59f, 130));
        listJazz2.add(new Biblio2(5,"Mocha", 4.09f, 310));
        listJazz2.add(new Biblio2(6,"Espresso", 2.09f, 0));
        listJazz2.add(new Biblio2(7,"Americano", 2.89f, 0));
        listJazz2.add(new Biblio2(9,"Cafe au Lait", 2.69f, 220));
        listJazz2.add(new Biblio2(10,"Caramel Delight", 4.69f, 430));
        listJazz2.add(new Biblio2(11,"Caramel Latte", 4.59f, 350));
        listJazz2.add(new Biblio2(12,"Tuxedo", 4.89f, 440));
        listJazz2.add(new Biblio2(13,"White Chocolate Mocha", 4.69f, 310));
        listJazz2.add(new Biblio2(14,"Creme Brulee", 4.89f, 420));
        listJazz2.add(new Biblio2(15,"Hot Chocolate", 3.19f, 370));
        listJazz2.add(new Biblio2(16,"Flavored Steamer", 2.39f, 250));
        listJazz2.add(new Biblio2(17,"Mocha Blast", 4.69f, 420));
        listJazz2.add(new Biblio2(18,"Caramel Blast", 4.69f, 460));
        listJazz2.add(new Biblio2(19,"White Chocolate Blast", 4.69f, 420));
        listJazz2.add(new Biblio2(20,"Caramel Delight Blast", 4.69f, 540));
        listJazz2.add(new Biblio2(21,"Tuxedo Blast", 4.89f, 540));
        listJazz2.add(new Biblio2(22,"Creme Brulee Blast", 4.89f, 530));
        listJazz2.add(new Biblio2(23,"Smoothies", 4.19f, 0));
        listJazz2.add(new Biblio2(24,"Iced Blueberry Green Tea", 2.59f, 80));
        listJazz2.add(new Biblio2(25,"Iced Tea", 2.39f, 140));
        listJazz2.add(new Biblio2(26,"Hot Tea", 2.39f, 0));
        listJazz2.add(new Biblio2(27,"Hot or Iced Tea Latte", 4.09f, 250));
        return  listJazz2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazz_grande_size);

        List<Biblio2> B = rtnList2();
        ListView listViewGrande;
        listViewGrande = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio2> arrayAdapterG = new ArrayAdapter<Biblio2>(
                this,
                android.R.layout.simple_list_item_1,
                B);

        listViewGrande.setAdapter(arrayAdapterG);
    }
    //**********************************************************************************************
    public void BoxName2 (View view) {

        List<Biblio2> B2 = rtnList2();
        ListView listViewGrande2;
        listViewGrande2 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio2> arrayAdapterG2 = new ArrayAdapter<Biblio2>(
                this,
                android.R.layout.simple_list_item_1,
                B2);

        Collections.sort(B2, Biblio2.NameComparatorJ2);
        listViewGrande2.setAdapter(arrayAdapterG2);
    }
    //**********************************************************************************************
    public void BoxCalories2 (View v) {
        List<Biblio2> listCal2 = rtnList2();
        ListView listViewGrande3;
        listViewGrande3 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio2> arrayCal2 = new ArrayAdapter<Biblio2>(
                this,
                android.R.layout.simple_list_item_1,
                listCal2
        );

        Collections.sort(listCal2, Biblio2.CaloriesComparatorJ2);
        listViewGrande3.setAdapter(arrayCal2);
    }
    //**********************************************************************************************
    public void BoxPrice2 (View v) {
        List<Biblio2> listPrice2 = rtnList2();
        ListView listViewGrande4;
        listViewGrande4 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio2> arrayPrice2 = new ArrayAdapter<Biblio2>(
                this,
                android.R.layout.simple_list_item_1,
                listPrice2
        );

        Collections.sort(listPrice2, Biblio2.PriceComparatorJ2);
        listViewGrande4.setAdapter(arrayPrice2);
    }
    //**********************************************************************************************
    public void BoxDefault2 (View x) {
        List<Biblio2> listDefault2 = rtnList2();
        ListView listViewGrande5;
        listViewGrande5 = (ListView) findViewById(R.id.DspList2);

        ArrayAdapter<Biblio2> arrayDefault2 = new ArrayAdapter<Biblio2>(
                this,
                android.R.layout.simple_list_item_1,
                listDefault2
        );

        listViewGrande5.setAdapter(arrayDefault2);
    }
    //**********************************************************************************************
}
