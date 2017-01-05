package rishabhbanga.roastingwithjava;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity
{
    int number = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onIncr(View view)
    {
        number = number + 1;
        if (number > 99)
        {
            makeText(getApplicationContext(),"CAFFEINE ALERT!! You cannot have more than 99 coffees",Toast.LENGTH_SHORT).show();
            return;
        }
        onDisplayQuant(number);
    }

    public void onDecr(View view)
    {
        number = number - 1;
        if (number < 1)
        {
            Toast.makeText(getApplicationContext(),"SPOILER ALERT!! If you're in a Coffee Shop you have to order Coffee",Toast.LENGTH_SHORT).show();
            return;
        }
        onDisplayQuant(number);
    }

    private void onDisplayQuant(int number)
    {
        TextView displayQuant = (TextView)findViewById(R.id.quantView);
        displayQuant.setText("" + number);
    }

    private double getPrice(boolean addTopping_1, boolean addTopping_2)
    {
        double basePrice = 4.99;

        if(addTopping_1)
        {
            basePrice = basePrice + 1;
        }

        if(addTopping_2)
        {
            basePrice = basePrice + 2;
        }

        return basePrice * number;
    }

    public void onSubmit(View view)
    {
        EditText EnterName = (EditText)findViewById(R.id.name);
        String hasCustName = EnterName.getText().toString();

        CheckBox topping_1 = (CheckBox)findViewById(R.id.top1);
        boolean hasTopping_1 = topping_1.isChecked();

        CheckBox topping_2 = (CheckBox) findViewById(R.id.top2);
        boolean hasTopping_2 = topping_2.isChecked();

        double price = getPrice(hasTopping_1,hasTopping_2);
        onDisplayOrder(price,hasTopping_1,hasTopping_2,hasCustName);
    }

    private void onDisplayOrder(double price, boolean addTopping_1, boolean addTopping_2, String addCustName)
    {
        /*
        TextView displayOrderTitle = (TextView)findViewById(R.id.OrderTitle);
        String OrderTitle = getResources().getString(R.string.order_title);
        displayOrderTitle.setText(OrderTitle);

        TextView displayOrderSummary = (TextView)findViewById(R.id.OrderView);
        */

        String PriceMessage = addCustName;
        PriceMessage += "\nWhipped Cream Added? " + addTopping_1;
        PriceMessage += "\nChocolate Sauce Added? " + addTopping_2;
        PriceMessage += "\nQuantity: " + number;
        PriceMessage += "\nTotal: ₹ " + price;
        PriceMessage += "\nThank you!";
        //displayOrderSummary.setText(PriceMessage);

        Intent i = new Intent(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:"));
        i.putExtra(Intent.EXTRA_EMAIL, "rishabh_banga@yahoo.in");
        i.putExtra(Intent.EXTRA_SUBJECT,"RoastingwithJavs special for " +addCustName);
        i.putExtra(Intent.EXTRA_TEXT,PriceMessage);
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    };
}