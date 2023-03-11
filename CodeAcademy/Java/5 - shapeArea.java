nes (9 sloc)  145 Bytes

int solution(int n) {

    int sum = 0;

    while (n > 1) {
        sum += ((n-1) * 4);
        n--;
    }
    sum += 1;
    
    return sum;
}
