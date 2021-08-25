package leetCode;

import java.util.*;

public class Solution1 { 
	public static void main(String[] args) {
		Tree a = new Tree();
		a.maxDepth(new TreeNode(1,new TreeNode(2),new TreeNode(3)));
	}

    
}
class Tree{

	public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        Queue<TreeNode> queue = new LinkedList<>(); // TreeNode 타입 체크
        queue.offer(root); // queue에다가 차례차례 값을 넣음.
        int count = 0;
        
        while(!queue.isEmpty()){ // true일때만 동작 안비어있을때만
            int size = queue.size(); // queue의 크기
            while(size-- > 0){ // size가 0보다 클떄만 동작
                TreeNode node = queue.poll();
                if(node.left != null){ // 꺼낸 노드의 왼쪽에 값이 있으면
                    queue.offer(node.left); // 왼쪽 값 다시 넣어준다
                }
                if(node.right != null){ // 꺼낸 노드의 오른쪽 값이 있으면
                	queue.offer(node.right); // 오른쪽 값에 다시 넣어줌
                }
            
            }
            count++;
        } // TreeNode 타입의 node를 queue에서 꺼낸다 queue는 FIFO 이므로, 처음꺼가 나옴.
        
        return count;
           
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
