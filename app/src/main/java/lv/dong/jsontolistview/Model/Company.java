package lv.dong.jsontolistview.Model;

/**
 * Created by Cu Lee on 4/26/2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("catchPhrase")
    @Expose
    private String catchPhrase;
    @SerializedName("bs")
    @Expose
    private String bs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPharse() {
        return catchPhrase;
    }

    public void setCatchPharse(String catchPharse) {
        this.catchPhrase = catchPharse;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", catchPhrase='" + catchPhrase + '\'' +
                ", bs='" + bs + '\'' +
                '}';
    }
}

