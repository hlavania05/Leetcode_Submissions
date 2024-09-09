/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for(int[] row : matrix){
            Arrays.fill(row, -1);
        }
        int rs = 0;
        int cs = 0;
        int re = m-1;
        int ce = n-1;
        ListNode curr = head;
        while(rs <= re && cs <= ce){
            for(int i=cs; i <= ce && curr != null; i++){
                matrix[rs][i] = curr.val;
                curr = curr.next;
            }
            rs++;
            for(int i=rs; i<=re && curr != null; i++){
                matrix[i][ce] = curr.val;
                curr = curr.next;
            }
            ce--;
            for(int i=ce; i>= cs && curr != null; i--){
                matrix[re][i] =curr.val;
                curr = curr.next;
            }
            re--;
            for(int i=re; i>= rs && curr != null; i--){
                matrix[i][cs] = curr.val;
                curr = curr.next;
            }
            cs++;
        }
        return matrix;
    }
}