package np.com.sulab.learnnepali;

/**
 * Created by Sulabh on 7/8/2016.
 */
public class Word {
    private String mDefaultTranslation;
    private String mNepaliTransaltion;
    private int mImageResourceId = -1;

    public Word(String defaultTranslation, String nepaliTransaltion) {
        this.mDefaultTranslation = defaultTranslation;
        this.mNepaliTransaltion = nepaliTransaltion;
    }

    public Word(String mDefaultTranslation, String mNepaliTransaltion, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mNepaliTransaltion = mNepaliTransaltion;
        this.mImageResourceId = mImageResourceId;
    }

    public String getNepaliTransaltion() {
        return mNepaliTransaltion;
    }

    public void setNepaliTransaltion(String nepaliTransaltion) {
        this.mNepaliTransaltion = nepaliTransaltion;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=-1;
    }

}

