class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len=cardPoints.length;
        for (int i=1;i<len;i++)
            cardPoints[i]+=cardPoints[i-1];
        if (k==len)
            return cardPoints[len-1];
        int answer=cardPoints[len-1]-cardPoints[(len-k)-1];
        int index=len-k;
        while (index<len)
        {
            answer=Math.max(answer, cardPoints[len-1]-(cardPoints[index]-cardPoints[index-(len-k)]));
            index++;
        }
        return answer;
    }
}
