package programmers;

import java.util.PriorityQueue;

public class 호텔대실 {
    /*
        최소한의 객실만 사용해서 다음 예약손님 O
        퇴실시간 기준 10분 청소 후 이용 가능
        나에게 필요한 최소 객실 수

        그리디 인가?
        시작시간이 빠른 순으로 정렬.
        PQ사용

        ==> miniute으로 통일해서 하는게 나을거같음..^^
     */
    public static void main(String[] args) {
        String[][] arr ={
                {"09:00", "09:30"},
                {"09:10", "09:20"},
                {"09:15", "09:25"},
                {"09:40", "09:50"}
        };
        System.out.println(solution(arr));
    }
    public static int solution(String[][] book_time) {
        //변환 시작
        int N = book_time.length;
        PriorityQueue<book> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            String[] st = book_time[i][0].split(":");
            String[] ed = book_time[i][1].split(":");
            int start = Integer.parseInt(st[0])*60+Integer.parseInt(st[1]);
            int end = Integer.parseInt(ed[0])*60+Integer.parseInt(ed[1]);
            
            pq.offer(new book(start,end));

        }
        /*
         이미 사용한 객실을 또 pq에 넣음. => 만약 가까우면 변경
         */
        PriorityQueue<book> room = new PriorityQueue<>();
        while(!pq.isEmpty()){
            if(room.isEmpty()){ //만약 쓴 객실이 아직 없다면
                room.offer(pq.poll()); // 초기 객실 넣어주고
                continue;
            }
            //현재 고객들이 갈 곳 찾아보자.
            book now = pq.poll();
            //쓴 객실 순회
            boolean flag = false;
            for(book used:room){
                //만약 해당 숙소 종료시간 + 10 <= now의 시작시간이면 사용 가능
                if(used.ed+10<=now.st){
                    room.remove(used);
                    room.offer(now);
                    flag = true;
                    break; //멈추고
                }
            }
            if(flag) continue;
            //만약 해당하는게 없다면 현재 객실도 추가.
            room.offer(now);

        }
        return room.size();
    }
    static class book implements Comparable<book>{
        int st;
        int ed;

        public book(int st, int ed) {
            this.st = st;
            this.ed = ed;
        }

        @Override
        public int compareTo(book o) {
            return this.st-o.st;
        }

        @Override
        public String toString() {
            return "book{" +
                    "st=" + st +
                    ", ed=" + ed +
                    '}';
        }
    }
}
