package com.cetin.data;

import java.util.Arrays;
import java.util.List;


/*
O(n^2)
if the current value(i) is less than which element in list, which is looking for by ordering,
change the position.
if you find less than current, replace it.
* [90, 27, 13, 65, 5]
i - j 0 - 0
i - j 0 - 1
i - j 0 - 2
i - j 0 - 3
i - j 0 - 4
i - j 1 - 0
[27, 90, 13, 65, 5]
i - j 1 - 1
i - j 1 - 2
i - j 1 - 3
i - j 1 - 4
i - j 2 - 0
[13, 90, 27, 65, 5]
i - j 2 - 1
[13, 27, 90, 65, 5]
i - j 2 - 2
i - j 2 - 3
i - j 2 - 4
i - j 3 - 0
i - j 3 - 1
i - j 3 - 2
[13, 27, 65, 90, 5]
i - j 3 - 3
i - j 3 - 4
i - j 4 - 0
[5, 27, 65, 90, 13]
i - j 4 - 1
[5, 13, 65, 90, 27]
i - j 4 - 2
[5, 13, 27, 90, 65]
i - j 4 - 3
[5, 13, 27, 65, 90]
i - j 4 - 4
[5, 13, 27, 65, 90]

* */
public final class BubbleShort {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(12, 11, 13, 5, 6);

        System.out.println(array);
        for(int i = 0; i < array.size() ; i++){
            for (int j = 0 ; j < array.size() ; j++){
                System.out.println("i - j " + i +" - "+j);
                int temp = array.get(i);
                if( temp < array.get(j)){
                    array.set(i, array.get(j));
                    array.set(j, temp);
                    System.out.println(array);
                }
            }
        }
        System.out.println(array);
    }

}
