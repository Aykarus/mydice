package caric.mydice1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String DIE_1 = "die1";
    private TextView die1View;
    Die die1 = new Die();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        die1View = findViewById(R.id.die1);

        if(savedInstanceState != null){
            die1.setNumber(savedInstanceState.getInt(DIE_1));
            displayDice();
        }

        Button button = findViewById(R.id.roll_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie();
            }
        });

    }

    public void rollDie(){
        die1.roll();
        displayDice();
    }

    private void displayDice() {
        die1View.setText("" + die1.getNumber());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(DIE_1,die1.getNumber());
    }
}
