package co.il.dmobile.myapplication_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Car> cars)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars);
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(R.drawable.avatar1,"Car 1 model","car 1 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar2,"Car 2 model","car 2 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar3,"Car 3 model","car 3 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar4,"Car 4 model","car 4 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar5,"Car 5 model","car 5 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar6,"Car 6 model","car 6 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar7,"Car 7 model","car 7 brand", "2000", "500"));
            cars.add(new Car(R.drawable.avatar8,"Car 8 model","car 8 brand", "2000", "500"));
            return cars;
        }
    }

}
