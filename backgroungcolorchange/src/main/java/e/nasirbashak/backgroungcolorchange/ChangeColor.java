package e.nasirbashak.backgroungcolorchange;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChangeColor extends AppCompatActivity {

    static int startNum = 0, temp;

    static int endNum = 0;

    public ChangeColor() {
    }


    public void changeBackgroundColor(final View v, String start, String end) {


        startNum = Integer.parseInt(start, 16);
        temp = startNum;
        endNum = Integer.parseInt(end, 16);


        new Thread(new Runnable() {
            @Override
            public void run() {


                for (; ; ) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {

                            v.setBackgroundColor(Color.parseColor(generateTheColorCode()));

                            // Stuff that updates the UI

                        }
                    });

                    try {
                        Thread.sleep(225);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }).start();

    }


    public String generateTheColorCode() {

        String hexString = "";

        if (startNum + Integer.parseInt("FEAA", 16) >= endNum) {
            startNum = temp;
        }
        hexString = Integer.toHexString(startNum += Integer.parseInt("FEAA", 16));
        if (hexString.length() < 6) {
            int size = hexString.length();

            String temp = hexString;
            hexString = "";
            int j = 0;
            while (j < 6 - size) {
                j++;
                hexString += "0";
            }
            hexString += temp;
        }
        return "#" + hexString.toUpperCase();

    }
}
