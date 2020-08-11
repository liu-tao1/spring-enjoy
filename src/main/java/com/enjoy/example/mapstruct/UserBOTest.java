package com.enjoy.example.mapstruct;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/8/11
 */
public class UserBOTest {

    public static void main(String[] args) {
        // 创建 UserDO 对象
        UserDO userDO = new UserDO();
        userDO.setId(1);
        userDO.setUsername("ssdds");
        userDO.setPassword("1232");

        // <X> 进行转换
        UserBO userBO = UserConvert.INSTANCE.convert(userDO);
        System.out.println(userBO);

        System.out.println("------");
        // 进行转换
        UserDetailBO userDetailBO = UserConvert.INSTANCE.convertToDetail(userDO);
        System.out.println(userDetailBO);
    }

}
