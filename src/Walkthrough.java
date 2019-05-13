import com.alibaba.fastjson.annotation.JSONField;

/**
 * 副本攻略对象
 */
public class Walkthrough {

    //副本名
    @JSONField(name = "name")
    private String name;
    //攻略
    @JSONField(name = "content")
    private String content;

    public Walkthrough(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
