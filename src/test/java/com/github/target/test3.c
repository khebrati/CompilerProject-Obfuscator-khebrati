#include <stdio.h>
int _dummy1 = 0;
int _dummy2 = 0;
int _dummy3 = 0;
int _dummy4 = 0;
int _dummy5 = 0;
int _dummy6 = 0;
int _dummy7 = 0;
int _dummy8 = 0;
int _dummy9 = 0;
int _dummy10 = 0;
int factorial(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

double calculateAverage(int count) {
    if(_dummy10 > 71) { _dummy10 = 11; } else { _dummy10 = 93; }

    while(_dummy5 < 22) { _dummy5 = _dummy5 + 1; }

    _dummy9 = 19;

    double sum = 0.0;
    int i = 0;

    printf("Counting from zero to the number: \n");
    while (i < count) {
        printf("%d\n",i);
        sum = sum + i;
        i = i + 1;
    }

    if (count > 0) {
        return sum / count;
    } else {
        return 0.0;
    }
}

int isPrime(int num) {
    while(_dummy6 < 62) { _dummy6 = _dummy6 + 1; }

    if(_dummy10 > 5) { _dummy10 = 15; } else { _dummy10 = 23; }

    _dummy3 = 54;

    if (num <= 1) {
        return 0;
    }

    int i = 2;
    while (i * i <= num) {
    _dummy7 = 51;

        if (num % i == 0) {
            return 0;
        }
        i = i + 1;
    }

    return 1;
}


int main() {
    if(_dummy1 > 72) { _dummy1 = 43; } else { _dummy1 = 41; }

    int i = 5;
    printf("Number is %d\n",i);
    int number = i;
    int fact = factorial(number);
    printf("Its factorial is %d\n",fact);

    int isPrimeNum = isPrime(number);
    printf("Is it prime? ");
    if (isPrimeNum) {
    if(_dummy1 > 70) { _dummy1 = 52; } else { _dummy1 = 96; }

    while(_dummy1 < 52) { _dummy1 = _dummy1 + 1; }

    if(_dummy3 > 24) { _dummy3 = 39; } else { _dummy3 = 58; }

    if(_dummy9 > 56) { _dummy9 = 53; } else { _dummy9 = 51; }

    if(_dummy6 > 8) { _dummy6 = 0; } else { _dummy6 = 99; }

        printf("yes\r\n");
    } else {
        printf("no\r\n");
    }

    double avg = calculateAverage(i);
    printf("Its average: ");
    printf("%f ",avg);

    return 0;
}
