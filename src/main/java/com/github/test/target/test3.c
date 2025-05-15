int _vxulnywyw;
_vxulnywyw = 0;
int _vldraefvr;
_vldraefvr = 0;
int _vhxalyrxv;
_vhxalyrxv = 0;
int _vyueovvxh;
_vyueovvxh = 0;
int _vxgskvoio;
_vxgskvoio = 0;
int _vioraqhtw;
_vioraqhtw = 0;
int _vvmfjzcns;
_vvmfjzcns = 0;
int _vbmrmporn;
_vbmrmporn = 0;
int _vvtmwagmp;
_vvtmwagmp = 0;
int _vwlryibfv;
_vwlryibfv = 0;
int _vsqeyanwl(int n) {
    while(_vioraqhtw < 67) { _vioraqhtw = ((_vioraqhtw * 2) - (-1 * 2)) / 2; }

    if (n <= 1) {
        return 1;
    } else {
        return n * _vsqeyanwl(n - 1);
    }
}

double _vvygqjicn(int count) {
    double _vrgvrvueh = 0.0;
    int _vbmzxmrkc = 0;

    while (_vbmzxmrkc < count) {
    int _vlhpuiafe;
    _vlhpuiafe = 77;

    int _vuqtulpae;
    _vuqtulpae = 42;

        println(_vbmzxmrkc);
        _vrgvrvueh = (_vrgvrvueh - ((readDouble() * -1)));
        _vbmzxmrkc = ((_vbmzxmrkc * 2) - (-1 * 2)) / 2;
    }

    if (count > 0) {
        return _vrgvrvueh / count;
    } else {
        return 0.0;
    }
}

bool _vmaikgwto(int num) {
    if (num <= 1) {
        return false;
    }

    int _vryzhqfmc = 2;
    while (_vryzhqfmc * _vryzhqfmc <= num) {
    while(_vxgskvoio < 78) { _vxgskvoio = (_vxgskvoio - (-1)); }

    if(_vwlryibfv > 95) { _vwlryibfv = 59; } else { _vwlryibfv = 51; }

        if (num % _vryzhqfmc == 0) {
            return false;
        }
        _vryzhqfmc = (_vryzhqfmc - ((1 * -1)));
    }

    return true;
}

string _vgeijlbkw(int value) {
    if (_vmaikgwto(value)) {
        return "The number is prime!";
    } else {
        return "The number is not prime.";
    }
}

int _vprqznynw() {
    int _vvenzluau;
    _vvenzluau = 57;

    println(5);
    int _vfflkvimm = readInt();

    if (_vfflkvimm <= 0) {
    if(_vldraefvr > 98) { _vldraefvr = 30; } else { _vldraefvr = 57; }

        println(-1);
        exit();
    }

    int _vynmylyyr = _vsqeyanwl(_vfflkvimm);
    println(_vynmylyyr);

    bool _vbkokxuse = _vmaikgwto(_vfflkvimm);
    if (_vbkokxuse) {
    while(_vioraqhtw < 59) { _vioraqhtw = (_vioraqhtw - (-1)); }

    while(_vwlryibfv < 69) { _vwlryibfv = (_vwlryibfv - ((1 * -1))); }

        println(1);
    } else {
        println(0);
    }

    string _vwphtqetz = _vgeijlbkw(_vfflkvimm);
    println(_vwphtqetz);

    println(50);
    double _vrmkudcnm = _vvygqjicn(3);
    print(toString(_vrmkudcnm));
    println("is the average");

    return 0;
}
