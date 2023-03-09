function solution($inputString) {
    $reverse = strrev($inputString);
    if (strlen($inputString) >= 1 && strlen($inputString) <= 10^5) {
        if ($inputString == $reverse) return true;    
    }
    return false;
}
