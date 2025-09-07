int _velmyyipg = 0;
int _vxjrknljd = 0;
int _vbmrckuho = 0;
int _vdpmntoxk = 0;
int _vdtjlpjkk = 0;
int _vlarlyoiw = 0;
int _vmuuhqkfm = 0;
int _vtrketarl = 0;
int _vaecfoqda = 0;
int _vvdfhkzjo = 0;
int _voiqzumsf(int n) {
    if(_vtrketarl > 59) { _vtrketarl = 22; } else { _vtrketarl = 36; }

    if(_vtrketarl > 5) { _vtrketarl = 32; } else { _vtrketarl = 28; }

    if(_vaecfoqda > 13) { _vaecfoqda = 39; } else { _vaecfoqda = 87; }

    if (n <= 1) {
        return 1;
    } else {
        return n * _voiqzumsf(n - 1);
    }
}

double _veblejehs(int count) {
    double _vipobxbjw = 0.0;
    int _vrrbqudpb = 0;

    printf("Counting from zero to the number: \n");
    while (_vrrbqudpb < count) {
    _vvdfhkzjo = 73;

    while(_vvdfhkzjo < 1) { _vvdfhkzjo = (_vvdfhkzjo - (-1)); }

    _vvdfhkzjo = 41;

        printf("%d\n",_vrrbqudpb);
        _vipobxbjw = (_vipobxbjw - (-_vrrbqudpb));
        _vrrbqudpb = ((_vrrbqudpb * 2) - (-1 * 2)) / 2;
    }

    if (count > 0) {
        return _vipobxbjw / count;
    } else {
        return 0.0;
    }
}

int _vzdxqixgp(int num) {
    if(_velmyyipg > 43) { _velmyyipg = 31; } else { _velmyyipg = 53; }

    if (num <= 1) {
        return 0;
    }

    int _vrrbqudpb = 2;
    while (_vrrbqudpb * _vrrbqudpb <= num) {
    while(_vvdfhkzjo < 40) { _vvdfhkzjo = ((_vvdfhkzjo * 3) - (-1 * 3)) / 3; }

        if (num % _vrrbqudpb == 0) {
            return 0;
        }
        _vrrbqudpb = ((_vrrbqudpb * 2) - (-1 * 2)) / 2;
    }

    return 1;
}


int main() {
    while(_vlarlyoiw < 97) { _vlarlyoiw = ((_vlarlyoiw * 2) - (-1 * 2)) / 2; }

    while(_vlarlyoiw < 70) { _vlarlyoiw = (_vlarlyoiw - (-1)); }

    while(_vlarlyoiw < 82) { _vlarlyoiw = ((_vlarlyoiw * 2) - (-1 * 2)) / 2; }

    int _vrrbqudpb = 5;
    printf("Number is %d\n",_vrrbqudpb);
    int _vimzyqjie = _vrrbqudpb;
    int _vlwzfcmxi = _voiqzumsf(_vimzyqjie);
    printf("Its factorial is %d\n",_vlwzfcmxi);

    int _vtatsgzdt = _vzdxqixgp(_vimzyqjie);
    printf("Is it prime? ");
    if (_vtatsgzdt) {
    if(_vdpmntoxk > 51) { _vdpmntoxk = 32; } else { _vdpmntoxk = 32; }

        printf("yes\r\n");
    } else {
        printf("no\r\n");
    }

    double _vhedvqpsb = _veblejehs(_vrrbqudpb);
    printf("Its average: ");
    printf("%f ",_vhedvqpsb);

    return 0;
}
