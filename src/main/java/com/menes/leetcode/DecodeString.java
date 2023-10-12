class Solution {
   public String decodeString(String s) {
    Stack<Integer> numStack = new Stack<>();
    Stack<String> strStack = new Stack<>();
    String curString = "";
    int curNum = 0;
    for (char c : s.toCharArray()) {
        if (Character.isDigit(c)) {
            curNum = curNum * 10 + (c - '0');
        } else if (c == '[') {
            numStack.push(curNum);
            strStack.push(curString);
            curNum = 0;
            curString = "";
        } else if (c == ']') {
            int repeatTimes = numStack.pop();
            StringBuilder sb = new StringBuilder(strStack.pop());
            for (int i = 0; i < repeatTimes; i++) {
                sb.append(curString);
            }
            curString = sb.toString();
        } else {
            curString += c;
        }
    }
    return curString;
}

}
