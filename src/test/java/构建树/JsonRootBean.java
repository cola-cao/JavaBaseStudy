package 构建树;

/**
 * Created on 2021/5/28.
 *
 * @author 曹可乐
 */
import java.util.List;
public class JsonRootBean {

    private int id;
    private int pid;
    private String name;
    private List<String> children;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    public int getPid() {
        return pid;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }
    public List<String> getChildren() {
        return children;
    }

}
