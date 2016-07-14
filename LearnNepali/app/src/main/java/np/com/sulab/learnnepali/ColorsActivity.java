package np.com.sulab.learnnepali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","Rato रातो ",R.drawable.color_red));
        words.add(new Word("blue","Nilo निलो",R.drawable.color_blue));
        words.add(new Word("green","Hariyo हरियो",R.drawable.color_green));
        words.add(new Word("white","Seto सेतो",R.drawable.color_white));
        words.add(new Word("black","kalo कालो",R.drawable.color_black));
        words.add(new Word("pink","gulabi गुलाबी",R.drawable.color_pink));
        words.add(new Word("brown","Khairo खैरो",R.drawable.color_brown));
        words.add(new Word("Gray","Kharani खरानी",R.drawable.color_gray));
        words.add(new Word("Yellow","Pahelo पहेलो",R.drawable.color_dusty_yellow));
        words.add(new Word("Orange","Suntala सुन्तला",R.drawable.color_orange));

        WordAdapter itemAdapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
