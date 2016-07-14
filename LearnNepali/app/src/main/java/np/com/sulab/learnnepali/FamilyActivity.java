package np.com.sulab.learnnepali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //array list of words
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Father","Buwa एक",R.drawable.family_father));
        words.add(new Word("Mother","Aama दुई",R.drawable.family_mother));
        words.add(new Word("Older Brother","Dai तिन",R.drawable.family_older_brother));
        words.add(new Word("Older Sister","Didi चार",R.drawable.family_older_sister));
        words.add(new Word("Younger Brother","Bhai तिन",R.drawable.family_younger_brother));
        words.add(new Word("Younger Sister","Bahini चार",R.drawable.family_younger_sister));
        words.add(new Word("Husband","Sri-man पाँच",R.drawable.family_father));
        words.add(new Word("Wife","Sri-mati छ",R.drawable.family_mother));
        words.add(new Word("Grand Father","Hajur Buwa सात",R.drawable.family_grandfather));
        words.add(new Word("Grand Mother","Hajur Aama आठ",R.drawable.family_grandmother));
        words.add(new Word("Son","Chora नौ",R.drawable.family_son));
        words.add(new Word("Daughter","Chori दस",R.drawable.family_daughter));

        WordAdapter itemAdapter = new WordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);


    }
}
