// https://school.programmers.co.kr/learn/courses/30/lessons/258705

package DP;

class 산_모양_타일링 {
    public int solution(int n, int[] tops) {
        int answer = 0;
        int total=0;
        int mod=10007;
        int devide=0;

        if(tops[0]==0){
            total=3;
            devide=2;
        }
        else{
            total=4;
            devide=3;
        }

        for(int i=1;i<n;i++){
            int multi=tops[i]+2;
            int tempTotal=(total*multi+devide)%mod;
            int tempDevide=(total*(multi-1)+devide)%mod;
            total=tempTotal;
            devide=tempDevide;




        }

        return total;

    }
}
