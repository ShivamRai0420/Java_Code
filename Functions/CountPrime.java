public class CountPrime {
    public static void main(String args[]){
        int n=10;
        var numbers = new boolean[n+1];
        int ans = 0;


        for (var i = 2; i < n; ++i) {
            if (numbers[i] == false) {
                ans++;
                for (var j = i; j < n; j += i) {
                    numbers[j] = true;
                }
            }
        }
    }
}
