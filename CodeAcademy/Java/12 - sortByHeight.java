int[] solution(int[] a) {
    
    for (int i = 0; i < a.length; i++){
        for(int k = i+1; k < a.length; k++) {
            if (a[k] > 0) {
                if(a[i] > a[k]) {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k]=temp;
                }
            }
        }    
    }
    return a;
}
