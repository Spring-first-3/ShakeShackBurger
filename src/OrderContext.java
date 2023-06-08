import java.time.LocalDateTime;
import java.util.*;

public class OrderContext {
    List<Order> orders;
    Scanner sc = new Scanner(System.in);

    public OrderContext() {
        orders = new ArrayList<>();
    }






    //주문 전체를 조회
    void output() {
        for(int i =orders.size(); i>0; i--) {
            System.out.println(orders.get(i-1).toString());
        }
    }



    //1건의 상품을 주문리스트에 추가
    void add(Order vo) {

        orders.add(vo);
    }






    //글 1건을 얻어와 리턴
    Order memoReturn(int no) {
        for(Order vo : orders) {
            if(vo.orderNo == no)
                return vo;
        }
        return null;
    }
    //상품을 수정하는 메소드

    Order edit(Order vo) {
        vo.productName = sc.nextLine();
        vo.productPrice = sc.nextDouble();
        vo.request = sc.nextLine();
        vo.productDetails = sc.nextLine();
        vo.orderDe = LocalDateTime.now();
        return vo;
    }
    //상품을 삭제하는 메소드

    void delete(Order vo) {
        for(Order memoVo : orders) {
            if(vo.orderNo == memoVo.orderNo) {
                orders.remove(0);
                break;
            }
        }
    }
    //상품 삭제 후  번호를 다시 붙여준다.
    void deleteAfter() {
        for(int i=1; i<=orders.size(); i++) {
            if(orders.get(i-1).orderNo != i) {
                orders.get(i-1).orderNo = i;
            }
        }
    }
    //
    int countNo() {
        return orders.get(orders.size()-1).orderNo;
    }
}