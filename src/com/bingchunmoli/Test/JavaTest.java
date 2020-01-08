package com.bingchunmoli.Test;


import com.bingchunmoli.Dao.UserAddachieve;
import com.bingchunmoli.Obj.User;
import com.bingchunmoli.Util.SHA1;

/**
 * @ProjectName: []
 * @Package: [.]
 * @ClassName: []
 * @Description: [一句话描述该类的功能]
 * @Author: []
 * @CreateDate: [ ]
 * @UpdateUser: []
 * @UpdateDate: [ ]
 * @UpdateRemark: [说明本次修改内容]
 */
public class JavaTest {
    public static void main(String[] args) {
//        UserAddachieve user = new UserAddachieve();
//        User user1 = new User();
//        user1.setUID(23);
//        user1.setEmil("@3");
//        user1.setName("sd");
//        user.query(2,user1);
//        System.out.println("执行完毕");
        String a = SHA1.encodePassword("password");
        System.out.println(a);
    }
}
