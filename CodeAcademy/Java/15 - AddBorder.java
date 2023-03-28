String[] solution(String[] picture) {

for(int i = 0; i < picture.length; i++) {
    picture[i] = '*' + picture[i] + '*';
}

int len = picture[0].length();
String stars = "";

for(int i = 0; i < len; i++) {
    stars += '*';
}
    
    picture = addBeginArr(picture, stars);
    picture = addEndArr(picture, stars);
    
    for (var item : picture) {
    System.out.println(item);
}
    return picture;
    
}

public static <T> T[] addBeginArr(T[] elements, T element) {
    T[] newArray = Arrays.copyOf(elements, elements.length + 1);
    newArray[0] = element;
    System.arraycopy(elements, 0, newArray, 1, elements.length);
    return newArray;
}

public static <T> T[] addEndArr(T[] elements, T element) {
    T[] newArray = Arrays.copyOf(elements, elements.length + 1);
    newArray[elements.length] = element;
    System.arraycopy(elements, 0, newArray, 0, elements.length);
    return newArray;
}
