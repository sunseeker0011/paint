package com.paint.demo.Dao;

import com.paint.demo.pojo.Invite;

import java.util.List;

public interface inviteDao {
    List<Invite> selectInvitation();

    List<Invite> selectRefused();

    List<Invite> selectInvitationAll();

    Invite insert(Invite invite);
}
