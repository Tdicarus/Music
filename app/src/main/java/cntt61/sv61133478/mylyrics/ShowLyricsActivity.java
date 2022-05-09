package cntt61.sv61133478.mylyrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class ShowLyricsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlyrics);
        //
        Intent BH = getIntent();
        // Lấy ra tên BH   , ==> ten file là:  tenBH.txt
        String tenBai = BH.getStringExtra("tenBH");



    }
}
