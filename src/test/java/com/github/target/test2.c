#include <stdio.h>
int sum(int a, int b) {
    int result = ((a * 3) - (-b * 3)) / 3;
    return result;
}
int main() {
    int x = 3;
    int y = 4;
    int total = sum(x, y);
    printf("%d\n", total);
    return 0;
}