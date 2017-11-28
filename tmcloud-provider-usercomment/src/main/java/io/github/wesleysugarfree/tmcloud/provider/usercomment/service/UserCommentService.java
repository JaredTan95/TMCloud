/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment.service;

import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.domain.UserComment;
import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.mapper.UserCommentMapper;
import io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.mapper.UserCommentMapperExt;
import io.github.wesleysugarfree.tmcloud.provider.usercomment.dto.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userCommentService")
public class UserCommentService {
    @Resource
    private UserCommentMapper userCommentMapper;

    @Resource
    private UserCommentMapperExt userCommentMapperExt;

    private static Logger logger = LoggerFactory.getLogger(UserCommentService.class);

    public BaseResult<UserComment> addOne(UserComment uc) {
        if (userCommentMapper.insert(uc) > 0) {
            logger.info("添加评论: 「用户ID」:{}--->歌曲ID:{} 成功.", uc.getsUserid(), uc.getsSongid());
            return new BaseResult<>(true, uc, "200", "Added successful.");
        }
        return new BaseResult<>(true, uc, "500", "Added failure.");
    }

    public BaseResult<UserComment> readBySongId(int id) {
        List<UserComment> list;
        UserComment uc = new UserComment();
        uc.setsSongid(id);
        logger.info("查看歌曲「{}」的评论.", uc.getsSongid());
        list = userCommentMapperExt.selectSelective(uc);
        return new BaseResult<>(true, list, "200", "Readed successful.");
    }

    public BaseResult<UserComment> deleteOne(UserComment userComment) {
        if (userCommentMapper.deleteByPrimaryKey(userComment) > 0) {
            logger.info("删除评论: 「用户ID」:{}--->歌曲ID:{} 成功.", userComment.getsUserid(), userComment.getsSongid());
            return new BaseResult<>(true, userComment, "200", "Deleted successful.");
        }
        return new BaseResult<>(true, userComment, "500", "Delete failure.");
    }
}
