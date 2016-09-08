<?php

function calc()
{
    // lol
    ini_set('memory_limit','256M');
    $max = 1000000;
    $phi = [];
    $out = 0;

    for ($t = 0; $t <= $max; $t++) {
        $phi[] = $t;
    }

    for ($i = 2; $i <= $max; $i++) {
        if ($phi[$i] == $i) {
            for ($j = $i; $j <= $max; $j += $i) {
                $phi[$j] = $phi[$j] / $i * ($i - 1);
            }
        }
        $out += $phi[$i];
    }
    return $out;
}

echo calc();
