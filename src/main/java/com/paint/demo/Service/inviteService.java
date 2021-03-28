package com.paint.demo.Service;

import com.paint.demo.pojo.Invite;

import java.util.List;

public interface inviteService {
    List getInvitation(int state);
    Invite update(int id,int state);
    Invite insert(Invite invite);
}
