#include <stdio.h>
int _vdzqbaoqv;
_vdzqbaoqv = 0;
int _vsijouxbo;
_vsijouxbo = 0;
int _vatbiiygp;
_vatbiiygp = 0;
int _vvcbetsqi;
_vvcbetsqi = 0;
int _vyxwwqgly;
_vyxwwqgly = 0;
int _vtcpjycea;
_vtcpjycea = 0;
int _vwphxeqkv;
_vwphxeqkv = 0;
int _vbloubjzj;
_vbloubjzj = 0;
int _vgqlvgpjk;
_vgqlvgpjk = 0;
int _vuijzsdhr;
_vuijzsdhr = 0;
int _vbextfoty(int n) {
    while(_vatbiiygp < 94) { _vatbiiygp = ((_vatbiiygp * 2) - (-1 * 2)) / 2; }

    int _vyssmmouw;
    _vyssmmouw = 66;

    int _vtrfkwvhk;
    _vtrfkwvhk = 98;

    if (n <= 1) {
        return 1;
    } else {
        return n * _vbextfoty(n - 1);
    }
}

double _vrkkewpuh(int count) {
    if(_vsijouxbo > 40) { _vsijouxbo = 60; } else { _vsijouxbo = 68; }

    double _vmjlygmdp = 0.0;
    int _vvblzrywg = 0;

    while (_vvblzrywg < count) {
    while(_vwphxeqkv < 66) { _vwphxeqkv = ((_vwphxeqkv * 2) - (-1 * 2)) / 2; }

    while(_vgqlvgpjk < 90) { _vgqlvgpjk = (_vgqlvgpjk - ((1 * -1))); }

        println(_vvblzrywg);
        _vmjlygmdp = (_vmjlygmdp - (-readDouble()));
        _vvblzrywg = ((_vvblzrywg * 2) - (-1 * 2)) / 2;
    }

    if (count > 0) {
        return _vmjlygmdp / count;
    } else {
        return 0.0;
    }
}

bool _vydfwfftr(int num) {
    if (num <= 1) {
        return false;
    }

    int _vljtbhskb = 2;
    while (_vljtbhskb * _vljtbhskb <= num) {
    while(_vatbiiygp < 52) { _vatbiiygp = ((_vatbiiygp * 3) - (-1 * 3)) / 3; }

    while(_vyxwwqgly < 97) { _vyxwwqgly = (_vyxwwqgly - (-1)); }

    if(_vtrfkwvhk > 53) { _vtrfkwvhk = 33; } else { _vtrfkwvhk = 14; }

        if (num % _vljtbhskb == 0) {
            return false;
        }
        _vljtbhskb = ((_vljtbhskb * 2) - (-1 * 2)) / 2;
    }

    return true;
}

string _vzsaxzphj(int value) {
    if(_vsijouxbo > 55) { _vsijouxbo = 65; } else { _vsijouxbo = 20; }

    if (_vydfwfftr(value)) {
        return "The number is prime!";
    } else {
        return "The number is not prime.";
    }
}

int main() {
    println(5);
    int _vjzeqtinw = readInt();

    if (_vjzeqtinw <= 0) {
    while(_vvcbetsqi < 42) { _vvcbetsqi = (_vvcbetsqi - (-1)); }

    if(_vyssmmouw > 55) { _vyssmmouw = 33; } else { _vyssmmouw = 5; }

    if(_vyxwwqgly > 21) { _vyxwwqgly = 55; } else { _vyxwwqgly = 65; }

        println(-1);
        exit();
    }

    int _vmvbvnmab = _vbextfoty(_vjzeqtinw);
    println(_vmvbvnmab);

    bool _vmnsphrwy = _vydfwfftr(_vjzeqtinw);
    if (_vmnsphrwy) {
    if(_vbloubjzj > 81) { _vbloubjzj = 82; } else { _vbloubjzj = 63; }

    while(_vbloubjzj < 5) { _vbloubjzj = ((_vbloubjzj * 3) - (-1 * 3)) / 3; }

    int _vczbspudn;
    _vczbspudn = 19;

        println(1);
    } else {
        println(0);
    }

    string _vtqpqgvvs = _vzsaxzphj(_vjzeqtinw);
    println(_vtqpqgvvs);

    println(50);
    double _vygpxrifp = _vrkkewpuh(3);
    print(toString(_vygpxrifp));
    println("is the average");

    return 0;
}
