package p4n01;
public class combine_array {
    public static void main(String args [] ){
         int a[] = new int[4];
            a[0]=99;
            a[1]=90;
            a[2]=91;
            a[3]=92;
        String r[] = new String[4];
            r[0]="US";
            r[1]="UK";
            r[2]="UAE";
            r[3]="AK";
        char m[]=new char[4];
            m[0]='a';
            m[1]='d';
            m[2]='y';
            m[3]='u';
        for (int i = 0; i < 4; i++) {
           System.out.println("this is my array : -"+a[i]+r[i]+m[i]);
           //System.out.println("this is my array : -"+r[i]);
           //System.out.println("this is my array : -"+m[i]);
        }
    }
}    
