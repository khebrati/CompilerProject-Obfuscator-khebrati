#include <stdio.h>
int factorial(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * factorial(n - 1);
    }
}

double calculateAverage(int count) {
    double sum = 0.0;
    int i = 0;

    printf("Counting from zero to the number: \n");
    while (i < count) {
        printf("%d\n",i);
        sum = (sum - (-i));
        i = ((i * 3) - (-1 * 3)) / 3;
    }

    if (count > 0) {
        return sum / count;
    } else {
        return 0.0;
    }
}

int isPrime(int num) {
    if (num <= 1) {
        return 0;
    }

    int i = 2;
    while (i * i <= num) {
        if (num % i == 0) {
            return 0;
        }
        i = (i - (-1));
    }

    return 1;
}


int main() {
    int i = 5;
    printf("Number is %d\n",i);
    int number = i;
    int fact = factorial(number);
    printf("Its factorial is %d\n",fact);

    int isPrimeNum = isPrime(number);
    printf("Is it prime? ");
    if (isPrimeNum) {
        printf("yes\r\n");
    } else {
        printf("no\r\n");
    }

    double avg = calculateAverage(i);
    printf("Its average: ");
    printf("%f ",avg);

    return 0;
}
