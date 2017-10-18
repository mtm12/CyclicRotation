package cyclicrotation.demo.com.cyclicrotation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int[] intArray = new int[]{3,8,9,7,6};
    int k = 3;
    boolean endLoop = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] newArray = new int[intArray.length];

        int n = 0;
        for(int j=k-1; j<intArray.length; j++){
            newArray[n] = intArray[j];
            n++;
        }

        for (int m=0; m<k-1; m++){
            newArray[n] = intArray[m];
            n++;
        }

        for(int l=0; l<newArray.length; l++){
            Log.d("Array", String.valueOf(newArray[l]));
        }
    }
}
