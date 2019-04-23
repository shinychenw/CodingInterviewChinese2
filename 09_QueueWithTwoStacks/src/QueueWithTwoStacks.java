import java.util.Stack;

/**
 * @ClassName QueueWithTwoStacks
 * @Description TODO
 * @Author yuchenwang
 * @Date 2019-04-23 16:21
 * @Version 1.0
 **/
public class QueueWithTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public QueueWithTwoStacks() {
    }

    public void push(int n) {
        stack1.push(n);
    }

    public int pop() throws Exception{
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new Exception("The queue is empty!");
        }

        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public static void main(String[] args) {
        QueueWithTwoStacks queueWithTwoStacks = new QueueWithTwoStacks();
        queueWithTwoStacks.push(1);
        queueWithTwoStacks.push(2);
        queueWithTwoStacks.push(3);
        try {
            System.out.println(queueWithTwoStacks.pop());
            System.out.println(queueWithTwoStacks.pop());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
