import java.util.Scanner;
public class Timgiatri {
    public static void main(String[] args) {
        String[] danhsach={"tinh","tu","tuan","ngoc","ha","nam","son"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String ten=scanner.nextLine();
        boolean tem=false;
        for (int i=0;i<danhsach.length;i++){
            if (danhsach[i].equalsIgnoreCase(ten)){
                System.out.println(ten + "  vi tri so : "+i);
                tem=true;
                break;
            }
        }
        if (!tem){
            System.out.println(ten+"  khong co trong danh sach");
        }
    }
}
