package geekbrains.ru.lesson1mvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Presenter presenter;
    private Button btnCounter1;
    private Button btnCounter2;
    private Button btnCounter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCounter1 = (Button) findViewById(R.id.btnCounter1);
        btnCounter2 = (Button) findViewById(R.id.btnCounter2);
        btnCounter3 = (Button) findViewById(R.id.btnCounter3);
        presenter = new Presenter();
        setInitState();
        initOnClickListener();
    }

    private void setInitState(){
        setValue(btnCounter1, presenter.getCurrentValueByIndex(0));
        setValue(btnCounter2, presenter.getCurrentValueByIndex(1));
        setValue(btnCounter3, presenter.getCurrentValueByIndex(2));
    }

    private void initOnClickListener() {
        btnCounter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(v, presenter.getNewValueByIndex(0));
            }
        });
        btnCounter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(v, presenter.getNewValueByIndex(1));
            }
        });
        btnCounter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValue(v, presenter.getNewValueByIndex(2));
            }
        });
    }

    private void setValue(View v, int value){
        Button button = (Button) v;
        String counterText = (String) getResources().getText(R.string.counter);
        StringBuilder sb = new StringBuilder(counterText);
        sb.append(value);
        button.setText(sb);
    }
}