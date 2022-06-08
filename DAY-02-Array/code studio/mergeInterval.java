public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> ans = new ArrayList<Interval>();
        int n = intervals.length;
        if(n == 0 ) return ans;
        Arrays.sort(intervals,(a,b) -> a.start - b.start);
        for(int i=0;i<n;i++){
            int begin = intervals[i].start;
            int end = intervals[i].finish;
            if(ans.isEmpty() || ans.get(ans.size()-1).finish < begin){
                ans.add(new Interval(begin,end)); 
            }
            else{
                Interval temp = new Interval(ans.get(ans.size()-1).start,
                                            Math.max(end,
                                                  ans.get(ans.size()-1).finish));
                ans.set(ans.size()-1,temp);
            }
                
        }
        return ans;
    }
}