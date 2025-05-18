int _vqluhpsaw = 0;
int _vgyfywewk = 0;
int _vrsbspdkk = 0;
int _vgbxcayfz = 0;
int _vvxuajmnk = 0;
int _vyvounaor = 0;
int _vrfrfmxsn = 0;
int _vonhenyul = 0;
int _vnwweoszx = 0;
int _vsbcvlkrc = 0;
int _vcenrmpde(int n) {
    while(_vrsbspdkk < 4) { _vrsbspdkk = _vrsbspdkk + 1; }

    _vnwweoszx = 56;

    if(_vgbxcayfz > 75) { _vgbxcayfz = 13; } else { _vgbxcayfz = 26; }

    if (n <= 1) {
        return 1;
    } else {
        return n * _vcenrmpde(n - 1);
    }
}

double _vblywygua(int count) {
    _vrfrfmxsn = 60;

    _vonhenyul = 83;

    if(_vgbxcayfz > 18) { _vgbxcayfz = 49; } else { _vgbxcayfz = 53; }

    double _vohihfkjr = 0.0;
    int _vhpzsjywg = 0;

    printf("Counting from zero to the number: \n");
    while (_vhpzsjywg < count) {
        printf("%d\n",_vhpzsjywg);
        _vohihfkjr = ((_vohihfkjr * 2) - (-_vhpzsjywg * 2)) / 2;
        _vhpzsjywg = ((_vhpzsjywg * 2) - (-1 * 2)) / 2;
    }

    if (count > 0) {
        return _vohihfkjr / count;
    } else {
        return 0.0;
    }
}

int _vkkevsxhl(int num) {
    if (num <= 1) {
        return 0;
    }

    int _vhpzsjywg = 2;
    while (_vhpzsjywg * _vhpzsjywg <= num) {
    _vsbcvlkrc = 55;

        if (num % _vhpzsjywg == 0) {
            return 0;
        }
        _vhpzsjywg = (_vhpzsjywg - (-1));
    }

    return 1;
}


int main() {
    _vqluhpsaw = 35;

    int _vhpzsjywg = 5;
    printf("Number is %d\n",_vhpzsjywg);
    int _vjsgbuqkp = _vhpzsjywg;
    int _vwpoofirb = _vcenrmpde(_vjsgbuqkp);
    printf("Its factorial is %d\n",_vwpoofirb);

    int _vrhebgplb = _vkkevsxhl(_vjsgbuqkp);
    printf("Is it prime? ");
    if (_vrhebgplb) {
    _vsbcvlkrc = 25;

    if(_vvxuajmnk > 41) { _vvxuajmnk = 44; } else { _vvxuajmnk = 60; }

    if(_vsbcvlkrc > 73) { _vsbcvlkrc = 77; } else { _vsbcvlkrc = 57; }

        printf("yes\r\n");
    } else {
        printf("no\r\n");
    }

    double _vjgnzwrly = _vblywygua(_vhpzsjywg);
    printf("Its average: ");
    printf("%f ",_vjgnzwrly);

    return 0;
}
