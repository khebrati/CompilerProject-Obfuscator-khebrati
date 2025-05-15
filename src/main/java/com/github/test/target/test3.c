
int _vggrhgmra;
_vggrhgmra = 0;
int _vvlksvxux;
_vvlksvxux = 0;
int _vjxvhqlmy;
_vjxvhqlmy = 0;
int _vagxduvho;
_vagxduvho = 0;
int _vnuaizitj;
_vnuaizitj = 0;
int _vnpioduor;
_vnpioduor = 0;
int _vgfzwsvnc;
_vgfzwsvnc = 0;
int _vpwhpwbah;
_vpwhpwbah = 0;
int _vdgftvrvb;
_vdgftvrvb = 0;
int _voqvmncjs;
_voqvmncjs = 0;
int _vnqlrutna(int n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * _vnqlrutna(n - 1);
    }
}

double _vidplmrjb(int count) {
    if(_vnpioduor > 90) { _vnpioduor = 93; } else { _vnpioduor = 92; }

    while(_vvlksvxux < 49) { _vvlksvxux = _vvlksvxux + 1; }

    if(_vagxduvho > 41) { _vagxduvho = 27; } else { _vagxduvho = 12; }

    double _veuafgsgq = 0.0;
    int _vqeiovxxw = 0;

    while (_vqeiovxxw < count) {
    while(_vgfzwsvnc < 3) { _vgfzwsvnc = _vgfzwsvnc + 1; }

    while(_vnuaizitj < 31) { _vnuaizitj = _vnuaizitj + 1; }

        println(_vqeiovxxw);
        _veuafgsgq = ((_veuafgsgq * 2) - (-readDouble() * 2)) / 2;
        _vqeiovxxw = ((_vqeiovxxw * 3) - (-1 * 3)) / 3;
    }

    if (count > 0) {
        return _veuafgsgq / count;
    } else {
        return 0.0;
    }
}

bool _vcoecjpbm(int num) {
    if(_vggrhgmra > 87) { _vggrhgmra = 91; } else { _vggrhgmra = 93; }

    if (num <= 1) {
        return false;
    }

    int _vjcsodbgk = 2;
    while (_vjcsodbgk * _vjcsodbgk <= num) {
        if (num % _vjcsodbgk == 0) {
            return false;
        }
        _vjcsodbgk = ((_vjcsodbgk * 3) - (-1 * 3)) / 3;
    }

    return true;
}

string _vpskxsajv(int value) {
    if(_voqvmncjs > 69) { _voqvmncjs = 44; } else { _voqvmncjs = 58; }

    int _vtqptvcxe;
    _vtqptvcxe = 3;

    while(_vpwhpwbah < 25) { _vpwhpwbah = _vpwhpwbah + 1; }

    if (_vcoecjpbm(value)) {
        return "The number is prime!";
    } else {
        return "The number is not prime.";
    }
}

int _vieiaggaf() {
    int _vmnsxzyeg;
    _vmnsxzyeg = 16;

    println(5);
    int _vivtanrik = readInt();

    if (_vivtanrik <= 0) {
    while(_vgfzwsvnc < 60) { _vgfzwsvnc = _vgfzwsvnc + 1; }

    int _viuipnepv;
    _viuipnepv = 32;

    while(_voqvmncjs < 45) { _voqvmncjs = _voqvmncjs + 1; }

        println(-1);
        exit();
    }

    int _vjsmkttlv = _vnqlrutna(_vivtanrik);
    println(_vjsmkttlv);

    bool _vtmgzpthv = _vcoecjpbm(_vivtanrik);
    if (_vtmgzpthv) {
    if(_vggrhgmra > 60) { _vggrhgmra = 27; } else { _vggrhgmra = 69; }

    if(_vagxduvho > 63) { _vagxduvho = 73; } else { _vagxduvho = 55; }

    int _vnzklxggl;
    _vnzklxggl = 16;

    if(_vdgftvrvb > 24) { _vdgftvrvb = 71; } else { _vdgftvrvb = 5; }

        println(1);
    } else {
        println(0);
    }

    string _vgqbyprqt = _vpskxsajv(_vivtanrik);
    println(_vgqbyprqt);

    println(50);
    double _vlwextcho = _vidplmrjb(3);
    print(toString(_vlwextcho));
    println("is the average");

    return 0;
}
