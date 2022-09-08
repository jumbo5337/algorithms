package leetcode.easy.array;

import java.util.LinkedList;
import java.util.Stack;

public class BestStock {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int profit = 0;
        int i = prices.length - 1;
        while (i >= 0) {
            int currVal = prices[i];
            if (stack.isEmpty()) {
                stack.add(currVal);
            } else if (stack.peek() > currVal && stack.size() == 1) {
                stack.add(currVal);
            }  else if (stack.peek()> currVal && stack.size() == 2) {
                stack.pop();
                stack.add(currVal);
            } else if (stack.peek() < currVal && stack.size() == 1) {
                stack.pop();
                stack.add(currVal);
            } else if (stack.peek() < currVal && stack.size() == 2) {
                int minimum = stack.pop();
                int maximum = stack.pop();
                profit += (maximum - minimum);
                stack.add(currVal);
            }
            i--;
        }
        if (stack.size() == 2) {
            int minimum = stack.pop();
            int maximum = stack.pop();
            if (minimum < maximum) {
                profit += (maximum - minimum);
            }
        }
        return profit;
    }
}
