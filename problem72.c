#include <stdio.h>
#include <stdlib.h>

const int max = 1000000;

uint64_t calc() {
    uint32_t phi[max + 1];
    uint32_t i, j;
    uint64_t out = 0;
    float fac;

    for (i = 0; i <= max; i++) {
        phi[i] = i;
    }

    for (i = 2; i <= max; i++) {
        if ( phi[i] == i) {
            fac = (i - 1.0) / i;
            for (j = i; j <= max; j += i) {
                phi[j] = phi[j] * fac;
            }
        }
        out += phi[i];
    }

    return out;
}

int main() {
    printf("%lld\n", calc());

    return 0;
}