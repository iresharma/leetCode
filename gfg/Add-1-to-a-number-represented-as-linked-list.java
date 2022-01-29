public class Solution
{
    public static Node addOne(Node head) 
    {
        Node extra, node, temp = head;
        Stack<Node> stack = new Stack<Node>();
        while(temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int ones = stack.peek().data + 1;
        int carry = 0;
        if(ones > 9) {
            node = stack.pop();
            node.data = ones - 10;
            carry = 1;
            while(!stack.isEmpty() && carry != 0) {
                ones = stack.peek().data + carry;
                node = stack.pop();
                if(ones > 9) {
                    node.data = ones - 10;
                    carry = 1;
                } else {
                    node.data = node.data + carry;
                    carry = 0;
                }
            }
        } else {
            node = stack.pop();
            node.data++;
        }
        if(carry == 0) return head;
        else {
            extra = new Node(1);
            extra.next = head;
            return extra;
        }
    }
}
