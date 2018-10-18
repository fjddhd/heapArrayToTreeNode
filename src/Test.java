import java.util.ArrayList;
/*
* 第一个节点不使用
* 空节点用-1元素表示
* */

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(-999);al.add(1);al.add(2);al.add(3);al.add(4);al.add(-1);al.add(5);al.add(6);al.add(-1);al.add(7);al.add(-1);al.add(-1);al.add(8);
        TreeNode root=Solution.change(al);
        Solution.ft(root);
        System.out.println();
        Solution.it(root);
    }

}
