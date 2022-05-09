package cntt61.sv61133478.mylyrics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Data
        ArrayList<String> listSong =  new ArrayList<String>();
        listSong.add("uoc_gi");
        listSong.add("mong_uoc_ky_niem_xua");
        listSong.add("chan_tinh");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,listSong);
        ListView lv= (ListView)findViewById(R.id.listView_Cac_cai_hat);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // do sth
                // Cần làm Lấy về tên bài hát
                String tenBaiHat = listSong.get(i);
                // Chuyển Activity
                Intent intentBH = new Intent(MainActivity.this, ShowLyricsActivity.class);
                // gói tên vào
                intentBH.putExtra("tenBH",tenBaiHat);
                // Đẩy sang
                startActivity(intentBH);
            }
        });
    }


}