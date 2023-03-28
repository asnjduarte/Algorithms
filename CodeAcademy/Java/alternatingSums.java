int[] solution(int[] a) {

int aT = 0;
int bT = 0;

for (int i = 0; i < a.length; i++) {
    if (i % 2 == 0) aT += a[i];
    else bT += a[i];
}

 int[] iA = new int[]{aT, bT}; 
return iA;

}
