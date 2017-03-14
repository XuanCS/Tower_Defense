package com.example.qifeng.td.GameRelated;

/**
 * Created by Qifeng on 00/6/0006.
 */

public class Maps {
    //All maps are 32x18 matrices
    //Each number represents a 40*40 pixels^2 grid

    //0: No pass, 1: Road, 2: lowTree, 3: tallTree, 4: water, 5: home
    public static final int[][] MAP1 =
            {
                    {2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
                    {2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2},
                    {2, 2, 2, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 2, 2, 2},
                    {2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 5, 1},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 3, 3, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 4, 4, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 4, 4, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 4, 4, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {2, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 3, 3, 3, 3, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 2},
                    {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
                    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            };

    public static final int[][] MAP1_TURNS =
            {
                    {0, 200},
                    {120, 200},
                    {120, 640},
                    {280, 640},
                    {280, 80},
                    {400, 80},
                    {400, 640},
                    {480, 640},
                    {480, 80},
                    {560, 80},
                    {560, 360},
                    {680, 360},
                    {680, 80},
                    {760, 80},
                    {760, 640},
                    {840, 640},
                    {840, 80},
                    {960, 80},
                    {960, 640},
                    {1120, 640},
                    {1120, 200},
                    {1200, 200},
            };
    //    public static final int MAP1_HOME_COLUMN = 30;
//    public static final int MAP1_HOME_ROW = 6;
    public static final int MAP1_START_X = 0;
    public static final int MAP1_START_Y = 200;
    public static final int MAP1_MAX_TURNS = MAP1_TURNS.length - 1;


    //0: No pass, 1: Road, 2: lowTree, 3: tallTree, 4: camp, 5: home
    public static final int[][] MAP2 =
            {
                    {2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
                    {2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2},
                    {2, 2, 2, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 2, 2, 2},
                    {2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {1, 51, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 50, 1},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 4, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 3, 3, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 3, 3, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 3, 3, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 3, 3, 3, 3, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {2, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 3, 3, 3, 3, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 2},
                    {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2},
                    {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
            };


    public static final int[][] MAP2_TURNS_A =
            {
                    {660, 360},
                    {680, 360},
                    {680, 80},
                    {760, 80},
                    {760, 640},
                    {840, 640},
                    {840, 80},
                    {960, 80},
                    {960, 640},
                    {1120, 640},
                    {1120, 200},
                    {1200, 200},
            };

    public static final int[][] MAP2_TURNS_B =
            {

                    {580, 360},
                    {560, 360},
                    {560, 80},
                    {480, 80},
                    {480, 640},
                    {400, 640},
                    {400, 80},
                    {280, 80},
                    {280, 640},
                    {120, 640},
                    {120, 200},
                    {40, 200}
            };

    public static final int MAP2_START_A_X = 660;
    public static final int MAP2_START_A_Y = 360;
    public static final int MAP2_MAX_TURNS_A = MAP2_TURNS_A.length - 1;

    public static final int MAP2_START_B_X = 580;
    public static final int MAP2_START_B_Y = 360;
    public static final int MAP2_MAX_TURNS_B = MAP2_TURNS_B.length - 1;


    //0: No pass, 1: Road, 2: lowTree, 3: tallTree, 4: water, 5: home, 6: tree2, 7: tree3
    public static final int[][] MAP3 =
            {
                    {6, 6, 6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 6, 6, 6},
                    {6, 6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 6},
                    {6, 6, 6, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6, 6},
                    {6, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 6},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 1, 7, 7, 7, 0, 1, 0, 0, 1, 0, 4, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 1, 1, 5, 1},
                    {0, 0, 0, 1, 0, 0, 0, 1, 7, 7, 7, 0, 1, 0, 0, 1, 0, 4, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 7, 7, 0, 0, 1, 0, 0, 1, 0, 4, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 7, 0, 7, 0, 1, 0, 0, 1, 0, 4, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 4, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 7, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 7, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 7, 0, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 7, 7, 1, 0, 0, 0},
                    {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                    {6, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 6},
                    {6, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 6},
                    {6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
            };

    public static final int[][] MAP3_TURNS =
            {
                    {0, 200},
                    {120, 200},
                    {120, 640},
                    {280, 640},
                    {280, 80},
                    {480, 80},
                    {480, 600},
                    {600, 600},
                    {600, 120},
                    {960, 120},
                    {960, 440},
                    {720, 440},
                    {720, 600},
                    {1120, 600},
                    {1120, 200},
                    {1200, 200},
            };

    public static final int MAP3_START_X = 0;
    public static final int MAP3_START_Y = 200;
    public static final int MAP3_MAX_TURNS = MAP3_TURNS.length - 1;

}

