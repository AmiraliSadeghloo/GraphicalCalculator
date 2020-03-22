public class LabelAnalysis {
    char[] op;
    int[] num, numIndex, opIndex;
    String labelCheck, temp;
    int l, result, pre, pos, opPos, numPos;

    int result() {
        return result;
    }

    LabelAnalysis(String labelCheck) {
        this.labelCheck = labelCheck;
        l = labelCheck.length();
        result = 0;
        op = new char[20];
        num = new int[20];
        pre = 0;
        pos = 0;
        Calculate();
        result = num[0];


    }

    void labelEq() {
        while (pos < l) {
            if (labelCheck.charAt(pos) == '+') {
                op[opPos] = '+';
                opPos += 2;
                temp = labelCheck.substring(pre, pos);
                num[numPos] = Integer.parseInt(temp);
                numPos += 2;
                pre = pos + 1;
            }
        }
        temp = labelCheck.substring(pre);
        num[numPos] = Integer.parseInt(temp);
    }


    public void Calculate() {
        for (int i = 1; i <= opPos; i += 2) {
            if (op[i] == '+') {
                num[i - 1] = num[i - 1] + num[i + 1];
                ChangeNumPos(i + 1);
                ChangeOpPos(i);
            }
        }

    }

    public void ChangeNumPos(int pos1) {
        for (int i = pos1; i < numPos; i += 2) num[i] = num[i + 2];
    }

    /*3*/
    public void ChangeOpPos(int pos1) {
        for (int i = pos1; i < opPos; i += 2) op[i] = op[i + 2];
    }
}
