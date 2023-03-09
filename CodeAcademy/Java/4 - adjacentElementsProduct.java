int solution(int[] inputArray) {
    return IntStream.range(1, inputArray.length).map(k->inputArray[k]*inputArray[k-1]).max().getAsInt();
}
