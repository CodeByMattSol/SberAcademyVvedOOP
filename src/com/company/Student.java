package com.company;

public class Student {
    public final String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;

        int i = 0;
        boolean flag = true;

        while (i < marks.length) {
            if (marks[i] > 5 || marks[i] < 1) {
                System.out.println("Некорректный массив оценок!");
                flag = false; break;
            }

            i++;
        }

        if (flag) {
            this.marks = marks;
        }
    }

    public float getAvr() {
        if (this.marks != null) {
            int summ = 0;

            for (int i = 0; i < marks.length; i++) {
                summ += marks[i];
            }

            return (float) summ / marks.length;
        } else {
            return -1f;
        }
    }
}
