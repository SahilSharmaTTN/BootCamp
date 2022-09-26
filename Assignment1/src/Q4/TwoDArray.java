package Q4;

public class TwoDArray {
    public static void main(String[] args) {

        int arr[][] =  {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        System.out.println("Row SUM");
        rowSum(arr);

        System.out.println();

        System.out.println("Col SUM");
        colSum(arr);
    }

    static void rowSum(int arr[][]){
        int sum;
        for( int i = 0; i < 4 ; i++){
            sum=0;
            for ( int j = 0 ; j < 4; j++){

                System.out.print(arr[i][j]+ " ");
                sum += arr[i][j];
            }

            System.out.print("Sum:" + sum);
            System.out.println();
        }
    }

    static void colSum(int arr[][]){

        int sum;
        for( int i = 0; i < 4 ; i++){
            sum=0;
            for ( int j = 0 ; j < 4; j++){

                System.out.print(arr[j][i]+ " ");
                sum += arr[j][i];
            }

            System.out.print("Sum:" + sum);
            System.out.println();
        }
    }




}
