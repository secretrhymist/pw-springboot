package com.shareJoy.pw.service.impl;

import com.shareJoy.pw.entity.Member;
import com.shareJoy.pw.mapper.MemberMapper;
import com.shareJoy.pw.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hjt
 * @since 2022-08-19
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
