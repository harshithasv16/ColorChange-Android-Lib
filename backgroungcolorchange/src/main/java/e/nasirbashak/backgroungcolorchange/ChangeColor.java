package e.nasirbashak.backgroungcolorchange;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class ChangeColor extends AppCompatActivity {

    private int startNum = 0, temp;
    private int stepNum;

    private int endNum = 0;
    protected Context context;

    public ChangeColor(Context context) {

        this.context = context;
        stepNum = Integer.parseInt("FEAA", 16);
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

    public void changeBackgroundColor(final View v, String start, String end, final int delay) {


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
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }).start();

    }

    public void changeBackgroundColor(final View v, String start, String end, String step, final int delay) {


        startNum = Integer.parseInt(start, 16);
        temp = startNum;
        endNum = Integer.parseInt(end, 16);
        stepNum = Integer.parseInt(step, 16);

        if (endNum - startNum < stepNum) {
            Toast.makeText(context, "step " + step + " should be in multiples of difference in end " + end + " and start " + start, Toast.LENGTH_LONG).show();

            return;
        }


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
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }).start();

    }


    public void changeTextColor(final View v, String start, String end) {


        startNum = Integer.parseInt(start, 16);
        temp = startNum;
        endNum = Integer.parseInt(end, 16);


        new Thread(new Runnable() {
            @Override
            public void run() {

                final boolean[] r = {true};
                while (r[0]) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {

                            {
                                if (v instanceof TextView) {
                                    ((TextView) v).setTextColor(Color.parseColor(generateTheColorCode()));
                                } else if (v instanceof Button) {
                                    ((Button) v).setTextColor(Color.parseColor(generateTheColorCode()));
                                } else {
                                    Toast.makeText(context, "InCompitable View object \n cannot set text color to " + v, Toast.LENGTH_LONG).show();
                                    Log.d("InCompitable Viewobject", "cannot set text color to " + v);
                                    r[0] = false;
                                }

                            }


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

    public void changeTextColor(final View v, String start, String end, final int delay) {


        startNum = Integer.parseInt(start, 16);
        temp = startNum;
        endNum = Integer.parseInt(end, 16);


        new Thread(new Runnable() {
            @Override
            public void run() {

                final boolean[] r = {true};
                while (r[0]) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {

                            {
                                if (v instanceof TextView) {
                                    ((TextView) v).setTextColor(Color.parseColor(generateTheColorCode()));
                                } else if (v instanceof Button) {
                                    ((Button) v).setTextColor(Color.parseColor(generateTheColorCode()));
                                } else {
                                    Toast.makeText(context, "InCompitable View object \n cannot set text color to " + v, Toast.LENGTH_LONG).show();
                                    Log.d("InCompitable Viewobject", "cannot set text color to " + v);
                                    r[0] = false;
                                }

                            }


                            // Stuff that updates the UI

                        }
                    });

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }).start();

    }

    public void changeTextColor(final View v, String start, String end, String step, final int delay) {


        startNum = Integer.parseInt(start, 16);
        temp = startNum;
        endNum = Integer.parseInt(end, 16);
        stepNum = Integer.parseInt(step, 16);

        if (endNum - startNum < stepNum) {
            Toast.makeText(context, "step " + step + " should be in multiples of difference in end " + end + " and start " + start, Toast.LENGTH_LONG).show();

            return;
        }


        new Thread(new Runnable() {
            @Override
            public void run() {

                final boolean[] r = {true};
                while (r[0]) {
                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {

                            {
                                if (v instanceof TextView) {
                                    ((TextView) v).setTextColor(Color.parseColor(generateTheColorCode()));
                                } else if (v instanceof Button) {
                                    ((Button) v).setTextColor(Color.parseColor(generateTheColorCode()));
                                } else {
                                    Toast.makeText(context, "InCompitable View object \n cannot set text color to " + v, Toast.LENGTH_LONG).show();
                                    Log.d("InCompitable Viewobject", "cannot set text color to " + v);
                                    r[0] = false;
                                }

                            }


                            // Stuff that updates the UI

                        }
                    });

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }

        }).start();

    }


    public String generateTheColorCode() {

        String hexString = "";

        if (startNum + stepNum >= endNum) {
            startNum = temp;
        }

        hexString = Integer.toHexString(startNum += stepNum);
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
