package 构建树;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2021/5/28.
 *
 * @author 曹可乐
 */
public class TreeNode<T> {

        private String id;
        private String parentId;
        private String name;
        private List<T> children = new ArrayList<>();

        public TreeNode (String id,String parentId,String name){
            this.id = id;
            this.parentId = parentId;
            this.name = name;
        }
        public void add(T node) {
            children.add(node);
        }



        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getParentId() {
            return parentId;
        }

        public void setParentId(String parentId) {
            this.parentId = parentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<T> getChildren() {
            return children;
        }

        public void setChildren(List<T> children) {
            this.children = children;
        }

    @Override
    public String toString() {
        return "TreeNode{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}

