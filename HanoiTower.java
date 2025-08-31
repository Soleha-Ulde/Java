public class HanoiTower{
    public static void towerOfHanoi(int n , String src, String helper,String dest){
        if(n == 1){
            System.out.println("Transfer of disk "+n+" from source "+src+" to destination "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer of disk "+n+" from source "+src+" to destination " +dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args){
        int n = 4;
        towerOfHanoi(n,"S","H","D");
    }
}