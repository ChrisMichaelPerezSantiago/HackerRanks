package Warmup;

import java.util.Arrays;
import java.util.Scanner;

/*
        Problem: Compare the Triplets

                Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges,
                awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
                We define the rating for Alice's challenge to be the triplet A=(a_1,a_2,a_3) , and the rating for Bob's challenge to
                be the triplet .

        Your task is to find their comparison points by comparing  a_0 with b_0 , a_1 with b_2 , and a_3 with b_3 .

        If a_i > b_i , then Alice is awarded  point.
        If a_i < b_i , then Bob is awarded  point.
        If a_i == b_i , then neither person receives a point.

                Comparison points is the total points a person earned.

        Given  and , can you compare the two challenges and print their respective comparison points?

        Input Format:
        The first line contains 3 space-separated integers ... and , describing the respective values in triplet .
        The second line contains 3 space-separated integers ... and , describing the respective values in triplet .

        @Author Chris M. Perez
        @Date   4/1/2017
*/

public class CompareTheTriplets {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int tripletA[];
        int tripletB[];



        tripletA = Arrays.stream(console.nextLine().split(" "))
                         .mapToInt(Integer::parseInt).toArray();

        tripletB = Arrays.stream(console.nextLine().split(" "))
                         .mapToInt(Integer::parseInt).toArray();

        comparisonPoints(tripletA,tripletB);
    }

    public static void comparisonPoints(int tripletA[], int tripletB[]){
        int alice = 0;
        int bob = 0;

        for(int i=0;i<tripletA.length;i++) {
            if (tripletA[i] > tripletB[i]) {
                alice++;
            } else if (tripletB[i] > tripletA[i]) {
                bob++;
            } else {
                alice += 0;
                bob += 0;
            }
        }
        System.out.println(alice + " " + bob);
    }
}
