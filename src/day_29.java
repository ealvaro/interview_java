import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int max = -1;
            //int and = n & n-1;
            //System.out.println(and);
            for (int i = 1; i < n; i++)
                for (int j = i+1; j <= n; j++) {
                    int and = i & j;
                    if (and < k)
                        if ( and > max)
                            max=and;
                }
            System.out.println(max);

        }
    }
}
// Input
// 40
// 955 236
// 132 107
// 178 104
// 394 378
// 773 29
// 159 117
// 928 443
// 250 146
// 730 468
// 601 278
// 535 449
// 293 109
// 239 87
// 559 168
// 601 435
// 199 41
// 297 50
// 407 143
// 107 33
// 227 39
// 674 86
// 153 134
// 302 53
// 823 436
// 532 125
// 149 86
// 140 133
// 887 166
// 646 496
// 481 208
// 308 190
// 467 452
// 411 130
// 835 88
// 412 192
// 174 123
// 848 390
// 435 169
// 286 50
// 906 806
// Output
// 235
// 106
// 103
// 377
// 28
// 116
// 442
// 145
// 467
// 277
// 448
// 108
// 86
// 167
// 434
// 40
// 49
// 142
// 32
// 38
// 85
// 133
// 52
// 435
// 124
// 85
// 132
// 165
// 495
// 207
// 189
// 451
// 129
// 87
// 191
// 122
// 389
// 168
// 49
// 805
