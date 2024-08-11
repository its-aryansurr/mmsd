import java.util.*;
class MATRIX_MULTIPLICATION{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rA,cA,rB,cB,h,p=0,k=0,t=0,z=1,b=1,d,i,s=0,j,o,l,m,q=1;
        while(t!=1){
        System.out.print("ENTER THE NUMBER OF ROWS OF MATRIX A - ");
        rA = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMNS OF MATRIX A - ");
        cA = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF ROWS OF MATRIX B - ");
        rB = sc.nextInt();
        System.out.print("ENTER THE NUMBER OF COLUMNS OF MATRIX B - ");
        cB = sc.nextInt();
        if(cA == rB){
            t=1;
            System.out.println("======================================================================");
            System.out.println("WHILE ENTERING VALUES FOR MATRIX A ENTER LEFT TO RIGHT , IN THE ORDER");
            System.out.println("WHILE ENTERING VALUES FOR MATRIX B ENTER UP TO DOWN , IN THE ORDER");
            System.out.println("======================================================================");
            int eleA [] = new int [rA * cA];
            int eleB [] = new int [rB * cB];
            System.out.println("ENTER MATRIX A VALUES");
            for(o=0;o<rA*cA;o++){
                eleA[o] = sc.nextInt();
            }
            System.out.println("ENTER MATRIX B VALUES");
            for(l=0;l<rB*cB;l++){
                eleB[l] = sc.nextInt();
            }
            System.out.println("THE MULTIPLIED MATRIX :");
            System.out.println();
            for(i=0;i<rA;i++){
                for(h=0;h<cB;h++){
                    for(j=0;j<cA;j++){   
                        s+=eleA[p]*eleB[k];
                        k++;
                        p++;
                    }
                    if(s>=0 && s<=9)
                    System.out.print("0"+s+" | ");
                    else
                    System.out.print(s+" | ");
                    b++;
                    for(d=1;d<=rA;d++){
                        if(p==d*cA){
                            p=p-cA;
                        }
                    }
                    s=0;
                }
                System.out.println();
                p+=cA;
                k=0;
                b=1;
                z++;
            } 
        }
        else
            System.out.println("THE COLUMNS AND THE ROWS OF THE MATRICES DON'T MATCH");
            System.out.println("==============================================================");
            System.out.println("CODED BY THE LEGENDARY ARYAN SUR");
            System.out.println("==============================================================");
        }
    }
}
