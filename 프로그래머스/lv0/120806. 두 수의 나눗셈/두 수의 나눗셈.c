#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num1, int num2) {
    int answer = 0;
    answer = (int) ((num1*1.0)/(num2*1.0) * 1000);
    return answer;
}