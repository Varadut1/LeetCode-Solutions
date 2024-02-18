class Solution {
    public int mostBooked(int n, int[][] meetings) {

        long time = 0;
        long [] assign = new long[n];
        long [] till = new long[n];
        boolean [] isempty = new boolean[n];

        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[0]));

        for(int meet = 0; meet < meetings.length; meet++){
            if(time < meetings[meet][0]){
                time = meetings[meet][0];
            }

            int empcount = 0;
            for(int room = 0; room<n; room++){
                if(till[room]<=time){
                    empcount++;
                    isempty[room] = true;
                }
            }

            if(empcount == 0){
                long earliest_finish = Long.MAX_VALUE;
                int earliest_f_room = -1;
                for(int room = 0; room<n; room++){
                    if(till[room]<earliest_finish){
                        earliest_finish = till[room];
                        earliest_f_room = room;
                    }
                }
                time = earliest_finish;
                assign[earliest_f_room] += 1;
                till[earliest_f_room] = (long) (time + (meetings[meet][1] - meetings[meet][0]));
                isempty[earliest_f_room] = false;

            }

            else{
                for(int room = 0; room < n; room++){
                    if(isempty[room]){
                        assign[room] += 1;
                        till[room] = (long) (time + (meetings[meet][1] - meetings[meet][0]));
                        isempty[room] = false;
                        break;
                    }
                }
            }
        }

        long max = Long.MIN_VALUE;
        int maxroom = -1;
        for(int i = 0 ;i<n; i++){
            System.out.print(assign[i]+" ");
        }
        for(int i = 0; i<assign.length; i++){
            if(assign[i]>max){
                maxroom = i;
                max = assign[i];
            }
        }
        return maxroom;
    }
}
