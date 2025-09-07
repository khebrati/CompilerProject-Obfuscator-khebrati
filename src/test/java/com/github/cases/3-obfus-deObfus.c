int a = 0;
int d = 0;
int f = 0;
int h = 0;
int i = 0;
int j = 0;
int func1(int k) {
if(h > 59) {
h = 22;
}
else {
h = 36;
}
if(h > 5) {
h = 32;
}
else {
h = 28;
}
if(i > 13) {
i = 39;
}
else {
i = 87;
}
if (k <= 1) {
return 1;
}
else {
return k * _voiqzumsf(k - 1);
}
}
double func2(int l) {
double m = 0.0;
int n = 0;
printf("Counting from zero to the number: \n");
while (n < l) {
j = 73;
while(j < 1) {
j = (j + 1);
}
j = 41;
printf("%d\n",n);
m = (m + n);
n = n + 1;
}
if (l > 0) {
return m / l;
}
else {
return 0.0;
}
}
int func3(int o) {
if(a > 43) {
a = 31;
}
else {
a = 53;
}
if (o <= 1) {
return 0;
}
int p = 2;
while (p * p <= o) {
while(j < 40) {
j = j + 1;
}
if (o % p == 0) {
return 0;
}
p = p + 1;
}
return 1;
}
int main() {
while(f < 97) {
f = f + 1;
}
while(f < 70) {
f = (f + 1);
}
while(f < 82) {
f = f + 1;
}
int q = 5;
printf("Number is %d\n",q);
int r = q;
int s = func1(r);
printf("Its factorial is %d\n",s);
int t = func3(r);
printf("Is it prime? ");
if (t) {
if(d > 51) {
d = 32;
}
else {
d = 32;
}
printf("yes\r\n");
}
else {
printf("no\r\n");
}
double u = func2(q);
printf("Its average: ");
printf("%f ",u);
return 0;
}