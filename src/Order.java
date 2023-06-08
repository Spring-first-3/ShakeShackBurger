import java.time.LocalDateTime;

public class Order {
    //주문번호
    int orderNo;
    //상품이름
    String productName;
    //상품가격
    double productPrice;
    //상품설명
    String productDetails;
    //요청사항
    String request;
    //주문시간
    LocalDateTime orderDe;


    //    @Override
//    public String toString() {
//       return "대기 번호: "+ orderNo+"\n" +"주문상품 목록: " + allList+"\n"
//                + "주문 총 가격: " + totalOrderPrice+"\n" + "요청사항: "+"\n"+request+"주문 일시:"+orderDe;
//   }
//    @Override
//    public String toString() {
//       return "대기 번호: "+ orderNo+"\n" +"주문상품 목록: " + allList+"\n"
//                + "주문 총 가격: " + totalOrderPrice+"\n" + "요청사항: "+"\n"+request+"완료 주문 일시:"+orderDe;
//   }
    public void setOrderDe(LocalDateTime createDe) {
        this.orderDe = orderDe;
    }




}
