import java.util.Stack;

/**
 * @ClassName PrintListInReversedOrder
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-23 10:12
 * @Version 1.0
 **/
public class PrintListInReversedOrder {
    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public PrintListInReversedOrder() {
    }

    public void print(ListNode node) {
        if(node == null){ return;}
        Stack<ListNode> stack = new Stack<>();
        while(node!=null){
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop().val);
        }
    }

    public static void main(String[] args){
        PrintListInReversedOrder printListInReversedOrder = new PrintListInReversedOrder();
        ListNode n1 = printListInReversedOrder.new ListNode(1);
        ListNode n2 = printListInReversedOrder.new ListNode(2);
        ListNode n3 = printListInReversedOrder.new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        printListInReversedOrder.print(n1);
    }

}
