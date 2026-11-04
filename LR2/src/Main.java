import java.util.Random;
void main() {
    int[] arr = {1, 2, 3, 2, 6, 4, 23, 5, 6, 4, 1, 5, 3, 6};

    System.out.print("Уникальные элементы: ");
    for (int i = 0; i < arr.length; i++) {
        boolean isDuplicate = false;
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            System.out.print(arr[i] + " ");
        }

    }
    int N = 5;
    int[][] A = new int[N][N];
    Random rand = new Random();
    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A.length; j++) {
            A[i][j] = rand.nextInt(21) - 10;
        }
    }

    System.out.println("Матрица A:");
    for (int i = 0; i < A.length; i++) {
        for (int j = 0; j < A.length; j++) {
            System.out.printf("%4d", A[i][j]);
        }
        System.out.println();
    }
        int sum = 0;
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (i + j < N - 1) {
                    if (A[i][j] > 0) {
                        sum += A[i][j];
                        count++;
                    }
                }
            }
        }

        System.out.println("\nСумма положительных элементов над побочной диагональю: " + sum);
        System.out.println("Количество положительных элементов над побочной диагональю: " + count);
    }

