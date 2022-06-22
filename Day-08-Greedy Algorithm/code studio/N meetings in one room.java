import java.util.*;

class Meeting {
    int index, start, end;
    Meeting(int index, int start, int end) {
        this.index = index;
        this.start = start;
        this.end = end;
    }
}

class Compare implements Comparator<Meeting> {
    public int compare(Meeting a, Meeting b) {
        return a.end - b.end;
    }
}
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        List<Integer> ans = new ArrayList<>();
        List<Meeting> meet = new ArrayList<>();
        
        for (int i = 0 ; i < start.length ; i++) {
            meet.add(new Meeting(i + 1, start[i], end[i]));
        }
        
        Collections.sort(meet, new Compare());
        
        ans.add(meet.get(0).index);
        int ending = meet.get(0).end;
        
        for (int i = 1 ; i < meet.size() ; i++) {
            if (ending < meet.get(i).start) {
                ans.add(meet.get(i).index);
                ending = meet.get(i).end;
            }
        }
        
        return ans;
    }
}