package 构建树;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.junit.experimental.categories.Categories;
import sun.reflect.generics.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created on 2021/5/28.
 *
 * @author 曹可乐
 */
public class RecursionTest {

    public static void main(String[] args) {

        List<TreeNode> treeNodes  = new ArrayList<>();
        treeNodes.add(new TreeNode("1","-1","lala01"));
        treeNodes.add(new TreeNode("2","-1","lala02"));
        treeNodes.add(new TreeNode("3","1","lala02"));
        treeNodes.add(new TreeNode("4","3","lala02"));
        treeNodes.add(new TreeNode("5","2","lala02"));

       // System.out.println(JSON.toJSON(listWithTree(treeNodes,"-1")));

        System.out.println(JSON.toJSONString(buildByRecursive(treeNodes)));

    }

//     private static List<TreeNode> buildCategory(List<TreeNode> list){
//
//         //2.1找到所有的父分类
//         List<TreeNode> collect = list.stream()
//                 .filter(parent -> parent.getParentId().equals("-1"))
//                 .map((arr)->{
//                     arr.setChildren(getChildren(arr,list));
//                     return arr;
//                 }).collect(Collectors.toList());
//         return collect;
//     }
//
//     //通过当前一级节点，递归查找子节点
//
//    private static List<TreeNode> getChildren(TreeNode root, List<TreeNode> all){
//
//        List<TreeNode> collect = all.stream()
//                .filter(treeNode -> treeNode.getId().equals(root.getParentId()))
//                .map(child -> {
//                    getChildren(child, all);
//                    return child;
//                })
//                .collect(Collectors.toList());
//
//        return collect;
//    }

    //--------------------------------
    public static <T extends TreeNode> List<T> listWithTree(List<T> list,String root) {
        List<T> level1Menus = list.stream().filter(categoryEntity ->
                categoryEntity.getParentId() == root
        ).map((menu)->{
            menu.setChildren(getChildren(menu,list));
            return menu;
        }).collect(Collectors.toList());

        return level1Menus;
    }

    //递归查找所有一级节点的的子节点
    private static <T extends TreeNode> List<T> getChildren(T root, List<T> all) {
        List<T> children = all.stream().filter(parentId -> {
            return parentId.getParentId() == root.getId();
        }).map(child -> {
            child.setChildren(getChildren(child, all));
            return child;
        }).collect(Collectors.toList());
        return children;
    }
//-------------------------------------------

    private static List<TreeNode> rebuildList2Tree(List<TreeNode> treeNodes) {
        boolean existRootNode = false;
        List<TreeNode> newTree = new ArrayList<TreeNode>();//初始化一个新的列表
        for (TreeNode treeNode : treeNodes) {
            if (isRootNode(treeNode, treeNodes)) {//选择根节点数据开始找儿子
                newTree.add(findChildren(treeNode, treeNodes));
                existRootNode = true;
            }
        }
        if (!existRootNode) {//也可能大家都是根节点
            return treeNodes;
        }
        return newTree;
    }

    /**
     * 判断节点是否是根节点
     *
     * @param checkNode
     * @param treeNodes
     * @return
     */
    private static boolean isRootNode(TreeNode checkNode, List<TreeNode> treeNodes) {
        for (TreeNode treeNode : treeNodes) {
            if (checkNode.getParentId().equals(treeNode.getId())) {//判断checkNode是不是有爸爸
                return false;
            }
        }
        return true;
    }


    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    private static TreeNode findChildren1(TreeNode parentNode, List<TreeNode> treeNodes) {
        List<TreeNode> children = parentNode.getChildren();
        for (TreeNode it : treeNodes) {
            if (parentNode.getId().equals(it.getParentId())) {//找儿子，判断parentNode是不是有儿子
                children.add(findChildren1(it, treeNodes));
            }
        }
        return parentNode;

    }

//-----------------------------
    public static <T extends TreeNode> List<T> buildByRecursive(List<T> treeNodes, Object root) {
        List<T> trees = new ArrayList<T>();
        for (T treeNode : treeNodes) {
            if (root.equals(treeNode.getParentId())) {
                trees.add(findChildren2(treeNode, treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     *
     * @param treeNodes
     * @return
     */
    public static <T extends TreeNode> T findChildren2(T treeNode, List<T> treeNodes) {
        for (T it : treeNodes) {
            if (treeNode.getId() == it.getParentId()) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<>());
                }
                treeNode.add(findChildren2(it, treeNodes));
            }
        }
        return treeNode;
    }

//---------------------------------------------

    public static List<TreeNode> buildByRecursive(List<TreeNode> treeNodes) {
        List<TreeNode> trees = new ArrayList<TreeNode>();
        for (TreeNode treeNode : treeNodes) {
            if ("-1".equals(treeNode.getParentId())) {
                trees.add(findChildren(treeNode,treeNodes));
            }
        }
        return trees;
    }

    /**
     * 递归查找子节点
     * @param treeNodes
     * @return
     */
    public static TreeNode findChildren(TreeNode treeNode,List<TreeNode> treeNodes) {
        for (TreeNode it : treeNodes) {
            if(treeNode.getId().equals(it.getParentId())) {
                if (treeNode.getChildren() == null) {
                    treeNode.setChildren(new ArrayList<TreeNode>());
                }
                treeNode.getChildren().add(findChildren(it,treeNodes));
            }
        }
        return treeNode;
    }
}
