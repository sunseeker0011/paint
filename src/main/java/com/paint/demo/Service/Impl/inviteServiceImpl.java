package com.paint.demo.Service.Impl;

import com.paint.demo.Dao.inviteDao;
import com.paint.demo.Service.inviteService;
import com.paint.demo.pojo.Invite;
import com.paint.demo.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class inviteServiceImpl implements inviteService {

    @Autowired
    private inviteDao inviteDao;
    @Autowired
    private orderServiceImpl orderService;

    /*邀请的列表*/
    @Override
    public List getInvitation(int state) {

        List<Invite> listAll= inviteDao.selectInvitationAll();

        /*邀请的名单*/
        if(state==1){
            List<Invite> list= inviteDao.selectInvitation();
            return list;
        }
        /*拒绝的名单*/
        else if (state==2){
            List<Invite> RefusedList= inviteDao.selectRefused();
            return RefusedList;
        }
        return listAll;
    }

    /*企划邀请界面更新*/
    @Override
    public Invite update(int id, int state) {
        return null;
    }

    /*收到邀请，数据库加入新数据*/
    @Override
    public Invite insert(Invite invite) {

        Invite apply=new Invite();
        /*取当前时间的长整形值包含毫秒作为ID值*/
        long millis = System.currentTimeMillis();
        /*先把long转换成字符串String，然后在转行成Integer*/
        int id = Integer.parseInt(String.valueOf(millis));
        invite.setId(id);
        Order order=orderService.getAll();
        invite.setOrderId(order.getId());
        invite.setPrinterId(order.getPrinterId());
        apply=inviteDao.insert(invite);
        return apply;
    }

}
