package exam05;

import java.util.Arrays;

public class Ex02 {
  public static void main(String[] args) {
    int[] nums1 = {10, 20, 30, 40};
    int[] nums2 = {10, 20, 30, 40};

    boolean isSame = Arrays.equals(nums1, nums2);
      //아래 방법 말고 위의 방법을 쓰면 한줄로 끝낼 수 있다.
//    boolean isSame = true;
//    for(int i = 0; i < nums1.length; i++){
//      if(num1[i] != num2[i]){
//        isSame = false;
//        break;
//        }
//      }
    System.out.println(isSame);
  }
}

