package example.practice.hackerrank;

import java.util.Arrays;
import java.util.List;
/*
* There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.

Example

Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices  and . They could follow these two paths:  or . The first path takes  jumps while the second takes . Return .

Function Description

Complete the jumpingOnClouds function in the editor below.

jumpingOnClouds has the following parameter(s):

int c[n]: an array of binary integers
Returns

int: the minimum number of jumps required
Input Format

The first line contains an integer , the total number of clouds. The second line contains  space-separated binary integers describing clouds  where .

Constraints

Output Format

Print the minimum number of jumps needed to win the game.

Sample Input 0

7
0 0 1 0 0 1 0
Sample Output 0

4
Explanation 0:
The player must avoid  and . The game can be won with a minimum of  jumps:

jump(2).png

Sample Input 1

6
0 0 0 0 1 0
Sample Output 1

3
Explanation 1:
The only thundercloud to avoid is . The game can be won in  jumps:

jump(5).png
* */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        List<Integer> clouds;
        int i;
        /*clouds = Arrays.asList(0, 0, 1, 0, 0, 1, 0);
        i = JumpingOnTheClouds.jumpingOnClouds(clouds);
        System.out.println("-------- " + i);*/
        /*clouds = Arrays.asList(0, 0, 0, 0, 1, 0);
        i = JumpingOnTheClouds.jumpingOnClouds(clouds);
        System.out.println("-------- " + i);*/
        clouds = Arrays.asList(0, 0, 0, 1, 0, 0);
        i = JumpingOnTheClouds.jumpingOnClouds(clouds);
        System.out.println("-------- " + i);
    }


    public static int jumpingOnClouds(List<Integer> c) {
        int path = 0;
        int size = c.size();
        for (int i = 0; i < size - 1; ) {
            if (c.get(i) == 0) {
                int[] sub;
                if (i == size - 1 || i == size - 2) {
                    sub = new int[]{c.get(i), c.get(i + 1)};
                } else {
                    sub = new int[]{c.get(i), c.get(i + 1), c.get(i + 2)};
                }
                boolean allGoodCloud = Arrays.stream(sub).allMatch(e -> e == 0);
                if (allGoodCloud) {
                    i = i + 2;
                } else {
                    if ((sub.length == 3 && sub[0] == 0 && sub[1] == 0 && sub[2] == 1)
                            || sub.length == 2 && sub[0] == 0 && sub[1] == 0) {
                        i = i + 1;
                    } else {
                        i = i + 2;
                    }
                }
                path++;
            }
        }
        return path;
    }
}
