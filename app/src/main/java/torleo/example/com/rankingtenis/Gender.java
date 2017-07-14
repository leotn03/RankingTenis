package torleo.example.com.rankingtenis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }

    public void onClick(View view){
        Intent intent = new Intent(Gender.this,LoginActivity.class);
        startActivity(intent);
    }
}
