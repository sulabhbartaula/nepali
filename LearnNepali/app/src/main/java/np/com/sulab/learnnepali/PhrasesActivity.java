package np.com.sulab.learnnepali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("What is your name ?","Tapai ko Nam K ho ? एक"));
        words.add(new Word("My name is .......","Mero nam ......... ho . दुई"));
        words.add(new Word("I am Hungry","Malai Vok Lageko cha . तिन"));
        words.add(new Word("How much does this cost ?","Yeslai Kati parcha ? चार"));
        words.add(new Word("I am from .......","Ma ....... bata ho  पाँच"));

        WordAdapter itemAdapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
    }
}
