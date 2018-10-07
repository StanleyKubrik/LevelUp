public class Cat {
    private String mName;

    public Cat(){
        name("Murzik");
    }

    private void name (String str){
        mName = str;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
