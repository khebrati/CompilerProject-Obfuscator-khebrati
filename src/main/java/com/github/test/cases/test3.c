// This test demonstrates various Minic language features
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

    while (i < count) {
        println(i);
        sum = sum + readDouble();
        i = i + 1;
    }

    if (count > 0) {
        return sum / count;
    } else {
        return 0.0;
    }
}

bool isPrime(int num) {
    if (num <= 1) {
        return false;
    }

    int i = 2;
    while (i * i <= num) {
        if (num % i == 0) {
            return false;
        }
        i = i + 1;
    }

    return true;
}

string generateMessage(int value) {
    if (isPrime(value)) {
        return "The number is prime!";
    } else {
        return "The number is not prime.";
    }
}

int main() {
    println(5);
    int number = readInt();

    if (number <= 0) {
        println(-1);
        exit();
    }

    int fact = factorial(number);
    println(fact);

    bool isPrimeNum = isPrime(number);
    if (isPrimeNum) {
        println(1);
    } else {
        println(0);
    }

    string message = generateMessage(number);
    println(message);

    println(50);
    double avg = calculateAverage(3);
    print(toString(avg));
    println("is the average");

    return 0;
}
