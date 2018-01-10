package kampus.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);

        ArrayList<String> list = new ArrayList<>();
        list.add("Ha Dong");
        list.add("Hoa Binh");
        list.add("Nghe An");
        list.add("Hai Duong");
        list.add("Ha Tinh");
        list.add("Nha Trang");
        list.add("Bac Giang");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
    }
}
