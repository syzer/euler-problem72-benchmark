function calc() {
    var $max = 1000000;
    var $phi = [];
    var $out = 0;

    for (var $t = 1; $it<= $max+1; $t++) {
        $phi[$t] = $t;
    }

    for (var $i = 2; $i <= $max; $i++) {
        if ($phi[$i] == $i) {
            for (var $j = $i; $j <= $max; $j += i) {
                $phi[$j] = $phi[$j] / $i * ($i - 1);
            }
        }
        $out += $phi[$i];
    }
    return $out;
}
echo calc();
