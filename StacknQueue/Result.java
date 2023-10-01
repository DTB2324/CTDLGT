//package StacknQueue;
//
//import java.util.Stack;
//
//class Result {
//
//    /*
//     * Complete the 'isBalanced' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts STRING s as parameter.
//     */
//
//    public static String isBalanced(String s) {
//        // Write your code here
//        Stack<Char> stacks = new Stack<>();
//        for(int i = 0; i < s.length; i++){
//            if(s.get(i) == '{' || '[' || '(') {
//                stacks.push(s.get(i));
//            }
//            if(i > 0) {
//                if(s.get(i) == '}' && stacks.get(i - 1) == '{') s.pop();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
