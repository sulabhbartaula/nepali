package np.com.sulab.learnnepali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("one","A-Ka वबजवबवबज",R.drawable.number_one));
        words.add(new Word("two","Du-e दुई",R.drawable.number_two));
        words.add(new Word("three","Ti-na तिन",R.drawable.number_three));
        words.add(new Word("four","Chaa-Ra चार",R.drawable.number_four));
        words.add(new Word("five","Paa-Cha पाँच",R.drawable.number_five));
        words.add(new Word("six","Cha छ",R.drawable.number_six));
        words.add(new Word("seven","saa-ta सात",R.drawable.number_seven));
        words.add(new Word("eight","aaa-tha आठ",R.drawable.number_eight));
        words.add(new Word("nine","nau नौ",R.drawable.number_nine));
        words.add(new Word("ten","das दस",R.drawable.number_ten));

        WordAdapter itemAdapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

    }
}
